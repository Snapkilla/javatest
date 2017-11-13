public class  TestRun{

    public static void main(String[] args){
        String[][] sets;
        sets = new String[5][5];
        for (int i=0; i<sets.length;i++ ){
            for (int j = 0; j < sets[0].length;j++){
                sets[i][j] = String.format("1" + Integer.toString(j) ) ;
                System.out.println(sets[i][j]);
            }
        }
        if (javatest.allStringSetsIdentical(sets) == true){
            System.out.println("все равны");
        } else System.out.println("не равны");
    }
}
