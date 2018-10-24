package e.brpl.app.utils;

@SuppressWarnings("unused")
public interface EBrpl {

    String BRPL_GENERATOR = "brpl_id";
    String BRPL_GENERATOR_STRATEGY = "e.brpl.app.configurations.EBrplIdGenerator";
    String DATE_PATTERN = "dd/MM/yyyy";
    String TIME_PATTERN = "HH:mm";
    String DATE_TIME_PATTERN = "dd/MM/yyyy HH:mm:ss.SSS";
    String ID_DATE_PATTERN = "yyyyMMddMMmmss";
    String PK_PATH_VARIABLE = "pk";
    String DIVIDER = "_";
    String SLASH = "/";

    interface RESOURCE_PATH {
        interface PHOTO {
            String ANGGOTA = "res/photos/anggota/";
        }
    }

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
            String ALAT_TANGKAP = "alattangkap";
            String SPESIFIKASI_ALAT_TANGKAP = "spesifikasialattangkap";
            String ANGGOTA = "anggota";
        }

        String ADMINISTRATOR_COMPONENT = "administrator";
        interface ADMINISTRATOR {

        }

        String CORE_COMPONENT = "ebrpl";
        interface CORE {
            String PENDARATAN = "pendaratan";
            String RINCIAN_PENDARATAN = "rincianpendaratan";
            String RINCIAN_TANGKAPAN_PENDARATAN = "pendaratandetailtangkapan";
            String OPERASIONAL = "operasional";
            String SPESIFIKASI_ALAT_TANGKAP_OPERASIONAL = "operasionalspesifikasialattangkap";
            String RINCIAN_TANGKAPAN_OPERASIONAL = "operasionaldetailtangkapan";
            String BIOLOGI_REPRODUKSI = "biologireproduksi";
            String RINCIAN_BIOLOGI_REPRODUKSI = "biologireproduksidetail";
            String BIOLOGI_UKURAN = "biologiukuran";
            String RINCIAN_BIOLOGI_UKURAN = "biologiukurandetail";
            String RINCIAN_SAMPEL_BIOLOGI_UKURAN = "biologiukuranrinciansample";
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
