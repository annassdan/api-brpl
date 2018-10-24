package e.brpl.services.integration;

import e.brpl.entities.integration.Sizing;
import e.brpl.repositories.integration.SizingRepo;
import e.brpl.utils.service.EBrplService;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("unused")
public class SizingService  extends EBrplService<Sizing, SizingRepo> {
}
