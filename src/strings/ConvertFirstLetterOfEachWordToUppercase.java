package strings;

public class ConvertFirstLetterOfEachWordToUppercase {

    public static String convertFirstCharUppercase(String str){

        String[] words = str.split(" ");
        for (int i = 0; i<words.length; i++){
            System.out.println(words[i]);
        }

        StringBuilder finalStr = new StringBuilder();

        for (String word: words){

            finalStr.append(Character.toTitleCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        return finalStr.toString().trim();
    }

    public static String convertWithoutSplit(String str){

        StringBuilder finalStr = new StringBuilder();
        finalStr.append(Character.toTitleCase(str.charAt(0)));

        for (int i = 1; i<str.length(); i++){

            char ch = str.charAt(i);

            if (ch==' ' && i+1 <str.length()){

                finalStr.append(" ");
                finalStr.append(Character.toTitleCase(str.charAt(i+1)));
                i++;
            }else {
                finalStr.append(ch);
            }
        }

        return finalStr.toString().trim();
    }

    public static void main(String[] args) {

        String str = "i love pRogRamming";
        System.out.println(convertFirstCharUppercase(str.toLowerCase()));
        System.out.println(convertWithoutSplit(str.toLowerCase()));
    }
}
