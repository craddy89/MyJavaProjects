package JSON.gsonEx2;

import JSON.gsonEx2.parser.GsonParser;

public class Main {
    public static void main(String[] args) {
        GsonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
