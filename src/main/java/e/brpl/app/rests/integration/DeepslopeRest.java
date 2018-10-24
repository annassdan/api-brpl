package e.brpl.app.rests.integration;

import e.brpl.app.utils.rest.EBrplRest;
import e.brpl.app.entities.integration.Deepslope;
import e.brpl.app.services.integration.DeepslopeService;
import e.brpl.app.utils.EBrpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.INTEGRATION + EBrpl.COMPONENT.INTEGRATION.DEEPSLOPE + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class DeepslopeRest extends EBrplRest<Deepslope, DeepslopeService, String> {
}
