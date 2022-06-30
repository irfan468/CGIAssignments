public class circle {
    public void calc(double rad){
        double area,circ;
        area=3.14*rad*rad;
        circ=2*3.14*rad;
        System.out.println("area "+area);
        System.out.println("circumference "+circ);
    }

    public static void main(String[] args) {
        double radius=5.1;
        circle obj=new circle();
        obj.calc(radius);
    }
}
