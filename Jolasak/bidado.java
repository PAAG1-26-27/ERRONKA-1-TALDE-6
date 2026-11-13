public static void Bidadojolasa(ArrayList<Integer>P1, ArrayList<Integer>CPU,Scanner sc)
{
    int aukera = 0;
    int max = 6;//ausazko zenbaki handiena
    int min = 1;//ausazko zenbaki txikiena
    int berriro;

    do
    {
        P1.clear();
        CPU.clear();
        int zenb1 = 0;
        int zenb2 = 0;
        int P1guztia = 0;
        int CPUguztia = 0;

        //jokalariaren 1. dadoa
        do
        {
            System.out.println("Sakatu 1 dadoa botatzeko:");
            aukera = sc.nextInt();
            if (aukera != 1)
            {
                System.out.println("Aukera okerra. Sakatu 1 dadoa botatzeko!");
            }
        }
        while (aukera != 1);
        zenb1 = (int) (Math.random() * max + min);
        System.out.println("Zure dadoa = " + zenb1);
        P1guztia += zenb1;
        P1.add(zenb1);

        //jokalariaren 2. dadoa
        do
        {
            System.out.println("Sakatu 1 bigarren dadoa botatzeko:");
            aukera = sc.nextInt();
            if (aukera != 1)
            {
                System.out.println("Aukera okerra. Sakatu 1 dadoa botatzeko!");
            }
        }
        while (aukera != 1);
        zenb2 = (int) (Math.random() * max + min);
        System.out.println("Zure dadoa = " + zenb2);
        P1guztia += zenb2;
        P1.add(zenb2);

        //CPUren 1. tirada
        zenb1 = (int) (Math.random() * max + min);
        CPUguztia += zenb1;
        CPU.add(zenb1);
        System.out.println("CPUren dadoa = " + zenb1);

        //CPUren 2. tirada
        zenb2 = (int) (Math.random() * max + min);
        System.out.println("CPUren dadoa = " + zenb2);
        CPUguztia += zenb2;
        CPU.add(zenb2);

        // puntuen konparaketa
        if (P1guztia > CPUguztia)
        {
            System.out.println("Irabazi duzu! Zorionak!");
        }
        else if (P1guztia < CPUguztia)
        {
            System.out.println("Galdu duzu! Sorte hobeagoa hurrengoan!");
        }
        else
        {
            while (P1guztia == CPUguztia)
            {
                do
                {
                    System.out.println("Berdinketa!!!");
                    System.out.println("Sakatu 1 beste dado bat botatzeko:");
                    aukera = sc.nextInt();
                    if (aukera != 1)
                    {
                        System.out.println("Aukera okerra. Sakatu 1 dadoa botatzeko!");
                    }
                }
                while (aukera != 1);
                zenb1 = (int) (Math.random() * max + min);
                P1guztia += zenb1;
                System.out.println("Zure dadoa = " + zenb1);
                P1.add(zenb1);

                zenb1 = (int) (Math.random() * max + min);
                System.out.println("CPUren dadoa = " + zenb1);
                CPUguztia += zenb1;
                CPU.add(zenb1);
            }
            if (P1guztia > CPUguztia)
            {
                System.out.println("Berdinketa ostean... IRABAZI DUZU!! ZORIONAK!");
            }
            else
            {
                System.out.println("Berdinketa ostean... GALDU DUZU =( Sorte hobeagoa hurrengoan!");
            }
        }

        System.out.println("\n--- PARTIDAREN LABURPENA ---");
        System.out.println("Zure tiradak (P1): " + P1);
        System.out.println("CPUren tiradak: " + CPU);
        System.out.println("Zure puntu totala: " + P1guztia);
        System.out.println("CPUren puntu totala: " + CPUguztia);

        //berriro jokatu nahi duen galdetu
        do
        {
            System.out.println("\nBerriro jokatu nahi duzu? 1 = Bai, 2 = Ez");
            berriro = sc.nextInt();
            if (berriro != 1 && berriro != 2)
            {
                System.out.println("Aukera okerra. Sakatu 1 edo 2.");
            }
        }
        while (berriro != 1 && berriro != 2);
    }
    while (berriro == 1);
    //berriro == 2 denean metodoa amaitzen da eta menu nagusira itzultzen da
}
