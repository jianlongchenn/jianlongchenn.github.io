import javax.swing.JFrame;


/**.
* Final Project PokemonGUI
* @author JianlongChen
* @since 2020/12/10
*/
public class PokemonGUIJianlong {
   
 
   
   public static void main(String[] args) {
   
      JFrame frame = new JFrame("Pokemon");
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //add the panel into the frame
      frame.getContentPane().add(new PokemonPanel());
     
      frame.pack();
      frame.setVisible(true);
      
   
   }

}