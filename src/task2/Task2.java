/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nadeen Nadim
 */

class Books
{
    private String authorName;
    private String title;
    private String publisher;
    private int year;
    private double price;
    

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Books(String authorName, String title, String publisher,int year, double price)
    {
        this.authorName = authorName;
        this.title = title;
        this.publisher = publisher;
        this.year= year;
        this.price = price;
        
    
        
    }
    public void printInfo()
    {
        System.out.println("Author Name: " +  authorName +"\n" +"Title: "+ title+"\n" 
             +"Publisher: "+publisher+"\n" +"Release Year: "+ year+"\n" +"Price: " +price +"le");
    }
    
}

class Ebooks extends Books
{
    
    private int numberOfPages;
    private ArrayList<String> favorite;
    private int bookMark =0; // points at coverPage

    public int getBookMark() {
        return bookMark;
    }

    public void setBookMark(int bookMark) {
        this.bookMark = bookMark;
    }
    
    

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public ArrayList<String> getFavorite() {
        return favorite;
    }

    public void setFavorite(ArrayList<String> favorite) {
        this.favorite = favorite;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    
    
    public Ebooks(String authorName, String title, String publisher, int year, double price,int numberOfPages) {
        super(authorName, title, publisher, year, price);
        this.numberOfPages= numberOfPages;
        this.favorite = new ArrayList();
    }
    
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Number of Pages: " + numberOfPages);   
    }
    
     public void addFavorite(String statement)
    {
        favorite.add(statement);
    }
      public void removeFromFavorite(String statement)
    {
        favorite.remove(statement);
    }
 
    
   
  
}

class AudioBook extends Books
{
    int durationInMinutes; //appears to user
    String narrator;
    int pausePoint =0;
    ArrayList<Integer> favorites;
    

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
    
    
    public AudioBook(String authorName, String title, String publisher, int year, double price, int durationInMinutes, String narrator) {
        super(authorName, title, publisher, year, price); 
        this.favorites = new ArrayList();
        this.durationInMinutes = durationInMinutes;
        this.narrator = narrator;
    }
    
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Duration in minutes: " + durationInMinutes+"\n"
        + "Narrator:" + narrator+"\n");   
    }

    public int getPausePoint() {
        return pausePoint;
    }

    public void setPausePoint(int pausePoint) {
        this.pausePoint = pausePoint;
    }

    public ArrayList<Integer> getFavorites() {
        return favorites;
    }

    public void setFavorites(ArrayList<Integer> favorites) {
        this.favorites = favorites;
    }

  
    
    public void addFavorite(int minute)
    {
        favorites.add(minute);
    }
      public void removeFromFavorite(int minute)
    {
        favorites.remove(minute);
    }
    
    //function used to play and pause the audioBook
    public void listening()
    {
        Scanner btn = new Scanner(System.in);
        int count =0;
        System.out.println("Press q to pause");
        
        while(true)
        {   

            if(btn.next().charAt(0)== 'q'||btn.next().charAt(0) =='Q')
            {  
              break;
            }
            count++; 
           
        }
        pausePoint = (pausePoint +(count/60)) ;
    }
    
   
}



public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
    }
    
}
