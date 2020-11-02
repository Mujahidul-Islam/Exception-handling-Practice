public class Dog extends Animal{
    private String breedName;
    public Dog(String breedName){
        this.breedName = breedName;

    }

    @Override
    public String toString()   {
        return super.toString() +"("+breedName+")";
    }

    public static void main(String[]args)
    {
        Dog d = new Dog("Poodle");
        System.out.println(d);
    }
}
