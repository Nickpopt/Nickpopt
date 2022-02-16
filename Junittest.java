public class networktest {
    
 @Test
 public void SuccesfulSend() {
  string message="the messege", ip="198.164.1.1";
  boolean tf = sendMessage(String ip, String message); 
  assertEquals(tf, true);
 }
 @Test
 public void FailedToSend() {
  string message="the messege", ip="198.164.1.1";
  boolean tf = sendMessage(String ip, String message); 
  assertEquals(tf, false);
 }
}