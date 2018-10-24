package e.brpl.app.rests.master;


import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.rest.EBrplRest;
import e.brpl.app.entities.master.SumberDaya;
import e.brpl.app.services.master.SumberDayaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.MASTER + EBrpl.COMPONENT.MASTER.SUMBER_DAYA + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class SumberDayaRest extends EBrplRest<SumberDaya, SumberDayaService, String> {
}
