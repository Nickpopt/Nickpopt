public class network {
 string message="the messege", ip="198.164.1.1";
 boolean tf = MessageService.sendMessage(String ip, String message);
 if (tf = true){
  system.out.println("message was sent");
 }
 else {
  system.out.println("network was down");
 }
}
public class MessageService {
 public boolean sendMessage(String ip, String message){
  string reip="198.164.1.5";
  int i=0;
  boolean tf=false;
  while (tf ==false || i<1){
   try{
    send("message");
	tf=true;
   }
   catch{
    tf=false;
   }
  }
  return tf;
 }
}