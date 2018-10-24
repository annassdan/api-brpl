package e.brpl.rests.integration;

import e.brpl.entities.integration.Sizing;
import e.brpl.services.integration.SizingService;
import e.brpl.utils.EBrpl;
import e.brpl.utils.rest.EBrplRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.INTEGRATION + EBrpl.COMPONENT.INTEGRATION.SIZING + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class SizingRest extends EBrplRest<Sizing, SizingService> {
}
