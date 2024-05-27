import java.util.HashMap;
import java.util.Map;

public class GeorgianLatinMapping {

    private static final Map<Character, String> georgianToLatinMap = new HashMap<>();
    private static final Map<String, Character> latinToGeorgianMap = new HashMap<>();

    static {
        georgianToLatinMap.put('ა', "a");
        georgianToLatinMap.put('ბ', "b");
        georgianToLatinMap.put('გ', "g");
        georgianToLatinMap.put('დ', "d");
        georgianToLatinMap.put('ე', "e");
        georgianToLatinMap.put('ვ', "v");
        georgianToLatinMap.put('ზ', "z");
        georgianToLatinMap.put('თ', "t");
        georgianToLatinMap.put('ი', "i");
        georgianToLatinMap.put('კ', "k");
        georgianToLatinMap.put('ლ', "l");
        georgianToLatinMap.put('მ', "m");
        georgianToLatinMap.put('ნ', "n");
        georgianToLatinMap.put('ო', "o");
        georgianToLatinMap.put('პ', "p");
        georgianToLatinMap.put('ჟ', "zh");
        georgianToLatinMap.put('რ', "r");
        georgianToLatinMap.put('ს', "s");
        georgianToLatinMap.put('ტ', "t");
        georgianToLatinMap.put('უ', "u");
        georgianToLatinMap.put('ფ', "f");
        georgianToLatinMap.put('ქ', "k");
        georgianToLatinMap.put('ღ', "gh");
        georgianToLatinMap.put('ყ', "q");
        georgianToLatinMap.put('შ', "sh");
        georgianToLatinMap.put('ჩ', "ch");
        georgianToLatinMap.put('ც', "ts");
        georgianToLatinMap.put('ძ', "dz");
        georgianToLatinMap.put('წ', "ts");
        georgianToLatinMap.put('ჭ', "ch");
        georgianToLatinMap.put('ხ', "kh");
        georgianToLatinMap.put('ჯ', "j");
        georgianToLatinMap.put('ჰ', "h");

        for (Map.Entry<Character, String> entry : georgianToLatinMap.entrySet()) {
            latinToGeorgianMap.put(entry.getValue(), entry.getKey());
        }
    }

    public static String georgianToLatin(char georgianLetter) {
        return georgianToLatinMap.get(georgianLetter);
    }

    public static Character latinToGeorgian(String latinLetter) {
        return latinToGeorgianMap.get(latinLetter);
    }
}