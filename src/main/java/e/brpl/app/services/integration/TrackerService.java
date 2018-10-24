package e.brpl.app.services.integration;

import e.brpl.app.entities.integration.Tracker;
import e.brpl.app.repositories.integration.TrackerRepo;
import e.brpl.app.utils.service.EBrplService;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class TrackerService  extends EBrplService<Tracker, TrackerRepo, String> {
}
