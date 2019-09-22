public class Main {
    public static void main(String[] args) {
        TaxiService service = new TaxiService();
        int count = service.count(60, 20, 100);
        System.out.println(count);
    }
}
