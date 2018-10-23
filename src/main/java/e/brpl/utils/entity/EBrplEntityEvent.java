package e.brpl.utils.entity;

import e.brpl.utils.EBrpl;

import java.util.Date;

/**
 *
 * @param <ID>
 */
@SuppressWarnings("unused")
public interface EBrplEntityEvent<ID> extends EBrpl {

    String getUuid();
    void setUuid(String uuid);

    Date getDibuatPadaTanggal();
    void setDibuatPadaTanggal(Date date);


    Date getTerakhirDiubahPadaTanggal();
    void setTerakhirDiubahPadaTanggal(Date date);


    String getDibuatAtauTerakhirDiubahOleh();
    void setDibuatAtauTerakhirDiubahOleh(String oleh);

}
