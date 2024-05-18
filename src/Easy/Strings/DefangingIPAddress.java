package Easy.Strings;

import java.util.List;

public class DefangingIPAddress {
    public static String defangIPaddr(String address) {


//        return address.replaceAll("\\.", "[.]");

        // solution 2:

        if (address == null || address.isEmpty()) {
            return "";
        }
        var sb = new StringBuilder();
        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}
