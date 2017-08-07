package pl.sda.day14.Algorithms;

public class BiednyCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

//        String[] tab = new String[]{"jąs", "nćla"};

//        String tab1 = "Jąś ma dwa";
//
//        Map<String, String> values = new HashMap<String, String>();
//        values.put("ą", "a");
//        values.put("ć", "c");
//
//        for (String key : values.keySet()) {
//            if (tab1.contains(key)) {
//                String result = tab1.replaceAll(key, values.get(key));
////                System.out.println(result);
//            }
//        }


        int letters = 0; //Licznik zliczający wszystkie literki, aby można było określić czy wypisać z dużej czy z małej
        for (int wordsCounter = 1; wordsCounter < input.length; wordsCounter++)
        //For, który przechodzi po wszystkich słowach
        //Iteracje zaczynamy od 1, ponieważ w input[0] zapisana jest nazwa algorytmu
        {
            String word = input[wordsCounter]; //Zapisujemy do zmiennej word aktualnie przetwarzane słowo
            char[] lettersInWord = word.toCharArray(); //Rozbijamy słowo na poszczególne znaki

            for (int lettersCounter = 0; lettersCounter < lettersInWord.length; lettersCounter++)
            //For, który przechodzi przez wszystkie literki w słowie
            {
                if (letters % 2 == 0) //jeżeli literka jest parzysta piszemy ją z dużej
                {
                    System.out.print(Character.toString(lettersInWord[lettersCounter]).toUpperCase());
                } else //W przeciwnym wypadku wypisujemy z małej
                {
                    System.out.print(Character.toString(lettersInWord[lettersCounter]).toLowerCase());
                }
                letters++; //Zwiększamy licznik wszystkich literek
            }
            System.out.print(" "); //Między słowami dokładamy spacje
        }
//        switch () {
//
//        }

    }
}


//    Map<String, String> values = new HashMap<String, String>();
//        values.put("x", "3");
//                values.put("y", "7");
//
//                for (String key : values.keySet()) {
//                if (test2.contains(key)) {
//                String result = test2.replaceAll(key, values.get(key));
//                System.out.println(result);
////                }
//                }

//
//    public static Operator fromChar(char c) {
//        switch (c) {
//            case '+':
//                return ADD;
//            case '-':
//                return SUB;
//            case '*':
//                return MULT;
//            case '/':
//                return DIV;
//            case '%':
//                return MOD;
//            case '^':
//                return POW;
//            default:
//                return NONE;
//        }
//    }