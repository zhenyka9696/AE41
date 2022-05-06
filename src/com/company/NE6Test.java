package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NE6Test {

    @Test
    void is_narc_dec_num() {
        // то, что с дома
        //assertEquals(true,NE6.is_narc_dec_num(1634));
    int [] arr={0,1,2,3,4,5,6,7,8,9,153,370};
    for (int i=0;i<arr.length;i++)
        Assertions.assertTrue(NE6.is_narc_dec_num(arr[i]));
            //нужное
 //       Assertions.assertTrue(Narcis.is_narc_dec_num(370));
 //       Assertions.assertFalse(Narcis.is_narc_dec_num(369));
    }
}