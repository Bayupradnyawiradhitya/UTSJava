public class latihan2 {

        public int hitung1(double total_akhir) {
            double total;
            double diskon;
            return 0;
        }
    public int hitung2(double total_akhir) {
        double total;
        double diskon;
        return 0;
    }

    }class diskon extends latihan2 {
        public int hitung1(double total_akhir ) {
            double total;
            double diskon;
            if (total_akhir > 30000) {
                diskon = 0.1 * total_akhir;
                total = total_akhir - diskon;
                System.out.println("Total = "+total);
            }
            return 0;
        }

}