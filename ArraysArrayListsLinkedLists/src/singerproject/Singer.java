package singerproject;

import java.util.ArrayList;

public class Singer {

    private ArrayList<String> singer_list = new ArrayList<String>();

    public void write_singer(){
        System.out.println("Şarkıcı listesinde " + singer_list.size() + " kadar şarkıcı var.");

        for (int i = 0; i < singer_list.size() ; i++){
            System.out.println((i+1) + ". Şarkıcı : " + singer_list.get(i));
        }
    }
    public void  add_singer(String name){
        singer_list.add(name);

        System.out.println("Şarkıcı listesi güncellendi.");
    }

    public void update_singer(String new_name, int position){

        singer_list.set(position,new_name);
        System.out.println("Şarkıcı listesi güncellendi.");
    }
    public void delete_singer(int position){
        String name = singer_list.get(position);
        singer_list.remove(position);
        System.out.println(name + " isimli Şarkıcı listeden silindi.");
    }
    public void search_singer(String singer_name){
        int position = singer_list.indexOf(singer_name);

        if (position >= 0){
            System.out.println("Şarkıcı bulundu.");
            System.out.println(singer_name + " isimli şarkıcı " + (position+1) + " pozisyonda");
        }else {
            System.out.println("Şarkıcı bulunamadı");
        }

    }
}
