import java.util.Scanner;

class Checkbit
{
    boolean Checkbit(int iNo)
    {
    int iMask = 0 , iResult = 0;

    iMask = (1 << 6) | (1 << 14) |(1 << 20) | (1 << 27);

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

class program64_3
{
    public static void main(String A[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        Checkbit obj = new Checkbit();
        bRet = obj.Checkbit(iNo);

        if(bRet == true)
        {
            System.out.println("7th,15th,21st and 28th bits are ON");

        }
        else
        {
            System.out.println("7th,15th,21st and 28th bits are OFF");
        }
    }
}

/*
Test Cases
1)  135282752(All bits ON)         ON
2)  64 (Only 7th bit ON)           OFF
3)  16384(Only 15th bit ON)        OFF
4)  16448 (7th and 15th ON)        OFF

 */