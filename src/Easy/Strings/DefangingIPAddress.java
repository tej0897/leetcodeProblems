package Easy.Strings;

public class DefangingIPAddress {
    public static String defangIPaddr(String address) {

        StringBuilder temp = new StringBuilder(address);
        for (int i=0; i<temp.length(); i++){
            if (temp.charAt(i) == '.'){
                temp.replace(i, i, "[.]");
            }
        }

        return temp.toString();

    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}
