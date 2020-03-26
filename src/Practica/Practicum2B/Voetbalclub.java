package Practica.Practicum2B;

public class Voetbalclub {
    int aantalGewonnen = 0;
    int aantalGelijk = 0;
    int aantalVerloren = 0;
    String clubnaam;

    public Voetbalclub(String club) {
        clubnaam = club;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;

        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;

        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public String aantalPunten() {
        return String.valueOf(aantalGewonnen * 3 + aantalGelijk);
    }

    public String aantalGespeeld() {
        return String.valueOf(aantalGewonnen + aantalGelijk + aantalVerloren);
    }

    @Override
    public String toString() {
        return " " + clubnaam + " " +  aantalGespeeld() + " " +  aantalGewonnen + " " +  aantalGelijk + " " +  aantalVerloren + " " +  aantalPunten() ;
    }
}