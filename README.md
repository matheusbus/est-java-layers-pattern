# EST - Padrão de Camadas no Desenvolvimento de Software
 Estudos sobre padrão de camadas em aplicações.

# 001 - Objetivo

---

🎯 Registrar e entender como funciona o padrão de camadas para o desenvolvimento de software.

🔗 Link da aula: https://www.youtube.com/watch?v=7HvOBCqHWvA

---

# 002 - Camadas

---

O objetivo do padrão de camadas é especificar e dividir as diversas responsabilidades de um sistema em camadas lógicas.

![camadas](https://github.com/matheusbus/est-padrao-camadas/assets/73143728/84a7032b-c5be-42f5-83b1-7c3a781be71f)


Representação gŕafica das camadas lógicas.

# 003 - Responsabilidades

---

## 003.1 - Controller

---

- Controlador: reponder interações do usuário.
    - No caso de uma API Rest, as interações são as requisições.

## 003.2 - Data Transfer Objects (DTO)

---

- DTO: São objetos de transferências de dados.
    - São utilizados fora de ambiente transacionais, no meio de campo que eles fornecem, posso validar e esconder alguns campos.

## 003.3 - Service

---

- Service: realizar operações de negócio.
    - Um método da camada service deve ter um SIGNIFICADO relacionado ao negócio, podendo executar várias operações. Exemplo: registrarPedido [verifica o estoque, salva o pedido, baixa estoque, envia email].

## 003.4 - Entities

---

- Entities: São as camadas de modelo e domínio do meu sisterma.
    - É nelas que fica o ORM (Mapeamento Objeto-Relacional).

## 003.5 - Repository

---

- Repository: realiza operações “individuais” de acesso ao banco de dados.
    - Todas as operações que envolvem minha camada fisica de dados passam pela camada dos repositorios;
    - É onde acontece a conversão de tuplas/registros do banco de dados para objetos da minha linguagem de programação.

# 004 - Ambiente Transacional

---

<aside>
💡 Importante destacar: As camadas de Serviço, Repository e Entity ficam dentro do **ambiente transacional**, enquanto os Controllers e DTO não.

</aside>

## 005 - Créditos

---

Professor: Nélio Alves.
