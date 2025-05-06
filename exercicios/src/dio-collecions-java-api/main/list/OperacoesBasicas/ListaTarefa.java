package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;

    public ListaTarefa(){
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> removerTarefa = new ArrayList<>();
        if(!listaTarefa.isEmpty()){
            for (Tarefa tarefa : listaTarefa) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    removerTarefa.add(tarefa);
                }
                
            }
            listaTarefa.removeAll(removerTarefa);
        }
        else{
            System.out.println("A lista está vazia! ");
        }
    }

    public int tamanhoLista(){
        return listaTarefa.size();
    }

    public void descricaoLista(){
        if(!listaTarefa.isEmpty()){
            System.out.println(listaTarefa);
        }
        else{
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();
    
        // Adicionando tarefas à lista
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");
    
        // Exibindo o número total de tarefas na lista
        System.out.println("Você tem " + listaTarefa.tamanhoLista() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas na lista
        listaTarefa.descricaoLista();
    
        // Removendo uma tarefa da lista
        listaTarefa.removerTarefa("Comprar leite");
    
        // Exibindo o número total de tarefas na lista após a remoção
        System.out.println("Agora você tem " + listaTarefa.tamanhoLista() + " tarefas na lista:");
    
        // Exibindo as descrições das tarefas atualizadas na lista
        listaTarefa.descricaoLista();
    
        // Removendo uma tarefa da lista quando a lista está vazia
        listaTarefa.removerTarefa("Estudar para o exame");
    
        // Exibindo o número total de tarefas na lista após tentar remover de uma lista vazia
        System.out.println("Agora você tem " + listaTarefa.tamanhoLista() + " tarefas na lista:");
      }
    }

