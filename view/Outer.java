package view;

import model.Toy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Outer {
    public void givePrize(List<Toy> winList, String path) {
        try (FileWriter writer = new FileWriter(path, true)) {
            String text = "some text";
            writer.append(winList.get(0).toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        winList.remove(0);
    }
}
