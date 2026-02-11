public class ParkingLotOpenAddressing{

    private final String[] table;

    public ParkingLotOpenAddressing(int size) {
        table = new String[size];
    }

    private int hash(String s) {
        return Math.abs(s.hashCode() % table.length);
    }

    public int park(String plate) {
        int idx = hash(plate);

        while (table[idx] != null)
            idx = (idx + 1) % table.length;

        table[idx] = plate;
        return idx;
    }

    public void exit(String plate) {
        int idx = hash(plate);

        while (table[idx] != null) {
            if (table[idx].equals(plate)) {
                table[idx] = null;
                return;
            }
            idx = (idx + 1) % table.length;
        }
    }
}
