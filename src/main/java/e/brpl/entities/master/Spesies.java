package e.brpl.entities.master;

import e.brpl.utils.EBrpl;
import e.brpl.utils.entity.EBrplEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Data
@Builder
@AllArgsConstructor
@Table(name =
        EBrpl.COMPONENT.MASTER_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.MASTER.SPESIES)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class Spesies extends EBrplEntity<Spesies, String> {

    @Column(name = "family")
    @ColumnDefault("'false'")
    private boolean family;

    @Column(name = "fish_phylum", length = 64)
    private String fishPhylum;

    @Column(name = "fish_class", length = 64)
    private String fishClass;

    @Column(name = "fish_order", length = 64)
    private String fishOrder;

    @Column(name = "fish_family", length = 64)
    private String fishFamily;

    @Column(name = "fish_genus", length = 64)
    private String fishGenus;

    @Column(name = "fish_species", length = 64)
    private String fishSpecies;

    @Column(name = "nama_umum")
    private String namaUmum;

    @Column(name = "nama_indonesia")
    private String namaIndonesia;

    @Column(name = "nama_latin")
    private String namaLatin;

    @Column(name = "lmat")
    private int lmat;

    @Column(name = "lopt")
    private int lopt;

    @Column(name = "linf")
    private int linf;

    @Column(name = "lmax")
    private int lmax;

    @Column(name = "lmatm")
    private int lmatm;

    @Column(name = "species_id_number")
    private int speciesIdNumber;

    @Column(name = "reported_trade_limit_weight")
    private double reportedTradeLimitWeight;

    @Column(name = "var_a")
    private double varA;

    @Column(name = "var_b")
    private double varB;

    @Column(name = "length_basis", length = 4)
    private double lengthBasis;

    @Column(name = "converted_trade_limit_l")
    private double convertedTradeLimitL;

    @Column(name = "plotted_trade_limit_tl")
    private long plottedTradeLimitTl;

    @Column(name = "conversion_factor_tl2fl")
    private double conversionFactorTl2fl;

}
