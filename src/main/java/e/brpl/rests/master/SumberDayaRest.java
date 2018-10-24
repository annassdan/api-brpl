package e.brpl.rests.master;


import e.brpl.entities.master.SumberDaya;
import e.brpl.services.master.SumberDayaService;
import e.brpl.utils.EBrpl;
import e.brpl.utils.rest.EBrplRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.MASTER + EBrpl.COMPONENT.MASTER.SUMBER_DAYA + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class SumberDayaRest extends EBrplRest<SumberDaya, SumberDayaService> {
}
