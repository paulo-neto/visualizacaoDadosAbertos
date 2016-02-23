#visualizacaoDadosAbertos

###Gerenciamento das dependências e build da aplicação
    
####Este projeto foi criado com o *Maven 3.0*, então assumindo que você 
####já tenha o Maven instalado, segue alguns comandos que podem ser executados:
    
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

###Crie uma base de dados no MySql

    'create database dadosabertos;'

###JBoss-eap-6.3 com o datasource da aplicação configurado.

[JBoss-eap-6.3]

####Documentação da API Rest
[Documentação a fazer]

