package e.brpl.app.entities.integration;

import e.brpl.app.utils.entity.EBrplEntity;
import e.brpl.app.utils.EBrpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name =
        EBrpl.COMPONENT.INTEGRATION_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.INTEGRATION.TRACKER)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class Tracker extends EBrplEntity<Tracker, String> {

    // di tabel ifish adalah "tracker_id"
    @Column(name = "tracker_id")
    private String tracker_id;

    @Column(name = "tracker_name", length = 64)
    private String tracker_name;

    // di tabel ifish adalah "feed_id"
    @Column(name = "feed_id", length = 128)
    private String feed_id;

    @Column(name = "status")
    private short status;

    @Column(name = "auth_code", length = 16)
    private String auth_code;

    @Column(name = "notes", length = 64)
    private String notes;


}
