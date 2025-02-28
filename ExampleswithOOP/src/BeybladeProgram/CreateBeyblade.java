package BeybladeProgram;

public class CreateBeyblade {

    public Beyblade createBeylade(String beyblade_type){

        if (beyblade_type.equals("Dragon")){
            return new Dragon("Takao", 800, 300,"Mavi Ejderha","Kutsal Canavarla Konuşma");
        }else if (beyblade_type.equals("Dranza")){
            return new Dranza("Kai", 600, 400 , "Kırmızı Anka Kuşu");
        }else if (beyblade_type.equals("Drayga")){
            return new Drayga("Rei", 800, 250 , "Beyaz Kaplan");
        }else if (beyblade_type.equals("Draciel")){
            return new Draciel("Kai", 400, 1000 , "Kara Kaplumbağa");
        }else {
            return null;
        }

    }
}
