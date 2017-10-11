import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadastro extends JFrame {
	private String unidade = "d";
	private ImageIcon img = new ImageIcon(unidade+":/ProjetoGAJ/imgs/nome.jpg");
	private JPanel p;
	private JLabel logo = new JLabel(img);
	
	
	
	private JTextField nome = new JTextField();
	private JTextField data = new JTextField();
	private JTextField senha = new JTextField();
	private JTextField id= new JTextField();
	private JTextField ConfId = new JTextField();
	private JTextField Ninscri= new JTextField();
	private JTextField seccional= new JTextField();
	private JTextField TipoInscri= new JTextField();
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	private JLabel l7;
	private JLabel l8;
	private JLabel l9;
	
	
	private ImageIcon imgbt = new ImageIcon(unidade+":/ProjetoGAJ/imgs/efet.png");
	private JButton bt = new JButton(imgbt);
	
	private ImageIcon cancela = new ImageIcon(unidade+":/ProjetoGAJ/imgs/can.png");
	private JButton can = new JButton(cancela);
	
	private ImageIcon lin = new ImageIcon(unidade+":/ProjetoGAJ/imgs/linha.png");
	private JLabel linha = new JLabel(lin);
	
	public Cadastro (){
		
	
		
		super("Cadastro");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setBounds(250, 100, 1000, 690);
		super.setLayout(null);
		super.setVisible(true);
		super.setLocationRelativeTo(null);
		super.setResizable(false);
		
		
		
		logo.setVisible(true);
		logo.setBounds(0, 0, 1000, 180);
		
		linha.setVisible(true);
		linha.setBounds(15, 620, 965, 30);
		
		
		p =new JPanel();
		p.setVisible(true);
		p.setBounds(15, 185, 965, 465);
		p.setBackground(Color.GRAY);
		p.setLayout(null);
		
		

		
		
	
		
		
		l1 = new JLabel("Formulário de Cadastro do Usuário");
		l1.setFont(new Font("italic",Font.LAYOUT_LEFT_TO_RIGHT, 30));
		l1.setForeground(Color.black);
		l1.setVisible(true);
		l1.setBounds(247, 20, 500,50);
		
		
		l2 = new JLabel("Nome");
		l2.setFont(new Font("italic",Font.LAYOUT_LEFT_TO_RIGHT, 16));
		l2.setForeground(Color.black);
		l2.setVisible(true);
		l2.setBounds(20, 100, 500,50);
		
		l3 = new JLabel("Data de Nascimento");
		l3.setFont(new Font("italic",Font.LAYOUT_LEFT_TO_RIGHT, 16));
		l3.setForeground(Color.black);
		l3.setVisible(true);
		l3.setBounds(20, 165, 500,50);
		
		l4 = new JLabel("Id");
		l4.setFont(new Font("italic",Font.LAYOUT_LEFT_TO_RIGHT, 16));
		l4.setForeground(Color.black);
		l4.setVisible(true);
		l4.setBounds(20, 225, 500,50);
		
		l5 = new JLabel("Senha");
		l5.setFont(new Font("italic",Font.LAYOUT_LEFT_TO_RIGHT, 16));
		l5.setForeground(Color.black);
		l5.setVisible(true);
		l5.setBounds(20, 285, 500,50);
		
		l6 = new JLabel("Confirmar a Senha");
		l6.setFont(new Font("italic",Font.LAYOUT_LEFT_TO_RIGHT, 16));
		l6.setForeground(Color.black);
		l6.setVisible(true);
		l6.setBounds(20, 345, 500,50);
		
		l7 = new JLabel("Nº Da Inscrição");
		l7.setFont(new Font("italic",Font.LAYOUT_LEFT_TO_RIGHT, 16));
		l7.setForeground(Color.black);
		l7.setVisible(true);
		l7.setBounds(400, 155, 500,50);
		
		l8 = new JLabel("Seccional");
		l8.setFont(new Font("italic",Font.LAYOUT_LEFT_TO_RIGHT, 16));
		l8.setForeground(Color.black);
		l8.setVisible(true);
		l8.setBounds(400, 235, 500,50);
		
		l9 = new JLabel("Tipo de Inscrição");
		l9.setFont(new Font("italic",Font.LAYOUT_LEFT_TO_RIGHT, 16));
		l9.setForeground(Color.black);
		l9.setVisible(true);
		l9.setBounds(400, 315, 500,50);
		
		
		nome.setVisible(true);
		nome.setBounds(20, 135, 200, 30);
		nome.setFont(new Font("italic",Font.CENTER_BASELINE, 14));
		nome.setForeground(Color.BLACK);
		
		data.setVisible(true);
		data.setBounds(20, 200, 200, 30);
		data.setFont(new Font("italic",Font.CENTER_BASELINE, 14));
		data.setForeground(Color.BLACK);
		
		id.setVisible(true);
		id.setBounds(20, 230, 200, 30);
		id.setFont(new Font("italic",Font.CENTER_BASELINE, 14));
		id.setForeground(Color.BLACK);
		
		id.setVisible(true);
		id.setBounds(20, 260, 200, 30);
		id.setFont(new Font("italic",Font.CENTER_BASELINE, 14));
		id.setForeground(Color.BLACK);
		
		
		senha.setVisible(true);
		senha.setBounds(20, 320, 200, 30);
		senha.setFont(new Font("italic",Font.CENTER_BASELINE, 14));
		senha.setForeground(Color.BLACK);
		

		ConfId.setVisible(true);
		ConfId.setBounds(20, 379, 200, 30);
		ConfId.setFont(new Font("italic",Font.CENTER_BASELINE, 14));
		ConfId.setForeground(Color.BLACK);
		
		Ninscri.setVisible(true);
		Ninscri.setBounds(400, 190, 200, 30);
		Ninscri.setFont(new Font("italic",Font.CENTER_BASELINE, 14));
		Ninscri.setForeground(Color.BLACK);
		
		seccional.setVisible(true);
		seccional.setBounds(400, 270, 200, 30);
		seccional.setFont(new Font("italic",Font.CENTER_BASELINE, 14));
		seccional.setForeground(Color.BLACK);
		
		TipoInscri.setVisible(true);
		TipoInscri.setBounds(400, 350, 200, 30);
		TipoInscri.setFont(new Font("italic",Font.CENTER_BASELINE, 14));
		TipoInscri.setForeground(Color.BLACK);
		
		
		
		bt.setVisible(true);
		bt.setBounds(700, 255, 180, 30);
	
				/////EM ANÁLISE! EGH TOTAL NEM OLHEM KKKKKKKKKKKKKKKKKKKKK
		
		
		
		
		
		
		
		bt.addActionListener(new ActionListener() {
			
			
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 String aux = nome.getText();
				 String aux1 = data.getText(); 
				 String aux2 = id.getText();
				 String aux3 = senha.getText();
				 String aux4 = Ninscri.getText();
				 String aux5 = seccional.getText();
				 String aux6 = TipoInscri.getText();
			
				
			Front front = new Front();		
					
			GerenciadorPessoas gere = new GerenciadorPessoas();

			gere.passarPessoa(aux,aux1, aux2, aux3, aux4, aux5, aux6);
			gere.imprime();
		
		
			
			dispose();
				
				
				
			}
		});
		
	/////FIM DO EGH ///////////////////////////////////////////////////////////////	
		
		can.setVisible(true);
		can.setBounds(700, 295, 180, 30);
		
		can.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Interface in = new Interface();
				dispose();
				
			}
		});
		
		
		super.add(linha);
		super.add(logo);
		
		p.add(l9);
		p.add(l8);
		p.add(l7);
		p.add(l6);
		p.add(l5);
		p.add(l4);
		p.add(l3);
		p.add(l1);
		p.add(l2);
		p.add(nome);
		p.add(data);
		p.add(id);
		p.add(senha);
		p.add(ConfId);
		p.add(Ninscri);
		p.add(seccional);
		p.add(TipoInscri);
		p.add(bt);
		p.add(can);
		
		
		super.add(p);
		
	}
	
	
	
	//////FUNÇÃO VALIDAR USUÁRIO///////////////////////
	
	
	public static void validaUsuario(String [] argas){
		
		
		
		
		
		
		
	}
	
	
/////FIM DA FUNÇÃO VALIDAR USUÁRIO//////////////////////	
	
	
	
	
	

	
}
