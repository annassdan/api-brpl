package e.brpl.utils;

@SuppressWarnings("unused")
public interface EBrpl {

    String BRPL_GENERATOR = "brpl_id";
    String BRPL_GENERATOR_STRATEGY = "e.brpl.configurations.EBrplIdGenerator";
    String DATE_PATTERN = "dd/MM/yyyy";
    String TIME_PATTERN = "HH:mm";
    String DATE_TIME_PATTERN = "dd/MM/yyyy HH:mm:ss.SSS";
    String PK_PATH_VARIABLE = "pk";

    interface PAGING {
        String PAGE = "page";
        String SIZE = "size";
    }

    interface PRODUCES_MODE {
        String JSON = "application/json";
    }

    interface COMPONENT {
        interface MASTER {
            String DAERAH_PENANGKAPAN = "daerahpenangkapan";
            String SUMBER_DAYA = "sumberdaya";
            String SPESIES = "spesies";
        }
        interface CORE {

        }
    }

    interface PATH_PREFIX {
        String MASTER = "/api/master/";
        String CORE = "/api/core/";
    }


}
