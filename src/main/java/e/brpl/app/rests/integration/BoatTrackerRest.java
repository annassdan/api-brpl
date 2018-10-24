package e.brpl.app.rests.integration;


import e.brpl.app.utils.rest.EBrplRest;
import e.brpl.app.entities.integration.BoatTracker;
import e.brpl.app.services.integration.BoatTrackerService;
import e.brpl.app.utils.EBrpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.INTEGRATION + EBrpl.COMPONENT.INTEGRATION.BOAT_TRACKER + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class BoatTrackerRest extends EBrplRest<BoatTracker, BoatTrackerService, String> {
}
