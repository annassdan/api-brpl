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
                EBrpl.COMPONENT.INTEGRATION.DEEPSLOPE)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class Deepslope extends EBrplEntity<Deepslope, String> {

    @Column(name = "approach")
    @ColumnDefault("'0'")
    private int approach;

    // ditabel ifish adalah "user_id"
    @Column(name = "user_id")
    @ColumnDefault("'0'")
    private String user_id;

    // ditabel ifish adalah "partner_id"
    @Column(name = "partner_id")
    @ColumnDefault("'0'")
    private String partner_id;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "landing_date")
    private Date landing_date;

    @Column(name = "landing_location", length = 128)
    private String landing_location;

    @Column(name = "wpp1", length = 8)
    @ColumnDefault("'0'")
    private String wpp1;

    @Column(name = "wpp2", length = 8)
    @ColumnDefault("'0'")
    private String wpp2;

    @Column(name = "wpp3", length = 8)
    @ColumnDefault("'0'")
    private String wpp3;

    // ditabel ifish adalah "boat_id"
    @Column(name = "boat_id")
    @ColumnDefault("'0'")
    private String boat_id;

    @Column(name = "fishing_gear", length = 128)
    @ColumnDefault("''")
    private String fishing_gear;

    @Column(name = "brought_by", length = 128)
    @ColumnDefault("''")
    private String brought_by;

    @Column(name = "other_fishing_ground", length = 128)
    @ColumnDefault("''")
    private String other_fishing_ground;

    @Column(name = "supplier", length = 128)
    @ColumnDefault("''")
    private String supplier;

    @Column(name = "fishery_type", length = 32)
    @ColumnDefault("''")
    private String fishery_type;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "entry_date")
    private Date entry_date;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "posting_date")
    private Date posting_date;

    @Column(name = "posting_user")
    @ColumnDefault("'0'")
    private String posting_user;

    @Column(name = "doc_status", length = 32)
    @ColumnDefault("''")
    private String doc_status;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "first_codrs_picture_date")
    private Date first_codrs_picture_date;

    @Column(name = "data_status", length = 32)
    @ColumnDefault("''")
    private String data_status;

    @Column(name = "notes", columnDefinition = "TEXT")
    @ColumnDefault("''")
    private String notes;

    @Column(name = "fishing_ledger")
    @ColumnDefault("'0'")
    private String fishing_ledger;

    @Column(name = "total_catch")
    @ColumnDefault("'0'")
    private int total_catch;

}
