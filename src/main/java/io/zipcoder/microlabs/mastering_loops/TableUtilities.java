package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    // this is the general case
    public static String getMultiplicationTable(int tableSize)

    { String result = "";
        for (int i = 1; i <= tableSize; i++) {
        for (int j = 1; j <= tableSize; j++) {
            result += String.format("%3d |", j * i);
        }
        result += "\n";
    }
        return result;
}
    // String.format()
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }



}