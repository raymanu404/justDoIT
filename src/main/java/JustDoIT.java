/*
 * Decompiled with CFR 0.137.
 */
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JustDoIT {
    private JFrame frame;
    private JLabel lblSCOR;
    private DefaultListModel<String> listaIntrebari;
    private JScrollPane scrollPane;
    private JTextArea txtIntrebare;
    private JButton btnA;
    private JButton btnB;
    private JButton btnC;
    private JButton btnD;
    private JButton btnE;
    private JLabel lblGresit;
    final int scorTOTAL = 131;
    private List<String> intrebari;
    private List<String> raspunsuri;
    private String RASPUNS = "";
    private int scor = 0;
    private int intrebariRamase = 131;
    private int incercare = 0;
    private String raspuns = "";
    private int raspunsGresit = 0;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){

            @Override
            public void run() {
                try {
                    JustDoIT window = new JustDoIT();
                    window.getClass().getResourceAsStream(String.valueOf(System.getProperty("user.dir")) + "src\\sourceJava.txt");
                    window.frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public JustDoIT() {
        this.initialize();
    }

    private void initialize() {
        this.frame = new JFrame();
        this.frame.setResizable(false);
        this.frame.setBounds(100, 100, 764, 380);
        this.frame.setDefaultCloseOperation(3);
        this.frame.getContentPane().setLayout(null);
        this.frame.setTitle("JustDoIT");
        this.lblSCOR = new JLabel("Scor : ");
        this.lblSCOR.setFont(new Font("Times New Roman", 0, 16));
        this.lblSCOR.setBounds(37, 20, 386, 28);
        this.frame.getContentPane().add(this.lblSCOR);
        this.txtIntrebare = new JTextArea();
        this.txtIntrebare.setWrapStyleWord(true);
        this.txtIntrebare.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.txtIntrebare.setEditable(false);
        this.txtIntrebare.setRows(10);
        this.txtIntrebare.setLineWrap(true);
        this.txtIntrebare.setFont(new Font("Times New Roman", 0, 16));
        this.btnA = new JButton("A");
        this.btnB = new JButton("B");
        this.btnC = new JButton("C");
        this.lblGresit = new JLabel("New label");
        this.lblGresit.setFont(new Font("Times New Roman", 0, 16));
        this.lblGresit.setBounds(582, 20, 136, 28);
        this.frame.getContentPane().add(this.lblGresit);
        this.citesteFisier();
        this.randomItem();
        this.btnA.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (JustDoIT.this.RASPUNS.equals("A")) {
                    ++JustDoIT.this.scor;
                    JOptionPane.showMessageDialog(null, "RASPUNS CORECT!\n" + JustDoIT.this.raspuns, "Info", 1);
                } else {
                    ++JustDoIT.this.raspunsGresit;
                    JOptionPane.showMessageDialog(null, "RASPUNS GRESIT\n\nRaspunsul era:\n" + JustDoIT.this.raspuns, "Info", 1);
                }
                ++JustDoIT.this.incercare;
                JustDoIT.this.intrebariRamase = 131 - JustDoIT.this.incercare;
                JustDoIT.this.randomItem();
            }
        });
        this.btnA.setFont(new Font("Times New Roman", 0, 16));
        this.btnA.setBounds(577, 52, 157, 37);
        this.frame.getContentPane().add(this.btnA);
        this.btnB.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (JustDoIT.this.RASPUNS.equals("B")) {
                    ++JustDoIT.this.scor;
                    JOptionPane.showMessageDialog(null, "RASPUNS CORECT!\n" + JustDoIT.this.raspuns, "Info", 1);
                } else {
                    ++JustDoIT.this.raspunsGresit;
                    JOptionPane.showMessageDialog(null, "RASPUNS GRESIT\n\nRaspunsul era:\n" + JustDoIT.this.raspuns, "Info", 1);
                }
                ++JustDoIT.this.incercare;
                JustDoIT.this.intrebariRamase = 131 - JustDoIT.this.incercare;
                JustDoIT.this.randomItem();
            }
        });
        this.btnB.setFont(new Font("Times New Roman", 0, 16));
        this.btnB.setBounds(577, 99, 157, 37);
        this.frame.getContentPane().add(this.btnB);
        this.btnC.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (JustDoIT.this.RASPUNS.equals("C")) {
                    ++JustDoIT.this.scor;
                    JOptionPane.showMessageDialog(null, "RASPUNS CORECT!\n" + JustDoIT.this.raspuns, "Info", 1);
                } else {
                    ++JustDoIT.this.raspunsGresit;
                    JOptionPane.showMessageDialog(null, "RASPUNS GRESIT\n\nRaspunsul era:\n" + JustDoIT.this.raspuns, "Info", 1);
                }
                ++JustDoIT.this.incercare;
                JustDoIT.this.intrebariRamase = 131 - JustDoIT.this.incercare;
                JustDoIT.this.randomItem();
            }
        });
        this.btnC.setFont(new Font("Times New Roman", 0, 16));
        this.btnC.setBounds(577, 157, 157, 37);
        this.frame.getContentPane().add(this.btnC);
        this.scrollPane = new JScrollPane();
        this.scrollPane.setHorizontalScrollBarPolicy(32);
        this.scrollPane.setAutoscrolls(true);
        this.scrollPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.scrollPane.setVerticalScrollBarPolicy(22);
        this.scrollPane.setBounds(10, 57, 538, 223);
        this.frame.getContentPane().add(this.scrollPane);
        this.scrollPane.setViewportView(this.txtIntrebare);
        this.btnD = new JButton("D");
        this.btnD.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (JustDoIT.this.RASPUNS.equals("D")) {
                    ++JustDoIT.this.scor;
                    JOptionPane.showMessageDialog(null, "RASPUNS CORECT!\n" + JustDoIT.this.raspuns, "Info", 1);
                } else {
                    ++JustDoIT.this.raspunsGresit;
                    JOptionPane.showMessageDialog(null, "RASPUNS GRESIT\n\nRaspunsul era:\n" + JustDoIT.this.raspuns, "Info", 1);
                }
                ++JustDoIT.this.incercare;
                JustDoIT.this.intrebariRamase = 131 - JustDoIT.this.incercare;
                JustDoIT.this.randomItem();
            }
        });
        this.btnD.setFont(new Font("Times New Roman", 0, 16));
        this.btnD.setBounds(577, 203, 157, 37);
        this.frame.getContentPane().add(this.btnD);
        this.btnE = new JButton("E");
        this.btnE.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                if (JustDoIT.this.RASPUNS.equals("E")) {
                    ++JustDoIT.this.scor;
                    JOptionPane.showMessageDialog(null, "RASPUNS CORECT!\n" + JustDoIT.this.raspuns, "Info", 1);
                } else {
                    ++JustDoIT.this.raspunsGresit;
                    JOptionPane.showMessageDialog(null, "RASPUNS GRESIT\n\nRaspunsul era:\n" + JustDoIT.this.raspuns, "Info", 1);
                }
                ++JustDoIT.this.incercare;
                JustDoIT.this.intrebariRamase = 131 - JustDoIT.this.incercare;
                JustDoIT.this.randomItem();
            }
        });
        this.btnE.setFont(new Font("Times New Roman", 0, 16));
        this.btnE.setBounds(577, 250, 157, 30);
        this.frame.getContentPane().add(this.btnE);
    }

    private void citesteFisier() {
        try {
            this.intrebari = new ArrayList<String>();
            this.raspunsuri = new ArrayList<String>();
            File file = new File(String.valueOf(System.getProperty("user.dir")) + "\\src\\sourceJava.txt");
            Scanner sc = new Scanner(file);
            String st = "";
            String intr = "";
            String[] d = new String[40];
            int i = 0;
            while (sc.hasNextLine()) {
                st = sc.nextLine();
                if (!st.equalsIgnoreCase("^_^")) {
                    intr = st.endsWith("*") ? st.replace("*", "") : st;
                    d[i++] = intr;
                } else {
                    intr = "";
                    for (int j = 0; j < i; ++j) {
                        intr = String.valueOf(intr) + d[j] + "\n";
                        d[j] = "";
                    }
                    this.intrebari.add(intr);
                    i = 0;
                    intr = "";
                }
                if (!st.endsWith("*")) continue;
                this.raspunsuri.add(st);
            }
            sc.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void randomItem() {
        int rand1;
        this.listaIntrebari = null;
        this.txtIntrebare.setText("");
        Random rand = new Random();
        this.listaIntrebari = new DefaultListModel();
        int index = rand1 = rand.nextInt(this.intrebari.size());
        this.listaIntrebari.addElement(this.intrebari.get(index));
        if (this.raspunsuri.get(index).startsWith("a")) {
            this.RASPUNS = "A";
        } else if (this.raspunsuri.get(index).startsWith("b")) {
            this.RASPUNS = "B";
        } else if (this.raspunsuri.get(index).startsWith("c")) {
            this.RASPUNS = "C";
        } else if (this.raspunsuri.get(index).startsWith("d")) {
            this.RASPUNS = "D";
        } else if (this.raspunsuri.get(index).startsWith("e")) {
            this.RASPUNS = "E";
        }
        this.raspuns = this.raspunsuri.get(index);
        this.lblSCOR.setText("SCOR : " + this.scor + " / " + 131 + " ----------mai aveti  " + this.intrebariRamase + "  de intrebari !");
        this.txtIntrebare.setText(this.listaIntrebari.get(0));
        this.lblGresit.setText("Gresite: " + this.raspunsGresit);
        if (this.incercare == 131) {
            this.btnA.setEnabled(false);
            this.btnB.setEnabled(false);
            this.btnC.setEnabled(false);
            int reply = JOptionPane.showConfirmDialog(null, "Data viitoare veti face mai bine! \n Doriti sa iesiti? ", "SFARSIT CHESTIONAR", 0);
            if (reply == 0) {
                JOptionPane.showMessageDialog(null, "Ati ales sa iesiti :(");
                System.exit(0);
            }
        }
    }

}

