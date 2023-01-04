package Programs;

import java.util.HashMap;

public class StringProgram {

    public static void main(String[] args) {

        //akash

///////using java 8  features/////////
        String s = "aakash kawades";
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> h = new HashMap<>();
        for (char c : chars) {

            if (h.containsKey(c)) {
                h.put(c, h.get(c) + 1);
            } else {
                h.put(c, 1);
            }
        }
        h.forEach((key, value) -> {
            if (value > 1)
                System.out.println(key);
        });
    }
    }
