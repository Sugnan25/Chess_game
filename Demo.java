import java.util.*;
class Box{
    double wide;
    double length;
    double depth;
void volume(){
    double sum = wide * length * depth;
    System.out.println("Box size is: " + sum);
    }
}

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        System.out.println("Enter wide,length and depth of box 1: ");
        mybox1.wide = sc.nextInt();
        mybox1.length = sc.nextInt();
        mybox1.depth = sc.nextInt();
        mybox1.volume();
        System.out.println("Enter wide,length and depth of box 2: ");
        mybox2.wide = sc.nextInt();
        mybox2.length = sc.nextInt();
        mybox2.depth = sc.nextInt();
        mybox2.volume();
    }
}