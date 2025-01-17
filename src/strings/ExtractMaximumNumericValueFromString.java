package strings;

import java.util.ArrayList;
import java.util.Collections;

public class ExtractMaximumNumericValueFromString {

    public static void extractMaximumNumber(String str){

        String[] numbers = str.split("\\D+");

        ArrayList<Integer> intNumbers = new ArrayList<Integer>();

        for (int i = 0; i< numbers.length; i++){

            intNumbers.add(Integer.parseInt(numbers[i]));
        }

        System.out.println(intNumbers.toString());

        System.out.println(Collections.max(intNumbers));

    }

    public static void main(String[] args) {

        String str = "100klh564abc365bg";
        extractMaximumNumber(str);
    }
}
