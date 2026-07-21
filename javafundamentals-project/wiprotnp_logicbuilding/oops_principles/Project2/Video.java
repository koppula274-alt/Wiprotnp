// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Video {
   private String videoName;
   private boolean checkout;
   private int rating;

   public Video(String var1) {
      this.videoName = var1;
      this.checkout = false;
      this.rating = 0;
   }

   public String getName() {
      return this.videoName;
   }

   public void doCheckout() {
      this.checkout = true;
   }

   public void doReturn() {
      this.checkout = false;
   }

   public void receiveRating(int var1) {
      this.rating = var1;
   }

   public int getRating() {
      return this.rating;
   }

   public boolean getCheckout() {
      return this.checkout;
   }
}