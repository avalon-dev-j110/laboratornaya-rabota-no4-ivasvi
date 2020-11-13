/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sup;

import java.util.Date;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.Person;
import ru.avalon.java.dev.j10.labs.RealPerson;

/**
 *
 * @author Meerkat
 */
public class GenerateSomeArray {
 //   String[] strings;

    //Генератор строк сделан так, что строки задаются случайной длины в пределах 15 символов.
    //И используются только 5 заглавных букв алфавита, чтобы было легче проверять порядок строк.
    public String[] generateStrArray(int size) {
        Random random = new Random();
        int sizeChars;
        char[] chars; 
        String[] stringsArray = new String[size];

        for (int j = 0; j < size; j++) {
            sizeChars = random.nextInt(15);
            chars = new char[sizeChars];
            for (int i = 0; i < sizeChars; i++) {
                chars[i] = (char) (65 + random.nextInt(5));                
            }                    
            stringsArray[j] = new String(chars);
        }
        return stringsArray;
    }
    
    public void printStrArray(String[] stringsArray){      
        for (String stringsArray1 : stringsArray) {
            System.out.println(stringsArray1);
        }
    }
    
    // Генератор личностей сделан так, чтобы были полные тезки и фамилии по первым буквам алфавита, 
    // чтобы было легче проверять порядок.
    public Person[] generateRealPersonArray(int size){
        Person[] persons = new Person[size];
        Random random = new Random();
        Date randBD;
        String ranName;
        String[] names1 = new String[] {"Антонов ", "Абрикосов ", "Буков "};
        String[] names2 = new String[] {"Алекс ", "Боря ", "Турсунбек "};        
        for (int i = 0; i < size; i++) {
            persons[i] = new RealPerson(names1[random.nextInt(3)] + names2[random.nextInt(3)], new Date(random.nextLong()/10000000 + 1940));
        }
        return persons;
    }
    
    //Формат выовода "Фамилия имя   год месяц число"
    public void printPersonArray(Person[] rpArray) {
        for (int i = 0; i < rpArray.length; i++) {
            System.out.println(rpArray[i].getName() + "  " + (1900 + rpArray[i].getBirthDate().getYear()) + " " + rpArray[i].getBirthDate().getMonth() + " " + rpArray[i].getBirthDate().getDay());
        }
    }
}
