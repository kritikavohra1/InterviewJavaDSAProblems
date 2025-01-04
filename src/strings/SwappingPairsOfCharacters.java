package strings;

public class SwappingPairsOfCharacters {

    public static void swapChar(String str){

        char[] newArr = str.toCharArray();

        if (newArr.length %2==0){

            for (int i = 0; i<newArr.length-1; i = i+2){

                char temp = newArr[i];
                newArr[i] = newArr[i+1];
                newArr[i+1] = temp;
            }
        } else {

            for (int i = 0; i<newArr.length-1; i = i+2){

                char temp = newArr[i];
                newArr[i] = newArr[i+1];
                newArr[i+1] = temp;
            }

        }

        System.out.println(new String(newArr));
    }

    public static void main(String[] args) {

        String str = "GeeksForGeeks";
        swapChar(str);

    }
}
