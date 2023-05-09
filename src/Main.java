import java.math.BigDecimal;

public class Main {
    public static void ukol1() {
        System.out.println("JAVA-VaclavKuchar-DomaciUkol-Lekce1-CastA");
        // tady chyběli uvozovky
    }
    public static void ukol2() {
        String uzivatel = "Ahoj Přémo! :-)"; System.out.println(uzivatel);
        // tady opět chyběli uvozovky

        // K TOMUTO JEŠTĚ ROVNOU DOTAZ: Dal jsem to do jednoho rádku, protože až se bude psát složitější kód,
        // o té RESTURACI ke splnění kurzu již přemýšlím, jak to pojmu, tak podle mě bude nepřehledný a jednoduché věci
        // slučuji na jeden řádek, když se tam vejdou, ale jestli je to můj zlozvyk a od profesionálního programátora
        // se očekává, že co instrukce atp. se středníkem má být vždy na dalším řádeku,
        // tak se to mudu muset přeučit... :-)
        // Díky V.
    }
    public static void ukol3() {
        Short pocetLekci = 10; System.out.println(pocetLekci + " LEKCÍ?");
        // tady nevím co jste chtěli, ale rovnou jsem změnil i typ promměnné s předpokladem, že tato proměnná pro číso
        // s reálnou a celou hodnotou bude bohatě stačit na počet absolvovatelných kurzů v reálném světě,
        // v tomto případě od mínus do plus 32768 resp. 7 u záporu, jinak kliedně INT, ale zrovna pro počet lekcí kurzu
        // je to fakt zbytečný a asi by bohatě stačil i BYTE, ale nechme SHORT. :-)
        // ...kdyby v reálu nestačila, dá se to ošetřit ihned na vstupu a typ proměnné programově přizpůsobit (IF atd..)
    }
    public static void ukol4() {
        double cena = 10.596; // System.out.println(cena);
        System.out.println(String.format("%.3f", cena).replace(".", ","));
        // tady jasná chyba syntaxe, tečka, čárka
        // ještě jsem si dovolil výstup upravit na desetinnou čárku, ty tečky mě jako obchodníka iritují... :-)
    }
    public static void ukol5() {
        BigDecimal cena = new BigDecimal("0");
        for (int i = 0; i < 10; i++) {cena = cena.add(new BigDecimal("0.1"));}
        System.out.println(cena.toString().replace('.', ','));
        //     System.out.println(cena);
        // Tady opět nevím, co se po mě chtělo, měl jsem více možností (Fakt hodně! - zaokroulit?), :-)
        // zvolil jsem tu nejjednodušší, i když zabírá "nejvíce místa" v registru, ale fakt nevím,
        // jestli tímto domácí úkol SPLNÍM?. Měl jsem to zaoukrouhlit nebo co jsem měl udělat? Každopádně to funguje...
        // ...a VELMI přesně.

        // omlouvám se, zase jsem se musel při výstupu zbavit těch desetinných teček a dát tam čárky :D

        // Ještě bych chtěl podoknout, že tato proměnná funguje jako samostaný objekt (programovatené POLE),
        // jako "všechno" v JAVA
        // a že právě proto umožňuje velmi přesné matematické výstupy. Nuly a jedničky nechme být. :-)
        // Umím převést decimál i do HEXAdecimálu bez použítí počítače.

        // ...A VELICE SE VÁM omlouvám, jestli to vypadá jako, že Vás poučiji, NENÍ TO TAK, leč myslíím si,
        // že úplní začátečníci musí pochopit hlavně KROK za KROKEM... ...program "Karel"
        // na starodávném PMDčku
        // a kdo si tohoto "Karla" programování dá jako HRU - VŠE pochopí :-) ...samozřejmě IQ nad 89 :D
        // neměl by být problém to spustit pod Win10 (nejsem jediný, kdo se učí něco nového)

        // ...právě jsem si "Karla" spustil a funguje normálně pod W10 Build 22H2... :
    }
    public static void ukol6() {
        BigDecimal cena = new BigDecimal("0"); cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena.toString().replace('.', ','));
        // tady už vůbec nevím, co se po mě chtělo, fakt nemám ponětí, ale možná jen opravit vložení hodnoty? nevím.
        //        public static void ukol6() {
//            BigDecimal cena = new BigDecimal("0");
//        cena = cena.add(BigDecimal.valueOf(0.1));
//        System.out.println(cena);
//    }
    }
    public static void ukol7() {
        int vykonMotoru = 230;
        System.out.println("Výkon Motoru je: " + Integer.toString(vykonMotoru) + " kW");
        // tady byla fatální chyba syntaxe -spíše celý kód total na nic...
    }
    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " + Integer.toString(velikostKosile) + " S");
        // tady opět fatální chyba syntaxe -spíše celý kód total na nic...  ...ale již to začíná být zajímavé. :-)
        // to jen ze srandy jsem přidal to "S", dnes je to většinou velikost jen S, M, X, L XL
    }
    public static void ukol9() {
       System.out.println("Metoda je ÚPLNĚ bez chybičky!");
       // bez komentáře... :D
 }
    public static void MocDekuji() {
        System.out.println("Díky moc, pane Přemku. Děkuji, že jste můj učitel, vaše přednáška byla pro mě SUPER :-) VK");
        // bez komentáře... :D
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                + "zkratkou <Ctrl>+</> - použij lomítko "
                + "na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
        MocDekuji();
    }
}

