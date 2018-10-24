package e.brpl.services.integration;

import e.brpl.entities.integration.BoatTracker;
import e.brpl.repositories.integration.BoatTrackerRepo;
import e.brpl.utils.service.EBrplService;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class BoatTrackerService  extends EBrplService<BoatTracker, BoatTrackerRepo> {
}
