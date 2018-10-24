package e.brpl.rests.integration;

import e.brpl.entities.integration.Tracker;
import e.brpl.services.integration.TrackerService;
import e.brpl.utils.EBrpl;
import e.brpl.utils.rest.EBrplRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.INTEGRATION + EBrpl.COMPONENT.INTEGRATION.TRACKER + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class TrackerRest  extends EBrplRest<Tracker, TrackerService> {
}
