# Teste técnico -  Cotação-Dólar

# Sistema de cotação do dolar

O teste proposto foi para consumir uma API externa do BCB - Banco Central do Brasil. 

# Tecnologias utilizadas
Foi utilizado o framework Quarkus e RestClient para consumo da API do BCB. O RestClient foi utilizado também para o segundo microserviço que consome o primeiro e retorna a devida resposta. 

O Swagger foi utilizado para teste da API e o docker foi utilizado para criação de containers para cada microserviço. O QuarkusTest também foi utilizado para testes de integração

# Portas
  
O Microserviço de consumo da API está na porta 8082

# Swagger

O swagger não está funcionando dentro do Docker. Tentei várias vezes, mas acho que deixei passar algo. Para verificar a documentação via Swagger, precisa executar o projeto por alguma IDE (Eclipse,s IntelliJ etc). Após a importação do projeto pela IDE, a documentação da API pode ser acessada pela seguinte url: 

http://localhost:8082/q/swagger-ui

# Docker

Para criar uma imagem, foi utilizado o Docker-compose. Para executar a aplicação no docker, basta fazer clone do projeto, navegar até a pasta raiz e, então, executar o seguinte comando:

docker-compose -f docker-compose.yaml up

Feito isso, se pode utilizar o swagger para testes, o curl para requisição GET ou acessar direto por um navegador através de uma url que está exemplificada abaixo:

http://localhost:8080/v1/cotacao?dataCotacao=03-03-2022

swagger: http://localhost:8080/q/swagger-ui

# Testes

Infelizmente, não fiz os testes. Nunca fiz parte de alguma Squad de testes, por isso, deixe-os para estudar agora depois que vi a necessidade dos testes automatizados.
