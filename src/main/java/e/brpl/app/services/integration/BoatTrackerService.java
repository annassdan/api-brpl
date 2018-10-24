package e.brpl.app.services.integration;

import e.brpl.app.entities.integration.BoatTracker;
import e.brpl.app.repositories.integration.BoatTrackerRepo;
import e.brpl.app.utils.service.EBrplService;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class BoatTrackerService  extends EBrplService<BoatTracker, BoatTrackerRepo, String> {
}
