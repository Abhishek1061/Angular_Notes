// package com.litimindtree.librarymanagement.entity;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;

// import java.util.Set;

// @Entity
// public class Librarymember {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long memberId;
//     private String firstName;
//     private String lastName;
//     private String email;

//     @ManyToMany
//     private Set<Book> borrowedBooks;

//     public Librarymember() {
//     }

//     public Librarymember(String firstName, String lastName, String email, Set<Book> borrowedBooks) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.email = email;
//         this.borrowedBooks = borrowedBooks;
//     }

//     public Long getMemberId() {
//         return memberId;
//     }

//     public void setMemberId(Long memberId) {
//         this.memberId = memberId;
//     }

//     public String getFirstName() {
//         return firstName;
//     }

//     public void setFirstName(String firstName) {
//         this.firstName = firstName;
//     }

//     public String getLastName() {
//         return lastName;
//     }

//     public void setLastName(String lastName) {
//         this.lastName = lastName;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     public Set<Book> getBorrowedBooks() {
//         return borrowedBooks;
//     }

//     public void setBorrowedBooks(Set<Book> borrowedBooks) {
//         this.borrowedBooks = borrowedBooks;
//     }

// }
