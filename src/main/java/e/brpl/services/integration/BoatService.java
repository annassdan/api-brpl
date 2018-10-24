package e.brpl.services.integration;

import e.brpl.entities.integration.Boat;
import e.brpl.repositories.integration.BoatRepo;
import e.brpl.utils.service.EBrplService;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class BoatService extends EBrplService<Boat, BoatRepo> {
}
