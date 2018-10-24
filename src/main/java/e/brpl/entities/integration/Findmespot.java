package e.brpl.entities.integration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import e.brpl.configurations.EBrplDateSerializer;
import e.brpl.utils.EBrpl;
import e.brpl.utils.entity.EBrplEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name =
        EBrpl.COMPONENT.INTEGRATION_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.INTEGRATION.FINDMESPOT)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class Findmespot extends EBrplEntity<Findmespot, String> {


    // di tabel ifish adalah "findmespot_id"
    @Column(name = "findmespot_id")
    private String findmespot_id;

    // di tabel ifish adalah "tracker_id"
    @Column(name = "tracker_id")
    @ColumnDefault("'0'")
    @NotNull
    private String tracker_id;

    @Column(name = "tracker_name", length = 64)
    @ColumnDefault("''")
    private String tracker_name;

    @Column(name = "unix_time")
    private String unix_time;

    @Column(name = "message_type", length = 32)
    private String message_type;

    @Column(name = "latitude", columnDefinition = "Decimal(10,5) default '0.00'")
    private double latitude;

    @Column(name = "longitude", columnDefinition = "Decimal(10,5) default '0.00'")
    private double longitude;

    // di tabel ifish adalah "model_id"
    @Column(name = "model_id", length = 32)
    private String model_id;

    @Column(name = "show_custom_msg", length = 8)
    private String show_custom_msg;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "date_time")
    private Date date_time;

    @Column(name = "battery_state", length = 64)
    String battery_state;

    @Column(name = "hidden")
    private short hidden;

    @Column(name = "message_content", columnDefinition = "TEXT")
    String message_content;

    @Column(name = "daily_avg_latitude", columnDefinition = "Decimal(10,5) default '0.00'")
    private double daily_avg_latitude;

    @Column(name = "daily_avg_longitude", columnDefinition = "Decimal(10,5) default '0.00'")
    private double daily_avg_longitude;

}
