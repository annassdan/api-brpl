package e.brpl.app.entities.master;

import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.entity.EBrplEntity;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name =
        EBrpl.COMPONENT.MASTER_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.MASTER.ANGGOTA)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class Anggota extends EBrplEntity<Anggota, String> {

    @NotNull
    @Column(name = "nama_depan", length = 100)
    private String namaDepan;

    @Column(name = "nama_belakang", length = 50)
    private String namaBelakang;

    @NotNull
    @Column(name = "posisi", length = 64)
    private String posisi;

    @NotNull
    @Column(name = "email", length = 120)
    private String email;

    @Column(name = "wpp", length = 8)
    private String wpp;

    @ManyToOne
    @JoinColumn(name = "uuid_sumberdaya", referencedColumnName = "uuid")
    private SumberDaya uuidSumberDaya;

    @Column(name = "foto")
    private String foto;

}
