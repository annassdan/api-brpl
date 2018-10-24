package e.brpl.app.entities.master;

import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.entity.EBrplEntity;
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
        EBrpl.COMPONENT.MASTER_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.MASTER.SPESIFIKASI_ALAT_TANGKAP)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class SpesifikasiAlatTangkap extends EBrplEntity<SpesifikasiAlatTangkap, String> {

    @Column(name = "spesifikasi")
    private String spesifikasi;

    @Column(name = "nilai")
    private String  nilai;

    @Column(name = "unit")
    private String unit;

}
