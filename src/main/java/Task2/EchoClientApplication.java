package Task2;

public class EchoClientApplication {
    public static void main(String[] args) throws Exception {
        EchoClient echoClient = new EchoClient();
        System.out.println( echoClient.echo("test1234A") );
    }
}
