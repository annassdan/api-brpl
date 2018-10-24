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
                EBrpl.COMPONENT.INTEGRATION.BOAT_TRACKER)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class BoatTracker extends EBrplEntity<BoatTracker, String> {

    // di tabel ifish adalah "boat_id"
    @Column(name = "boat_id")
    @ColumnDefault("'0'")
    @NotNull
    private String boat_id;

    // di tabel ifish adalah "tracker_id"
    @Column(name = "tracker_id")
    @ColumnDefault("'0'")
    @NotNull
    private String tracker_id;

    @Column(name = "tracker_status")
    @ColumnDefault("'0'")
    private int tracker_status;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "tracker_start_date")
    private Date tracker_start_date;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "tracker_end_date")
    private Date tracker_end_date;


}
