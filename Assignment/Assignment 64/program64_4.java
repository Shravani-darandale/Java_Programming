import java.util.Scanner;

class Checkbit
{
    boolean Checkbit(int iNo)
    {
    int iMask = 0 , iResult = 0;

    iMask = (1 << 6) | (1 << 7) |(1 << 8);

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

class program64_4
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
            System.out.println("7th,8th and 9th bits are ON");

        }
        else
        {
            System.out.println("7th,8th and 9th bits are OFF");
        }
    }
}

/*
Test Cases
1)448            ON
2)64             OFF
3)128            OFF
4)256            OFF
5)192            OFF

 */