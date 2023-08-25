/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask1;

import java.util.Scanner;

/**
 *
 * @author andilenzama
 */



abstract class Animal {

public int iDtag;

public String species;


public class Bird extends Animal{

public String getColour() {

if(this.colour==1){

return "grey";

}

else if(this.colour==2){

return "white";

}

else {

return "Black";

}

}

public void setColour(int colour) {

this.colour = colour;

}

@Override

public int getiDtag() {

return iDtag;

}

@Override

public void setiDtag(int iDtag) {

this.iDtag = iDtag;

}

@Override

public String getSpecies() {

return species;

}

@Override

public void setSpecies(String species) {

this.species = species;

}

int colour;

public Bird(int iDtag, String species, int colour) {

super(iDtag, species);

this.colour = colour;

}

}



public class Reptile extends Animal{

public Reptile(int iDtag, String species, double bloodTemp) {

super(iDtag, species);

this.bloodTemp = bloodTemp;

}

double bloodTemp;

public double getBloodTemp() {

return bloodTemp;

}

public void setBloodTemp(double bloodTemp) {

this.bloodTemp = bloodTemp;

}

@Override

public int getiDtag() {

return iDtag;

}

@Override

public void setiDtag(int iDtag) {

this.iDtag = iDtag;

}

@Override

public String getSpecies() {

return species;

}

@Override

public void setSpecies(String species) {

this.species = species;

}

}




public class Main {

/**

* @param args

*/

public static void main(String[] args) {

Bird brd;

Reptile rept;

brd= new Bird(100, "Crow", 1);

rept=new Reptile(101, "Snack", 12.45);

System.out.println("*****Bird******");

System.out.println("Id Tag :" +brd.getiDtag());

System.out.println("Specied : "+brd.getSpecies());

System.out.println("Colour :"+brd.getColour());

System.out.println("*****Reptile******");

System.out.println("Id Tag :" +rept.getiDtag());

System.out.println("Specied : "+rept.getSpecies());

System.out.println("Colour :"+rept.getBloodTemp());

}

}


public int getiDtag() {

return iDtag;

}

public void setiDtag(int iDtag) {

this.iDtag = iDtag;

}

public String getSpecies() {

return species;

}

public void setSpecies(String species) {

this.species = species;

}

public Animal(int iDtag, String species) {

this.iDtag = iDtag;

this.species = species;

}

}