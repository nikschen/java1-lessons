package de.niklaswiemuth.tryjava;


class MyFirstStartClass {

    public static void not_main_anymore(String[] args) {

        for(int saidNumber=1;saidNumber<=100;saidNumber++)
        {
            if (saidNumber%5==0)
            {
                if (saidNumber%7==0)
                {
                    System.out.println("FitzQuark");
                }
                else
                {
                    System.out.println("Fitz");
                }
            }
            else if (saidNumber%7==0)
            {
                System.out.println("Quark");
            }
            else
            {
                System.out.println(saidNumber);
            }
        }
    }

}