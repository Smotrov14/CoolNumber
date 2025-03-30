import java.util.*;

public class CoolNumbers {
    private static final char[] ALLOWED_LETTERS = {
            'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};

    public static List<String> generateCoolNumbers() {
        List<String>numbers= new ArrayList<>();
        for(char X: ALLOWED_LETTERS){
            for (int N = 0; N < 9; N++) {
                for(char Y:ALLOWED_LETTERS){
                    for(char Z:ALLOWED_LETTERS){
                        for (int i = 1; i <199 ; i++) {
                            String R = i < 10 ? "0" + i : String.valueOf(i);
                            String result = String.format("%c%d%d%d%c%c%s", X, N, N, N, Y, Z, R);
                            numbers.add(result);
                        }
                    }
                }
            }
        }
        Collections.shuffle(numbers);
        return numbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        boolean isHave = list.contains(number);
        print(isHave,"Поиск перебором: номер");
        return isHave;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        int index = Collections.binarySearch(sortedList ,number);
        boolean isHave = index >= 0;
        print(isHave,"Бинарный поиск: номер");
        return isHave;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        boolean isHave = hashSet.contains(number);
        print(isHave,"Поиск в HashSet: номер");
        return isHave;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        boolean isHave = treeSet.contains(number);
        print(isHave,"Поиск в TreeSet: номер");
        return isHave;
    }
        public static void print(boolean isTrue,String metod){
            long start = System.nanoTime();
            long end = System.nanoTime();
            String result = isTrue? "найден" : "не найден";
            System.out.println(metod + " " + result + ", поиск занял "+ (end - start) + " нс");
        }
}
