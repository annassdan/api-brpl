package e.brpl.app.rests.master;


import e.brpl.app.utils.EBrpl;
import e.brpl.app.utils.rest.EBrplRest;
import e.brpl.app.entities.master.SpesifikasiAlatTangkap;
import e.brpl.app.services.master.SpesifikasiAlatTangkapService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
@RequestMapping(
        value = EBrpl.PATH_PREFIX.MASTER + EBrpl.COMPONENT.MASTER.SPESIFIKASI_ALAT_TANGKAP + EBrpl.SLASH,
        produces = { EBrpl.PRODUCES_MODE.JSON }
)
public class SpesifikasiAlatTangkapRest extends EBrplRest<SpesifikasiAlatTangkap, SpesifikasiAlatTangkapService, String> {
}
