import java.util.Scanner;

class OnBit
{
    int OnBit(int iNo)
   { 
        int iMask = 0 , iResult = 0;

        iMask = 0x0F ;

        iResult = iNo | iMask;

        return iResult;
   }
}

class program65_5
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        OnBit obj = new OnBit();
       
        iRet = obj.OnBit(iNo);

        System.out.println("Modified number : " + iRet);
    }
}

/*
Test Cases 
Enter number :     73
Modified number :  79
*/