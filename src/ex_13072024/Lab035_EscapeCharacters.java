package ex_13072024;



public class Lab035_EscapeCharacters {
    public static void main(String[] args) {
         /*  In java there are some escape characters to perform some specific task
           \t-provides a tab
           \n-inserts a new line
           \r-Backlash, delete 1 word
           \b-Inserts a backspace ie deletes one character from previous string
           \f-Inserts a form feed
           \'-Inserts a single quotes
           \"-Inserts a double quotes
           \\- Inserts a backslash*/

        char E1='\t';
        char E2 ='\n';
        char E3='\r';
        char E4='\b';
        char E5= '\f';
        char E6='\'';
        char E7='\"';
        char E8='\\';


        String str1="Hello all";
        String str2= "!Welcome home";
        System.out.println("Escape character 1:"+str1+E1+str2);
        System.out.println("Escape character 2:"+str1+E2+str2);
        System.out.println("Escape character 3:"+str1+E3+str2);
        System.out.println("Escape character 4:"+str1+E4+str2);
        System.out.println("Escape character 5:"+str1+E5+str2);
        System.out.println("Escape character 6:"+str1+E6+str2+E6);
        System.out.println("Escape character 7 :"+str1+E7+str2+E7);
        System.out.println("Escape character 8 :"+str1+E8+str2+E8);
    }

}
