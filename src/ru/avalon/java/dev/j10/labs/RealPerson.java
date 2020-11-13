/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Date;

/**
 *
 * @author Meerkat
 */
public class RealPerson implements Person<RealPerson>{

    String name;
    Date birthDate;
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }
    
    public RealPerson(String name, Date birthDate)
    {
        this.name = name;
        this.birthDate = birthDate;
    }
    
/**
 * <p>При сравнении одного человека с другим следует
 * учитывать, что больше будет тот человек, чьё имя должно
 * быть ниже в списке имён, отсортированном по возрастанию.Из двух людей с одним и тем же именем больше будет тот,
 который старше.
     * @param otherRealPerson    
     * @return     
 */
    
    
    @Override
    public int compareTo(RealPerson otherRealPerson) {
        int result;
        if (this.name.equals(otherRealPerson.name)){                  //Если имена одинаковые, то
            result = - birthDate.compareTo(otherRealPerson.birthDate);//кто старше - тот и больше
        }else{
            result = name.compareTo(otherRealPerson.name); // Если имена разные, то по возрастанию имен
        }
        return result;
    }

}
