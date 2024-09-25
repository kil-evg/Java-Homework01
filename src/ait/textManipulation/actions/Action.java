package ait.textManipulation.actions;

import java.util.Collections;
import java.util.List;

/* Additional requirements to the user that is adding his/her actions:
1. The new action must be added as a public method to the Action class.
2. The action name must be unique and must have the following signature: public void actionName(List<String> rows)
3. The action method should always accept a List<String> parameter that contains the rows read from the file.
The modified list will automatically be written back to the output file.
 */

public class Action {

    public void reverse(List<String> rows) {
        Collections.reverse(rows);
    }

    public void sort(List<String> rows) {
        Collections.sort(rows);
    }
}
