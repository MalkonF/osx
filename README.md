# osx

Sistema para cadastro de ordens de serviço.

Para rodar no Netbeans:

git clone https://github.com/MalkonF/osx.git .

File - Open Project - Selecione o projeto .

É necessário instalar localmente a dependencia rs2xml.jar, porque no repositório do maven ela não foi encontrada.

Para instalar faça:

mvn install:install-file -Dfile=<local que está o .jar da dependencia> -DgroupId=net.proteanit.sql -DartifactId=rs2xml -Dversion=1.0 -Dpackaging=jar .

Clique com botão direito no projeto e selecione build .

É necessário instalar o mysql e criar uma base de dados de nome dbinfox. 
Configure as credenciais de acesso ao banco de dados na classe ModuloConexao.java
