//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
  // to see how IntelliJ IDEA suggests fixing it.
  IO.println(String.format("Hello and welcome!"));

  for (int i = 1; i <= 5; i++) {
    i*=2;    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
    IO.println("i = " + i);
  }
}

public class Circle {
    private double radius; // a radius of a
    private static int id_gen = 0; // static field belongs to class
    private int id;

    public Circle() { // a no-arg constructor
        id = id_gen++; // id is generated automatically (auto-increment)
    }
    public Circle( double radius){ // a parametrized constructor
        this(); // no-arg constructor call
        setRadius(radius); // radius setter call
    }
    public int getId () { // a private field "id" has only getter
        return id;
    }
    public double getRadius () { // Radius getter
        return radius;
    }
    public void setRadius ( double radius){ // Radius setter
        this.radius = radius;
    }
    public double area () {
        return 3.14 * Math.pow(radius, 2); // S = ПR^2
    }
}