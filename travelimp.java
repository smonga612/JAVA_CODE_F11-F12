interface vechile
{
public void move();

}


class car implements vechile
{
public void move()
{
System.out.println("Move by car");
}
}

class bus implements vechile
{
public void move()
{
System.out.println("Move by bus");
}
}

class travel
{

void startjourney(vechile v1)
{
System.out.println("Journey started");
v1.move();
}

}

class travelimp
{
public static void main(String args[])
{
car c1=new car();
bus b1=new bus();

travel p1=new travel();
travel p2=new travel();
p1.startjourney(c1);
p2.startjourney(b1);


}
}






