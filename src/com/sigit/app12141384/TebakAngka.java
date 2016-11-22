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
             // Mulai Tebak
                // Tebak
                
              // ------------------- START EDIT HERE
                String nextLevel; 
                int berakhir;
                do{    
         int cobalagi=5;
                    int Kout, Ang, Pang;
                    int PiLevel=0;
                    System.out.println("# Level 1");
                    System.out.println("Selamat bergabung " + cariY);
                    Pang=PiLevel+1*100;
                    System.out.println("Silahkan Tebak Antara 1 s/d " + Pang);
                    int AngKaTebakAcak=angkaRandom.nextInt(Pang);
                    for(Kout=0;Kout<=4;Kout++){

                        System.out.println("Tebakan Anda ? " + AngKaTebakAcak);
                        int AkuTeb=input.nextInt();
                        int Kurang=4-Kout;
                        if(AkuTeb==AngKaTebakAcak){
                            System.out.println("Jawaban Betul");
                            break;
                            
                        }
                        else{
                            if(AkuTeb>AngKaTebakAcak){
                                System.out.println("Tebakan Anda terlalu Besar! Anda mempunyai kesempatan " + Kurang + " kali lagi" );
                            }
                            else{
                                System.out.println("Tebakan Anda terlalu Kecil! Anda mempunyai kesempatan " + Kurang + " kali lagi" );
                            }
                        }
                    }
                    System.out.println("Ketik 'next' dan tekan enter untuk lanjut ke Level berikutnya atau 'exit' untuk keluar : ");
                    nextLevel=input.nextLine();
                    PiLevel++;
                    
                   
                }
                while(!"exit".equals(nextLevel));
              
              // ------------------- END OF EDIT
            } // Stop Looping Nama Pemain
            
        }        
        while(!"y".equals(cariY));
        int jumPemain=namaPemakai.size();
        System.out.println("SCORE");
        System.out.println("=================================");
        int l;
        for(l=0;l<jumPemain-1;l++){
            System.out.println(namaPemakai.get(l));
ArrayList <String> namaPemain = new ArrayList<>(); 
       ArrayList <Integer> nilaiPenguna = new ArrayList<>(); 
        Scanner input = new Scanner(System.in); 
        Scanner input2= new Scanner(System.in); 
        Random angkaRandom=new Random(); 
        String cariY; 
        do{
System.out.println("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter = ");
            cariY=input.nextLine();
            namaPenguna.add(cariY);
            int NilaiJalan = 0;  
            int CekGameOver=0; 
 int aKumulasi[]= new int[6]; 
            int NilaiPasJalan=0; 
            // Mulai Ngegame
            if(!("y").equals(cariY)){  
              // ------------------- START SCRIPT TEBAK DISINI --------------------------  
                String nextLevel;  
                int PiLevel=1;   /
                System.out.println("Selamat Datang " + cariY); 
                do{
                    
                }