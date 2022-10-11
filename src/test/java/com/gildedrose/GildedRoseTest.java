package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("foo", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.name, is("foo"));
  }


  // test toString
  @Test
  @DisplayName("toString Test")
  void toString_Test() {
    Item element = new Item("Jack D", 19, 9);
  //     GildedRose app = new GildedRose(new Item[] {element});//    app.updateQuality();
    assertThat(element.toString(), is("Jack D, 19, 9"));
  }

  // Update quality tests :
    // Decrementation of quality
  @Test
  @DisplayName("Quality Decrementation Test")
  void QualityDecrementationTest() {
    Item[] elements = new Item[]
            {
                    //16 : items[i].quality = items[i].quality - 1;
                    new Item("aaa", 19, 0),
                    new Item("aaa", 19, 9),
                    new Item("Sulfuras, Hand of Ragnaros", 19, 9),


                    //48 : items[i].quality = items[i].quality - 1;
                    new Item("bbb", 1, 9),
                    new Item("bbb", -19, 0),
                    new Item("bbb", -19, 9),
                    new Item("Sulfuras, Hand of Ragnaros", -19, 9),

                    //52 : items[i].quality = items[i].quality - items[i].quality;
                    new Item(Item.name1, -1, 50),
                    new Item("Backstage passes to a TAFKAL80ETC concert", -1, 51),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 1, 9),




            };

    GildedRose app = new GildedRose(elements);
    app.updateQuality();

    assertThat(elements[0].quality, is( 0));
    assertThat(elements[1].quality, is( 8));
    assertThat(elements[2].quality, is( 9));
    assertThat(elements[3].quality, is( 8));
    assertThat(elements[4].quality, is( 0));
    assertThat(elements[5].quality, is( 7));
    assertThat(elements[6].quality, is( 9));
    assertThat(elements[7].quality, is( 0));
    assertThat(elements[8].quality, is( 0));
    assertThat(elements[9].quality, is( 12));


  }

  // Incrementation of quality
  @Test
  @DisplayName("Quality Incrementation Test")
  void QualityIncrementationTest() {
    Item[] elements = new Item[]
            {
                    //21 : items[i].quality = items[i].quality + 1;
                    new Item(Item.name2, 19, 50),
                    new Item("Aged Brie", 19, 9),

                    //26 : items[i].quality = items[i].quality + 1;
                    new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 10, 9),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 11, 9),

                    //32 : items[i].quality = items[i].quality + 1;
                    new Item("Backstage passes to a TAFKAL80ETC concert", 5, 9),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 6, 9),
                    new Item("Backstage passes to a TAFKAL80ETC concert", 5, 48),

                    //56 : items[i].quality = items[i].quality + 1;
                    new Item(Item.name2, -1, 9),
                    new Item("Aged Brie", -1, 49),
                    new Item("Aged Brie", 1, 9),






            };

    GildedRose app = new GildedRose(elements);
    app.updateQuality();

    assertThat(elements[0].quality, is( 50));
    assertThat(elements[1].quality, is( 10));
    assertThat(elements[2].quality, is( 50));
    assertThat(elements[3].quality, is( 11));
    assertThat(elements[4].quality, is( 10));
    assertThat(elements[5].quality, is( 12));
    assertThat(elements[6].quality, is( 11));
    assertThat(elements[7].quality, is( 50));
    assertThat(elements[8].quality, is( 11));
    assertThat(elements[9].quality, is( 50));
    assertThat(elements[10].quality, is( 10));


  }




  // Incrementation of quality
  @Test
  @DisplayName("SellIn Decrementation Test")
  void SellInDecrementationTest() {
    Item[] elements = new Item[]
            {
                    //40 : items[i].sellIn = items[i].sellIn - 1;
                    new Item("eee", 19, 9),

            };

    GildedRose app = new GildedRose(elements);
    app.updateQuality();

    assertThat(elements[0].sellIn, is( 18));



  }


}
