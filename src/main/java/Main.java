public class Main {
    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println("Błędna ilość parametrów");
            return;
        }
        WebPageServer webPageSaver = new WebPageServer();
        webPageSaver.save(args[0], args[1]); // tu można podać stronę i plik docelowy (ścieżka absolutna)

    }

}
