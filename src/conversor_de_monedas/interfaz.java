package conversor_de_monedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEntrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "¡ERROR! Valores no validos r","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
					
				}
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfaz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programa ONE\\Callenges\\conversor de monedas\\Imagenes\\monedas.png"));
		setForeground(new Color(0, 0, 0));
		setTitle("Conversor de monedas ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConvertir = new JButton("CONVERTIR ");
		
		btnConvertir.setBackground(new Color(255, 255, 255));
		btnConvertir.setForeground(new Color(0, 0, 0));
		btnConvertir.setBounds(204, 194, 135, 29);
		contentPane.add(btnConvertir);
		
		
		JLabel lblTexto2 = new JLabel("De");
		lblTexto2.setForeground(new Color(255, 128, 0));
		lblTexto2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTexto2.setBounds(52, 132, 46, 34);
		contentPane.add(lblTexto2);
		
		JComboBox MonedaACambiar = new JComboBox();
		MonedaACambiar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MonedaACambiar.setModel(new DefaultComboBoxModel(new String[] {"MXN", "USD", "EUR", "GBP", "JPY", "KRW"}));
		MonedaACambiar.setBounds(273, 132, 73, 33);
		contentPane.add(MonedaACambiar);
		
		JComboBox MonedaDeCambio = new JComboBox();
		MonedaDeCambio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		MonedaDeCambio.setModel(new DefaultComboBoxModel(new String[] {"USD", "EUR", "GBP", "JPY", "KRW", "MXN"}));
		MonedaDeCambio.setMaximumRowCount(6);
		MonedaDeCambio.setForeground(new Color(0, 0, 0));
		MonedaDeCambio.setBounds(413, 132, 73, 33);
		contentPane.add(MonedaDeCambio);
		
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double entrada = Double.parseDouble(textFieldEntrada.getText());
				int seleccion1 = MonedaACambiar.getSelectedIndex();
				int seleccion2 = MonedaDeCambio.getSelectedIndex();
				
				if(seleccion1 == 0 && seleccion2 == 5 || seleccion1 == 1 && seleccion2 == 0 ||seleccion1 == 2 && seleccion2 == 1 || seleccion1 == 3 && seleccion2 == 2 ||
				   seleccion1 == 4 && seleccion2 == 3 ||seleccion1 == 5 && seleccion2 == 4 || entrada == 0) {
					
					JOptionPane.showMessageDialog(null, "Esta converion no puede realizarse verifique los datos",
			                "Datos invalidos", JOptionPane.ERROR_MESSAGE);
				}else {
					SeleccionDeMoneda selec1 = new SeleccionDeMoneda(seleccion1,seleccion2,entrada);
					selec1.Validar();
					
					System.out.println(selec1);
					
					JOptionPane.showMessageDialog(null, selec1);
					
					String [] arregloS = {"Si","No"};
					int option =JOptionPane.showOptionDialog(null,"¿Desea realizar otra Conversion?", "¿?", 0 , JOptionPane.QUESTION_MESSAGE, null,  arregloS, null);
					System.out.println(option);
					if(option == 0) {
						SeleccionDeConversor selec = new SeleccionDeConversor();
						selec.setVisible(true);
						interfaz.this.dispose();
						selec.setLocationRelativeTo(null);
					}else {
						interfaz.this.dispose();
					}
				}
			}
		});
		
		textFieldEntrada = new JTextField();
		textFieldEntrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFieldEntrada.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldEntrada.setBounds(108, 132, 135, 34);
		contentPane.add(textFieldEntrada);
		textFieldEntrada.setColumns(10);
		
		JLabel lblTexto1 = new JLabel(" A");
		lblTexto1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTexto1.setForeground(new Color(255, 128, 0));
		lblTexto1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto1.setBounds(356, 129, 47, 36);
		contentPane.add(lblTexto1);
		
		JLabel lbltitulo = new JLabel("Conversor de Monedas");
		lbltitulo.setForeground(new Color(255, 128, 0));
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 32));
		lbltitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitulo.setBounds(72, 0, 414, 93);
		contentPane.add(lbltitulo);
		
		JLabel lblfondo = new JLabel("New label");
		lblfondo.setForeground(new Color(231, 182, 67));
		lblfondo.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblfondo.setIcon(new ImageIcon("D:\\Programa ONE\\Callenges\\conversor de monedas\\Imagenes\\fondo3.jpg"));
		lblfondo.setBounds(0, 0, 555, 328);
		contentPane.add(lblfondo);
	}
}
