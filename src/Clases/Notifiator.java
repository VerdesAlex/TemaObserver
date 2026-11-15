package Clases;

import Enums.TipDocument;
import Interfaces.Observer;

import java.util.ArrayList;

public class Notifiator implements Observer {


    protected TipDocument tipDocument;

    public Notifiator(TipDocument tipDocument) {
        this.tipDocument = tipDocument;
    }

    @Override
    public TipDocument GetTipDocument() {
        return tipDocument;
    }

    @Override
    public void Notify(Articol articol, Object arg) {
        System.out.println("Articolul " + articol.Titlu + " tip " + articol.document + " si-a schimbat " + arg);
    }
}
