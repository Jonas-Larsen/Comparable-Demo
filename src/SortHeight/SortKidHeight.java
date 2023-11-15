package SortHeight;

import java.util.ArrayList;
import java.util.Collections;

public class SortKidHeight {
    private ArrayList<Kid> Heights;

    public static void main(String[] args) {
        new SortKidHeight().run();
    }

    private void run() {
        Heights = new ArrayList<>();

        Heights.add(new Kid(155, "Mia"));
        Heights.add(new Kid(157, "Camilla"));
        Heights.add(new Kid(135, "Frank"));
        Heights.add(new Kid(170, "Morten"));
        Heights.add(new Kid(160, "Casper"));
        Heights.add(new Kid(182, "Jonas"));
        Heights.add(new Kid(192, "Lars"));
        Heights.add(new Kid(122, "Amalie"));
        Heights.add(new Kid(208, "Marcus"));
        Heights.add(new Kid(166, "Mette"));


        for (Kid kid : Heights) {
            System.out.println(kid.getHeightInCm() + "Cm " + "   " + kid.getName());
        }

        Collections.sort(Heights);

        System.out.println("----------------------------------");

        for (Kid kid : Heights){
            System.out.println(kid.getHeightInCm() + "Cm " + "   " + kid.getName());
        }

        System.out.println("----------------------------------");

        Kid shortestKid = Heights.get(0);
        System.out.println("The shortest kid: " + shortestKid.getHeightInCm() + "Cm" + "  " + shortestKid.getName());

        Kid tallestKid = Heights.get(Heights.size() - 1);
        System.out.println("The tallest kid: " + tallestKid.getHeightInCm() + "Cm" + "  " + tallestKid.getName());
    }
}
