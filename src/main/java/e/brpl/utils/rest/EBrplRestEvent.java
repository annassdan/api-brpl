package e.brpl.utils.rest;

import e.brpl.utils.EBrpl;
import e.brpl.utils.entity.EBrplEntityEvent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@SuppressWarnings("unused")
public interface EBrplRestEvent<Entity extends EBrplEntityEvent> extends EBrpl {


    /**
     * Merepresentasikan API proses save ke Tabel di Database
     *
     * @param entity Class Entitas yang merepresentasikan sebuah Tabel beserta Strukturnya yang ada di Database
     * @return ResponseEntity
     */
    ResponseEntity<Entity> save(@Valid @RequestBody Entity entity);


    /**
     * Merepresentasikan API proses edit Data dari tabel di Database
     *
     * @param uuid Primary Key dari Tabel yang ada dalam Database
     * @param entity Class Entitas yang merepresentasikan sebuah Tabel beserta Strukturnya yang ada di Database
     * @return ResponseEntity
     */
    ResponseEntity<Entity> edit(@PathVariable(PK_PATH_VARIABLE) String uuid, @Valid @RequestBody Entity entity);


    /**
     * Merepresentasikan API proses pengambilan salah satu data dari tabel di database
     * menggunakan value Primary Key dari Tabel tersebut
     *
     * @param uuid Primary Key dari Tabel yang ada dalam Database
     * @return ResponseEntity
     */
    ResponseEntity<Entity> findOne(@PathVariable(PK_PATH_VARIABLE) String uuid);


    /**
     * Merepresentasikan API penghabpusan data dari sebuah tabel di database berdasarkan UUID (Primary Key)
     *
     * @param uuid Primary Key dari Tabel yang ada dalam Database
     * @return ResponseEntity
     */
    ResponseEntity<Entity> delete(@PathVariable(PK_PATH_VARIABLE) String uuid);


    /**
     * Merepresentasikan API pengambilan seluruh data dari Database yang dibagi
     * dalam beberapa halaman
     *
     * @param page Halaman berapa yang akan ditampilkan pada sebuah webpage
     * @param size Jumlah data yang akan ditampilkan pada sebuah halaman
     * @return ResponseEntity
     */
    ResponseEntity<?> findAll(@RequestParam(PAGING.PAGE) final int page, @RequestParam(PAGING.SIZE) final int size);











}
