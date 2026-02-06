import java.util.Scanner;

class ToggleBit
{
    int ToggleBit(int iNo)
   { 
        int iMask = 0 , iResult = 0;

        iMask = (1 << 6) | (1 << 9) ;

        iResult = iNo ^ iMask;

        return iResult;
   }
}

class program65_4
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        ToggleBit obj = new ToggleBit();
       
        iRet = obj.ToggleBit(iNo);

        System.out.println("Modified number : " + iRet);
    }
}

/*
Test Cases 
Enter number :     137
Modified number :  713
*/