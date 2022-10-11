package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    //Ajout des propriétés statiques


    public  static final   String  name1="Backstage passes to a TAFKAL80ETC concert";
    public  static final   String  name2="Aged Brie";
    public  static final   String  name3="Sulfuras, Hand of Ragnaros";
    public final static    String name4="Conjured Mana Cake";

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }



   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }


    // Ajout de la  méthode updateQuality()

    public void updateQuality(){

    switch (name){

        //name1="Backstage passes to a TAFKAL80ETC concert";
        case name1:
            if (quality<50){
                quality++;
            }
            if (sellIn<11 && quality<50){
                quality++;
            }
            if (sellIn<6  && quality<50){
                quality++;
            }

            sellIn--;

            if (sellIn<0){
                quality=0;
            }

            break;

        //name2="Aged Brie";
        case name2:
            if (this.quality<50){
                this.quality++;
            }

            this.sellIn--;

            if (this.sellIn<0 && this.quality<50){
                this.quality++;
            }

            break;

        //name3="Sulfuras, Hand of Ragnaros";
        case name3:

            break;

        case name4:
            if (sellIn<0){
                quality-=4;
            }
            if (sellIn>=0){
                quality-=2;
            }

            break;




        default:
            if (quality>0){
                quality--;
            }

            sellIn--;

            if (sellIn<0 && quality>0){
                quality--;
            }


    }
    }
}
