package SerializationAndCloning.deepCloning.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Cow buryonka = new Cow("Buryonka", 200, 5);
        ByteArrayOutputStream byteOutput = null;
        ObjectOutputStream output = null;

        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            byteOutput = new ByteArrayOutputStream();
            output = new ObjectOutputStream(byteOutput);

            output.writeObject(buryonka);

            byteArrayInputStream = new ByteArrayInputStream(byteOutput.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);

            Cow cloneBuryonka = (Cow) objectInputStream.readObject();

            cloneBuryonka.setWeight(500);

            byteArrayInputStream.close();
            System.out.println(buryonka);
            System.out.println(cloneBuryonka);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
           if (byteOutput != null) {
                try {
                    byteOutput.flush();
                    byteOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           if (byteArrayInputStream != null) {
               try {
                   byteArrayInputStream.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
            if (output != null) {
                try {
                    output.flush();
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
