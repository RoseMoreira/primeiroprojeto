Algoritmo "Menu"
Var
   op, op2, i:Inteiro
   nome_cliente: vetor [1..10] de caractere
   cpf_cliente: vetor [1..11] de inteiro
   senha_cliente: vetor [1..20] de inteiro
   destino: vetor [1..10] de caractere
   nome, novodestino: caractere
   encontrou: logico

inicio

   Repita
      Limpatela
      escreval ("1. Cadastrar novo usuário ")
      escreval ("2. Cadastrar novo destino ")
      escreval ("3. Buscar usuário")
      escreval ("4. Buscar destino ")
      escreval ("5. Sair ")

      escreval ("Escolha uma opção de 1 a 5 : ")
      leia (op)
      ESCOLHA (op)
      Caso 1
         escreval ("Digite seu nome: ")
         leia (nome_cliente[1])
         escreval ("Digite seu cpf: ")
         leia (cpf_cliente[1])
         escreval ("Digite uma senha segura: ")
         leia (senha_cliente[1])
         escreval ("Usuario cadastrado com sucesso")

      Caso 2
         escreval ("Qual destino deseja inserir : ")
         leia (destino [1])
         escreval (" Muito obrigada pela sugestão! ")

      Caso 3
         escreval ("Digite seu nome: ")
         leia (nome)
         encontrou <- falso
         para i de 1 ate 10 faca
            se (nome_cliente[i] = nome) entao
               encontrou <- verdadeiro
               interrompa
            fimse
         fimpara
         se encontrou entao
            escreva ("Usuario cadastrado, favor fazer login")
         senao
            escreva ("Usuario não encontrado, favor cadastrar")
         fimse

      Caso 4
          escreval ("Digite seu destino: ")
         leia (novodestino)
         encontrou <- falso
         para i de 1 ate 10 faca
            se (destino[i] = novodestino) entao
               encontrou <- verdadeiro
               interrompa
            fimse
         fimpara
         se encontrou entao
            escreva ("Destino cadastrado, em breve teremos novidades")
         senao
            escreva ("Esse destino ainda não faz parte da nossa base, favor cadastrar")
         fimse

      Caso 5
         escreval ("Agradecemos a preferencia, Voe Sempre! ")
      OUTROCASO
         escreval ("Opção invalida")
      FIMESCOLHA
      leia (op2)
   ate (op) = 5
fimalgoritmo
