class Room
{
        int height,width,breadth;

        Room(int x, int y, int z) {
        height= x;
        width= y;
        breadth= z;
        }

        Room() {
        height= 10;
        width= 10;
        breadth= 10;
        }

        int volume() {
        return height*width*breadth;
        }
}

class RoomDemo
{
        public static void main(String args[]) {
        Room r1= new Room(12, 10, 15);
        Room r2= new Room();

        int v1= r1.volume();
        System.out.println("The Volume of Room 1= "+v1);

        int v2= r2.volume();
        System.out.println("The Volume of Room 2= "+v2);
        }
}