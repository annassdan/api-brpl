package e.brpl.app.entities.master;

import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.entity.EBrplEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@Builder
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
    private String  namaAlatTangkapEN;

    @Column(name = "deskripsi_alat_tangkap")
    private String deskripsiAlatTangkap;


//    @Fetch(value = FetchMode.SELECT)
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
////    @JoinColumn(name = "uuid_alattangkap")
//@Fetch(value = FetchMode.SELECT)
//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//@JoinColumn(name = "uuid_alattangkap")
//    private List<SpesifikasiAlatTangkap> spesifikasiAlatTangkap = new ArrayList<>();


}
