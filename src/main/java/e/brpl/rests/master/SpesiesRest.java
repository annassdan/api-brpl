package e.brpl.rests.master;


import e.brpl.entities.master.Spesies;
import e.brpl.services.master.SpesiesService;
import e.brpl.utils.EBrpl;
import e.brpl.utils.rest.EBrplRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.MASTER + EBrpl.COMPONENT.MASTER.SPESIES,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class SpesiesRest extends EBrplRest<Spesies, SpesiesService> {
}
