package Stuff;
public class Coin {
    private int value;
    public Coin(int v) {
        value = v; }
    public int getValue() {
        return value;
   }
    public void split() {
        value = value/2;
   }
}
