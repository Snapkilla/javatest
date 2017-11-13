import java.util.*;

class javatest {

    public static boolean allStringSetsIdentical(String[][] sets){
        int k = 0;

        List<String[]> setslist = Arrays.asList(sets);
        for (String[] item : setslist) {
            List templist = new ArrayList(Arrays.asList(item));

            Set<String> tempset = new HashSet<>();
            tempset.addAll(templist);
            templist.clear();
            templist.addAll(tempset);
            String[] temparray = new String[templist.size()];
            templist.toArray(temparray);
            for (int i = 0;i<item.length;i++){
                item[i] = temparray[i];
            }
        }
        List<String> basicset = Arrays.asList(setslist.get(0));
        for (String[] items: setslist) {
            if (Arrays.asList(items).containsAll(basicset)){
                k++;
            }
        }
        if (k == sets.length) {
            return true;
        }
        return false;
    }
}