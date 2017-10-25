import java.sql.*;
import java.util.Scanner;
import javax.*;
import com.mysql.*;

public class ConexaoBanco {
 Scanner d = new Scanner(System.in);
	
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	
	public ConexaoBanco(){
		
	}
	
	
    public void conectar(){
	
    String servidor = "jdbc:mysql://127.0.0.1:3306/Gaj";
	String usuario = "root";
	String senha = "";
	String driver = "com.mysql.jdbc.Driver";
	try{
		
		Class.forName(driver);
		this.connection = DriverManager.getConnection(servidor, usuario, senha);
		this.statement = (Statement) this.connection.createStatement();
		 
	    }catch(Exception e){
		
		//Coloquem aqui um método para chamar
		//uma caixa de texto se existir um erro na
		//conexão...
	}
	//return connection;
}
	
	public boolean estaConectado(){
		if(this.connection != null){
			return true;
		}else{
			return false;
		}
	
}
	
    public void listarUsuario(String usuario){
    	try{
    		conectar();
    		String query = "SELECT * FROM "+usuario+" ORDER BY nome";
    	    this.resultset = this.statement.executeQuery(query);
    	    this.statement = (Statement) this.connection.createStatement();
    	    while(this.resultset.next()){
    	    	System.out.println(" Cpf: " + this.resultset.getInt("cpf") 
    	    	+ " - Nome: " + this.resultset.getString("nome") + " - Idade:" 
    	    	+ this.resultset.getInt("idade") + " ...");
    	  
    	    }
    	 desconectar();
    	}catch(Exception e){
    		//Coloquem aqui um método para chamar
    		//uma caixa de texto se existir um erro
    		//na consulta do banco...	
    	}
    }	
	
	public void inserirUsuario(String user, int id, String nome, String data,
			String senha,String ninscri,String seccional,String TipoInscri){
		
		try{
		conectar();
		String query = "INSERT INTO "+user+" VALUES ('"+id+"','"+nome+"','"+data+"','"+senha+"','"+ninscri+"'"
				+ ",'"+seccional+"','"+TipoInscri+"');";
		this.statement.executeUpdate(query);
		desconectar();
		
		}catch(Exception e){
		
			//Coloquem aqui um método para chamar
    		//uma caixa de texto se existir um erro
    		//ao inserir no banco...
		}
	}
	
	public void editarUsuario(int cpf, String nome, int idade, String usuario){
		try{
			conectar();
			String query = "UPDATE "+usuario+" SET nome = '"+nome+"',idade = '"+idade+"' WHERE cpf = '"+cpf+"';";
		    this.statement.executeUpdate(query);	
	        desconectar();
		}catch(Exception e){
	    	//Coloquem aqui um método para chamar
    		//uma caixa de texto se existir um erro
    		//ao modificar o usuário no banco...	
		}
	}
	
	public void apagarUsuario(int cpf){
		try{
		    conectar();
			String query = "DELETE FROM usuario WHERE cpf = "+ cpf +";";	
		    this.statement.executeUpdate(query);	
		    desconectar();
		}catch(Exception e){
			//Coloquem aqui um método para chamar
    		//uma caixa de texto se existir algum erro
    		//ao excluir o usuario no banco...	
		}
		
    }
	
    public void desconectar(){
    	try{
    		this.connection.close();
    	}catch(Exception e){
       		//Coloquem aqui um método para chamar
    		//uma caixa de texto se existir algum erro
    		//ao fechar a conexão com o banco...	
     	}
    }

}
