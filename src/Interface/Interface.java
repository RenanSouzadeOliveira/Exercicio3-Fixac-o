package Interface;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Interface extends JFrame{
	JLabel lbltexto = new JLabel("Cálculo - MUV");
	JLabel lblformula = new JLabel("v=5+10t");
	
	JButton btnCalculo = new JButton("Calcular");
	
	JLabel lblVI = new JLabel("Veloc. Inicial: 5.0 m/s");
	JLabel lblA = new JLabel("Aceleração: 10.0 m/s''");
	JLabel lblVNI = new JLabel("Velocidade no instante 6s:");
	double vi = 5;
	double a = 10;
	double t = 6;
	public Interface() {
		super("Calcular - MUV");
		Calculo calc = new Calculo();
		Container paine = this.getContentPane();
		
		paine.add(lbltexto); // label
		lbltexto.setBounds(50,04,245,40);
		lbltexto.setFont(new Font("Dialog", Font.PLAIN, 22));
		
		paine.add(lblformula);// label
		lblformula.setBounds(100,30,245,40);
		lblformula.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 lblVNI.setText(lblVNI.getText()+ " " + calc.muv(vi, a, t) + " m/s");
			 }});
		btnCalculo.setBounds(80,90,90,20);
		
		paine.add(lblVI);// label
		lblVI.setBounds(70,110,245,40);
		
		paine.add(lblA); // label
		lblA.setBounds(70,130,245,40);
		
		paine.add(lblVNI); // label
		lblVNI.setBounds(70,150,245,40);
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(300, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Interface inte = new Interface();
	}
}
