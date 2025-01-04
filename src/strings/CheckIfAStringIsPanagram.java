package strings;

public class CheckIfAStringIsPanagram {

    // Panagram is a string containing all characters from a-z irrespective of order or in any case
    public static boolean checkPanagram(String str){

        if (str.length() < 26){
            return false;
        } else {
            for (char c = 'a'; c<='z'; c++){

                if (str.indexOf(c)<0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "Abcdefghijklmnopqrstuvwxyz";
        System.out.println(checkPanagram(str.toLowerCase()));
    }
}
