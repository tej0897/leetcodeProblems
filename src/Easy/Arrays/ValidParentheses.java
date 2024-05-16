package Easy.Arrays;

public class ValidParentheses
{
    public boolean checkValidString(String inputStr)
    {
        // computing the length of the input string
        int size = inputStr.length();

        if(size % 2 == 1)
        {
            // if the size of the inputStr is odd
            // then the string is not a valid string.
            return false ;
        }

        int level = 0;
        int j = 0 ;


        boolean isValid = true ;
        for( int k = 0; k < inputStr.length(); k++ )
        {

            if( inputStr.charAt( k ) == '(' || inputStr.charAt( k ) == '[' || inputStr.charAt( k ) == '{' )
            {
                // increasing the count by one means we have encountered an opening bracket
                level = level + 1 ;
            }
            else
            {
                // decreasing the count by one means we have encountered a closing bracket
                level = level - 1 ;
            }

            // level = 0 means the number of the opening bracket and the
            // closing brackets are the same in number
            if( level == 0 )
            {
                // checking whether j & k are valid or not
                // and apply recursion for the other parenthesis that are nested
                if( isPair( inputStr.charAt( j ), inputStr.charAt( k ) ) )
                {
                    return false ;
                }
                if( j + 1 < k )
                {
                    // if this block comes into action, then it means,
                    // the first and the last character of the string form a valid pair
                    // so we can remove that pair and consider the rest of the string recursively
                    isValid = checkValidString( inputStr.substring( j + 1, k ) ) ;
                }
                j = k + 1 ;
            }
        }

        if( level == 0 )
        {
            return isValid ;
        }

        // control has reached here. Hence,
        // the total number of open brackets
        // and close brackets are not the same.
        // Hence, false should be returned
        return false ;
    }

    // a method that checks whether p and q form the
    // valid pair or not
    public static boolean isPair( char p, char q )
    {
        if( p == '(' )
        {
            if( q == ')' )
            {
                return false ;
            }
            return true ;
        }
        else if( p == '[' )
        {
            if( q == ']' )
            {
                return false ;
            }
            return true ;
        }
        else if( p == '{' )
        {
            if( q == '}' )
            {
                return false ;
            }
            return true ;
        }
        // it means p is not an opening brace
        return true;
    }

    // main method
    public static void main(String argvs[])
    {

        // creating an object of the class ValidString
        ValidParentheses obj = new ValidParentheses();

        // input 1
        String inputStr = "(())";

        // invoking the method checkValidString()
        boolean isValidString = obj.checkValidString(inputStr);

        if(isValidString)
        {
            System.out.println("The string \"" + inputStr + "\" is a valid string.");
        }
        else
        {
            System.out.println("The string \"" + inputStr + "\" is not a valid string.");
        }

        System.out.println( );

        // input 2
        inputStr = "(({)})";

        // invoking the method checkValidString()
        isValidString = obj.checkValidString(inputStr);

        if(isValidString)
        {
            System.out.println("The string \"" + inputStr + "\" is a valid string.");
        }
        else
        {
            System.out.println("The string \"" + inputStr + "\" is not a valid string.");
        }

        System.out.println( );

        // input 3
        inputStr = "(({}))";

        // invoking the method checkValidString()
        isValidString = obj.checkValidString(inputStr);

        if(isValidString)
        {
            System.out.println("The string \"" + inputStr + "\" is a valid string.");
        }
        else
        {
            System.out.println("The string \"" + inputStr + "\" is not a valid string.");
        }

        System.out.println( );

        // input 4
        inputStr = ")([{}])";

        // invoking the method checkValidString()
        isValidString = obj.checkValidString(inputStr);

        if(isValidString)
        {
            System.out.println("The string \"" + inputStr + "\" is a valid string.");
        }
        else
        {
            System.out.println("The string \"" + inputStr + "\" is not a valid string.");
        }

        System.out.println( );

        // input 5
        inputStr = "()(({}))(";

        // invoking the method checkValidString()
        isValidString = obj.checkValidString(inputStr);

        if(isValidString)
        {
            System.out.println("The string \"" + inputStr + "\" is a valid string.");
        }
        else
        {
            System.out.println("The string \"" + inputStr + "\" is not a valid string.");
        }

    }
}
