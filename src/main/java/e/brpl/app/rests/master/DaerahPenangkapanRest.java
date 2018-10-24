package e.brpl.app.rests.master;


import e.brpl.app.services.master.DaerahPenangkapanService;
import e.brpl.app.entities.master.DaerahPenangkapan;
import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.rest.EBrplRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.MASTER + EBrpl.COMPONENT.MASTER.DAERAH_PENANGKAPAN  + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class DaerahPenangkapanRest extends EBrplRest<DaerahPenangkapan, DaerahPenangkapanService, String> {
}
