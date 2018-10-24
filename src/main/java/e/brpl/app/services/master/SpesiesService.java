package e.brpl.app.services.master;


import e.brpl.app.utils.service.EBrplService;
import e.brpl.app.entities.master.Spesies;
import e.brpl.app.repositories.master.SpesiesRepo;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class SpesiesService extends EBrplService<Spesies, SpesiesRepo, String> {
}
