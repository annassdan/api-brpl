package e.brpl.rests.master;


import e.brpl.entities.master.DaerahPenangkapan;
import e.brpl.services.master.DaerahPenangkapanService;
import e.brpl.utils.EBrpl;
import e.brpl.utils.rest.EBrplRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(value = "/api/master/daerahpenangkapan/",
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class DaerahPenangkapanRest extends EBrplRest<DaerahPenangkapan, DaerahPenangkapanService> {
}