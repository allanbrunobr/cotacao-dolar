# Teste técnico -  Cotação-Dólar

O teste proposto foi para consumir uma API externa do BCB - Banco Central do Brasil a fim de saber a cotação do dólar. 

# Tecnologias utilizadas
Foi utilizado o framework Quarkus e o RestClient para o consumo da API do BCB. O RestClient foi utilizado também para o o consumo da mensagem do primeiro microservice (client). 

# Portas
  
O Microserviço de consumo da API está na porta 8082.

# Swagger

Para testes e documentação das APIs, após iniciar a aplicação, acesse o Swagger pela seguinte url: 

http://localhost:8082/q/swagger-ui

# Exceptions
As mensagens das exceções dentro do docker não estão sndo exibidas. Mais uma vez, posso ter deixado passar algo com o Docker. Mas ao executar o programa pela IDE ou até mesmo por um executável (*jar), elas são exibidas na tela.
Caso queira criar um executável, basta ir na pasta raiz do projeto e digitar o seguinte código:
```mvn package -Dquarkus.package.type=native -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true -Dmaven.test.skip=true```
Após o término, o projeto irá criar uma pasta _target_, dentro da pasta foi gerada outra pasta chamada _quarkus-app_. Dentro dessa pasta se encontra o executável **quarkus-run.jar**


# Docker

Para criar uma imagem, foi utilizado o Docker-compose. Para executar a aplicação no docker, basta fazer clone do projeto, navegar até a pasta raiz e, então, executar o seguinte comando:

```docker-compose -f docker-compose.yaml up```

Para acessar a requisição GET, pode usar o curl ou acessar direto por um navegador através da URL:

Pesquisa por período: http://localhost:8082/v1/api/client/periodo/03-04-2021
ou

Pesquisa apenas da data: http://localhost:8082/v1/api/client/03-04-2021

