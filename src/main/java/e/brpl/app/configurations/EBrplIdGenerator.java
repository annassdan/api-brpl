package e.brpl.app.configurations;

import e.brpl.app.utils.EBrpl;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;

@SuppressWarnings("unused")
public class EBrplIdGenerator implements IdentifierGenerator, Configurable {

    Logger logger = LoggerFactory.getLogger(EBrplIdGenerator.class);

    private String prefix;

    @Override
    public Serializable generate(SharedSessionContractImplementor sessionImplementor, Object o) throws HibernateException {

        String className = sessionImplementor.getEntityPersister(null, o).getClassMetadata().getIdentifierType().getReturnedClass().getName();
        Serializable id = sessionImplementor.getEntityPersister(null, o)
                .getClassMetadata().getIdentifier(o, sessionImplementor);  // read received id , if the id is attached on entity

        if (className.equals("java.lang.String")) {
            return (id == null) ? UUID.randomUUID().toString() : ((id.toString().length() == 0) ? UUID.randomUUID().toString() : id.toString());
        } else if (className.equals("java.lang.Integer")) {
            return (id == null) ? Integer.parseInt(generateNonStringId()) : Integer.parseInt(id.toString());
        } else if (className.equals("java.lang.Long")) {
            return (id == null) ? Long.parseLong(generateNonStringId()) : Long.parseLong(id.toString());
        } else {
            try {
                return Integer.parseInt(generateNonStringId());
            } catch (NumberFormatException e) {
                return Long.parseLong(generateNonStringId());
            }
        }
    }


    /**
     *
     * @return
     */
    private String generateNonStringId() {
        String random = String.valueOf((int) Math.random());
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(EBrpl.ID_DATE_PATTERN);
            return simpleDateFormat.format(new Date()) + random;
        } catch (Exception e) {
            return random;
        }
    }

    @Override
    public void configure(Type type, Properties properties, ServiceRegistry serviceRegistry) throws MappingException {
//        this.prefix = properties.getProperty("pre")
    }

}
