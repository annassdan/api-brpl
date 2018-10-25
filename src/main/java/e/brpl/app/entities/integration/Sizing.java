package e.brpl.app.entities.integration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import e.brpl.app.utils.entity.EBrplEntity;
import e.brpl.app.configurations.EBrplDateSerializer;
import e.brpl.app.utils.EBrpl;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name =
        EBrpl.COMPONENT.INTEGRATION_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.INTEGRATION.SIZING)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class Sizing extends EBrplEntity<Sizing, String> {

    // di tabel ifish adalah "fish_id"
    @Column(name = "fish_id")
    private String fish_id;

    @Column(name = "cm", columnDefinition = "Decimal(10,2) default '0.00'")
    private double cm;

    // di tabel ifish adalah "landing_id"
    @Column(name = "landing_id")
    private String landing_id;

    // di tabel ifish adalah "offloading_id"
    @Column(name = "offloading_id")
    private String offloading_id;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "codrs_picture_date")
    private Date codrs_picture_date;

    @Column(name = "codrs_picture_name", length = 128)
    @ColumnDefault("''")
    String codrs_picture_name;

    @Column(name = "length_type", length = 32)
    @ColumnDefault("''")
    String length_type;



}
