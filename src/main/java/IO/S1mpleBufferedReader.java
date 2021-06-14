package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class S1mpleBufferedReader {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int num = Integer.parseInt(bufferedReader.readLine());
//        System.out.println(num);
        //Bytes ------->
//        int i = System.in.read();
//        System.out.println((i));
//        System.out.println((char) i);

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int i2 = inputStreamReader.read();
        System.out.println((i2));
        System.out.println((char) i2);
    }
}
