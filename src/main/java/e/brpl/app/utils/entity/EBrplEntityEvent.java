package e.brpl.app.utils.entity;

import e.brpl.app.utils.EBrpl;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @param <ID>
 */
@SuppressWarnings("unused")
public interface EBrplEntityEvent<ID extends Serializable> extends EBrpl {

    ID getUuid();
    void setUuid(ID uuid);

    Date getDibuatPadaTanggal();
    void setDibuatPadaTanggal(Date date);


    Date getTerakhirDiubahPadaTanggal();
    void setTerakhirDiubahPadaTanggal(Date date);


    String getDibuatAtauTerakhirDiubahOleh();
    void setDibuatAtauTerakhirDiubahOleh(String oleh);


}
