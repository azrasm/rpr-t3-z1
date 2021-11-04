package ba.unsa.etf.rpr;

enum Grad{ SARAJEVO, TUZLA, ZENICA, BRCKO };

public class FiksniBroj extends TelefonskiBroj{
    FiksniBroj(Grad grad, String broj);
    void ispisi()
}
