/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LABTUAN2;
public class book {
    private String boCode;
    private String boTitle;
    private String boAuthor;
    public book() {
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }
    public book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
    public book(book b) {
        this.boCode = b.boCode;
        this.boTitle = b.boTitle;
        this.boAuthor = b.boAuthor;
    }
    public String getBoCode() {
        return boCode;
    }
    public String getBoTitle() {
        return boTitle;
    }
    public String getBoAuthor() {
        return boAuthor;
    }
    public String toString() {
        return "Book Code: " + boCode + ", Title: " + boTitle + ", Author: " + boAuthor;
    }
}
