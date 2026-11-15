import Clases.Articol;
import Clases.ArticolFiscal;
import Clases.ArticolMedical;
import Clases.Notifiator;
import Enums.TipDocument;
import Interfaces.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArticolMedical articolMedical = new ArticolMedical("Despre Rinichi", new Date(2026),"rinichi buni");
        ArticolFiscal articolFiscal = new ArticolFiscal("Despre taxe", new Date(2026),"taxe scumpe");

        Notifiator n1  = new Notifiator(TipDocument.FISCAL);
        Notifiator n2  = new Notifiator(TipDocument.FISCAL);
        Notifiator n3  = new Notifiator(TipDocument.MEDICINA);
        Notifiator n4  = new Notifiator(TipDocument.MEDICINA);
        Notifiator n5  = new Notifiator(TipDocument.POLITICA);

        List<Observer> notifiers = new ArrayList<>();
        notifiers.add(n1);
        notifiers.add(n2);
        notifiers.add(n3);
        notifiers.add(n4);
        notifiers.add(n5);

        articolMedical.addObservers(notifiers);
        articolFiscal.addObservers(notifiers);

        System.out.println("Articol FISCAL: ----------------------------");
        articolFiscal.setContinut("Taxe prea scumpe");
        articolFiscal.setTitle("Anti taxe");

        System.out.println("Articol MEDICAL: ----------------------------");
        articolMedical.setContinut("Rinichi trebuie protejati");
    }
}