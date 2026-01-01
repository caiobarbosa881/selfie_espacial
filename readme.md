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