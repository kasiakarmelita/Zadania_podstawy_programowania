package pl.Karmelita;

public class Zad19Poem {
    Zad19Author creator;
    int stropheNumbers;

    public Zad19Poem(Zad19Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public Zad19Author getCreator() {
        return creator;
    }

    public void setCreator(Zad19Author creator) {
        this.creator = creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }
}
