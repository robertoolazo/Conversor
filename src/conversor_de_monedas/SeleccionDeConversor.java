package conversor_de_monedas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SeleccionDeConversor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionDeConversor frame = new SeleccionDeConversor();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SeleccionDeConversor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEncabezado = new JLabel("Seleccione la conversin a realizar ");
		lblEncabezado.setFont(new Font("Segoe Print", Font.BOLD, 16));
		lblEncabezado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncabezado.setBounds(49, 54, 342, 31);
		contentPane.add(lblEncabezado);
		
		JComboBox Seleccion = new JComboBox();
		Seleccion.setModel(new DefaultComboBoxModel(new String[] {"Conversor de monedas", "Conversor de temperatura"}));
		Seleccion.setBounds(128, 112, 184, 31);
		contentPane.add(Seleccion);
		
		JButton btnContinuar = new JButton("Continuar ");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int SeleccionConversion= Seleccion.getSelectedIndex();
				System.out.println(SeleccionConversion);
				
				if(SeleccionConversion == 1) {
					ConversorDeTemperatura in = new ConversorDeTemperatura();
					in.setVisible(true);
					SeleccionDeConversor.this.dispose();
					in.setLocationRelativeTo(null);
				}else {
					interfaz in = new interfaz();
					in.setVisible(true);
					SeleccionDeConversor.this.dispose();
					in.setLocationRelativeTo(null);
				}
			}
		});
		btnContinuar.setBackground(Color.WHITE);
		btnContinuar.setBounds(165, 169, 105, 23);
		contentPane.add(btnContinuar);
	}
}
