# 🌍🚀 Selfie Espacial — O Notificador de Passagens

Já imaginou saber **quando um satélite está passando exatamente sobre você**?

O **Selfie Espacial** é uma API que transforma o espaço em algo pessoal e cotidiano.  
Ela avisa quando um satélite “vai te ver agora” e te convida a olhar para o céu.

> 🛰️ “Em alguns minutos, o espaço estará olhando para você. Vá até a janela.”

---

## ✨ A Ideia

Em vez de cálculos complexos ou termos técnicos, o projeto foca em **experiência e encantamento**.

Qualquer pessoa consegue entender:
- Onde está
- Quando olhar
- Para qual direção do céu

Não é um simulador científico.  
É uma **ponte entre tecnologia e imaginação**.

---

## 🎯 O que a API faz

- Recebe o nome de uma cidade
- Simula uma passagem de satélite
- Retorna:
  - Uma mensagem humana
  - Tempo estimado da passagem
  - Direção aproximada no céu

---

## 📡 Endpoint disponível

### `GET /selfie-space/notify`

#### Parâmetro
- `city` → nome da cidade

#### Exemplo de chamada
http://localhost:8080/selfie-space/notify?city=Rio de Janeiro

bash
Copiar código

#### Exemplo de resposta
```json
{
  "title": "🛰️ O satélite vai te ver agora!",
  "message": "Um satélite vai passar sobre Rio de Janeiro em 6 minutos.",
  "direction": "Olhe para o céu na direção sudoeste.",
  "time": "19:42:10"
}
🛠️ Tecnologias utilizadas
Java 17

Spring Boot

Maven

API REST

▶️ Como inicializar o projeto
✅ Pré-requisitos
Antes de começar, certifique-se de ter instalado:

Java 17 ou superior

nginx
Copiar código
java -version
Maven

nginx
Copiar código
mvn -version
📥 Passo 1 — Clonar o repositório
bash
Copiar código
git clone https://github.com/seu-usuario/selfie-espacial.git
Entre na pasta do projeto:

bash
Copiar código
cd selfie-espacial
▶️ Passo 2 — Rodar o projeto
Opção 1: Pela IDE (recomendado)
Abra o projeto no IntelliJ, VS Code ou Eclipse

Localize a classe:

Copiar código
SelfieEspacialApplication.java
Clique em Run

Opção 2: Pelo terminal
arduino
Copiar código
mvn spring-boot:run
🌐 Passo 3 — Testar a API
Com a aplicação rodando, acesse no navegador ou Postman:

bash
Copiar código
http://localhost:8080/selfie-space/notify?city=SuaCidade
Se aparecer uma resposta em JSON, o projeto está rodando corretamente ✅

🧠 Como funciona (em termos simples)
O sistema simula uma “janela de passagem”

Usa apenas:

Tempo atual

Mensagens amigáveis

Nenhum conhecimento de física ou astronomia é necessário para entender o resultado

O foco é sensação de momento, não precisão científica.