public class Main
{
    public static void main(String[] args)
    {

        String partyAfil = "";

        // create a scanner and read in the PartyAfil


        if (partyAfil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (partyAfil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (partyAfil.equalsIgnoreCase("I"))
        {
            System.out.println("You get a Independent Man");
        }
        else
            System.out.println("I don't know what party you belong to!");
    }

}