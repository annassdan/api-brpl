package e.brpl.entities.master;


import e.brpl.utils.entity.EBrplEntity;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Builder
@Table(name = "daerahpenangkapan")
@SuppressWarnings("unused")
public class DaerahPenangkapan extends EBrplEntity<DaerahPenangkapan, String> {

    @Column(name = "kode_daerah_penangkapan")
    private String kodeDaerahPenangkapan;

    @Column(name = "nama_daerah_penangkapan")
    private String namaDaerahPenangkapan;

    @Column(name = "latitude")
    @ColumnDefault("'0'")
    private double latitude;

    @Column(name = "longitude")
    @ColumnDefault("'0'")
    private double longitude;

}