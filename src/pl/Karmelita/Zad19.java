package pl.Karmelita;

public class Zad19 {
    public static void zad19() {
        Zad19Poem[] poems = new Zad19Poem[3];

        poems[0] = new Zad19Poem(new Zad19Author("Mickiewicz", "polak"), 15);
        poems[1] = new Zad19Poem(new Zad19Author("Szymborska", "polka"), 80);
        poems[2] = new Zad19Poem(new Zad19Author("Goete", "niemiec"), 76);


        int maxstropheNubmers = 0;
        Zad19Author author = new Zad19Author("", "");

        for (Zad19Poem poem : poems) {
            if (poem.getStropheNumbers() > maxstropheNubmers) {
                maxstropheNubmers = poem.getStropheNumbers();
            }

            if (maxstropheNubmers == poem.getStropheNumbers()) {
                author = poem.getCreator();
            }
        }


        System.out.println(author.surname);

    }


}
