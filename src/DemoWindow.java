import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DemoWindow {	
	private JFrame frame;
	private JPanel panel;
	private JLabel encryptLbl;
	private JLabel decryptLbl;
	private JTextArea encryptTxt;
	private JTextArea decryptTxt;
	private JButton encryptBtn;
	private JButton decryptBtn;
	private JLabel shiftSizeLbl;
	private JTextField shiftSizeTxt;
	
	public DemoWindow(){
		frame = new JFrame("Caesar Cipher Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		encryptLbl = new JLabel("Plaintext");
		encryptLbl.setSize(80, 20);
		encryptLbl.setLocation(10, 10);
		frame.add(encryptLbl);
		
		encryptTxt = new JTextArea();
		encryptTxt.setSize(400, 200);
		encryptTxt.setLocation(10, 40);
		frame.add(encryptTxt);
		
		encryptBtn = new JButton("Encrypt");
		encryptBtn.setSize(160, 40);
		encryptBtn.setLocation(425, 100);
		encryptBtn.addActionListener(new clickListener());
		encryptBtn.setActionCommand("Encrypt");
		frame.add(encryptBtn);
		
		decryptLbl = new JLabel("Ciphertext");
		decryptLbl.setSize(80, 20);
		decryptLbl.setLocation(10, 270);
		frame.add(decryptLbl);
		
		decryptTxt = new JTextArea();
		decryptTxt.setSize(400, 200);
		decryptTxt.setLocation(10, 300);
		frame.add(decryptTxt);
		
		decryptBtn = new JButton("Decrypt");
		decryptBtn.setSize(160, 40);
		decryptBtn.setLocation(425, 375);
		decryptBtn.addActionListener(new clickListener());
		decryptBtn.setActionCommand("Decrypt");
		frame.add(decryptBtn);
		
		shiftSizeLbl = new JLabel("Shift Size");
		shiftSizeLbl.setSize(80, 40);
		shiftSizeLbl.setLocation(425, 250);
		frame.add(shiftSizeLbl);
		
		shiftSizeTxt = new JTextField("3");
		shiftSizeTxt.setSize(60,20);
		shiftSizeTxt.setLocation(500,262);
		frame.add(shiftSizeTxt);
		
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setSize(600, 520);
		frame.setLocationRelativeTo(null);
		//frame.setVisible(true);
	}
	
	public void show(){
		frame.setVisible(true);
	}
	
	private class clickListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			int shift = Integer.parseInt(shiftSizeTxt.getText());
			if(e.getActionCommand().equals("Encrypt")){	
				decryptTxt.setText(Encryptor.encrypt(encryptTxt.getText(), shift));
				encryptTxt.setText("");
			}
			else if(e.getActionCommand().equals("Decrypt"))
				encryptTxt.setText(Encryptor.decrypt(decryptTxt.getText(), shift));
		}
	}
}
