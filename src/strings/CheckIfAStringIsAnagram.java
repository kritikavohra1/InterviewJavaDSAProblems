package strings;

public class CheckIfAStringIsAnagram {

    public static void checkStringIsAnagram(String str1, String str2){

        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] chararr1 = str1.toCharArray();
        char[] chararr2 = str2.toCharArray();

        for (int i = 0; i<chararr1.length; i++){

            for (int j = i+1; j<chararr1.length; j++){

                if (chararr1[i] > chararr1[j]){
                    char temp = chararr1[i];
                    chararr1[i] = chararr1[j];
                    chararr1[j] = temp;
                }
            }
        }

        for (int i = 0; i<chararr2.length; i++){

            for (int j = i+1; j<chararr2.length; j++){

                if (chararr2[i] > chararr2[j]){
                    char temp = chararr2[i];
                    chararr2[i] = chararr2[j];
                    chararr2[j] = temp;
                }
            }
        }

        System.out.println("String 1: "+String.valueOf(chararr1));
        System.out.println("String 2: "+String.valueOf(chararr2));

        if (String.valueOf(chararr1).equals(String.valueOf(chararr2))){
            System.out.println("String is anagram");
        } else {
            System.out.println("STring is not anagram");
        }

    }

    public static void main(String[] args) {

        String str1 = "geeks";
        String str2 = "ekegs";
        checkStringIsAnagram(str1, str2);
    }
}
