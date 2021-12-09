class Shape{
public double calArea(){
return 0; }
}
public class circle extends Shape{
int radius;
public circle(int radius){
this.radius=radius;
}
public double calArea()
{
return 3.142*radius*radius;
}
public static void main(String args[]){
Shape obj=new circle(5);
System.out.println(obj.calArea());
}
}
