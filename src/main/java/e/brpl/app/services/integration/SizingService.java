package e.brpl.app.services.integration;

import e.brpl.app.entities.integration.Sizing;
import e.brpl.app.repositories.integration.SizingRepo;
import e.brpl.app.utils.service.EBrplService;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class SizingService  extends EBrplService<Sizing, SizingRepo, String> {
}
