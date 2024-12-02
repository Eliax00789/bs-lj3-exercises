package n05_data_structures;

public class CinemaHall {
    private static final int SEAT_ROWS = 10;
    private static final int SEATS_PER_ROW = 20;

    public final String name;
    public final int number;
    private final boolean[][] seats;

    public CinemaHall(String name, int number) {
        this.name = name;
        this.number = number;
        this.seats = new boolean[SEAT_ROWS][SEATS_PER_ROW];
    }

    public boolean reserve(int seat) {
        return this.reserve(seat / SEAT_ROWS, seat % SEAT_ROWS);
    }

    public boolean reserve(int row, int seat) {
        if (row < 0 || seat < 0 || row >= SEAT_ROWS || seat >= SEATS_PER_ROW) {
            throw new IllegalArgumentException("Invalid seat");
        }

        if (this.seats[row][seat]) {
            return false;
        }
        this.seats[row][seat] = true;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SEAT_ROWS; i++) {
            sb.append('[');
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                sb.append(this.seats[i][j] ? 'X' : '_');
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}
