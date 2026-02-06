import java.util.Scanner;

class Checkbit
{
    boolean Checkbit(long iNo)
    {
    long iMask = 0 , iResult = 0;

    iMask = (1L << 0) | (1L << 31L);

    iResult = iNo & iMask;

    if(iResult == iMask)
    {
        return true;
    }
    else
    {
        return false;
    }
}
}

class program64_5
{
    public static void main(String A[])
    {
        long iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextLong();

        Checkbit obj = new Checkbit();
        bRet = obj.Checkbit(iNo);

        if(bRet == true)
        {
            System.out.println("First and last bits are ON");

        }
        else
        {
            System.out.println("First and last bits are OFF");
        }
    }
}

/*
Test Cases
1)2147483649        ON
2)2147483648        OFF
3)1                 OFF
4)0                 OFF
5)2147483651        ON
*/
