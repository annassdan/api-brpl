package e.brpl.utils.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import e.brpl.configurations.EBrplDateTimeSerializer;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("unused")
@MappedSuperclass
public class EBrplEntity<Entity extends EBrplEntityEvent, ID extends Serializable>
        implements Serializable, EBrplEntityEvent<ID>  {

    /**
     *
     */
    private static final long serialVersionUID = 12L;

    @Id
    @GenericGenerator(name = BRPL_GENERATOR, strategy = BRPL_GENERATOR_STRATEGY)
    @GeneratedValue(generator = BRPL_GENERATOR)
    @Column(name = "uuid", unique = true, nullable = false)
    @SuppressWarnings("unused")
    private String uuid;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_PATTERN)
    @JsonSerialize(using = EBrplDateTimeSerializer.class)
    @Column(name = "dibuat_pada_tanggal")
    @CreatedDate
    private Date dibuatPadaTanggal;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_PATTERN)
    @JsonSerialize(using = EBrplDateTimeSerializer.class)
    @Column(name = "terakhir_diubah_pada_tanggal")
    @LastModifiedDate
    private Date terakhirDiubahPadaTanggal;

    @Column(name = "terakhir_diubah_oleh")
    @ColumnDefault("''")
    @LastModifiedBy
    private String dibuatAtauTerakhirDiubahOleh;


    @JsonIgnore
    @Transient
    public Entity entity;

    @Override
    public String getUuid() {
        return uuid;
    }
    @Override
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public Date getDibuatPadaTanggal() {
        return this.dibuatPadaTanggal;
    }
    @Override
    public void setDibuatPadaTanggal(Date date) {
        this.dibuatPadaTanggal = date;
    }

    @Override
    public Date getTerakhirDiubahPadaTanggal() {
        return this.terakhirDiubahPadaTanggal;
    }
    @Override
    public void setTerakhirDiubahPadaTanggal(Date date) {
        this.terakhirDiubahPadaTanggal = date;
    }

    @Override
    public String getDibuatAtauTerakhirDiubahOleh() {
        return this.dibuatAtauTerakhirDiubahOleh;
    }
    @Override
    public void setDibuatAtauTerakhirDiubahOleh(String oleh) {
        this.dibuatAtauTerakhirDiubahOleh = oleh;
    }


}
