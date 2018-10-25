package e.brpl.app.entities.master;

import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.entity.EBrplEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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

    @NotNull
    @Column(name = "nama_alat_tangkap_id", length = 100)
    private String namaAlatTangkapID;

    @Column(name = "nama_alat_tangkap_en", length = 120)
    private String namaAlatTangkapEN;

    @Column(name = "deskripsi_alat_tangkap", columnDefinition = "TEXT")
    private String deskripsiAlatTangkap;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "uuid_alattangkap", referencedColumnName = "uuid")
    private List<SpesifikasiAlatTangkap> spesifikasiAlatTangkap = new ArrayList<>();


}
