package ProgramowanieObiektowe;

public class ProgramowanieObiektowe {

    public static void main (String arhs[])
    {



        Test pierwszy = new Test();

        int wynik = pierwszy.dodaj(10,20);
        System.out.println(wynik);
    }

}

class Test
{


    int dodaj(int a, int b)
    {
        return a + b;


    }

}
