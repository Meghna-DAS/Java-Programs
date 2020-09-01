import java.util.Scanner;


class student {
    public static void main(String[] args) {
        Innerstudent obj1 = new Innerstudent();
        obj1.setInfo();
        obj1.printInfo();
        obj1.computeAvg();
        obj1.highest();
        Innerstudent obj2 = new Innerstudent();
        obj2.setInfo();
        obj2.printInfo();
        obj2.computeAvg();
        obj2.highest();
        Innerstudent obj3 = new Innerstudent();
        obj3.setInfo();
        obj3.printInfo();
        obj3.computeAvg();
        obj3.highest();

        obj1.highestStudent(obj2, obj3);
    }
}


class Innerstudent {
    private String name;
    private int phy,che,bio, marks;

    Scanner in = new Scanner(System.in);

    public void setInfo() {
        System.out.print("Enter Your Name: ");
        name = in.next();
        System.out.print("Enter Your physics marks: ");
        phy=in.nextInt();
        System.out.print("Enter Your chemistry marks: ");
        che=in.nextInt();
        System.out.print("Enter Your biology marks: ");
        bio=in.nextInt();

    }

    public void printInfo() {
        System.out.println("------------------------------------------------");
        System.out.println("Name of the Student: " + name);
        System.out.println("Physics marks: " + phy);
        System.out.println("Chemistry marks: " + che);
        System.out.println("Biology marks: " + bio);
        System.out.println("------------------------------------------------");
    }
    
    public void computeAvg() {
        System.out.println("****************");
        System.out.println("Average Marks: " + (phy + che + bio)/3 ) ;
    }

    public void highest() {
        if(phy>che)
            if (phy > bio)
                marks = phy;
            else 
                marks = bio;
        else if(phy<che)
            if (che > bio)
                marks = che;
            else 
                marks = bio;
        else if(bio>che)
            if (bio > phy)
                marks = bio;
            else 
                marks = phy;
        else 
            marks = phy; // anyone since they are all equal
        System.out.println("Highest Marks: " + marks);
        System.out.println("****************");
    }

    public void highestStudent(Innerstudent obj2, Innerstudent obj3) {
        String student="";
        if (marks > obj2.marks)
            if(marks>obj3.marks)
                student = name;
            else
                student = obj3.name;
        else if(obj2.marks> marks)
            if (obj2.marks > obj3.marks)
                student = obj2.name;
            else 
                student = obj3.name;
        else if(obj3.marks> marks)
            if (obj3.marks > obj2.marks)
                student = obj3.name;
            else 
                student = obj2.name;

        System.out.println("Student with highest grades: " + student);
    }
}