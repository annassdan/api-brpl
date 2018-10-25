package e.brpl.app.entities.master;

import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.entity.EBrplEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name =
        EBrpl.COMPONENT.MASTER_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.MASTER.SPESIFIKASI_ALAT_TANGKAP)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class SpesifikasiAlatTangkap extends EBrplEntity<SpesifikasiAlatTangkap, String> {

    @NotNull
    @Column(name = "spesifikasi")
    private String spesifikasi;

    @Column(name = "unit", length = 16)
    private String unit;

}
