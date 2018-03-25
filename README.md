# visualizacaoDadosAbertos
    Sistema desenvolvido na disciplina TCC Sistemas de Informação do curso Bacharel em Sistemas de Informação, juntamente com o artigo 
    Uma análise dos dados abertos sobre gastos dos parlamentares federais, sob a orientação do professor Yuri Malheiros.
    Será utilizado para a plotagem do gráficos os dados contidos no arquivo AnoAtual.xml disponibilizado pela câmara dos deputados.
[AnoAtual.xml](http://www.camara.gov.br/cotas/AnoAtual.zip) 

### Arquitetura da aplicação
    1. SGBD MySql.
    2. Spring Data.
    3. Spring MVC.
    4. API XStream para o parse de arquivos xml.
    5. JBoss EAP 6.3.

### Gerenciamento das dependências e build da aplicação
    
#### Este projeto foi criado com o *Maven 3.0*, então assumindo que você 
#### já tenha o Maven instalado, segue alguns comandos que podem ser executados:
    
   1. Para compilar 'mvn compile'
   2. Para compilar offline 'mvn –o compile'
   3. Para criar os pacotes 'mvn package'
   4. Instalar o pacote nos respectivos repositórios 'mvn install'
   5. Limpar a pasta target 'mvn clean'
   6. Gerar um projeto eclipse 'mvn eclipse:clean eclipse:eclipse'
   7. Executar os testes unitários 'mvn test'
   8. Executar um teste específico 'mvn test –Dtest=caminho.do.seu.pacote.suaClasseDeTestes'
   9. Ignorar os testes ao gerar um pacote 'mvn package -Dmaven.test.skip=true'
   10. Ignorar os testes ao instalar um pacote 'mvn install -Dmaven.test.skip=true'

### Crie uma base de dados no MySql

    'create database dadosabertos;'

### JBoss-eap-6.3 com o datasource da aplicação configurado.
    1. No terminal.    
    2. Iniciar o JBoss: $JBOSSS_HOME/bin run.sh
    3. Parar o JBoss: Ctrl+C

[JBoss-eap-6.3](https://www.dropbox.com/s/6w2vwc94y15u1u7/jboss-eap-6.3.tar.gz?dl=0)

#### Documentação da API Rest
[Documentação a fazer]
