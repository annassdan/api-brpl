package e.brpl.rests.integration;


import e.brpl.entities.integration.Boat;
import e.brpl.services.integration.BoatService;
import e.brpl.utils.EBrpl;
import e.brpl.utils.rest.EBrplRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.INTEGRATION + EBrpl.COMPONENT.INTEGRATION.BOAT + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class BootRest extends EBrplRest<Boat, BoatService> {
}
