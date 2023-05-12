import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //add this for the listener

/**.
* PokemonPanel for PokemonGUIJianlong.java
* @author JianlongChen
* @since 2020/12/10
*/

public class PokemonPanel extends JPanel {

  /********* label. ************/
   private JLabel lTitle = new JLabel("Pokemon Available");

   private JLabel lMsg = new JLabel("                ");
   

  /******* button. ****************/
   private JButton bDone = new JButton(" Make Pokemon ");
  
   private JButton bClear = new JButton(" Clear ");
  
   private JButton bList = new JButton("List Pokemon"); 
   
   /******* sub-panel. ***********/
   private JPanel firstSubpanel = new JPanel();  
   private JPanel secondSubpanel = new JPanel(); 
   private JPanel thirdSubpanel = new JPanel(); 
   private JPanel fourthSubpanel = new JPanel();
   
    
  
   
  /** we can declare and initialize ActionListener obj. */
   private GUIListener listener = new GUIListener();
  
   private Choice chSpecies = new Choice();
  
  /******** Pokemon. *********/
   private Pokemon pk;
   /******* capacity of Pokemon array. ****/
   private final int capacity = 6;
   /******** Array of Pokemon. ***************/
   private Pokemon[ ] pokemonList = new Pokemon[capacity];
   /******** counter for Pokemon. ***************/
   private int count = 0;
   
  /******** String for holding Pokemon for display. */ 
   private String sOut = new String("");
   private String sOut2 = new String("");
 
  /****** text are for displaying Pokemon.toString()s. */
  //parameters are default size in (rows,cols) chars
   private JTextArea textArea = new JTextArea(20, 25);
   private JTextArea textArea2 = new JTextArea(20, 25);
   
  /** Make TextArea scrollable. **********************/
  //textArea is put inside this.              (right here)            
   private JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
       JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
   private JScrollPane scroll2 = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
       JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

/**
  * Constructor holds everything.
  */
   public PokemonPanel() {
      this.setLayout(new BorderLayout());
      this.setPreferredSize(new Dimension(700, 500));
     
     //add choices to the choice dropdown list
      chSpecies.add("Bulbasaur");
      chSpecies.add("Venusaur");
      chSpecies.add("Ivysaur");
      chSpecies.add("Squirtle");
      chSpecies.add("Wartortle");
      chSpecies.add("Blastoise");
      chSpecies.add("Charmander");
      chSpecies.add("Charmeleon");
      chSpecies.add("Charizard");
      
     
     //add labels, textFields and choice
      firstSubpanel.add(lTitle);
      firstSubpanel.add(chSpecies);
      firstSubpanel.add(bDone);
      bList.addActionListener(listener); //add listener to button
      bList.setEnabled(false); // set bList to disable
      firstSubpanel.add(bList);
      bDone.addActionListener(listener); //add listener to button
      firstSubpanel.add(bClear);
      bClear.addActionListener(listener); //add listener to button
      //firstSubpanel add to North
      
      add("North", firstSubpanel); 
  
       //set up the textArea for holding list
      //make the textArea look like the background instead of white
      textArea.setBackground(Color.yellow);
      //make it not editable by user
      textArea.setEditable(false);
      //set up scrollPane appearance and size (textArea already inside it) 
      scroll.setBorder(null);
      secondSubpanel.add(scroll);  //add scrollPane to panel, textArea inside.       
      scroll.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
      //secondSubpanel add to Center
      add("Center", secondSubpanel);
      
      
      
        //set up the textArea for holding list
      //make the textArea look like the background instead of white
      textArea2.setBackground(Color.yellow);
      //make it not editable by user
      textArea2.setEditable(false);
      //set up scrollPane appearance and size (textArea already inside it) 
      scroll2.setBorder(null);
      thirdSubpanel.add(scroll2);  //add scrollPane to panel, textArea inside.        
      scroll2.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
      //third Subpanel add to south
      add("South", thirdSubpanel);

      
     
     
     //fourthSubpanel add to west
      fourthSubpanel.add(lMsg);
      add("West", fourthSubpanel);
      
     
        
   } //close PokemonPanel constructor
 
 /**
 * Private ActionListener class.
 */
   private class GUIListener implements ActionListener {
   
   /**
   * ActionPerformed method.
   * @param event what button is clicked.
   */ 
      public void actionPerformed(ActionEvent event) {
      
      //if "clear" button clicked, run cleaner method  
         if (event.getSource() == bClear) {
            cleaner();
         }
         if (event.getSource()  == bList) {
            textarea();
         }   

      //if "done" button clicked
      //get the input from the text boxes
      //post error messages if input not valid
      //add Pokemon to array if valid
         if (event.getSource()  == bDone) { 
            String sSpecies  = "";
            String sName  = "";
            String sNumber = "";
            String sHP = "";
            int iNumber = 0;
            int iHP = 0;
            Random rd = new Random();
            int numRange = 151;
            int hpRange = 401;
            iNumber = rd.nextInt(numRange);
            iHP = rd.nextInt(hpRange);
            bList.setEnabled(true); // set bList to enabled after user make pokemon

            //get Choice selection
            sSpecies = chSpecies.getSelectedItem();
           
            
         
            try {
                //converting sID to integer
               //iNumber = Integer.parseInt(sNumber);
              //converting sGPA to double
               //iHP = Integer.parseInt(sHP);
               try  {
               //Student will throw PokemonException if not valid
                  pk = new Pokemon(sSpecies, sName, iNumber, iHP);
                   
               
                  if (count < capacity) {
                     pokemonList[count] = pk;
                     lMsg.setText("Pokemon added");
                     textArea.setText(pokemonList[count].toString());
                     count++;
                     
                  } else {
                     lMsg.setText("array full, cannot add Pokemon");
                  } 
               } catch (PokemonException pe) {
                  lMsg.setText(pe.getMessage());
               }
              //redisplay the list of students
               sOut = "";
               for (int j = 0; j < capacity; j++) {
                  if (j < count) {
                     sOut += " " + pokemonList[j].toString() + "\n\n";                   
                     
                  } 
               }
               
            } catch (NumberFormatException nfe) {
               lMsg.setText("Number or HP are not a number");
            }           
         } //end for "done" button  
      } //actionEvent method
   
   /**
   * helper method for ActionListener.
   * clears the TextBoxes resets choice
   */
      private void textarea() {
         textArea2.setText(sOut); // list Pokemon
      }
      private void cleaner() {
         chSpecies.select("Bulbasaur");
         textArea.setText(""); //clean textArea
         textArea2.setText(""); //clean textArea2
         lMsg.setText("          ");

         
         
      } //end cleaner method
   
   } // end GUIListener private class
 
 
} //end PokmonPanel class
