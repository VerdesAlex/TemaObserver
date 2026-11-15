package Interfaces;

import Clases.Articol;
import Enums.TipDocument;

import java.util.Enumeration;

public interface Observer {
    TipDocument GetTipDocument();
    void Notify(Articol articol, Object arg);
}
