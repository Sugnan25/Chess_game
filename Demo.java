import java.util.*;
class Box{
    double width;
    double height;
    double depth;
void volume(){
    double sum = width * height * depth;
    System.out.println("Box size is: " + sum);
    }
}

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        System.out.println("Enter width,height and depth of box 1: ");
        mybox1.width = sc.nextInt();
        mybox1.height = sc.nextInt();
        mybox1.depth = sc.nextInt();
        mybox1.volume();
        System.out.println("Enter width,height and depth of box 2: ");
        mybox2.width = sc.nextInt();
        mybox2.height = sc.nextInt();
        mybox2.depth = sc.nextInt();
        mybox2.volume();
    }
}