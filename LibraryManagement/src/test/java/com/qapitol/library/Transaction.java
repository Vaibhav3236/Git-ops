package com.qapitol.library;

public class Transaction {
    private int transaction_id;
    private int book_id;
    private String date;

    public int getTransaction_id()
    {return transaction_id;}
    public void setTransaction_id(int transaction_id)
    {this.transaction_id = transaction_id;}
    public int getBook_id()
    {return book_id;}
    public void setBook_id(int book_id)
    {this.book_id = book_id;}
    public String getDate()
    {return date;}
    public void setDate(String date)
    {this.date = date;}

    @Override
    public String toString() {
        return "Transaction{" +
                "transaction_id=" + transaction_id +
                ", book_id=" + book_id +
                ", date='" + date + '\'' +
                '}';
    }
}
