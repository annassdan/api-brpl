package e.brpl.app.rests.integration;

import e.brpl.app.utils.rest.EBrplRest;
import e.brpl.app.entities.integration.Sizing;
import e.brpl.app.services.integration.SizingService;
import e.brpl.app.utils.EBrpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.INTEGRATION + EBrpl.COMPONENT.INTEGRATION.SIZING + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class SizingRest extends EBrplRest<Sizing, SizingService, String> {
}
