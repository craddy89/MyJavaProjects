package IO;

import java.io.*;

public class S1mpleDataInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt"))); DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))
        ) {
            dataOutputStream.writeShort(1200);
            dataOutputStream.writeInt(1111);
            dataOutputStream.writeLong(10L);
            dataOutputStream.writeUTF("Hello World!!!");
            dataOutputStream.flush();
            System.out.println("Short " + in.readShort());
            System.out.println("Int " + in.readInt());
            System.out.println("Long " + in.readLong());
            System.out.println("UTF " + in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
