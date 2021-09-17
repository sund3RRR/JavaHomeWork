package HomeTask2;

public class dz2 {
    public static int GetVolume(Parallelepiped Parall) {
        return Parall.getASide() * Parall.getBSide() * Parall.getCSide();
    }
    public static void GetSquare(Parallelepiped Parall) {
        System.out.println("a * b = " + Parall.getASide() * Parall.getBSide());
        System.out.println("a * c = " + Parall.getASide() * Parall.getCSide());
        System.out.println("b * c = " + Parall.getBSide() * Parall.getCSide());
    }
    public static void main(String[] args) {
        Parallelepiped NewParall = new Parallelepiped();
        NewParall.setASide(2);
        NewParall.setBSide(5);
        NewParall.setCSide(4);
        
        int volume =  GetVolume(NewParall);
        System.out.println("Volume = " + volume);

        GetSquare(NewParall);
    }
}

class Parallelepiped
{
    int a;
    int b;
    int c;

    Parallelepiped()
    {
        a = 0;
        b = 0;
        c = 0;
    }

    int getASide()
    {
        return a;
    }
    int getBSide()
    {
        return b;
    }
    int getCSide()
    {
        return c;
    }
    void setASide(int aSide)
    {
        a = aSide;
    }
    void setBSide(int bSide)
    {
        b = bSide;
    }
    void setCSide(int cSide)
    {
        c = cSide;
    }
}