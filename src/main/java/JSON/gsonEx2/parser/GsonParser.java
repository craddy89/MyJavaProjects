package JSON.gsonEx2.parser;

import JSON.gsonEx2.entity.CurrencyRate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;


public class GsonParser {
    public static void parseJson(String url) {
        GsonBuilder gsonBuilder = new GsonBuilder();

        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();
        try {
            JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
            CurrencyRate[] currencyRates = gson.fromJson(jsonReader, CurrencyRate[].class);

            for (CurrencyRate currencyRate : currencyRates) {
                System.out.println(currencyRate);
            }
            String gsonString = gson.toJson(currencyRates);
            Files.writeString(Paths.get("C:\\Users\\yaksu\\IdeaProjects\\SkillBox\\src\\main\\java\\JSON\\gsonEx2\\gsonCurrency.json"), gsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
