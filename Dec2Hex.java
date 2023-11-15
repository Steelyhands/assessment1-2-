import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
{

        //try catch to catch incorrect info being entered
        try{
                Arg1 = integer.parseInt(args[0]);
                char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                int rem, num;
                num = Arg1;
                String hexadecimal="";
                System.out.println("Converting the Decimal Value " + num + " to Hex...");
        //checking to see if num = 0
        if(num == 0)

         {System.out.println("hexadecimal representation is:" + (0));}
        //calculating hexadecimal
        else
           {
                rem=num%16;
                hexadecimal= ch[rem] + hexadecimal;
                num= num/16;
           }
                //printing hex answer
                System.out.println("Hexadecimal representation is: " + hexadecimal);
        //catching exception
      }
        catch(Exception e)
      {
        System.out.println("error, non convertable data entered");
      }
        //printing end statement for program no matter what try catch does, 
	//ending program as am not looping till i get a correct input
        finally
        {
         system.out.println("end of program");
        }
        }
}
