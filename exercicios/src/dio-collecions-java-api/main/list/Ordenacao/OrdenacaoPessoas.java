package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import main.list.Ordenacao.Pessoa.ComparatorPorAltura;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaPorIdade = new ArrayList<>(listaPessoas);
        if(!listaPessoas.isEmpty()){
            Collections.sort(listaPorIdade);
            return listaPorIdade;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura(){
         List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        if (!listaPessoas.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } 
        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

}


