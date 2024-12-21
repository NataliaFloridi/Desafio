
#### Desafio CEP


##### Cunsumo API

Uma aplicação de consulta de CEP através da API do governo (https://www.gov.br/conecta/catalogo/apis/cep-codigo-de-enderecamento-postal/swagger-json/swagger_view)
Após a realização da consulta os logs com os ceps buscados, o resultado e a hora da consulta serão armazenados no banco de dados.

Uso de banco de dados Amazon RDS - MySql;
Java 17.

##### Requisição

GET - https://api.consultacep.com/cep/{cep}

##### Response

{
  "cep": "01001-000",
  "endereco": "Praça da Sé",
  "bairro": "Sé",
  "cidade": "São Paulo",
  "uf": "SP"
}

##### Script criação da tabela

CREATE TABLE logs (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cep_consultado VARCHAR(8) NOT NULL,
    resultado TEXT NOT NULL,
    data_hora_consulta TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
