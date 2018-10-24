package e.brpl.app.services.integration;

import e.brpl.app.entities.integration.Findmespot;
import e.brpl.app.repositories.integration.FindmespotRepo;
import e.brpl.app.utils.service.EBrplService;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class FindmespotService  extends EBrplService<Findmespot, FindmespotRepo, String> {
}
