package com.sigit.app12141384;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * NIM 12141384
 * @author Mr.She-Gate
 */
public class TebakAngka {

    public String namaPemakai;
    public int asalTebakAngka;
    public byte tingkatan;
    public char jawab;
    public int angkaTebakAcak;
    public int cobaLagi;
    public int nilai;
    ArrayList <String> namaPenguna = new ArrayList<>();
        ArrayList <Integer> nilaiPermainan = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random angkaRandom=new Random();
        String Na="no";
         boolean PlayaGain = false;
        String cariY; // Untuk mencari nilai Y, jika input y, maka otomatis akan keluar
        do{
            System.out.println("Masukkan 'Nama' anda atau tekan 'k' untuk keluar, kemudian tekan enter = ");
            cariY=input.nextLine();
            namaPemakai.add(cariY);
            // star
            if(!("y").equals(cariY)){