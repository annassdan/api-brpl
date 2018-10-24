package e.brpl.utils;

@SuppressWarnings("unused")
public interface EBrpl {

    String BRPL_GENERATOR = "brpl_id";
    String BRPL_GENERATOR_STRATEGY = "e.brpl.configurations.EBrplIdGenerator";
    String DATE_PATTERN = "dd/MM/yyyy";
    String TIME_PATTERN = "HH:mm";
    String DATE_TIME_PATTERN = "dd/MM/yyyy HH:mm:ss.SSS";
    String PK_PATH_VARIABLE = "pk";
    String DIVIDER = "_";
    String SLASH = "/";

    interface PAGING {
        String PAGE = "page";
        String SIZE = "size";
    }

    interface PRODUCES_MODE {
        String JSON = "application/json";
    }

    interface COMPONENT {
        String MASTER_COMPONENT = "master";
        interface MASTER {
            String DAERAH_PENANGKAPAN = "daerahpenangkapan";
            String SUMBER_DAYA = "sumberdaya";
            String SPESIES = "spesies";
        }

        String ADMINISTRATOR_COMPONENT = "administrator";
        interface ADMINISTRATOR {

        }

        String CORE_COMPONENT = "ebrpl";
        interface CORE {

        }

        String INTEGRATION_COMPONENT = "eksternal";
        interface INTEGRATION {
            String BOAT = "boat";
            String BOAT_TRACKER = "boat_tracker";
            String DEEPSLOPE = "deepslope";
            String FINDMESPOT = "findmespot";
            String SIZING = "sizing";
            String TRACKER = "tracker";
        }
    }

    interface PATH_PREFIX {
        String MASTER = "/api/master/";
        String CORE = "/api/core/";
        String INTEGRATION = "/api/integration/";
    }


}
