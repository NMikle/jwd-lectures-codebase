package com.epam.jwd.lecture.app;

import com.epam.jwd.lecture.serialization.ToBeSerialized;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        final Scanner scanner = new Scanner(new File("helloFile.f"));
////        scanner.useDelimiter("W");
//        while (scanner.hasNext()) {
//            final BigDecimal bd = scanner.nextBigDecimal();
//            if (scanner.hasNextInt()) {
//                final int i = scanner.nextInt() + 1;
//                System.out.println(i);
//            } else {
//                final String nextString = scanner.next();
//                System.out.println(nextString);
//            }
//        }

        final ToBeSerialized toBeSerialized = new ToBeSerialized("Serialization Works!", 4);
        final ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("ser.f"));
        output.writeObject(toBeSerialized);

        final ObjectInputStream input = new ObjectInputStream(new FileInputStream("ser.f"));
        final Object deserializedObject = input.readObject();
        System.out.println(deserializedObject);
    }
}
