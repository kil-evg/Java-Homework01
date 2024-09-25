package ait.textManipulation.infra;

import ait.textManipulation.actions.Action;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TextManipulationUtils {
    public static void perform(String src, String dst, String action) {

        List<String> rows = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(src))) {
            String row = br.readLine();
            while (row != null) {
                rows.add(row);
                row = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Class<Action> clazz = Action.class;
        try {
            Method method = clazz.getDeclaredMethod(action, List.class);
            method.invoke(clazz.getDeclaredConstructor().newInstance(), rows);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(action + " doesn't exists");
        }

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(dst, false), true)) {
            rows.forEach(r -> printWriter.println(r));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
