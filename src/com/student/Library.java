package com.student;

public class Library {
    private int borrowed_books = 0;
   private final int max_Books =5;

   public void  borrowedBook(){
       if(borrowed_books > 0 && borrowed_books <5 ){
            borrowed_books++;
       }

   }

   public int Book(){

       return borrowed_books;
   }

}
