/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PROGRAM;

import java.util.Comparator;
public class IPK implements Comparator<MAHASISWA>{
    @Override
    public int compare(MAHASISWA x, MAHASISWA y){
        return Float.compare(x.getipk(), y.getipk());
    }
}
