package strings;

public class GetCharaterFromString {

    public static void findCharUsingArray(String str, int index){

        char[] newArr = str.toCharArray();

        for (int i = 0; i< newArr.length; i++){

            if (i==index){
                System.out.println(newArr[i]);
            }
        }
    }

    public static void main(String[] args) {

        String str = "GeeksForGeeks";
        int index = 5;

        System.out.println(str.charAt(index));
        findCharUsingArray(str, index);
        System.out.println((char) str.codePointAt(5));

        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.replace('e', 't'));
        System.out.println(str.startsWith("Geeks"));
        System.out.println(str.endsWith("For"));
        System.out.println(str.charAt(3));
        System.out.println(str.indexOf('F'));
        System.out.println(str.lastIndexOf('e'));

    }
}
