# ETL de Orientações de TCC (etl.json)

Projeto desenvolvido em Java com Spring Boot para a disciplina de Recuperação, Integração e Reuso de Dados, com o objetivo de implementar um processo ETL (Extração, Transformação e Carga) a partir de dados em formato JSON.

---

## 📚 Descrição do Projeto

A aplicação realiza o processamento de dados de orientações de Trabalhos de Conclusão de Curso (TCC), seguindo as etapas clássicas de um processo ETL:

- **Extração**: leitura de dados a partir de um arquivo JSON (`orientacoes.json`);
- **Transformação**:
  - Ajuste das datas de defesa;
  - Quando a data de defesa não é identificada, o valor é definido como *"não definida"*;
  - Quando existe data de defesa, o nível do trabalho é ajustado para **TCC2**;
- **Carga**: persistência dos dados transformados em um banco de dados **MongoDB**.

O projeto utiliza a biblioteca [simples.etl](https://github.com/eduardoalmeidajesus/simples.etl) para organizar e reutilizar a lógica do processo ETL.

---

## 🛠️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- MongoDB
- Gson
- Jsoup
- Selenium
  
---

## 📂 Estrutura do Projeto

```
etl.json/
├── src/main/java/
│ └── br/edu/utfpr/td/tsi/raspador/atividade3
├── orientacoes.json
├── application.properties
├── pom.xml
└── README.md
```

---

## ▶️ Como Executar o Projeto

### Pré-requisitos
- Java 17 ou superior
- Maven
- MongoDB em execução
- Projeto `simples.etl` instalado no repositório Maven local

### Passos
1. Clonar o repositório:
   ```bash
   git clone https://github.com/eduardoalmeidajesus/simples.etl.git
2. Entrar na pasta do projeto
   ```bash
   cd etl.json
3. Executar a aplicação:
   ```bash
   mvn spring-boot:run

---

## 📄 Arquivo de Entrada

O arquivo **orientacoes.json** contém a lista de orientações de trabalhos de TCC utilizada como fonte de dados para o processo ETL.
