package e.brpl.app.entities.master;

import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.entity.EBrplEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name =
        EBrpl.COMPONENT.MASTER_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.MASTER.ANGGOTA)
@SuppressWarnings("unused")
//@EqualsAndHashCode(callSuper = false)
public class Anggota extends EBrplEntity<Anggota, String> {

    @Column(name = "nama_depan")
    private String namaDepan;

    @Column(name = "nama_belakang")
    private String namaBelakang;

    @Column(name = "posisi")
    private String posisi;

    @Column(name = "email")
    private String email;

    @Column(name = "wpp")
    private String wpp;

//    @ManyToOne
//    @JoinColumn(name = "uuid_sumberdaya", referencedColumnName = "uuid")
//    private SumberDaya uuidSumberDaya;

    @Column(name = "foto")
    private String foto;

}
