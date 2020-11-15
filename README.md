# javalogincadastroBCrypt

Softwares usados: NetBeans e pacote WAMP(para Windows) 
e LAMP(para Linux, no meu caso, em máquina virtual)

Projeto com objetivo de mostrar como as senhas eram 
armazenadas, com seguraça, em banco de dados de empresas.
Para isso, criei uma tela login e uma tela cadastro,
ambas feitas com a ferramenta de interface gráfica 
da IDE Netbeans.
Nenhuma das telas mostra as senhas "hashed" armazenadas,
isso só é verificado fazendo um select * no MySQL.
A parte interessante do trabalho foi conseguir utilizar
o pacote BCrypt para passar a senha por uma função hashing,
fazendo uso do metodo do pacote para comparar senha digitada
na tela login, com senha armazenada no banco de dados.
