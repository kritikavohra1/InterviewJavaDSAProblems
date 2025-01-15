package strings;

public class CheckAnagramTest {

    public static boolean areAnagrams(String s1, String s2) {

        s1.replaceAll("\\s", "");
        s2.replaceAll("\\s", "");
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        // Your code here
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if(arr1.length == arr2.length){

            for(int i = 0; i<arr1.length; i++){

                for(int j = i+1; j<arr1.length; j++){

                    if(arr1[i] > arr1[j]){

                        char temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }

            System.out.println(String.valueOf(arr1));

            for(int i = 0; i<arr2.length; i++){

                for(int j = i+1; j<arr2.length; j++){

                    if(arr2[i] > arr2[j]){

                        char temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }

            System.out.println(String.valueOf(arr2));

            if(String.valueOf(arr1).equals(String.valueOf(arr2))){
                return true;
            } else{
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        String s1 = "geeks";
        String s2 = "keegs";
        System.out.println(areAnagrams(s1, s2));
    }
}
