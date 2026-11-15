package Clases;

import Enums.TipDocument;

import java.util.Date;

public class ArticolFiscal extends Articol {
    public ArticolFiscal() {
        super(TipDocument.FISCAL);
    }

    public ArticolFiscal(String titlu, Date dtaPublicare, String continut) {
        super(TipDocument.FISCAL, titlu, dtaPublicare, continut);
    }
}
