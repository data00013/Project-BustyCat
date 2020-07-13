//BLACK THEME

/**
 *
 * Created by: Code Black
 * Date Created: November 25, 2018
 * 
 * Filename: BustyCat.java
 * 
 */


/**
 *
 * Bus Ticket Calculator Project
 * PROG3
 * by: Ryan Group
 * 
 * Acleta, Noel E.
 * Jumarang, Syndy Apple T.
 * Lacorte, Ryan
 * Manongson,
 * Mercadal, Kenan
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class BustyCat extends JFrame {

    /**
     * Creates new form BustyCat
     */
    public BustyCat() {
        initComponents();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addWindowListener(new WindowAdapter(){
            //this is the exit message
            public void windowClosing(WindowEvent e) {
                String exitMessage = ""
                        + "Bus Ticket Calculator Project\n"
                        + "PROG2 - Computer Programming\n"
                        + "by: Ryan Group\n\n"
                        + "ACLETA, Noel E.\n"
                        + "JUMARANG, Syndy Apple T.\n"
                        + "LACORTE, Ryan Joseph M.\n"
                        + "MANONGSONG, John Ray L.\n"
                        + "MERCADAL, Kenan H.\n";
                JOptionPane.showMessageDialog(null, exitMessage, "BustyCat Exit Message",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        passenger = new ButtonGroup();
        panel = new JPanel();
        startLabel = new JLabel();
        destinationLabel = new JLabel();
        scroll1 = new JScrollPane();
        startList = new JList<>();
        scroll2 = new JScrollPane();
        destinationList = new JList<>();
        radio1 = new JRadioButton();
        radio2 = new JRadioButton();
        radio3 = new JRadioButton();
        radio4 = new JRadioButton();
        calcButton = new JButton();
        resultField = new JTextArea();

        setTitle("Bus Ticket Calculator");
        setBounds(new Rectangle(900, 700, 700, 700));
        setResizable(false);

        panel.setBackground(new Color(25, 25, 25));
        panel.setForeground(new Color(255, 255, 255));
        panel.setLayout(null);

        startLabel.setForeground(new Color(200, 200, 200));
        startLabel.setHorizontalAlignment(SwingConstants.CENTER);
        startLabel.setLabelFor(startList);
        startLabel.setText("START");
        startLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(startLabel);
        startLabel.setBounds(30, 20, 200, 10);

        destinationLabel.setForeground(new Color(200, 200, 200));
        destinationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        destinationLabel.setLabelFor(destinationList);
        destinationLabel.setText("DESTINATION");
        panel.add(destinationLabel);
        destinationLabel.setBounds(250, 20, 200, 10);

        startList.setBackground(new Color(51, 51, 51));
        startList.setForeground(new Color(204, 204, 204));
        startList.setModel(new AbstractListModel<String>() {
            String[] strings = { "",
                "Lucena", 
                "Domoit", 
                "Arias", 
                "Jollibee Calumpang", 
                "Lynelle's Lagoon and Resort", 
                
                "Jollibee Sariaya", 
                "Villa Leandro Resort", 
                "United Doctor's Hospital", 
                "Jollibee Candelaria", 
                "Sementeryo Candelaria", 
                
                "Lagalag Hospital", 
                "Lusacan", 
                "Tiaong Bantayan", 
                "Brgy. Lalig", 
                "San Antonio", 
                
                "Sitio de Amor", 
                "San Pablo Cemetery", 
                "Tierra de Oro Resort", 
                "Tindahan ng Itlog ni Kuya", 
                "Fuego Grill", 
                
                "SM City San Pablo", 
                "San Agustin", 
                "San Juan", 
                "San Jose", 
                "Prowil Cafe & Restaurant", 
                
                "San Pedro", 
                "Kainan ni Sir Chief", 
                "Mcdo Sto. Tomas", 
                "Sto. Tomas NLEX", 
                "Festival Mall"
            };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        startList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        startList.setFocusable(false);
        startList.setName("location");
        startList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                startListValueChanged(evt);
            }
        });
        scroll1.setViewportView(startList);

        panel.add(scroll1);
        scroll1.setBounds(30, 50, 200, 300);

        destinationList.setBackground(new Color(51, 51, 51));
        destinationList.setForeground(new Color(204, 204, 204));
        destinationList.setModel(new AbstractListModel<String>() {
            String[] strings = { "",
                "Lucena", 
                "Domoit", 
                "Arias", 
                "Jollibee Calumpang", 
                "Lynelle's Lagoon and Resort", 
                
                "Jollibee Sariaya", 
                "Villa Leandro Resort", 
                "United Doctor's Hospital", 
                "Jollibee Candelaria", 
                "Sementeryo Candelaria", 
                
                "Lagalag Hospital", 
                "Lusacan", 
                "Tiaong Bantayan", 
                "Brgy. Lalig", 
                "San Antonio", 
                
                "Sitio de Amor", 
                "San Pablo Cemetery", 
                "Tierra de Oro Resort", 
                "Tindahan ng Itlog ni Kuya", 
                "Fuego Grill", 
                
                "SM City San Pablo", 
                "San Agustin", 
                "San Juan", 
                "San Jose", 
                "Prowil Cafe & Restaurant", 
                
                "San Pedro", 
                "Kainan ni Sir Chief", 
                "Mcdo Sto. Tomas", 
                "Sto. Tomas NLEX", 
                "Festival Mall"
            };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        destinationList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        destinationList.setFocusable(false);
        destinationList.setName("location");
        destinationList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                destinationListValueChanged(evt);
            }
        });
        scroll2.setViewportView(destinationList);

        panel.add(scroll2);
        scroll2.setBounds(250, 50, 200, 300);

        radio1.setBackground(new Color(25, 25, 25));
        radio1.setForeground(new Color(200, 200, 200));
        radio1.setText("Regular");
        radio1.setBounds(490, 60, 225, 30);

        radio2.setBackground(new Color(25, 25, 25));
        radio2.setForeground(new Color(200, 200, 200));
        radio2.setText("Student");
        radio2.setBounds(490, 90, 225, 30);

        radio3.setBackground(new Color(25, 25, 25));
        radio3.setForeground(new Color(200, 200, 200));
        radio3.setText("Differently Abled Person");
        radio3.setBounds(490, 120, 225, 30);

        radio4.setBackground(new Color(25, 25, 25));
        radio4.setForeground(new Color(200, 200, 200));
        radio4.setText("Senior Citizen");
        radio4.setBounds(490, 150, 225, 30);

        panel.add(radio1);
        panel.add(radio2);
        panel.add(radio3);
        panel.add(radio4);

        passenger.add(radio1);
        passenger.add(radio2);
        passenger.add(radio3);
        passenger.add(radio4);
        
        //setActionCommand is use to assign value to the radio buttons
        radio1.setActionCommand("Regular");
        radio2.setActionCommand("Student");
        radio3.setActionCommand("Differently Abled Person");
        radio4.setActionCommand("Senior Citizen");
        
        //set radio1("Regular") selected as default
        radio1.setSelected(true);

        calcButton.setBackground(new Color(204, 204, 204));
        calcButton.setText("Calculate");
        calcButton.setToolTipText("Hit this SHIT");
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });
        panel.add(calcButton);
        calcButton.setBounds(470, 310, 250, 26);

        resultField.setEditable(false);
        resultField.setBackground(new Color(51, 51, 51));
        resultField.setForeground(new Color(200, 200, 200));
        resultField.setLineWrap(true);
        resultField.setText("\n1. Choose your Starting Point\n");
        resultField.append("2. Choose your Destination\n");
        resultField.append("3. Indicate type of Passenger\n");
        resultField.append("4. Hit the Calculate Button\n");
        resultField.setToolTipText("");
        panel.add(resultField);
        resultField.setBounds(470, 180, 250, 100);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.PREFERRED_SIZE, 750, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(panel, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void startListValueChanged(ListSelectionEvent evt) {
        resultField.setText("\n1. Choose your Starting Point\n");
        resultField.append("2. Choose your Destination\n");
        resultField.append("3. Indicate type of Passenger\n");
        resultField.append("4. Hit the Calculate Button\n");

        start = startList.getSelectedIndex();
        stringStart = startList.getSelectedValue();
    }

    private void destinationListValueChanged(ListSelectionEvent evt) {
        resultField.setText("\n1. Choose your Starting Point\n");
        resultField.append("2. Choose your Destination\n");
        resultField.append("3. Indicate type of Passenger\n");
        resultField.append("4. Hit the Calculate Button\n");

        desti = destinationList.getSelectedIndex();
        stringDesti = destinationList.getSelectedValue();
    }

    private void calcButtonActionPerformed(ActionEvent evt) {
            
            pass = passenger.getSelection().getActionCommand();
            
            if(start!=0&&desti!=0){
                
                distance = (meter[desti]-meter[start]);
                distance = Math.abs(distance);
                fare = distance*1.95;

                if(distance==0){
                    //if you pick destination the same with start distance will be at least 0
                    distance=1;
                }
                
                if(distance<10){
                    //if the user traveled less than 10km your fare will be equal with minimum fare
                    fare=20;
                }
                
                if(pass!="Regular"){
                    //RadioButton("Regular") is selected as default
                    //if you change it you will get 20% discount
                    fare*=0.8;
                }
                //if conditions above is satisfied
                //the current text written in text area will be overwritten by this
                //resultField.setText(stringStart + " --> " + stringDesti + "\n");
                resultField.setText("From: " + stringStart);
                resultField.append("\nTo: " + stringDesti);
                resultField.append("\n\nPassenger: " + pass);
                resultField.append("\nDistance: " + Math.round(distance) + "km");
                resultField.append("\nFare: " + Math.round(fare) + " pesos" + ((pass!="Regular") ? "   20% discount" : ""));
            }
            else{
                //if you hit the calculate button but didnt give your location
                resultField.setText("Invalid Input");
            }
    }//GEN-LAST:event_calcButtonActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BustyCat().setVisible(true);
            }
        });
    }

    //These are the variables used in computing
    public int start;
    public String stringStart;

    public int desti;
    public String stringDesti;

    public double distance;
    public double fare;
    public String pass;
    public double meter[] = {0, 
        0.0, //Lucena
        2.0, //Domoit
        5.6, //Arias
        7.2, //Jollibee Calumpang
        8.8, //Lynelle's Lagoon and Resort
        
        10.6, //Jollibee Sariaya
        17.4, //Villa Leandro Resort
        20.4, //United Doctor's Hospital
        23.1, //Jollibee Candelaria
        24.3, //Sementeryo Candelaria
        
        30.0, //Lagalag Hospital
        33.3, //Lusacan
        36.6, //Tiaong Bantayan
        39.5, //Brgy. Lalig
        42.4, //San Antonio
        
        43.3, //Sitio de Amor
        44.1, //San Pablo Cemetery
        45.3, //Tierra de Oro Resort
        46.6, //Tindahan ng Itlog ni Kuya
        47.5, //Fuego Grill
        
        52.2, //SM City San Pablo
        56.2, //San Agustin
        59.4, //San Juan
        64.3, //San Jose
        65.5, //Prowil Cafe & Restaurant
        
        67.0, //San Pedro
        69.9, //Kainan ni Sir Chief
        71.4, //Mcdo Sto. Tomas
        73.2, //Sto. Tomas NLEX
        109.4 //Festival Mall
    };

    //these are the Components used in GUI
    private JPanel panel;
    private JLabel startLabel;
    private JLabel destinationLabel;
    private JScrollPane scroll1;
    private JScrollPane scroll2;
    private JList<String> startList;
    private JList<String> destinationList;
    private JRadioButton radio1;
    private JRadioButton radio2;
    private JRadioButton radio3;
    private JRadioButton radio4;
    private ButtonGroup passenger;
    private JTextArea resultField;
    private JButton calcButton;
    
}
