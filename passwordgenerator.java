import java.util.Scanner;

public class passwordgenerator {
    public static void main(String[] args)
    {   //the passwords are combination of :
        // '0'-'9' => ASCII 48-57
        //'a'-'b' => 65-90
        // 'A'-'B' =>97-122
        //'0'-'9' = 10 , 'a'-'b' = 26 , 'A'-'B' = 26 ===>> total is 62 characters
       
        Scanner object_input = new Scanner(System.in);
        int n_pass ;
        int n_length ;

        //asking the user how many password he wants to generate 
        System.out.println("how many password you want to be  generated : ");
        n_pass = object_input.nextInt();

        //asking about the length of the password
        System.out.println("Enter the length of the passwords  : ");
        n_length = object_input.nextInt();

        //creating an array that will store all the generated passwords

        String passwords[] = new String[n_pass];

        //loop through the number of passwords to generate the password with n_length character

        for (int i = 0 ; i < n_pass ; i++)
        {
            //creating a string that will store the generated password
            String password = "";
                        
            for (int j = 0 ; j < n_length ; j++)
            {
                password += randomChar();

            }
            //adding the password to our array
            passwords[i] = password;
        }

        //print our passwords 
        display_passwords(passwords);

    }

    public static void display_passwords(String[] passwords)
    {
        for (int i = 0; i < passwords.length; i++)
        {
            System.out.println(passwords[i]);
        }

    }

    public static char randomChar()
    {
        int rand;
        rand = (int)(Math.random()*62);
        //we multiply by 62 means that we have a plage of numbers from 0 to 61

        if (rand >= 0 && rand <= 9)
        {
            //rand is a number
            //we have to convert it into ascii
            rand += 48;
            return (char)rand;

        }
        else if (rand >= 10 && rand <= 35)
        {
            //rand is a lower case
            //we have to convert it into ascii
            rand += 55;
            return (char)rand;

        }
        else
        {
            //rand is a upper case
            rand += 61;
            return (char)rand;       

        }

    }   

}
