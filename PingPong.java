import java.io.Console;

public class PingPong {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Enter a number between 1 and 100.");
    String stringNumber = myConsole.readLine();

    Integer yourNumber = Integer.parseInt(stringNumber);
    pingPong(yourNumber);
  }

  public static void pingPong(Integer yourNumber) {
    for ( Integer index = 1; index <= yourNumber; index++ ) {
      if ( index % 15 == 0) {
        System.out.println("ping-pong");
      } else if ( index % 3 == 0 ) {
        System.out.println("ping");
      } else if ( index % 5 == 0 ) {
        System.out.println("pong");
      } else {
        System.out.println(index);
      }
    }
  }
}
