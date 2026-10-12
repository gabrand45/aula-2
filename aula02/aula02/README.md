# Aula 02 — Misturando clique() e sortear() (Kotlin)

Seis projetos Android independentes, todos usando `android:onClick`.
Abra cada pasta (`exercicio1` ... `exercicio6`) separadamente no Android Studio
(File > Open) e rode no emulador. Veja as mensagens na aba **Logcat**.

| Exercício | O que faz |
|-----------|-----------|
| 1 | Botão "Saudar": imprime no Logcat e mostra "Olá, seja bem-vindo(a)!" no TextView `txtSaudacao`. |
| 2 | Botão "Contar": contador no nível da classe; atualiza "Cliques: X" na tela e imprime "botão clicado X vezes". |
| 3 | `sortear()` (0 a 10) atualiza o TextView e imprime "número par/ímpar sorteado: X" no Logcat. |
| 4 | `rolarDado()` (1 a 6) com contador de rolagens: "Rolagem N: resultado R", também no Logcat. |
| 5 | Três botões: "Aviso" (só Logcat), "Sortear" (só tela) e "Ambos" (`avisarESortear`, faz os dois). |
| 6 | Baseado no 3: muda a cor do texto (par = verde-azulado, ímpar = vermelho) e registra a cor no Logcat. |

Dica: no Logcat, filtre por `System.out` para ver só as mensagens do `println`.
