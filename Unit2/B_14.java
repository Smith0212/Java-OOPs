// Hello.java
package a;
public class Hello {
void printMessage(){
System.out.println("Hello");
}
}
// World.java
package b;
import a.Hello;
public class World extends Hello {
void printMessage(){
System.out.println("World");
}
public static void main(String[] args){
Hello gfg = new World();
gfg.printMessage();
}
}
/* Hello.java */
package a;
public class Hello {
public void doIt(){
printMessage();
}
void printMessage(){
System.out.println("Hello");
}
}
/* World.java */
package b;
import a.Hello;
public class World {
private static class HDG extends Hello {
void printMessage(){
System.out.println("World");
}
}
public static void main(String[] args){
HDG hdg = new HDG();
hdg.doIt();
}
}
// Filename: Hello.java
package a;
public class Hello {
private void printMessage(){
System.out.println("Hello");
}
public void fun(){
printMessage();
}
}
// Filename: World.java
package b;
import a.Hello;
public class World extends Hello {
private void printMessage(){
System.out.println("World");
}
public static void main(String[] args){
Hello abc = new World();
abc.fun();
}
}
// Hello.java
package a;
public class Hello {
public void printMessage(){
System.out.println("Hello");
}
}
// World.java
package b;
import a.Hello;
public class World extends Hello {
public void printMessage(){
System.out.println("World");
}
public static void main(String[] args){
Hello efg = new World();
efg.printMessage();
}
}
