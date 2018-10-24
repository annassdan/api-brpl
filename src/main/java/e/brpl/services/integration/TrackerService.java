package e.brpl.services.integration;

import e.brpl.entities.integration.Tracker;
import e.brpl.repositories.integration.TrackerRepo;
import e.brpl.utils.service.EBrplService;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class TrackerService  extends EBrplService<Tracker, TrackerRepo> {
}
