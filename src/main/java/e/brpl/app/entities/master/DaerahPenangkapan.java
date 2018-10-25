package e.brpl.app.entities.master;


import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.entity.EBrplEntity;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name =
        EBrpl.COMPONENT.MASTER_COMPONENT + EBrpl.DIVIDER +
        EBrpl.COMPONENT.MASTER.DAERAH_PENANGKAPAN)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class DaerahPenangkapan extends EBrplEntity<DaerahPenangkapan, String> {

    @NotNull
    @Column(name = "kode_daerah_penangkapan", length = 64)
    private String kodeDaerahPenangkapan;

    @NotNull
    @Column(name = "nama_daerah_penangkapan", length = 120)
    private String namaDaerahPenangkapan;

    @Column(name = "latitude")
    @ColumnDefault("'0'")
    private double latitude;

    @Column(name = "longitude")
    @ColumnDefault("'0'")
    private double longitude;

}
