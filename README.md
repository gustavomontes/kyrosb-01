# kyrosb-01

## Sobre o projeto:
O Projeto trata-se de uma api para gestão de clientes, e é composto inicialmente por um CRUD (Create | Read | Update | Delete), onde podemos fazer a gestão de uma base de clientes

### Frameworks utilizados:
  * Spring-boot para execução da aplicação e gerenciamento de dependências
  * Lombok, para redução de código pois o mesmo gera, em tempo de compilação todos os métodos de gerenciamento de acesso a atributos (Getters, setters, construtores, equals, hashcode)
  * Spring JPA para persistência de dados
  * H2 Database, para persistência dos dados em tempo de execução. 
  * JUnit para execução de testes unitários

### 1- Executar a aplicação
Para Executar a plicação, temos duas formas:
 * Através de uma IDE, executando o método main da classe ApiClientApplication
 * Atrávés de linha de comando, através do comando: mvn spring-boot:run

Por configuração, a mesma está sendo executada na porta 8081, e contexto /api-client mas essa porta pode ser mudada no arquivo application.properties

### 2- Executar os testes unitários
Os testes unitários são por padrão executados durante o step de "install" do maven, mas também podem ser executados através do comando "mvn test" ou ainda através da IDE onde é possível executar todos de uma vez ou apenas um.

### 3- Banco de dados
O Banco de dados adotado foi um banco de dados em memória que pode ser acessado através do browser utilizando-se a url e credenciais abaixo:
    
    URL: http://localhost:8081/h2-console
    Username: sa
    Password: password

Caso necessário as mesmas podem ser alteradas no arquivo application.properties.

Documentação: 
A Api foi documentada através do swagger e pode ser acessada através do caminho: "/api-client/swagger-ui.html"

