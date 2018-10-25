package e.brpl.app.entities.master;

import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.entity.EBrplEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name =
        EBrpl.COMPONENT.MASTER_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.MASTER.SUMBER_DAYA)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class SumberDaya extends EBrplEntity<SumberDaya, String> {

    @Column(name = "nama_sumber_daya")
    private String namaSumberDaya;

    @Column(name = "deskripsi_sumber_daya")
    private String deskripsiSumberDaya;

}
