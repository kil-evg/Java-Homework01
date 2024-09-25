package ait.textManipulation;

import ait.textManipulation.infra.TextManipulationUtils;

public class TextManipulationAppl {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Wrong number of arguments");
            return;
        }
        TextManipulationUtils.perform(args[0], args[1], args[2]);

    }
}
