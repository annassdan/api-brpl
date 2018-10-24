package e.brpl.app.services.master;

import e.brpl.app.utils.service.EBrplService;
import e.brpl.app.entities.master.Anggota;
import e.brpl.app.repositories.master.AnggotaRepo;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class AnggotaService extends EBrplService<Anggota, AnggotaRepo, String> {
}
