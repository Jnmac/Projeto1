package cursojava.executavel;

import java.util.*;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
        

	
	public static void main(String[] args) {

        
        List<Aluno> alunos = new ArrayList<Aluno>();
        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
        
     /*   List<Aluno> alunosAprovados = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/
        
      for (int qtd=1; qtd<=3; qtd++) {
    	  String nome = JOptionPane.showInputDialog("Qual é o nome do Aluno "+qtd+" ?");
//        String idade = JOptionPane.showInputDialog("Qual é a idade do Aluno");
        
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  Aluno aluno1 = new Aluno(); //Passa a existir na memória                  
        
    	  aluno1.setNome(nome);
//        aluno1.setIdade(Integer.valueOf(idade));
        
        
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  for (int pos=1 ; pos<=1; pos++) {
                
                Disciplina disciplina = new Disciplina();
            //    String nomeDisciplina = JOptionPane.showInputDialog("Entre com o nome da "+pos+"ª"+" disciplina");
            //    disciplina.setDisciplina(nomeDisciplina);
                String notaDisciplina = JOptionPane.showInputDialog("Entre com a nota "+pos+"ª"+" nota");
                disciplina.setNota(Double.valueOf(notaDisciplina));
                
              
                aluno1.getDisciplinas().add(disciplina);
        }
        
        int  escolha = JOptionPane.showConfirmDialog(null, "Deseja remover uma de "+aluno1.getDisciplinas().size()+" notas?");
        
        if (escolha == 0 ){
        	
        	int continuarRemover =0;
        	int posicao =1;
        
        	while (continuarRemover == 0) {
                        
                String remove = JOptionPane.showInputDialog("qual nota quer remover (1-4)?");
                aluno1.getDisciplinas().remove(Integer.valueOf( remove).intValue()-posicao); //Converte para inteiro a variável remove (String)
                JOptionPane.showMessageDialog(null, "Restam "+aluno1.getDisciplinas().size()+" notas");
                posicao ++;                
              continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo notas?");
        }
        }
        alunos.add(aluno1);
      }    
      
      maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
      maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
      maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
    
      for (Aluno aluno : alunos) {
    	  if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
    		 maps.get(StatusAluno.APROVADO).add(aluno);
    	  } else
    		      		  
    		  if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
    			  maps.get(StatusAluno.RECUPERACAO).add(aluno);
    		  }
    			  else
    				  maps.get(StatusAluno.REPROVADO).add(aluno);
    					  
    				  }
      

      
      System.out.println("---------------Lista dos aprovados-----------------");
      for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
    	  System.out.println("Resultado de "+aluno.getNome() + aluno.getAlunoAprovado() + "com médica de = "+aluno.getMediaNota());
		
	}
      
      System.out.println("---------------Lista dos Reprovados-----------------");
      for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
    	  System.out.println("Resultado de "+aluno.getNome()+ aluno.getAlunoAprovado() + "com médica de = "+aluno.getMediaNota());
		
	}
      
      System.out.println("---------------Lista dos em recuperação-----------------");
      for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
    	  System.out.println("Resultado de "+aluno.getNome()+ aluno.getAlunoAprovado() + "com médica de = "+aluno.getMediaNota());
		
	}
    				  
    		}
	}