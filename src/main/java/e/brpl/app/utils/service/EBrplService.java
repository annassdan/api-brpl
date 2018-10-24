package e.brpl.app.utils.service;

import e.brpl.app.utils.entity.EBrplEntityEvent;
import e.brpl.app.utils.repository.EBrplRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
public class EBrplService<Entity extends EBrplEntityEvent, Repository extends EBrplRepository, ID extends Serializable>
        implements EBrplServiceEvent<Entity, ID> {

    @Autowired

    protected Repository repository;

    /**
     * Merepresentasikan fungsi utama yang digunakan untuk menyimpan data ke Database
     *
     * @param entity Struktur dan Data yang akan diproses ke Tabel yang akan dituju
     * @return Entity
     */
    @Override
    @SuppressWarnings("unchecked")
    public Entity save(Entity entity) {
        entity = (Entity) repository.save(entity);
        return entity;
    }

    /**
     * Merepresentasikan fungsi utama yang digunakan untuk menyimpan beberapa data sekaligus ke Database
     *
     * @param entities Struktur dan Data yang akan diproses ke Tabel yang akan dituju
     * @return Entity
     */
    @Override
    @SuppressWarnings("unchecked")
    public List<Entity> saves(List<Entity> entities) {
        entities = (List<Entity>) repository.save(entities);
        return entities;
    }


    /**
     * Merepresentasikan fungsi utama pengubahan data dari sebuah Tabel yang ada di Database
     *
     * @param entity Struktur dan Data yang akan diproses ke Tabel yang akan dituju
     * @return Entity
     */
    @Override
    @SuppressWarnings("unchecked")
    public Entity edit(Entity entity) {
        entity = (Entity) repository.save(entity);
        return entity;
    }


    /**
     * Merepresentasikan service pengambilan sebuah data dari tabel yang ada di database
     * dengan menggunakan Primary Key sebagai Parameter
     *
     * @param uuid Primary Key dari Tabel yang ada dalam Database
     * @return Entity
     */
    @Override
    @SuppressWarnings("unchecked")
    public Entity findOne(ID uuid) {
        Optional<Entity> optional = repository.findById(uuid);
        if (optional.isPresent())
            return (Entity) repository.findById(uuid).get();
        else
            return null;
    }


    /**
     * Merepresentasikan fungsi penghapusan data dari tabel di Database
     * berdasarkan UUID (Primary Key)
     *
     * @param uuid Primary Key dari Tabel yang ada dalam Database
     */
    @Override
    @SuppressWarnings("unchecked")
    public boolean delete(ID uuid) {
        try {
            repository.delete(uuid);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Merepresentasikan pengambilan seluruh data dari sebuah Tabel yang ada di database dengan
     * membagi data dalam beberapa halaman
     *
     * @param page Halaman berapa yang akan ditampilkan pada sebuah webpage
     * @param size Jumlah data yang akan ditampilkan pada sebuah halaman
     * @return Page
     */
    @Override
    @SuppressWarnings("unchecked")
    public Page<Entity> findAll(int page, int size) {
        page = (page > 0) ? page - 1 : page;
        Pageable paging = PageRequest.of(page, size);
//        return repository.findAllByOrderByDibuatPadaTanggalAsc(paging);
        return repository.findAll(paging);
    }
}
