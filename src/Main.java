import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JRadioButton radioTortillaConCebolla = new JRadioButton("Tortilla con cebolla");
		buttonGroup.add(radioTortillaConCebolla);
		
		JRadioButton radioTortillaSinCebolla = new JRadioButton("Tortilla sin cebolla");
		buttonGroup.add(radioTortillaSinCebolla);
		
		JRadioButton radioTortillaFrancesaCon = new JRadioButton("Tortilla francesa con jam\u00F3n");
		buttonGroup.add(radioTortillaFrancesaCon);
		
		JCheckBox checkPatata = new JCheckBox("Patata");
		
		JCheckBox checkCebollie = new JCheckBox("Cebollie");
		
		JCheckBox checkArrotzie = new JCheckBox("Arrotzie");
		
		JCheckBox checkJamoie = new JCheckBox("Jamoie");
		
		JCheckBox checkTxorizue = new JCheckBox("Txorizue");
		
		JCheckBox checkPiperra = new JCheckBox("Piperra");
		
		JCheckBox checkPimienta = new JCheckBox("Pimienta");
		
		JCheckBox checkLetxugie = new JCheckBox("Letxugie");
		
		JButton buttonComprobar = new JButton("Comprobar");
		buttonComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(radioTortillaConCebolla.isSelected()){ 
					if(checkPatata.isSelected() && checkArrotzie.isSelected() && checkCebollie.isSelected() && !checkJamoie.isSelected() && !checkTxorizue.isSelected() && !checkPiperra.isSelected() && !checkPimienta.isSelected() && !checkLetxugie.isSelected()){
						buttonComprobar.setBackground(new Color(168, 199, 100));
					}else{
						buttonComprobar.setBackground(new Color(128, 24, 21));
						checkPatata.setSelected(false);
						checkArrotzie.setSelected(false);
						checkCebollie.setSelected(false);
						
					}
				}else if(radioTortillaSinCebolla.isSelected()){
					if(checkPatata.isSelected() && checkArrotzie.isSelected() && !checkCebollie.isSelected() && !checkJamoie.isSelected() && !checkTxorizue.isSelected() && !checkPiperra.isSelected() && !checkPimienta.isSelected() && !checkLetxugie.isSelected()){
						buttonComprobar.setBackground(new Color(168, 199, 100));
					}else{
						buttonComprobar.setBackground(new Color(128, 24, 21));
						checkPatata.setSelected(false);
						checkArrotzie.setEnabled(false);
					}
				}else if(radioTortillaFrancesaCon.isSelected()){
					if(!checkPatata.isSelected() && checkArrotzie.isSelected() && !checkCebollie.isSelected() && checkJamoie.isSelected() && !checkTxorizue.isSelected() && !checkPiperra.isSelected() && !checkPimienta.isSelected() && !checkLetxugie.isSelected()){
						buttonComprobar.setBackground(new Color(168, 199, 100));
					}else{
						buttonComprobar.setBackground(new Color(128, 24, 21));
						checkJamoie.setSelected(false);
						checkArrotzie.setSelected(false);
					}
				}
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(radioTortillaConCebolla)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioTortillaSinCebolla)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioTortillaFrancesaCon))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(checkPimienta)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(checkPatata)
											.addGap(8)
											.addComponent(checkArrotzie)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(checkCebollie)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(checkJamoie)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(checkTxorizue)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(checkPiperra))
										.addComponent(checkLetxugie)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(134)
							.addComponent(buttonComprobar)))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(radioTortillaConCebolla)
						.addComponent(radioTortillaSinCebolla)
						.addComponent(radioTortillaFrancesaCon))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(checkPatata)
						.addComponent(checkArrotzie)
						.addComponent(checkCebollie)
						.addComponent(checkJamoie)
						.addComponent(checkTxorizue)
						.addComponent(checkPiperra))
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(checkPimienta)
						.addComponent(checkLetxugie))
					.addGap(32)
					.addComponent(buttonComprobar)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
