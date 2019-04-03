public class App {
    private static int random(){ return  (int) Math.round(Math.random()*100+1);}
    public static void main(String[] args) {
        Resizeable[] resizeables=new Resizeable[6];
        resizeables[0]=new Circle();
        resizeables[1]=new Circle(1,"red",false);
        resizeables[2]=new Rectangle();
        resizeables[3]=new Square();
        resizeables[4]=new Rectangle(12,3);
        resizeables[5]=new Square(12);
        System.out.println("Before: ");
        for (Resizeable resizeable:resizeables
             ) {
            System.out.println(resizeable);
        }
        System.out.println("After: ");
        for (Resizeable resizeable:resizeables
             ) {
            int randoooom=random();
            resizeable.resize(randoooom);
            System.out.println("Shape after resize with percent= "+ randoooom+ " : "+resizeable);
        }
    }
}
