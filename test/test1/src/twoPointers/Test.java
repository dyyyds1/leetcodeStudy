package twoPointers;

/**
* JVM参数为:-Xss2M 
* @author 38134
*
*/
public class Test {
 
      private void dontStop() {
          while(true) {

          }
      }
      public void stackLeakByThread() {
           while(true) {
                Thread thread = new Thread(new Runnable() {
                      @Override
                      public void run() {
                          dontStop();
                      }
                });
                thread.start();
           }
      }
 
     public static void main(String[] args) {
          Test test = new Test();
          test.stackLeakByThread();
     }
}