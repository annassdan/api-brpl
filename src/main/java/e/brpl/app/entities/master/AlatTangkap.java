package e.brpl.app.entities.master;

import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.entity.EBrplEntity;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name =
        EBrpl.COMPONENT.MASTER_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.MASTER.ALAT_TANGKAP)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class AlatTangkap extends EBrplEntity<AlatTangkap, String> {

    @Column(name = "nama_alat_tangkap_id")
    private String namaAlatTangkapID;

    @Column(name = "nama_alat_tangkap_en")
    private String namaAlatTangkapEN;

    @Column(name = "deskripsi_alat_tangkap")
    private String deskripsiAlatTangkap;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "uuid_alattangkap", referencedColumnName = "uuid")
    private List<SpesifikasiAlatTangkap> spesifikasiAlatTangkap = new ArrayList<>();


}
