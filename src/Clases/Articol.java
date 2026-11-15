package Clases;

import Enums.*;
import Interfaces.Observer;
import Interfaces.Subject;

import java.util.Date;
import java.util.List;


public abstract class Articol implements Subject {
    protected TipDocument document;
    protected String Titlu;
    protected Date DataPublicare;
    protected String Continut;

    public Articol(TipDocument document) {
        this.document = document;
    }

    public Articol(TipDocument document, String titlu, Date dtaPublicare, String continut) {
        this.document = document;
        Titlu = titlu;
        DataPublicare = dtaPublicare;
        Continut = continut;
    }

    public Articol() {
    }


    public void setContinut(String continut) {
        this.Continut = continut;
        notifyObservers("Continutul");
    }

    public void setTitle(String titlu) {
        this.Titlu = titlu;
        notifyObservers("Titlul");
    }

    public void setDate(Date dtaPublicare) {
        this.DataPublicare = dtaPublicare;
        notifyObservers("Data publicarii");
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void addObservers(List<Observer> os) {
        this.observers.addAll(os);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer o : this.observers) {
            if(this.document == o.GetTipDocument()) {
                o.Notify(this, arg); //test
            }
        }
    }
}
