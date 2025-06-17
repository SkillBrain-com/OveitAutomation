package org.skillbrain.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGroup {

    //    private static final List<String> strings = List.of("Marius Turcanu", "Mustafa Fayed",
//            "Cristina Nedelcu", "Nicu Ilie Radu", "Corina Soare",
//            "Gianina Tantau", "Rusu Ioana Gabriel", "Adreea Buciumanu", "Anghelescu Ionut Daniel"
//            , "Marco Alecu", "Marian Radu", "Emilia Butusina", "Cornelia Brandusel", "Moldovan Ionut"
//            , "Andrei Stan", "Katea Manoila", "Marcu Andreea Vasilica", "Luca Daniela",
//            "Andreea Adina");
    private static final List<String> strings = List.of("Eduard Nita Popa",
            "Păsărică Andrei Alexandru", "Andrei-Ion Burhala", "Paula Vasiliu", "Holbură Samuel", "Andrei Paun",
            "Claudiu Ciovarnache", "Emanuel Istrate", "Marco Rabita", "Mihai Alexe", "Dumitru Gabriela", "Poenaru Alberto");


    public static List<List<String>> randomGrouping(List<String> inputList) {
        List<List<String>> groups = new ArrayList<>();
        Random random = new Random();


        if (inputList.size() < 2) {
            System.out.println("Input list should have at least 2 elements to form a pair.");
            return groups;
        }
        List<String> tempList = new ArrayList<>(inputList);

        while (tempList.size() >= 2) {
            int index1 = random.nextInt(tempList.size());
            String element1 = tempList.remove(index1);

            int index2 = random.nextInt(tempList.size());
            String element2 = tempList.remove(index2);

            int index3 = random.nextInt(tempList.size());
            String element3 = tempList.remove(index3);

            int index4 = random.nextInt(tempList.size());
            String element4 = tempList.remove(index4);

            List<String> pair = new ArrayList<>();
            pair.add(element1);
            pair.add(element2);
            pair.add(element3);
            pair.add(element4);
            groups.add(pair);
        }

        if (!tempList.isEmpty()) {
            List<String> singleElementGroup = new ArrayList<>();
            singleElementGroup.add(tempList.get(0));
            groups.add(singleElementGroup);
        }

        return groups;
    }

    public static void main(String[] args) {
        List<List<String>> groups = randomGrouping(strings);
        groups.stream().forEach(System.out::println);
    }
}
