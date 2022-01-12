package cursojava.executavel;

import java.util.*;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
        

	
	public static void main(String[] args) {

        
        List<Aluno> alunos = new ArrayList<Aluno>();
        
      for (int qtd=1; qtd<=2; qtd++) {
    	  String nome = JOptionPane.showInputDialog("Qual é o nome do Aluno "+qtd+" ?");
//        String idade = JOptionPane.showInputDialog("Qual é a idade do Aluno");
        
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  Aluno aluno1 = new Aluno(); //Passa a existir na memória                  
        
    	  aluno1.setNome(nome);
//        aluno1.setIdade(Integer.valueOf(idade));
        
        
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  for (int pos=1 ; pos<=4; pos++) {
                
                Disciplina disciplina = new Disciplina();
                //String nomeDisciplina = JOptionPane.showInputDialog("Entre com o nome da "+pos+"ª"+" disciplina");
                //disciplina.setDisciplina(nomeDisciplina);
                String notaDisciplina = JOptionPane.showInputDialog("Entre com a nota "+pos+"ª"+" nota");
                disciplina.setNota(Double.valueOf(notaDisciplina));
                
                aluno1.getDisciplinas().add(disciplina);
                        
        }
        
        int  escolha = JOptionPane.showConfirmDialog(null, "Deseja remover uma de "+aluno1.getDisciplinas().size()+" notas?");
        
        if (escolha == 0 ){
        	
        	int continuarRemover =0;
        //	int posicao =1;
        
        	while (continuarRemover == 0) {
                        
                String remove = JOptionPane.showInputDialog("qual nota quer remover (1-4)?");
                aluno1.getDisciplinas().remove(Integer.valueOf( remove).intValue()-1); //Converte para inteiro a variável remove (String)
                JOptionPane.showMessageDialog(null, "Restam "+aluno1.getDisciplinas().size()+" notas");
           //     posicao ++;                
              continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo notas?");
                                
        }
        }
        alunos.add(aluno1);
      }    
      
      for (Aluno aluno : alunos) {
    	  
    	  System.out.println("Nome : "+aluno.getNome());
          //System.out.println("Idade: "+aluno.getIdade());
          System.out.println("Media do Aluno: "+aluno.getNome()+" é:"+ aluno.getMediaNota());
          System.out.println("Resultado do Aluno: "+aluno.getNome()+" é:"+ aluno.getAlunoAprovado());
          System.out.println("-----------------------------------------------");
          //JOptionPane.showMessageDialog(null, "Aluno "+aluno.getNome()+" está: "+ aluno.getAlunoAprovado());		
	}
                //JOptionPane.showMessageDialog(null, "Saí do looping");
        
      
}
}