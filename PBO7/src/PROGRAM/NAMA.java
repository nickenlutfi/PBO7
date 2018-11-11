/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PROGRAM;

import java.util.Comparator;
public class NAMA implements Comparator<MAHASISWA>{
@Override
    public int compare(MAHASISWA x, MAHASISWA y)
    {
        return x.getnama().compareToIgnoreCase(y.getnama());   
    }    
}

