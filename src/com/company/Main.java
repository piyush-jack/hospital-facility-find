package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class India1 extends JFrame {
    India1(){
        JFrame frame1=new JFrame();
        this.setTitle("India");
        this.setVisible(true);

        this.setResizable(true);
        this.setSize(1200,750);
        this.getContentPane().setBackground(new Color(223,156,156));

    }


}
class HospitalData extends JFrame {
    HospitalData(){
        this.setTitle("Hospidata data");
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(417,500);
        this.setLayout(null);
    }
}
class Hospital extends JFrame{
    Hospital(){
        this.setTitle("Hosptal info");
        this.setVisible(true);

        this.setResizable(false);
        this.setSize(900,150);

        this.getContentPane().setBackground(new Color(223,156,156));
    }
}
 class Karnatak extends JFrame {
    Karnatak(){
        this.setTitle("Karnataka");
        this.setVisible(true);

        this.setResizable(false);
        this.setSize(1200,750);
        this.getContentPane().setBackground(new Color(223,156,156));
    }
}

public class Main  {

    public static void main(String[] args) {



        ImageIcon mapimage=new ImageIcon("Karnataka (1).jpg");
        ImageIcon mapimage1=new ImageIcon("indiamap (5).jpg");

        JPanel TitleH=new JPanel();
        JButton backB=new JButton("BACK");

        JLabel titleH=new JLabel("SELECT THE COMPONENT YOU WANT TO SEE");
        TitleH.setBackground(new Color(213,123,113));
        TitleH.setSize(100,100);
        TitleH.add(backB);
        TitleH.add(titleH);

        JPanel H1=new JPanel();
        JPanel H11=new JPanel();
        JPanel H12=new JPanel();
        JPanel H13=new JPanel();


        final String[] b1 = {"28"};
        final String[] v1 = {"12"};
        final String[] a1 = {"90"};
        final String[] b2 = {"20"};
        final String[] v2 = {"15"};
        final String[] a2 = {"84"};
        final String[] b3 = {"27"};
        final String[] v3 = {"10"};
        final String[] a3 = {"67"};
        JLabel h1=new JLabel("The Bangalore Hospital");
        String[]  components={"Beds","Ventilators","Antidots"};
        JComboBox comboBox=new JComboBox(components);
        comboBox.addActionListener(e -> {
            String a= (String) comboBox.getSelectedItem();
            switch (a){
                case "Beds":
                    System.out.println("Number of Beds in The Bangalore Hospital are"+ ""+ b1[0]);break;
                case "Ventilators":
                    System.out.println("Number of Ventilators in The Bangalore Hospital are"+ ""+ v1[0]);break;
                case "Antidots":
                    System.out.println("Number of Antidots in The Bangalore Hospital are"+ ""+ a1[0]);break;
            }
        });
        JComboBox comboBox2=new JComboBox(components);
        comboBox2.addActionListener(e -> {
            String a= (String) comboBox2.getSelectedItem();
            switch (a){
                case "Beds":
                    System.out.println("Number of Beds in Manipal Hospital Yeshwanthpur are"+ ""+ b2[0]);break;
                case "Ventilators":
                    System.out.println("Number of Ventilators in Manipal Hospital Yeshwanthpur are"+ ""+ v2[0]);break;
                case "Antidots":
                    System.out.println("Number of Antidots in Manipal Hospital Yeshwanthpur are"+ ""+ a2[0]);break;
            }
        });
        JComboBox comboBox3=new JComboBox(components);
        comboBox3.addActionListener(e -> {
            String a= (String) comboBox3.getSelectedItem();
            switch (a){
                case "Beds":
                    System.out.println("Number of Beds in Victoria Hospital are"+""+ b3[0]);break;
                case "Ventilators":
                    System.out.println("Number of Ventilators in Victoria Hospital are"+""+ v3[0]);break;
                case "Antidots":
                    System.out.println("Number of Antidots in Victoria Hospital are"+""+ a3[0]);break;
            }
        });
        JLabel h2=new JLabel("Manipal Hospital Yeshwanthpur");
        JLabel h3=new JLabel("Victoria Hospital");
        H11.setSize(100,100);
        H12.setSize(100,100);
        H13.setSize(100,100);
        H11.add(h1);
        H12.add(h2);
        H13.add(h3);
        H1.add(H11,BorderLayout.NORTH);
        H1.add(comboBox);
        H1.add(H12,BorderLayout.CENTER);
        H1.add(comboBox2);
        H1.add(H13,BorderLayout.SOUTH);
        H1.add(comboBox3);



        JPanel Title=new JPanel();
        JLabel title=new JLabel("SELECT THE STATE");
        Title.setBackground(new Color(213,123,113));
        Title.setSize(100,100);
        Title.add(title);

        JPanel indiaMap=new JPanel();
        indiaMap.setVisible(true);
        indiaMap.setBackground(Color.yellow);
        indiaMap.setSize(300,600);

        JLabel map=new JLabel();
        map.setIcon(mapimage1);
        indiaMap.add(map);



        JPanel cities=new JPanel();
        cities.setVisible(true);
        cities.setBackground(new Color(1,133,132));
        cities.setSize(250,600);


        //
        JPanel TitleK=new JPanel();
        JButton backK=new JButton("BACK");
        JLabel titleK=new JLabel("SELECT THE CITY");
        TitleK.setBackground(new Color(213,123,113));
        TitleK.setSize(100,100);
        TitleK.add(backK);
        TitleK.add(titleK);

        JPanel KMap=new JPanel();
        KMap.setVisible(true);
        KMap.setBackground(Color.yellow);
        KMap.setSize(300,600);

        JLabel Kmap=new JLabel();
        Kmap.setIcon(mapimage);
        KMap.add(Kmap);

//Hospital infos



        JButton Bangalore=new JButton("Bangalore");

        cities.add(Bangalore);

        JButton 	HubliDharwad=new JButton("Hubli-Dharwad");

        JPanel TitleD=new JPanel();
        JButton backD=new JButton("BACK");

        JLabel titleD=new JLabel("SELECT THE COMPONENT YOU WANT TO SEE");
        TitleD.setBackground(new Color(213,123,113));
        TitleD.setSize(100,100);
        TitleD.add(backD);
        TitleD.add(titleD);

        JPanel D1=new JPanel();
        JPanel D11=new JPanel();
        JPanel D12=new JPanel();
        JPanel D13=new JPanel();

        final String[] b01 = {"24"};
        final String[] v01 = {"14"};
        final String[] a01 = {"60"};
        final String[] b02 = {"18"};
        final String[] v02 = {"16"};
        final String[] a02 = {"104"};
        final String[] b03 = {"20"};
        final String[] v03 = {"17"};
        final String[] a03 = {"167"};
        JLabel d1=new JLabel("Vivekananda General Hospital");
        JLabel d2=new JLabel("HUBLI SUPER SPECIALITY HOSPITAL");
        JLabel d3=new JLabel("Shivakrupa Hospital (Dugani)");
        String[]  components1={"Beds","Ventilators","Antidots"};
        JComboBox comboBoxD1=new JComboBox(components1);
        comboBoxD1.addActionListener(e -> {
            String a= (String) comboBoxD1.getSelectedItem();
            switch (a){
                case "Beds":
                    System.out.println("Number of Beds are"+ b01[0]);break;
                case "Ventilators":
                    System.out.println("Number of Ventilators are"+ v01[0]);break;
                case "Antidots":
                    System.out.println("Number of Antidots are"+ a01[0]);break;
            }
        });
        JComboBox comboBoxD2=new JComboBox(components1);
        comboBoxD2.addActionListener(e -> {
            String a= (String) comboBoxD2.getSelectedItem();
            switch (a){
                case "Beds":
                    System.out.println("Number of Beds are"+ b02[0]);break;
                case "Ventilators":
                    System.out.println("Number of Ventilators are"+ v02[0]);break;
                case "Antidots":
                    System.out.println("Number of Antidots are"+ a02[0]);break;
            }
        });
        JComboBox comboBoxD3=new JComboBox(components1);
        comboBoxD3.addActionListener(e -> {
            String a= (String) comboBoxD3.getSelectedItem();
            switch (a){
                case "Beds":
                    System.out.println("Number of Beds are"+ b03[0]);break;
                case "Ventilators":
                    System.out.println("Number of Ventilators are"+ v03[0]);break;
                case "Antidots":
                    System.out.println("Number of Antidots are"+ a03[0]);break;
            }
        });

        D11.setSize(100,100);
        D12.setSize(100,100);
        D13.setSize(100,100);
        D11.add(d1);
        D12.add(d2);
        D13.add(d3);
        D1.add(d1,BorderLayout.NORTH);
        D1.add(comboBoxD1);
        D1.add(d2,BorderLayout.CENTER);
        D1.add(comboBoxD2);
        D1.add(d3,BorderLayout.SOUTH);
        D1.add(comboBoxD3);








        cities.add(HubliDharwad);

        JButton Mysore=new JButton("Mysore");
        Mysore.addActionListener(e->
        {
            Hospital H=new Hospital();
            H.add(TitleD,BorderLayout.NORTH);
            H.add(D1);
        });


        cities.add(Mysore);

        JButton Kalaburagi=new JButton("Kalaburagi");
        Kalaburagi.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Kalaburagi);

        JButton Belgaum=new JButton("Belgaum");
        Belgaum.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Belgaum);

        JButton Mangalore=new JButton("Mangalore");
        Mangalore.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Mangalore);

        JButton 	Vijayapura=new JButton("Vijayapura");
        Vijayapura.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(	Vijayapura);

        JButton Davanagere=new JButton("Davanagere");
        Davanagere.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Davanagere);

        JButton Bellary=new JButton("Bellary");
        Bellary.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Bellary);

        JButton Tumkur=new JButton("Tumkur");
        Tumkur.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Tumkur);

        JButton 	Shimoga=new JButton("Shimoga");
        Shimoga.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(	Shimoga);

        JButton Raichur=new JButton("Raichur");
        Raichur.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Raichur);

        JButton Bidar=new JButton("Bidar");
        Bidar.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Bidar);

        JButton Udupi=new JButton("Udupi");
        Udupi.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Udupi);

        JButton Hospet=new JButton("Hospet");
        Hospet.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Hospet);

        JButton 	GadagBetageri=new JButton("Gadag-Betageri");
        GadagBetageri.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(	GadagBetageri);

        JButton Robertsonpet=new JButton("Robertsonpet ");
        Robertsonpet.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Robertsonpet);

        JButton Hassan=new JButton("Hassan");
        Hassan.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Hassan);

        JButton 	Bhadravati=new JButton("Bhadravati");
        Bhadravati.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(	Bhadravati);

        JButton 	Chitradurga=new JButton("Chitradurga");
        Chitradurga.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(	Chitradurga);

        JButton Kolar=new JButton("Kolar");
        Kolar.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Kolar);

        JButton 	Mandya=new JButton("Mandya");
        Mandya.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(	Mandya);

        JButton 	Chikmagalur=new JButton("Chikmagalur");
        Chikmagalur.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(	Chikmagalur);

        JButton Gangavati=new JButton("Gangavati");
        Gangavati.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Gangavati);

        JButton 	Bagalkot=new JButton("Bagalkot");
        Bagalkot.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(	Bagalkot);

        JButton Ranebennuru=new JButton("Ranebennuru");
        Ranebennuru.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities.add(Ranebennuru);





        JPanel states=new JPanel();
        states.setVisible(true);
        states.setBackground(new Color(1,133,132));
        states.setSize(250,600);

        //States data
        JButton UttarPradesh=new JButton("Uttar Pradesh");
        UttarPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));

        JButton AndhraPradesh=new JButton("Andhra Pradesh");
        AndhraPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        states.add(AndhraPradesh);

        JButton ArunachalPradesh=new JButton("Arunachal Pradesh");
        ArunachalPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        states.add(ArunachalPradesh);

        JButton Assam=new JButton("Assam");
        Assam.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Assam);

        JButton Bihar=new JButton("Bihar");
        Bihar.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Bihar);

        JButton Chhattisgarh=new JButton("Chhattisgarh");
        Chhattisgarh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Chhattisgarh);

        JButton Goa=new JButton("Goa");
        Goa.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Goa);

        JButton Gujarat=new JButton("Gujarat");
        Gujarat.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Gujarat);


        JButton Haryana=new JButton("Haryana");
        Haryana.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Haryana);

        JButton HimachalPradesh=new JButton("Himachal Pradesh");
        HimachalPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(HimachalPradesh);

        JButton JammuandKashmir=new JButton("Jammu and Kashmir");
        JammuandKashmir.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(JammuandKashmir);

        JButton Jharkhand=new JButton("Jharkhand");
        Jharkhand.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Jharkhand);


        //CITIES FOR HOSPITAL STAFF

        JPanel cities2=new JPanel();
        cities2.setVisible(true);
        cities2.setBackground(new Color(1,133,132));
        cities2.setSize(250,600);





          JPanel titleB=new JPanel();
          titleB.setBackground(Color.CYAN);
          titleB.setBounds(0,0,400,30);
          JLabel titleb=new JLabel("TYPE THE AMOUNT OF COMPONENTS YOU HAVE");
          titleb.setSize(400,30);
          JButton button12=new JButton("BACK");
          titleB.add(button12);
          titleB.add(titleb);

        JTextField data=new JTextField();
        JTextField datab1=new JTextField();
        JTextField datab2=new JTextField();
        datab1.setPreferredSize(new Dimension(300,25));
        datab2.setPreferredSize(new Dimension(300,25));
         data.setPreferredSize(new Dimension(300,25));
         data.setText("beds");
         datab1.setText("Ventilators");
         datab2.setText("Antidotes");
        JButton TheBangaloreHospital=new JButton("The Bangalore Hospital");
        TheBangaloreHospital.setSize(300,25);
        JButton submit=new JButton("submit");
        submit.addActionListener(e -> b1[0] =data.getText());
        JButton  submitb1=new JButton("submit");
        submitb1.addActionListener(e-> v1[0] =datab1.getText());
        JButton  submitb2=new JButton("submit");
        submitb2.addActionListener(e-> a1[0] =datab2.getText());
          JPanel componentsh1=new JPanel();
          componentsh1.setLayout(new FlowLayout());
          componentsh1.setBackground(Color.yellow);
           componentsh1.setBounds(0,30,400,140);
        componentsh1.add(TheBangaloreHospital);
        componentsh1.add(data);
        componentsh1.add(submit);
        componentsh1.add(datab1);
        componentsh1.add(submitb1);
        componentsh1.add(datab2);
        componentsh1.add(submitb2);

           JPanel componentsh2=new JPanel();
           componentsh2.setLayout(new FlowLayout());
           componentsh2.setBackground(Color.CYAN);
           componentsh2.setBounds(0,170,400,140);
        JTextField data3=new JTextField();

        JTextField datab01=new JTextField();

        JTextField datab02=new JTextField();
        datab01.setPreferredSize(new Dimension(300,25));
        datab02.setPreferredSize(new Dimension(300,25));
        data3.setPreferredSize(new Dimension(300,25));
        data3.setText("beds");
        datab01.setText("Ventilators");
        datab02.setText("Antidotes");
        JButton ManipalHospitalYeshwanthpur=new JButton("Manipal Hospital Yeshwanthpur");
        ManipalHospitalYeshwanthpur.setSize(300,25);
        JButton submit3=new JButton("submit");
        submit3.addActionListener(e-> b2[0] =data3.getText());
        JButton  submitb01=new JButton("submit");
        submitb01.addActionListener(e-> v2[0] =datab01.getText());
        JButton  submitb02=new JButton("submit");
        submitb02.addActionListener(e-> a2[0] =datab02.getText());
        componentsh2.add(ManipalHospitalYeshwanthpur);
        componentsh2.add(data3);
        componentsh2.add(submit3);
        componentsh2.add(datab01);
        componentsh2.add(submitb01);
        componentsh2.add(datab02);
        componentsh2.add(submitb02);


           JPanel componentsh3=new JPanel();
        componentsh3.setLayout(new FlowLayout());
           componentsh3.setBackground(Color.ORANGE);
           componentsh3.setBounds(0,310,400,140);

        JTextField data4=new JTextField();

        JTextField datab011=new JTextField();

        JTextField datab012=new JTextField();
        datab011.setPreferredSize(new Dimension(300,25));
        datab012.setPreferredSize(new Dimension(300,25));
        data4.setPreferredSize(new Dimension(300,25));
        data4.setText("beds");
        datab011.setText("Ventilators");
        datab012.setText("Antidotes");
        JButton VictoriaHospital=new JButton("Victoria Hospital");
        VictoriaHospital.setSize(300,25);
        JButton submit4=new JButton("submit");
        submit4.addActionListener(e-> b3[0] =data4.getText());
        JButton  submitb011=new JButton("submit");
        submitb011.addActionListener(e-> v3[0] =datab011.getText());
        JButton  submitb012=new JButton("submit");
        submitb012.addActionListener(e-> a3[0] =datab012.getText());
        componentsh3.add(VictoriaHospital);
        componentsh3.add(data4);
        componentsh3.add(submit4);
        componentsh3.add(datab011);
        componentsh3.add(submitb011);
        componentsh3.add(datab012);
        componentsh3.add(submitb012);


//            Mysore data

        JTextField data5=new JTextField();
        JTextField datab11=new JTextField();
        JTextField datab12=new JTextField();
        datab11.setPreferredSize(new Dimension(300,25));
        datab12.setPreferredSize(new Dimension(300,25));
        data5.setPreferredSize(new Dimension(300,25));
        data5.setText("beds");
        datab11.setText("Ventilators");
        datab12.setText("Antidotes");
        JButton VivekanandaGeneralHospital=new JButton("Vivekananda General Hospital");
        VivekanandaGeneralHospital.setSize(300,25);
        JButton submit5=new JButton("submit");
        submit5.addActionListener(e-> b01[0] =data5.getText());
        JButton  submitb11=new JButton("submit");
        submitb11.addActionListener(e-> v01[0] =datab11.getText());
        JButton  submitb12=new JButton("submit");
        submitb12.addActionListener(e-> a01[0] =datab12.getText());
        JPanel componentsh11=new JPanel();
        componentsh11.setLayout(new FlowLayout());
        componentsh11.setBackground(Color.yellow);
        componentsh11.setBounds(0,30,400,140);
        componentsh11.add(VivekanandaGeneralHospital);
        componentsh11.add(data5);
        componentsh11.add(submit5);
        componentsh11.add(datab11);
        componentsh11.add(submitb11);
        componentsh11.add(datab12);
        componentsh11.add(submitb12);

        JPanel componentsh12=new JPanel();
        componentsh12.setLayout(new FlowLayout());
        componentsh12.setBackground(Color.CYAN);
        componentsh12.setBounds(0,170,400,140);
        JTextField data6=new JTextField();

        JTextField datab21=new JTextField();

        JTextField datab22=new JTextField();
        datab21.setPreferredSize(new Dimension(300,25));
        datab22.setPreferredSize(new Dimension(300,25));
        data6.setPreferredSize(new Dimension(300,25));
        data6.setText("beds");
        datab21.setText("Ventilators");
        datab22.setText("Antidotes");
        JButton HUBLISUPERSPECIALITYHOSPITAL=new JButton("HUBLI SUPER SPECIALITY HOSPITAL");
        HUBLISUPERSPECIALITYHOSPITAL.setSize(300,25);
        JButton submit6=new JButton("submit");
        submit6.addActionListener(e-> b02[0] =data6.getText());
        JButton  submitb21=new JButton("submit");
        submitb21.addActionListener(e-> v02[0] =datab21.getText());
        JButton  submitb22=new JButton("submit");
        submitb22.addActionListener(e-> a02[0] =datab22.getText());
        componentsh12.add(HUBLISUPERSPECIALITYHOSPITAL);
        componentsh12.add(data6);
        componentsh12.add(submit6);
        componentsh12.add(datab21);
        componentsh12.add(submitb21);
        componentsh12.add(datab22);
        componentsh12.add(submitb22);


        JPanel componentsh13=new JPanel();
        componentsh13.setLayout(new FlowLayout());
        componentsh13.setBackground(Color.ORANGE);
        componentsh13.setBounds(0,310,400,140);

        JTextField data7=new JTextField();

        JTextField datab31=new JTextField();

        JTextField datab32=new JTextField();
        datab31.setPreferredSize(new Dimension(300,25));
        datab32.setPreferredSize(new Dimension(300,25));
        data7.setPreferredSize(new Dimension(300,25));
        data7.setText("beds");
        datab31.setText("Ventilators");
        datab32.setText("Antidotes");
        JButton  ShivakrupaHospitalDugani =new JButton("ShivakrupaHospital(Dugani)");
        ShivakrupaHospitalDugani.setSize(300,25);
        JButton submit7=new JButton("submit");
        submit7.addActionListener(e-> b03[0] =data7.getText());
        JButton  submitb31=new JButton("submit");
        submitb31.addActionListener(e-> v03[0] =datab31.getText());
        JButton  submitb32=new JButton("submit");
        submitb32.addActionListener(e-> a03[0] =datab32.getText());
        componentsh13.add(ShivakrupaHospitalDugani);
        componentsh13.add(data7);
        componentsh13.add(submit7);
        componentsh13.add(datab31);
        componentsh13.add(submitb31);
        componentsh13.add(datab32);
        componentsh13.add(submitb32);






        JButton BANGALORE=new JButton("BANGALORE");
         BANGALORE.addActionListener(e->{
             HospitalData bangolore=new HospitalData();
             bangolore.add(titleB);
            bangolore.add(componentsh1);
            bangolore.add(componentsh2);
            bangolore.add(componentsh3);

         });
        cities2.add(BANGALORE);


        cities2.add(	HubliDharwad);


          Mysore=new JButton("Mysore");
        Mysore.addActionListener(e-> {
            HospitalData MYSORE=new HospitalData();
            MYSORE.add(titleB);
            MYSORE.add(componentsh11);
            MYSORE.add(componentsh12);
            MYSORE.add(componentsh13);
        });
        cities2.add(Mysore);

         Kalaburagi=new JButton("Kalaburagi");
        Kalaburagi.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Kalaburagi);

         Belgaum=new JButton("Belgaum");
        Belgaum.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Belgaum);

         Mangalore=new JButton("Mangalore");
        Mangalore.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Mangalore);

         	Vijayapura=new JButton("Vijayapura");
        Vijayapura.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(	Vijayapura);

         Davanagere=new JButton("Davanagere");
        Davanagere.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Davanagere);

         Bellary=new JButton("Bellary");
        Bellary.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Bellary);

         Tumkur=new JButton("Tumkur");
        Tumkur.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Tumkur);

         	Shimoga=new JButton("Shimoga");
        Shimoga.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(	Shimoga);

         Raichur=new JButton("Raichur");
        Raichur.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Raichur);

         Bidar=new JButton("Bidar");
        Bidar.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Bidar);

         Udupi=new JButton("Udupi");
        Udupi.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Udupi);

         Hospet=new JButton("Hospet");
        Hospet.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Hospet);

         	GadagBetageri=new JButton("Gadag-Betageri");
        GadagBetageri.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(	GadagBetageri);

         Robertsonpet=new JButton("Robertsonpet ");
        Robertsonpet.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Robertsonpet);

         Hassan=new JButton("Hassan");
        Hassan.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Hassan);

         	Bhadravati=new JButton("Bhadravati");
        Bhadravati.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(	Bhadravati);

         	Chitradurga=new JButton("Chitradurga");
        Chitradurga.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(	Chitradurga);

         Kolar=new JButton("Kolar");
        Kolar.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Kolar);

         	Mandya=new JButton("Mandya");
        Mandya.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(	Mandya);

         	Chikmagalur=new JButton("Chikmagalur");
        Chikmagalur.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(	Chikmagalur);

         Gangavati=new JButton("Gangavati");
        Gangavati.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Gangavati);

         	Bagalkot=new JButton("Bagalkot");
        Bagalkot.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(	Bagalkot);

         Ranebennuru=new JButton("Ranebennuru");
        Ranebennuru.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        cities2.add(Ranebennuru);



        JButton Karnataka=new JButton("Karnataka");

      states.add(Karnataka);






        JButton Kerala=new JButton("Kerala");
        Kerala.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Kerala);


        JButton MadhyaPradesh=new JButton("Madhya Pradesh");
        MadhyaPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(MadhyaPradesh);


        JButton Maharashtra=new JButton("Maharashtra");
        Maharashtra.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Maharashtra);


        JButton Manipur=new JButton("Manipur");
        Manipur.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Manipur);


        JButton Meghalaya=new JButton("Meghalaya");
        Meghalaya.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Meghalaya);


        JButton Mizoram=new JButton("Mizoram");
        Mizoram.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Mizoram);


        JButton Nagaland=new JButton("Nagaland");
        Nagaland.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Nagaland);


        JButton Odisha=new JButton("Odisha");
        Odisha.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Odisha);


        JButton Punjab=new JButton("Punjab");
        Punjab.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Punjab);

        JButton Rajasthan=new JButton("Rajasthan");
        Rajasthan.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Rajasthan);

        JButton Sikkim=new JButton("Sikkim");
        Sikkim.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Sikkim);

        JButton TamilNadu=new JButton("Tamil Nadu");
        TamilNadu.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(TamilNadu);

        JButton Telangana=new JButton("Telangana");
        Telangana.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Telangana);

               JButton Tripura=new JButton("Tripura");
        Tripura.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states.add(Tripura);


          states.add(UttarPradesh);
          states.setLayout(new FlowLayout(FlowLayout.CENTER));



          //states for hospital staff
        JPanel states2=new JPanel();
        states2.setVisible(true);
        states2.setBackground(new Color(1,133,132));
        states2.setSize(250,600);

        //States data
        UttarPradesh = new JButton("Uttar Pradesh");
        UttarPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));

        AndhraPradesh=new JButton("Andhra Pradesh");
        AndhraPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        states2.add(AndhraPradesh);

         ArunachalPradesh=new JButton("Arunachal Pradesh");
        ArunachalPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));
        states2.add(ArunachalPradesh);

         Assam=new JButton("Assam");
        Assam.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Assam);

         Bihar=new JButton("Bihar");
        Bihar.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Bihar);

         Chhattisgarh=new JButton("Chhattisgarh");
        Chhattisgarh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Chhattisgarh);

         Goa=new JButton("Goa");
        Goa.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Goa);

         Gujarat=new JButton("Gujarat");
        Gujarat.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Gujarat);


         Haryana=new JButton("Haryana");
        Haryana.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Haryana);

         HimachalPradesh=new JButton("Himachal Pradesh");
        HimachalPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(HimachalPradesh);

         JammuandKashmir=new JButton("Jammu and Kashmir");
        JammuandKashmir.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(JammuandKashmir);

         Jharkhand=new JButton("Jharkhand");
        Jharkhand.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Jharkhand);







        JButton KARNATAKA=new JButton("KARNATAKA");
        states2.add(KARNATAKA);
        JPanel Titlek=new JPanel();

        JButton backk=new JButton("BACK");
        JLabel titlek=new JLabel("SELECT THE CITY");
        Titlek.setBackground(new Color(213,123,113));
        Titlek.setSize(100,100);
        Titlek.add(backk);
        backk.addActionListener(e->{
            India1 india=new India1();
            india.add(states2);
            india.add(Title,BorderLayout.NORTH);
            india.add(indiaMap,BorderLayout.EAST);
        });
        Titlek.add(titlek);
        KARNATAKA.addActionListener(l->{
            Karnatak K=new Karnatak();
            K.add(Titlek,BorderLayout.NORTH);
            K.add(cities2);
            K.add(KMap,BorderLayout.EAST);
            });






         Kerala=new JButton("Kerala");
        Kerala.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Kerala);


         MadhyaPradesh=new JButton("Madhya Pradesh");
        MadhyaPradesh.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(MadhyaPradesh);


         Maharashtra=new JButton("Maharashtra");
        Maharashtra.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Maharashtra);


         Manipur=new JButton("Manipur");
        Manipur.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Manipur);


         Meghalaya=new JButton("Meghalaya");
        Meghalaya.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Meghalaya);


         Mizoram=new JButton("Mizoram");
        Mizoram.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Mizoram);


         Nagaland=new JButton("Nagaland");
        Nagaland.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Nagaland);


         Odisha=new JButton("Odisha");
        Odisha.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Odisha);


         Punjab=new JButton("Punjab");
        Punjab.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Punjab);

         Rajasthan=new JButton("Rajasthan");
        Rajasthan.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Rajasthan);

         Sikkim=new JButton("Sikkim");
        Sikkim.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Sikkim);

         TamilNadu=new JButton("Tamil Nadu");
        TamilNadu.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(TamilNadu);

         Telangana=new JButton("Telangana");
        Telangana.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Telangana);

         Tripura=new JButton("Tripura");
        Tripura.addActionListener(e-> System.out.println("THE DATA IS INSUFFICIENT"));states2.add(Tripura);


        states2.add(UttarPradesh);
        states2.setLayout(new FlowLayout(FlowLayout.CENTER));

          myFrame frame=new myFrame();
        JPanel panel2=new JPanel();
        panel2.setBackground(new Color(123,223,232));
        panel2.setSize(700,50);
        JButton button=new JButton("PATIENT");
        JButton button1=new JButton("HOSPITAL STAFF");
        JButton button6=new JButton("SELECT AN APPOINTMENT");
        panel2.add(button);
        panel2.add(button1);
        panel2.add(button6);
        frame.add(panel2,BorderLayout.SOUTH);
        button.addActionListener(e->{
            India india=new India();
            india.add(states);
            india.add(Title,BorderLayout.NORTH);
            india.add(indiaMap,BorderLayout.EAST);
        });


        button1.addActionListener(e->{
            India1 india=new India1();
            india.add(states2);
            india.add(Title,BorderLayout.NORTH);
            india.add(indiaMap,BorderLayout.EAST);
        });



        backK.addActionListener(e->{
            India india1=new India();

            india1.add(states);
            india1.add(Title,BorderLayout.NORTH);
            india1.add(indiaMap,BorderLayout.EAST);
        });

        Karnataka.addActionListener(e-> {

            Karnatak K=new Karnatak();
            K.add(TitleK,BorderLayout.NORTH);
            K.add(cities);
            K.add(KMap,BorderLayout.EAST);
            backD.addActionListener(D->{
                K.dispose();
                Karnatak K1=new Karnatak();
                K1.add(TitleK,BorderLayout.NORTH);
                K1.add(cities);
                K1.add(KMap,BorderLayout.EAST);
            });
            backB.addActionListener(b->{
                K.dispose();
                Karnatak K1=new Karnatak();
                K1.add(TitleK,BorderLayout.NORTH);
                K1.add(cities);
                K1.add(KMap,BorderLayout.EAST);
            });


            Bangalore.addActionListener(f-> {
                            K.dispose();
                Hospital H=new Hospital();
                H.add(TitleH,BorderLayout.NORTH);
                H.add(H1);
            });
        });








    }




}
