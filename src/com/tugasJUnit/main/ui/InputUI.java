package com.tugasJUnit.main.ui;

import java.util.Scanner;

import com.tugasJUnit.main.formula.KecepatanRataRata;

public class InputUI {
	
	KecepatanRataRata kecepatan;
	
	
	public InputUI() {
		
		if (kecepatan == null) {
			kecepatan = new KecepatanRataRata();
		}
	}
	
	public void showHitungKecapatan() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai jaraknya : ");
		float jarak = in.nextFloat();
		System.out.print("Masukkan Nilai waktunya : ");
		float waktu = in.nextFloat();
		
		System.out.print("Rata - Rata kecepatannya Adalah : " +kecepatan.HitungKecepatan(jarak, waktu));
		
	}
	
}
