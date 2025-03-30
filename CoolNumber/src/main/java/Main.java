import java.util.*;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска вводимого номера в консоль в каждой из структуры данных
     - проанализировать полученные данные
     */

    public static void main(String[] args) {
        List<String> arrayList = CoolNumbers.generateCoolNumbers();
        System.out.println(arrayList.get(7));
        System.out.println(arrayList.size());
        CoolNumbers.binarySearchInList(arrayList, "Т333ВВ201");
        CoolNumbers.bruteForceSearchInList(arrayList, "Т333ВВ171");
        TreeSet<String> treeSet = new TreeSet<>(CoolNumbers.generateCoolNumbers());
        CoolNumbers.searchInTreeSet( treeSet, "Т333ВВ171");
        HashSet<String> hashSet = new HashSet<>(CoolNumbers.generateCoolNumbers());
        CoolNumbers.searchInHashSet(hashSet,"Т333ВВ171");

    }
}
