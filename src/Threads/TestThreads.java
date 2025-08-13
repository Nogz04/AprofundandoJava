package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreads {
    public static void main(String[] args) {
        // Criando um pool de 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Criando uma tarefa que imprime qual thread está executando
        Runnable tarefa = () -> {
            System.out.println("Executando: " + Thread.currentThread().getName());
        };

        // Enviando 5 tarefas para execução
        for (int i = 0; i < 5; i++) {
            executor.submit(tarefa); // Envia para uma thread disponível
        }

        // Finaliza o executor (não aceita mais novas tarefas)
        executor.shutdown();
    }
}


                            // ===Perguntas a mim mesmo===

// -----------------------------------------------------------------------------------------//

// O que é um pool de 2 threads?

// Um pool de 2 threads significa que o Java vai manter apenas 2 threads ativas ao mesmo tempo
// para executar tarefas, mesmo que você envie muito mais tarefas para ele.

// -----------------------------------------------------------------------------------------//