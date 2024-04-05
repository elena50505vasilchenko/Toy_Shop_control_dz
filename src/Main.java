import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Lottery();

        Lottery.put("1 Мяч 10 0.10");
        Lottery.put("2 Кукла 40 0.40");
        Lottery.put("3 Машинка 50 0.50");


        ArrayList<Toys> winners = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int wonToyId = Lottery.getToyId();
            Toys wonToy = Lottery.getToyById(wonToyId);
            assert wonToy != null;
            if (Lottery.checkAvailable(wonToy)) {
                winners.add(wonToy);
            }
        }
        Lottery.saveToFile("Result.txt", winners);
    }
}