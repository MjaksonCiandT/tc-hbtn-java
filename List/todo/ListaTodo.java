import java.util.ArrayList;
import java.util.List;

public class ListaTodo {
    public List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public ListaTodo() {

    }

    public ListaTodo(List<Tarefa> tarefas) {
        super();
        this.tarefas = tarefas;
    }

    public void adicionarTarefa(Tarefa tarefaFeita) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == tarefaFeita.getIdentificador()) {
                throw new IllegalArgumentException(
                        "Tarefa com identificador " + tarefaFeita.getIdentificador() + " ja existente na lista");
            }

            if (tarefaFeita.getDescricao().isEmpty() || tarefaFeita.getDescricao().equals("")) {
                throw new IllegalArgumentException("Descricao de tarefa invalida");
            }

        }
        tarefas.add(tarefaFeita);
    }

    public boolean marcarTarefaFeita(int identificadorTarefas) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == identificadorTarefas) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int IdentificadorTarefaDesfeita) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == IdentificadorTarefaDesfeita) {
                tarefa.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }

    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isEstahFeita()) {
                System.out.println("[X]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
            } else {
                System.out.println("[ ]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
            }

        }
    }
}
