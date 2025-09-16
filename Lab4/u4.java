public class U4 {
  static void main() {
    // Deklarera två variabler, 'rad' och 'kol', tilldela värdet 1 till båda
    //
    // SÅ LÄNGE (rad <= 10)
    // OM (rad == 1)
    // SÅ LÄNGE (rad <= 10)
    // skriv ut rad
    // öka rad
    // tilldela åter 1 till 'rad'
    // radbryt
    //
    // SÅ LÄNGE (kol <= 10)
    // skriv ut "{rad}"
    // skriv ut "{kol*rad}"
    // öka kol med 1
    // öka rad med 1
    // radbryt

    int row = 1;
    int col = 1;

    while (row <= 10) {
      if (row == 1) {
        while (row <= 10) {
          System.out.printf("%d", row);
          row++;
        }
        row = 1;
        System.out.printf("\n");
      }
    }
  }
}
