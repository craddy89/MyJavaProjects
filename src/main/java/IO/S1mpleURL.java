package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class S1mpleURL {
    public static void main(String[] args) throws IOException {
        URL nbuAPI = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange");

        BufferedReader br = new BufferedReader(new InputStreamReader(nbuAPI.openStream()));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
