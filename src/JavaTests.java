import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class javatest {

    public static boolean allStringSetsIdentical(String[][] sets){
        int k = 0;

        List<String[]> setslist = Arrays.asList(sets);
        for (String[] item : setslist) {
            List<String> templist = Arrays.asList(item);
            Set<String> tempset = new HashSet<>();
            tempset.addAll(templist);
            templist.clear();
            templist.addAll(tempset);
        }

        List<String> basicset = Arrays.asList(setslist.get(0));
        for (String[] items: setslist) {
            if (Arrays.asList(items).contains(basicset)){
                k++;
            }
        }
        if (k == sets.length) {
            return true;
        }
        return false;
    }
}