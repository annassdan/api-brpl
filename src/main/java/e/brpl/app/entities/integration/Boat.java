package e.brpl.app.entities.integration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import e.brpl.app.utils.entity.EBrplEntity;
import e.brpl.app.configurations.EBrplDateSerializer;
import e.brpl.app.utils.EBrpl;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name =
        EBrpl.COMPONENT.INTEGRATION_COMPONENT + EBrpl.DIVIDER +
                EBrpl.COMPONENT.INTEGRATION.BOAT)
@SuppressWarnings("unused")
@EqualsAndHashCode(callSuper = false)
public class Boat extends EBrplEntity<Boat, String> {

    @Column(name = "program_site", length = 128)
    @ColumnDefault("''")
    private String program_site;

    @Column(name = "program_type", length = 32)
    @ColumnDefault("''")
    private String program_type;

    @Column(name = "picture_original")
    long picture_original;

    @Column(name = "picture_censored")
    long picture_censored;

    @Column(name = "boat_code", length = 24)
    @ColumnDefault("''")
    private String boat_code;

    @Column(name = "boat_name", length = 64)
    @ColumnDefault("''")
    private String boat_name;

    @Column(name = "fishing_gear", length = 32)
    @ColumnDefault("''")
    private String fishing_gear;

    @Column(name = "codrs_contract")
    @ColumnDefault("'0'")
    private String codrs_contract;

    @Column(name = "captain", length = 64)
    @ColumnDefault("''")
    private String captain;

    @Column(name = "captain_origin", columnDefinition = "TEXT")
    private String captain_origin;

    @Column(name = "owner", length = 64)
    @ColumnDefault("''")
    private String owner;

    @Column(name = "owner_origin", columnDefinition = "TEXT")
    private String owner_origin;

    @Column(name = "owner_district", columnDefinition = "TEXT")
    private String owner_district;

    @Column(name = "owner_province", columnDefinition = "TEXT")
    private String owner_province;

    @Column(name = "registration_port", length = 64)
    @ColumnDefault("''")
    private String registration_port;

    @Column(name = "year_built")
    @ColumnDefault("'0'")
    private int year_built;

    //    @Digits(integer = 6, fraction = 2)
    @Column(name = "length_of_boat", columnDefinition = "Decimal(6,2) default '0.00'")
//    @ColumnDefault("'0'")
    private double length_of_boat;

    //    @Digits(integer = 6, fraction = 2)
    @Column(name = "width_of_boat", columnDefinition = "Decimal(6,2) default '0.00'")
//    @ColumnDefault("'0'")
    private double width_of_boat;

    //    @Digits(integer = 6, fraction = 2)
    @Column(name = "height_of_boat", columnDefinition = "Decimal(6,2) default '0.00'")
//    @ColumnDefault("'0'")
    private double height_of_boat;

    //    @Digits(integer = 10, fraction = 2)
    @Column(name = "capacity_palka_m3", columnDefinition = "Decimal(10,2) default '0.00'")
//    @ColumnDefault("'0'")
    private double capacity_palka_m3;

    //    @Digits(integer = 6, fraction = 2)
    @Column(name = "gt_estimate", columnDefinition = "Decimal(6,2) default '0.00'")
//    @ColumnDefault("'0'")
    private double gt_estimate;

    //    @Digits(integer = 6, fraction = 2)
    @Column(name = "gt_declared", columnDefinition = "Decimal(6,2) default '0.00'")
//    @ColumnDefault("'0'")
    private double gt_declared;

    @Column(name = "size_category", length = 32)
    @ColumnDefault("''")
    private String size_category;

    @Column(name = "engine_spec", columnDefinition = "TEXT")
    private String engine_spec;

    @Column(name = "number_of_engine")
    @ColumnDefault("'0'")
    private int number_of_engine;

    @Column(name = "number_of_crew")
    @ColumnDefault("'0'")
    private int number_of_crew;

    @Column(name = "wpp_permit1", length = 32)
    @ColumnDefault("''")
    private String wpp_permit1;

    @Column(name = "wpp_permit2", length = 32)
    @ColumnDefault("''")
    private String wpp_permit2;

    @Column(name = "wpp_permit3", length = 32)
    @ColumnDefault("''")
    private String wpp_permit3;

    @Column(name = "landing_port1", columnDefinition = "TEXT")
    @ColumnDefault("''")
    private String landing_port1;

    @Column(name = "landing_port2", columnDefinition = "TEXT")
    @ColumnDefault("''")
    private String landing_port2;

    @Column(name = "trans_destination1", columnDefinition = "TEXT")
    @ColumnDefault("''")
    private String trans_destination1;

    @Column(name = "trans_destination2", columnDefinition = "TEXT")
    @ColumnDefault("''")
    private String trans_destination2;

    @Column(name = "company1", columnDefinition = "TEXT")
    @ColumnDefault("''")
    private String company1;

    @Column(name = "company2", columnDefinition = "TEXT")
    @ColumnDefault("''")
    private String company2;

    @Column(name = "company3", columnDefinition = "TEXT")
    @ColumnDefault("''")
    private String company3;

    @Column(name = "fishing_area1", length = 32)
    @ColumnDefault("''")
    private String fishing_area1;

    @Column(name = "fishing_area2", length = 32)
    @ColumnDefault("''")
    private String fishing_area2;

    @Column(name = "fishing_area3", length = 32)
    @ColumnDefault("''")
    private String fishing_area3;

    @Column(name = "avg_trip_per_year")
    @ColumnDefault("'0'")
    private int avg_trip_per_year;

    @Column(name = "avg_catch_per_trip_kg", columnDefinition = "Decimal(6,2) default '0.00'")
    private double avg_catch_per_trip_kg;

    @Column(name = "avg_catch_per_year_kg", columnDefinition = "Decimal(12,2) default '0.00'")
    private double avg_catch_per_year_kg;

    @Column(name = "uuid_data", columnDefinition = "TEXT")
    private String uuidData; // di kolom tabel ifish adalah "uuid"

    @Column(name = "counter")
    @ColumnDefault("'0'")
    private int counter;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "codrs_start_date")
    private Date codrs_start_date;

    @Temporal(TemporalType.DATE)
    @JsonSerialize(using = EBrplDateSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_PATTERN)
    @Column(name = "codrs_end_date")
    private Date codrs_end_date;

    @Column(name = "engine_hp1")
    private int engine_hp1;

    @Column(name = "engine_hp2")
    private int engine_hp2;

    @Column(name = "engine_hp3")
    private int engine_hp3;

}
