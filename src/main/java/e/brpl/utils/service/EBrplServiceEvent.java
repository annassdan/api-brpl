package e.brpl.utils.service;

import e.brpl.utils.entity.EBrplEntityEvent;
import org.springframework.data.domain.Page;

import java.util.List;

@SuppressWarnings("unused")
public interface EBrplServiceEvent<Entity extends EBrplEntityEvent> {


    /**
     * Merepresentasikan fungsi utama yang digunakan untuk menyimpan data ke Database
     *
     * @param entity Struktur dan Data yang akan diproses ke Tabel yang akan dituju
     * @return Entity
     */
    Entity save(Entity entity);

    /**
     * Merepresentasikan fungsi utama yang digunakan untuk menyimpan beberapa data sekaligus ke Database
     *
     * @param entities Struktur dan Data yang akan diproses ke Tabel yang akan dituju
     * @return Entity
     */
    List<Entity> saves(List<Entity> entities);


    /**
     * Merepresentasikan fungsi utama pengubahan data dari sebuah Tabel yang ada di Database
     *
     * @param entity Struktur dan Data yang akan diproses ke Tabel yang akan dituju
     * @return Entity
     */
    Entity edit(Entity entity);


    /**
     * Merepresentasikan service pengambilan sebuah data dari tabel yang ada di database
     * dengan menggunakan Primary Key sebagai Parameter
     *
     * @param uuid Primary Key dari Tabel yang ada dalam Database
     * @return Entity
     */
    Entity findOne(String uuid);


    /**
     * Merepresentasikan fungsi penghapusan data dari tabel di Database
     * berdasarkan UUID (Primary Key)
     *
     * @param uuid Primary Key dari Tabel yang ada dalam Database
     */
    boolean delete(String uuid);


    /**
     * Merepresentasikan pengambilan seluruh data dari sebuah Tabel yang ada di database dengan
     * membagi data dalam beberapa halaman
     *
     * @param page Halaman berapa yang akan ditampilkan pada sebuah webpage
     * @param size Jumlah data yang akan ditampilkan pada sebuah halaman
     * @return Page
     */
    Page<Entity> findAll(int page, int size);
}
