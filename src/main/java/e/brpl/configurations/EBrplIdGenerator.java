package e.brpl.configurations;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.IdentityGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.UUID;

@SuppressWarnings("unused")
public class EBrplIdGenerator extends IdentityGenerator implements IdentifierGenerator {

    Logger logger = LoggerFactory.getLogger(EBrplIdGenerator.class);

    @Override
    public Serializable generate(SharedSessionContractImplementor sessionImplementor, Object o) {
        Serializable id = sessionImplementor.getEntityPersister(null, o)
                .getClassMetadata().getIdentifier(o, sessionImplementor);  // read received id , if the id is attached on entity
        return (id == null || id.toString().length() == 0) ? UUID.randomUUID().toString() : id.toString();
    }

}
