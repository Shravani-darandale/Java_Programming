import java.util.Scanner;

class Checkbit
{
    boolean Checkbit(int iNo)
    {
    int iMask = 0 , iResult = 0;

    iMask = (1 << 4) | (1 << 17);

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

class program64_2
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
            System.out.println("5th and 18th bit is ON");

        }
        else
        {
            System.out.println("5th and 18th bit is OFF");
        }
    }
}