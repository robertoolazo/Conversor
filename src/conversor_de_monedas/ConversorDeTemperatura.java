package conversor_de_monedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ConversorDeTemperatura extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEntrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDeTemperatura frame = new ConversorDeTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversorDeTemperatura() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programa ONE\\Callenges\\conversor de monedas\\Imagenes\\nube-kawaii-dulce.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 342);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Programa ONE\\Callenges\\conversor de monedas\\Imagenes\\3673_R0lVIE1FQyAxMzEtMjc (1).jpg"));
		lblNewLabel.setBounds(10, 24, 237, 243);
		contentPane.add(lblNewLabel);
		
		JLabel lblTituloPrincipal = new JLabel("Converosr De Temperatura ");
		lblTituloPrincipal.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
		lblTituloPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPrincipal.setBounds(292, 24, 243, 23);
		contentPane.add(lblTituloPrincipal);
		
		textFieldEntrada = new JTextField();
		textFieldEntrada.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldEntrada.setBounds(292, 123, 86, 23);
		contentPane.add(textFieldEntrada);
		textFieldEntrada.setColumns(10);
		
		JComboBox comboBoxSlc1 = new JComboBox();
		comboBoxSlc1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxSlc1.setModel(new DefaultComboBoxModel(new String[] {"°C", "°F", " K"}));
		comboBoxSlc1.setBounds(388, 123, 46, 23);
		contentPane.add(comboBoxSlc1);
		
		JLabel lbltexto1 = new JLabel("A");
		lbltexto1.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 18));
		lbltexto1.setHorizontalAlignment(SwingConstants.CENTER);
		lbltexto1.setBounds(433, 122, 46, 23);
		contentPane.add(lbltexto1);
		
		JComboBox comboBoxSlc2 = new JComboBox();
		comboBoxSlc2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxSlc2.setModel(new DefaultComboBoxModel(new String[] {"°F", " K", "°C"}));
		comboBoxSlc2.setBounds(489, 123, 46, 23);
		contentPane.add(comboBoxSlc2);
		
		JButton btnConvertir = new JButton("Convertir ");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double entrada = Double.parseDouble(textFieldEntrada.getText());
				int seleccion1 = comboBoxSlc1.getSelectedIndex();
				int seleccion2 = comboBoxSlc2.getSelectedIndex();
				
				if(seleccion1 == 0 && seleccion2 == 2 ||seleccion1 == 1 && seleccion2 == 0 ||seleccion1 == 2 && seleccion2 == 1 ) {
					JOptionPane.showMessageDialog(null, "Esta converion no puede realizarse verifique los datos",
			                "Datos invalidos", JOptionPane.ERROR_MESSAGE);
				}else {
					SeleccionDeTemperatura tem = new SeleccionDeTemperatura(seleccion1,seleccion2,entrada);
					tem.Validar();
					System.out.println(tem);
					
					JOptionPane.showMessageDialog(null, tem);
					
					String [] arregloS = {"Si","No"};
					int option =JOptionPane.showOptionDialog(null,"¿Desea realizar otra Conversion?", "¿?", 0 , JOptionPane.QUESTION_MESSAGE, null,  arregloS, null);
					System.out.println(option);
					if(option == 0) {
						SeleccionDeConversor selec = new SeleccionDeConversor();
						selec.setVisible(true);
						ConversorDeTemperatura.this.dispose();
						selec.setLocationRelativeTo(null);
					}else {
						ConversorDeTemperatura.this.dispose();
					}
				}
			}
		});
		btnConvertir.setBounds(373, 174, 104, 23);
		contentPane.add(btnConvertir);
	}
}
