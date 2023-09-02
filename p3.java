class Box
{
        int height,width,breadth;

        Box(int h, int w, int b) {
        height= h;
        width= w;
        breadth= b;
        }

        int getVolume() {
        return height*width*breadth;
        }

        int getArea() {
        int a= (2*height*width)+(2*height*breadth)+(2*width*breadth);
        return a;
        }

        public static void main(String args[]) {
        Box b1= new Box(2,3,5);
        Box b2= new Box(4,6,10);

        int v1= b1.getVolume();
        int v2= b2.getVolume();

        int a1= b1.getArea();
        int a2= b2.getArea();

        System.out.println("The Volume of Box 1= "+v1);
        System.out.println("The Surface area of Box 1= "+a1);

        System.out.println("\nThe Volume of Box 2= "+v2);
        System.out.println("The Surface area of Box 2= "+a2);
        }
} 