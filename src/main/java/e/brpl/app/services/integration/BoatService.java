package e.brpl.app.services.integration;

import e.brpl.app.entities.integration.Boat;
import e.brpl.app.repositories.integration.BoatRepo;
import e.brpl.app.utils.service.EBrplService;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class BoatService extends EBrplService<Boat, BoatRepo, String> {
}
