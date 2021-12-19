INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA
DO SUDESTE DE MINAS GERAIS – IF SUDESTE MG
Programação Orientada a Objetos
Paulo Vinícius Moreira Dutra
Nome: Diego Jefferson


Exercício Prático – Programação Orientada a Objetos e Vetores

1. Objetivo
Desenvolver um programa em Java para resolver os exercícios propostos que envolvem a 
implementação de classes e vetores. A especificação dos exercícios está logo após as orientações a 
abaixo.
2. Instruções
Essa atividade DEVERÁ ser desenvolvida em DUPLA. As duplas deverão ser informadas no 
ato da entrega dessa atividade no SIGA.
3. Entrega
O grupo deverá entregar o trabalho na plataforma SIGAA. Não serão aceitas atividades fora do prazo, 
bem como, enviados por e-mail ou qualquer outra plataforma que não seja o SIGAA.
Caso haja algum imprevisto, o aluno deverá informar com antecedência, com no mínimo de 24 horas.
Os arquivos deverão ser entregues somente com a extensão a extensão “.java”, ou seja, no formato 
de código, no qual seja possível compilar e testar os exercícios. Como haverá mais de um arquivo 
com a extensão “.java” o exercício deverá ser compactado. Qualquer outro formato será considerado 
a atividade como não entregue.
Certifique-se que o arquivo compactado possua todos os arquivos antes de enviar ou se não está 
corrompido. Caso o arquivo compacto seja enviado corrompido ou vazio, será considerado como 
atividade não entregue.
Como alternativa de BACKUP de envio, vocês podem colocar os arquivos com a extensão “.java” no 
google drive e enviar o link do compartilhamento também no SIGAA. Entretanto, CUIDADO, 
certifique-se que enviou o link corretamente. Lembre-se de compartilhar o link com o meu e-mail:

Atividades que forem identificadas como iguais serão zeradas

4. Especificação
a) Exercício 1
Deverá ser desenvolvido uma classe em Java que implemente funções para resolver cada um 
dos itens abaixo, ou seja, a classe deverá possuir um método para cada item. Lembre-se de 
criar a classe principal para realizar as chamadas dos métodos da classe, afim de testar cada 
método se está executando corretamente.

• Método 1: Criar um vetor que armazene 100 (cem) elementos de números inteiros. 
Gere números aleatórios entre valores positivos e negativos entre(-1000 e 1000) e 
armazene no vetor. Após preencher o vetor, imprima os elementos armazenados. Ao 
final, exiba a quantidade de números positivos e negativos que foram armazenados no 
vetor.
• Método 2: Solicite ao usuário para informar qual é quantidade máxima de elementos 
de um vetor, Gere números aleatórios entre 0 e 1000, imprima os elementos, e ao final, 
apresente qual é o maior e menor elemento armazenado no vetor.

b) Exercício 2
Esse exercício é uma variação do exercício anterior. Crie uma classe chamada 
NumerosRandomicos. Essa classe deve possuir um atributo que represente um vetor de 
números inteiros, inicialize esse vetor para armazenar no máximo 10 elementos. Essa classe 
deverá possuir os seguintes métodos.

• gerarNumeros: Esse método possui como finalidade gerar números aleatórios entre 0 
e 10000 e preencher o vetor de 10 elementos que é um atributo da classe 
NumerosRandomicos.
• imprimirNumeros: Possui como objetivo de exibir os números armazenados no 
atributo que é um vetor de inteiros.

• ordenarNumeros: Possui como objetivo ordenar os números armazenados no atributo 
que é um vetor de inteiros.

Crie uma classe principal com o objetivo de testar todos os métodos implementados na classe 
NumerosRandomicos. Importante, na classe principal, lembre-se de sempre chamar o método 
imprimirNumeros(), após executar os métodos gerarNumeros e ordenarNumeros. Nesse caso, chamar 
o método imprimirNumeros(), para cada UMA execução dos métodos, isso é necessário, afim de, 
verificar se os números foram gerados e ordenados corretamente