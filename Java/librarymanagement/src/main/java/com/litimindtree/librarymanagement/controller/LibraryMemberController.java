// package com.manytoone.libraeymanagement.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import com.manytoone.libraeymanagement.entity.Librarymember;
// import com.manytoone.libraeymanagement.service.LibraryMemberService;

// import java.util.List;

// @RestController
// @RequestMapping("/api/members")
// public class LibraryMemberController {

//     @Autowired
//     private LibraryMemberService libraryMemberService;

//     @GetMapping
//     public List<Librarymember> getAllMembers() {
//         return libraryMemberService.getAllMembers();
//     }

//     @GetMapping("/{id}")
//     public ResponseEntity<Librarymember> getMemberById(@PathVariable Long id) {
//         return libraryMemberService.getMemberById(id)
//                 .map(ResponseEntity::ok)
//                 .orElseGet(() -> ResponseEntity.notFound().build());
//     }

//     @PostMapping
//     public Librarymember createMember( @RequestBody Librarymember member) {
//         return libraryMemberService.addMember(member);
//     }

//     @PutMapping("/{id}")
//     public ResponseEntity<Librarymember> updateMember(@PathVariable Long id,@RequestBody Librarymember memberDetails) {
//         return ResponseEntity.ok(libraryMemberService.updateMember(id, memberDetails));
//     }

//     @DeleteMapping("/{id}")
//     public ResponseEntity<Void> deleteMember(@PathVariable Long id) {
//         libraryMemberService.deleteMember(id);
//         return ResponseEntity.noContent().build();
//     }

//     @PostMapping("/borrow")
//     public ResponseEntity<String> borrowBook(@RequestParam Long memberId, @RequestParam Long bookId) {
//         return ResponseEntity.ok(libraryMemberService.borrowBook(memberId, bookId));
//     }

//     @PostMapping("/return")
//     public ResponseEntity<String> returnBook(@RequestParam Long memberId, @RequestParam Long bookId) {
//         return ResponseEntity.ok(libraryMemberService.returnBook(memberId, bookId));
//     }
// }
