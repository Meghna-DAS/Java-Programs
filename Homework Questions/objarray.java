class objarray
{
    public static void main(String[] args) {
        Innerobjarray[] studentArray = {new Innerobjarray("Meghna Das", 53, 6),new Innerobjarray("Chhavi Trivedi", 26, 5),new Innerobjarray("Simeen khan", 85, 3)};
        for(int i=0; i<studentArray.length; i++)
        {
            studentArray[i].display();
        }
    }
}

/**
 * Innerobjarray
 */

class Innerobjarray {
    private String Name;
    private int prn , review;
    Innerobjarray(String Name, int prn, int review) {
        this.Name = Name;
        this.prn = prn;
        this.review = review;
    }
    public void display() {
        System.out.println("Student Name: " + Name);
        System.out.println("Prn: " + prn);
        System.out.println("review: " + review);
    }
}