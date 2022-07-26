// package com.example.bookstoreProject.WishList;

//import java.util.List;

//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

//import com.example.bookstoreProject.Author.Author;
//import com.example.bookstoreProject.Book.Book;
//import com.example.bookstoreProject.User.User;


//@RestController
//@RequestMapping("/api/v1/wishlist")
//public class WishListController {

   // private WishListService wishlistserivce;

//public WishListController(WishlistService wishlistserivce){
    //this.wishlistserivce = wishlistserivce;
//}
//@GetMapping("/searchByUser/{userId}")
//public ResponseEntity<List<WishList>> searchWishListsByUser(@PathVaraible Long userId){
    //return ResponseEntity.ok(wishlistserivce.searchListsByUser(userId));
//}

//@PostMapping("/createWishlist/{userId}/{bookId}")
    //public WishList createWishlist(@RequestBody WishList wishList, @PathVariable Long userId, @PathVaraible String bookId ){
       //wishList.setUser(new User(userId));
       //wishlist.setBook(new Book(bookId));
      // return WishlistService.createWishlist(wishList);
//}
//@PostMapping("/updateWishlist/{userId}/{bookId}")
    //public WishList updateWishlist(@RequestBody WishList wishList, @PathVariable Long userId, @PathVaraible String bookId ){
       //wishList.setUser(new User(userId));
       //wishlist.setBook(new Book(bookId));
       //return WishlistService.createWishlist(wishList);



//}

//}