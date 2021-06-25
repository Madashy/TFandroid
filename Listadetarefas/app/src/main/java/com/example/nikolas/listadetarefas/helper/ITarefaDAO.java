package com.example.nikolas.listadetarefas.helper;

import com.example.nikolas.listadetarefas.model.Tarefa;

import java.util.List;

/**
 * Created by nikolas
 */

public interface ITarefaDAO {

    public boolean salvar(Tarefa tarefa);
    public boolean atualizar(Tarefa tarefa);
    public boolean deletar(Tarefa tarefa);
    public List<Tarefa> listar();

}
