package e.brpl.utils.rest;

import e.brpl.utils.EBrpl;
import e.brpl.utils.entity.EBrplEntityEvent;
import e.brpl.utils.service.EBrplServiceEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.validation.Valid;


/**
 *
 * @param <Entity>
 * @param <Service>
 */
@SuppressWarnings("unused")
public class EBrplRest<Entity extends EBrplEntityEvent, Service extends EBrplServiceEvent>
    implements EBrplRestEvent<Entity> {

    @Autowired
    @SuppressWarnings("")
    protected Service service;


    @Override
    @PostMapping
    @SuppressWarnings("unchecked")
    public ResponseEntity<Entity> save(@Valid Entity entity) {
        entity = (Entity) service.save(entity);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }


    @Override
    @PutMapping("{" + EBrpl.PK_PATH_VARIABLE + "}")
    @SuppressWarnings("unchecked")
    public ResponseEntity<Entity> edit(String uuid, @Valid Entity entity) {

        boolean finded = service.findOne(uuid) != null;
        if(finded) {
            entity.setUuid(uuid);
            entity = (Entity) service.edit(entity);
        }

        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @Override
    @GetMapping("{" + EBrpl.PK_PATH_VARIABLE + "}")
    @SuppressWarnings("unchecked")
    public ResponseEntity<Entity> findOne(String uuid) {
        Entity entity = (Entity) service.findOne(uuid);

        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("{" + EBrpl.PK_PATH_VARIABLE + "}")
    @SuppressWarnings("unchecked")
    public ResponseEntity<Entity> delete(String uuid) {
        Entity entity = (Entity) service.findOne(uuid);
        boolean deleted = service.delete(uuid);
        return new ResponseEntity<>(entity, (deleted) ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    @GetMapping(params = {PAGING.PAGE, PAGING.SIZE} )
    @SuppressWarnings("unchecked")
    public ResponseEntity<?> findAll(int page, int size) {
        Page<Entity> entities = service.findAll(page, size);
        return new ResponseEntity<>(entities, HttpStatus.OK);
    }
}
