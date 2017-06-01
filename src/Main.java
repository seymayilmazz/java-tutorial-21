import com.sun.scenario.effect.impl.prism.ps.PPSEffectPeer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Şeyma Yılmaz on 1.6.2017.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Şeyma");
        list.add("Burak");
        list.add("Berkan");
        list.add(12);

        /* 1.yontem */
        for(int i=0; i < list.size();i++){
            System.out.println((i+1) + ".nci kisi : " + list.get(i));
        }

        /* 2.yontem */
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(" eleman :  " + iterator.next());
        }

        /* 3.yontem */
        for(Object o : list){
            System.out.println("eleman : " + o);
        }

        /* .. */
        List<String> isimListesi = new ArrayList<>();
        isimListesi.add("ss");
        isimListesi.add("cc");

        /* ... */
        ArrayList<Person> kisiListesi  = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("Şeyma Yılmaz");
        person1.setAge(22);
        kisiListesi.add(person1);


        Person person2 = new Person();
        person2.setName("Burak Köken");
        person2.setAge(22);
        kisiListesi.add(person2);

        System.out.println("Kisi Listesi");
        for(Person person : kisiListesi){
            System.out.println("kisi ismi : " + person.getName()   +    "   kisi yasi : " + person.getAge() );

        }
    }

}
