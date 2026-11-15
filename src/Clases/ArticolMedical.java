package Clases;

import Enums.TipDocument;

import java.util.Date;
import java.util.Observable;

public class ArticolMedical extends Articol {
    public ArticolMedical() {
        super(TipDocument.MEDICINA);
    }

    public ArticolMedical(String titlu, Date dtaPublicare, String continut) {
        super(TipDocument.MEDICINA, titlu, dtaPublicare, continut);
    }

}
