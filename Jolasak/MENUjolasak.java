/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menujolasak;

/**
 *
 * @author Munoz.Maikel
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class MENUjolasak {
    
public static void Blackjackjolasa(Scanner sc){
Random ausazkoa = new Random();

        // ArrayList-ak sortu
        ArrayList<Integer> jokalaria = new ArrayList<>();
        ArrayList<Integer> programa = new ArrayList<>();

        int jokalariaKopurua = 0;
        int programaKopurua = 0;
        int zenb;
        String aukera;

        System.out.println("\nBLACK JACK");

        // Jokalariari 2 ausazko zenbaki eman (1 eta 11 artean)
        for(int i = 0; i < 2; i++) {
            zenb = ausazkoa.nextInt(11) + 1;
            jokalaria.add(zenb);
            jokalariaKopurua = jokalariaKopurua + zenb;
        }

        // Programari 2 ausazko zenbaki eman (1 eta 11 artean)
        for(int i = 0; i < 2; i++) {
            zenb = ausazkoa.nextInt(11) + 1;
            programa.add(zenb);
            programaKopurua = programaKopurua + zenb;
        }

        // Hasierako emaitzak
        System.out.println("\nZURE TXANDA:");
        System.out.println("Zure zenbakiak:" + jokalaria);
        System.out.println("Zure kopurua:" + jokalariaKopurua);
        System.out.println("---------");

        // Menuaren sc.nextInt()-k uzten duen enter karakterea garbitzeko
        sc.nextLine();

        // Jokalariaren txanda
        while(jokalariaKopurua < 21) {
            System.out.println("Beste zenbaki bat nahi duzu?(bai/ez)");    
            aukera = sc.nextLine();

            if(aukera.equalsIgnoreCase("bai")) {
                zenb = ausazkoa.nextInt(11) + 1;
                jokalaria.add(zenb);
                jokalariaKopurua = jokalariaKopurua + zenb;

                System.out.println("Zenbaki berria:" + zenb);
                System.out.println("Zure zenbaki guztiak:" + jokalaria);
                System.out.println("Zure kopurua:" + jokalariaKopurua);
                System.out.println("---------");

            } else if(aukera.equalsIgnoreCase("ez")) {
                break;
            } else {
                System.out.println("Aukera okerra. Saiatu berriro");
            }
        }

        // Jokalaria 21 pasatzen bada
        if(jokalariaKopurua > 21) {
            System.out.println("21 baino gehiago! GALDU DUZU");
        } else {
            // Programaren txanda
            System.out.println("\nPROGRAMAREN TXANDA:");
            System.out.println("Programaren hasierako zenbakiak:" + programa);
            System.out.println("Programaren hasierako kopurua:" + programaKopurua);
            System.out.println("---------");

            // <=16 beste bat eskatu, >=17 gelditu
            while(programaKopurua <= 16) {
                zenb = ausazkoa.nextInt(11) + 1;
                programa.add(zenb);
                programaKopurua = programaKopurua + zenb;

                System.out.println("Zenbaki berria:" + zenb);
                System.out.println("Zenbaki guztiak:" + programa);
                System.out.println("Programaren kopurua:" + programaKopurua);
                System.out.println("---------");
            }

            if(programaKopurua >= 17) {
                System.out.println("Programak 17 edo gehiago duenez, ezin du zenbaki gehiago eskatu.");
            }

            // Azken emaitzak
            System.out.println("\nAZKEN EMAITZAK");
            System.out.println("Zure kopurua:" + jokalariaKopurua);
            System.out.println("Programaren kopurua:" + programaKopurua);
            System.out.println("---------");

            // Irabazlea erabaki
            if(programaKopurua > 21) {
                System.out.println("Programak 21 baino gehiago ditu. IRABAZI DUZU!!!");
            } else if(jokalariaKopurua > programaKopurua) {
                System.out.println("IRABAZI DUZU!!!");
            } else if(jokalariaKopurua < programaKopurua) {
                System.out.println("PROGRAMAK IRABAZI DU");
            } else {
                System.out.println("ENPATEA!");
            }
        }
    } // Blackjackjolasa metodoaren amaiera

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
}//bidadojolas amaiera
public static void Ruletajolasa(Scanner sc)
{
Random random = new Random();
            int puntos=100;
            int apuesta;
            int aukera;
            int zenbakiAtera;

            do{
                if (puntos <= 0) {
                    System.out.println("\nEz daukazu punturik jokatzeko! Jokoa amaitu da.");
                    break; // Ziklotik kanpora doa zuzenean
                }

                System.out.println("Nola jokatu nahi duzu??");
                System.out.println("1.-Kolorez");
                System.out.println("2.-Bakoiti/bikoiti");
                System.out.println("3.-Zenbakiz");
                System.out.println("4.-Exit");
                System.out.println("Aukeratu zer egin:");
                aukera = sc.nextInt();

                switch(aukera){
                    case 1:
                        do {
                            System.out.print("Zenbat puntu jokatu nahi dituzu? (1 - " + puntos + "): ");
                            apuesta = sc.nextInt();
                        } while (apuesta <= 0 || apuesta > puntos);

                        System.out.println("Ze kolore erabili nahi duzu??");
                        System.out.println("1. Gorria");
                        System.out.println("2. Beltza");
                        System.out.println("3. Berdea");
                        System.out.print("Aukeratu kolorea (1-3): ");
                        int koloreAukera = sc.nextInt();
                        
                        String aukeratutakoKolorea = "";
                        if (koloreAukera == 1) aukeratutakoKolorea = "Gorria";
                        else if (koloreAukera == 2) aukeratutakoKolorea = "Beltza";
                        else if (koloreAukera == 3) aukeratutakoKolorea = "Berdea";
                        else {
                            System.out.println("Aukera okerra.");
                            break;
                        }

                        zenbakiAtera = random.nextInt(37);
                        String koloreAtera = "";
                        //Kondizioak
                        if (zenbakiAtera == 0) {
                            koloreAtera = "Berdea";
                        } else if (zenbakiAtera % 2 == 0) {
                            koloreAtera = "Beltza";
                        } else {
                            koloreAtera = "Gorria";
                        }

                        System.out.println("[RULETA BIRATZEN...]");
                        System.out.println("Zenbakia: " + zenbakiAtera + " (" + koloreAtera + ")");
                        
                        //Zer gertatu apostuarekim
                        //equalsIgnoreCase problemarik ez izateko letra txikias edo handias idatzi baldin baduzu
                        if (aukeratutakoKolorea.equalsIgnoreCase(koloreAtera)) {
                            if (koloreAtera.equals("Berdea")) {
                                int irabazia = apuesta * 14;
                                puntos += irabazia;
                                System.out.println("Berdea atera da " + irabazia + " puntu irabazi dituzu!");
                            } else {
                                puntos += apuesta;
                                System.out.println("Asmatu duzu " + apuesta + " puntu irabazi dituzu!");
                            }
                        } else {
                            puntos -= apuesta;
                            System.out.println("Galdubakarra... " + apuesta + " puntu galdu dituzu.");
                        }
                        break;

                    case 2:
                        // Apustua egin
                        do {
                            System.out.print("Zenbat puntu jokatu nahi dituzu? (1 - " + puntos + "): ");
                            apuesta = sc.nextInt();
                        } while (apuesta <= 0 || apuesta > puntos);

                        System.out.println("Ze erabili nahi duzu??");
                        System.out.println("1. Bakoiti");
                        System.out.println("2. Bikoiti");
                        System.out.print("Aukeratu jokaldia (1-2): ");
                        int jokaldia = sc.nextInt();
                        
                        //Zuk erabaki duzun aukera
                        String aukeratutakojokaldia = "";
                        if (jokaldia == 1) aukeratutakojokaldia = "Bakoiti";
                        else if (jokaldia == 2) aukeratutakojokaldia = "Bikoiti";
                        else {
                            System.out.println("Aukera okerra.");
                            break;
                        }
                        zenbakiAtera = random.nextInt(37);
                        String jokaldiAtera = "";
                        
                        // Apustuaren kondizioak
                        if (zenbakiAtera == 0) {
                            jokaldiAtera = "Ezer ez (0)";
                        } else if (zenbakiAtera % 2 == 0) {
                            jokaldiAtera = "Bikoiti";
                        } else {
                            jokaldiAtera = "Bakoiti";
                        }

                        System.out.println("[RULETA BIRATZEN...]");
                        System.out.println("Zenbakia: " + zenbakiAtera + " (" + jokaldiAtera + ")");
                        
                        //Zer gertatu apustuarekin
                        if (aukeratutakojokaldia.equals(jokaldiAtera)) {
                            puntos += apuesta;
                            System.out.println("Asmatu duzu " + apuesta + " puntu irabazi dituzu.");
                        } else {
                            puntos -= apuesta;
                            System.out.println("Galdu duzu " + apuesta + " puntu galdu dituzu.");
                        }
                        break;

                    case 3:
                        //Zenbat puntu jokatzeko galdera
                        do {
                            System.out.print("Zenbat puntu jokatu nahi dituzu? (1 - " + puntos + "): ");
                            apuesta = sc.nextInt();
                        } while (apuesta <= 0 || apuesta > puntos);

                        int aukeratutakoZenbakia;
                        //Jokoaren aukera egin
                        do {
                            System.out.print("Zein zenbakiri jokatu nahi diozu? (0 - 36): ");
                            aukeratutakoZenbakia = sc.nextInt();
                            if (aukeratutakoZenbakia < 0 || aukeratutakoZenbakia > 36) {
                                System.out.println("Zenbakia 0 eta 36 artekoa izan behar da!");
                            }
                        } while (aukeratutakoZenbakia < 0 || aukeratutakoZenbakia > 36);

                        zenbakiAtera = random.nextInt(37);

                        System.out.println("[RULETA BIRATZEN...]");
                        System.out.println("Zenbakia: " + zenbakiAtera);
                        
                        //Zer gertatu apostuarekin
                        if (aukeratutakoZenbakia == zenbakiAtera) {
                            int irabazia = apuesta * 35;
                            puntos += irabazia;
                            System.out.println(" Zorionak! Zenbaki zehatza asmatu duzu! " + irabazia + " puntu irabazi dituzu!");
                        } else {
                            puntos -= apuesta;
                            System.out.println("Ez duzu asmatu... " + apuesta + " puntu galdu dituzu.");
                        }
                        break;
                        
                    //Programatik ateratzen    
                    case 4:
                        System.out.println("Eskerrik asko jokatzeagatik");
                        break;
                    
                    //Beste zenbaki bat jartzen baldin baduzu aterako den mezua    
                    default:
                        System.out.println("Aukera okerra, saiatu berriro.");
                        break;
            }//Switch bukaera
        }while(aukera !=4);
}//ruletajolas amaiera
public static void HandiTxikijolasa(Scanner sc)
{
Random random = new Random();
    boolean jokatzen = true;
    int puntuacion = 0;
    int jZenbakia = sortuZenbakia(random);

    // Jokalariak hurrengo zenbakia handiagoa, txikiagoa edo berdina izango den asmatu behar du.
    while (jokatzen) {
        System.out.println("Dagoen zenbakia: " + jZenbakia);
        String erantzuna = eskatuErantzuna(sc);

        if (!erantzuna.equals("h") && !erantzuna.equals("t") && !erantzuna.equals("b")) {
            System.out.println("Aukera okerra. Erabili h, t edo b.");
            continue;
        }

        int hurrengoZen = sortuZenbakia(random);
        String erantzunErreala = kalkulatuErantzunErreala(jZenbakia, hurrengoZen);
        System.out.println("Hurrengo zenbakia izan da: " + hurrengoZen);

        if (erantzuna.equals(erantzunErreala)) {
            puntuacion++;
            jZenbakia = hurrengoZen;
            System.out.println("Asmatu duzu. Puntuazioa: " + puntuacion + "\n");
        } else {
            System.out.println("Galdu duzu, jokoa itxiko da.");
            System.out.println("Bukaerako puntuazioa: " + puntuacion);
            jokatzen = false;
        }
    }
}

// Erabiltzailearen erantzuna eskatzen du (h, t edo b).
public static String eskatuErantzuna(Scanner sc) {
    System.out.print("Nolakoa izango da hurrengo zenbakia? (handiago(h)/txikiago(t)/berdina(b)): ");
    return sc.nextLine().trim().toLowerCase();
}

// 1 eta 10 arteko ausazko zenbaki bat sortzen du.
public static int sortuZenbakia(Random random) {
    return random.nextInt(10) + 1;
}

// Hurrengo zenbakia unekoarekin konparatzen du.
public static String kalkulatuErantzunErreala(int unekoZenbakia, int hurrengoZenbakia) {
    if (hurrengoZenbakia > unekoZenbakia) {
        return "h";
    } else if (hurrengoZenbakia < unekoZenbakia) {
        return "t";
    } else {
        return "b";
    }
}//handitxikijolas amaiera
// ==========================================
// HARRI ORRI AR (Integratu berria metodo bakarrean)
// ==========================================
public static void HarriOrriArjolasa(Scanner sc)
{
    Random random = new Random();
    
    int[] jokalari_irabaziak = new int[1];
    int[] makina_irabaziak = new int[1];
    
    int aukera;
    boolean jirabaziak = true;

    while (jirabaziak) {
        System.out.println("\n--- HARRI, ORRI, ARTAZIAK ---");
        System.out.println("Aukeratu bat:");
        System.out.println("1. Jolastu HarriOrriAr");
        System.out.println("2. Bistaratu irabaziak");
        System.out.println("3. Atzera / Irten joko honetatik");
        
        if (sc.hasNextInt()) {
            aukera = sc.nextInt();
            switch (aukera) {
                case 1:
                    JolastuHarriOrriAr(sc, random, jokalari_irabaziak, makina_irabaziak);
                    break;
                case 2:
                    getIrabaziak(jokalari_irabaziak, makina_irabaziak);
                    break;
                case 3:
                    System.out.println("Harri Orri Artazitik irten zara.");
                    jirabaziak = false;
                    break;
                default:
                    System.out.println("Aukeratu bat egokia (1-3)");
                    break;
            }
        } else {
            sc.next(); // garbitu sarrera okerra
        }
    }
}//harri orri jolas amaiera

// Azpimetodoak HarriOrriAr-rentzat barrutik deitzeko
public static void JolastuHarriOrriAr(Scanner sc, Random random, int[] jokalari_irabaziak, int[] makina_irabaziak) {
    System.out.println("Zenbat partida jokatu nahi duzu?");
    int partidaKopurua = sc.nextInt();
    System.out.println("Partida hauek jokatuko dira: " + partidaKopurua);

    for (int i = 0; i < partidaKopurua; i++) {
        System.out.println("Aukeratu bat:");
        System.out.println("1. orria");
        System.out.println("2. artazia");
        System.out.println("3. harria");
        
        int aukera = sc.nextInt();
        int aukeraMakina = random.nextInt(3) + 1;

        if (aukera == aukeraMakina) {
            System.out.println("Berdinketa bat egon da, berriz jolastu!");
        } else if ((aukera == 1 && aukeraMakina == 3) || 
                   (aukera == 2 && aukeraMakina == 1) || 
                   (aukera == 3 && aukeraMakina == 2)) {
            System.out.println("Jokalariak irabazten du, orria harriari irabazten dio");
            jokalari_irabaziak[0]++;
        } else {
            if (aukera == 1 && aukeraMakina == 2) {
                System.out.println("Makina irabazten du, artazia orriari irabazten dio");
            } else if (aukera == 2 && aukeraMakina == 3) {
                System.out.println("Makina irabazten du, harria artaziari irabazten dio");
            } else {
                System.out.println("Makina irabazten du, orria harriari irabazten dio");
            }
            makina_irabaziak[0]++;
        }
    }
}

public static void getIrabaziak(int[] jokalari_irabaziak, int[] makina_irabaziak) {
    System.out.println("Jokalari irabaziak: " + jokalari_irabaziak[0]);
    System.out.println("Makina irabaziak: " + makina_irabaziak[0]);
}
    public static void main(String[] args) {
        ArrayList<Integer> listaJokalariPuntuazioa = new ArrayList<>();
        ArrayList<Integer> listaCPUpuntuazioa = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        int aukeramenu;
        do
        {
            System.out.println("---> JOLASEN MENUA <--- ");
            System.out.println("1: Black Jack jolasteko: Sakatu 1.");
            System.out.println("2: Bi dado jolasteko: Sakatu 2. ");
            System.out.println("3: Ruleta jolasteko: Sakatu 3. ");
            System.out.println("4: Handiago edo Txikiago jolasteko: Sakatu 4. ");
            System.out.println("5: Harria,orria,artaziak jolasteko: Sakatu 5. ");
            System.out.println("6: Jolasetik irtetzeko: Sakatu 6. ");
            System.out.println("---> Aukeratu jolas bat. <---");
            try {
                aukeramenu = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                aukeramenu = 0;
            }
        switch(aukeramenu)
        {
            case 1:
                Blackjackjolasa(sc);
                break;
            case 2:
                Bidadojolasa(listaJokalariPuntuazioa,listaCPUpuntuazioa, sc);
                break;
            case 3:
                Ruletajolasa(sc);
                break;
            case 4:
                HandiTxikijolasa(sc);
                break;
            case 5:
                HarriOrriArjolasa(sc);
                break;
            case 6:
                System.out.println("Jolasetik irtetzen. Hurrengorarte!");
                break;
            default:
                System.out.println("ZENBAKI OKERRA! Sartu aukera zenbaki zuzena!");
        }//switch
        }//do
        while(aukeramenu!=6);
    }//main
}//classmenujolasak
