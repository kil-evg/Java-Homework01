package ait.textManipulation.actions;

import java.util.Collections;
import java.util.List;

public class Action {

    public void reverse(List<String> rows) {
        Collections.reverse(rows);
    }

    public void sort(List<String> rows) {
        Collections.sort(rows);
    }
}
