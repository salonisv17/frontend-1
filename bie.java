interface hi
{
void display();
}
class hie implements hi
{
public void display()
{
System.out.print("hello");
}
}
class bie
{
public static void main(String a[])
{
hie h=new hie();
h.display();
}
}