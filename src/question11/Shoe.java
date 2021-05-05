/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author Venkat Sai Jarugula
 */
public class Shoe {

    private String brand;
    private int size;

    public Shoe(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Shoe{" + "brand=" + brand + ", size=" + size + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.brand);
        hash = 41 * hash + Objects.hashCode(this.size);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        /*
         Step 1: this check. if yes , then return true.
         In this step the references of shoe1 and shoe2 are compared.If equal return true.
         */
        if (this == obj) {
            return true;
        }
        /*
         Step 2: null check. if yes , then return false.
         In this step,we will check if object is null.If null return false.
         */
        if (obj == null) {
            return false;
        }
        /*
         Step 3: getClass check.if not equal then return false.
        We need to check if both the objects being compared are of same class type or not.
        In this example we will compare shoe 1 and shoe2 are of same class type,if not will return false.
         
         */

        if (getClass() != obj.getClass()) {
            return false;
        }
        /*
         Step 4: Typecast the object.
        This step must be done after getClass check
         */
        final Shoe other = (Shoe) obj;
        /*
        Step 5: Comparing Objects
        Here we need to make a decision to consider the class member variables,
        when comparing two objects of a class.
        For example:
        As per the below code,two shoe objects are equal, only if size and brand
        member variables are equal.And will return false, if any one of them is not equal.
         */
        if (this.size != other.size) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return true;
    }

}
