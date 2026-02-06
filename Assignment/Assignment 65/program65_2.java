import java.util.Scanner;

class Checkbit
{
    int BitOff(int iNo)
   { 
        int iMask = 0 , iResult = 0;

        iMask = (1 << 6) | (1 << 9);

        iResult = iNo & (~iMask);

        return iResult;
   }
}

class program65_2
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        Checkbit obj = new Checkbit();
       
        iRet = obj.BitOff(iNo);

        System.out.println("Modified number : " + iRet);
    }
}

/*
Test Cases 
Enter number :    577
Modified number :  1
*/