<h1 align="center"> Springboot 3.0.5 + Kotlin - API do BestCommerce da WS Work Sistemas!</h1>

#### Projeto proposto pelo teste Técnico da empresa WS Work Sistemas, cujo deram escolha entre fazer com Spring Boot usando Java, Kotlin ou Groovy.
#### Feito por: Iasmim Ferreira de Godoy, concluído em: 19/04/2023
##### Linguagem escolhida: Kotlin;
##### Packaging: Jar 
##### Java: 17
##### Dependências: WEB / Spring WEB SQL, Spring Data JDBC SQL

##### Clonando este repositório:
`git clone https://github.com/IasmimFGodoy/teste-back-end-iasmim-godoy-best-commerce-spring-boot-kotlin.git`

> <b>Depois de clonar o repositório, você precisará baixar as dependências</b><br>
> <b>Se estiver no Windows</b>:<br>
> Abra o projeto no IntelliJ e digite no terminal:<br>
> `gradlew.bat build`
>
> <b>Se estiver no Linux</b>:<br>
> Abra o projeto no IntelliJ e digite no terminal:<br>
> `./gradlew build`


> Modelo de Entidade Relacional Fornecido pelo Teste na Questão 1: 
> 
> ![image](https://user-images.githubusercontent.com/106850969/232895203-e28fd851-0be8-4c65-9c7c-c09b2201797a.png)
> 
> Organização dos pacotes do projeto:
> 
> ![image](https://user-images.githubusercontent.com/106850969/232895786-93489a8f-5dda-4e30-a414-21ebd2e46690.png)


<p align="center"><b>Ferramentas utilizadas:</b></p>
<p align="center">IntelliJ IDEA Community Edition 2023</p>
<p align="center">Insomnia</p>
<p align="center">Ngrok</p>
<h3 align="center">Veja a API do projeto Best Commerce funcionando logo abaixo!</h3>
<h4 align="center">CRUD da entidade <b>Users</b></h4>

https://user-images.githubusercontent.com/106850969/233143404-6587c218-642b-44b1-8776-a714ad65800c.mp4

<h4 align="center">CRUD da entidade <b>Store</b></h4>

https://user-images.githubusercontent.com/106850969/233144187-81ddad2d-7205-4312-a710-b525d3e5242d.mp4

<h4 align="center">CRUD da entidade <b>Customer_Types</b></h4>

https://user-images.githubusercontent.com/106850969/233144396-e42f2f42-db17-4b68-9df5-c8b73f1270ea.mp4

<h4 align="center">CRUD da entidade <b>Costumer</b></h4>

https://user-images.githubusercontent.com/106850969/233144537-c110709e-88bd-4b9a-a834-0896ac8f4df9.mp4

<h4 align="center">CRUD da entidade <b>Sales</b></h4>

https://user-images.githubusercontent.com/106850969/233144742-f8fe35ff-85e2-41ae-afbc-f41fb61d5afa.mp4

<h4 align="center">CRUD da entidade <b>Customer_Stores</b></h4>

https://user-images.githubusercontent.com/106850969/233144825-88e58a49-f2fb-41e9-964d-71618d801b74.mp4


> Na questão 2 foi solicitado para projetar os endpoints necessários para alimentar este site:<br>
> ![image](https://user-images.githubusercontent.com/106850969/233145392-9807b348-a82c-466f-b85b-6ff08d71f6d9.png)
> <br>
> Caso ainda não tenha visto, fiz também o teste front-end com este layout, que se encontra neste repositório: https://github.com/IasmimFGodoy/teste-front-end-iasmim-godoy-ws-work-questao-1.git <br>
> Então vamos começar com a demosntração das APIs funcionando!

<h4 align="center">Endpoints das categorias da sidebar:</h4>

![image](https://user-images.githubusercontent.com/106850969/233148459-74124422-3ecc-430b-842b-05722dfc67b1.png)

https://user-images.githubusercontent.com/106850969/233147153-2390cdfe-6637-4a7a-80cf-434b293827a2.mp4

<h4 align="center">Para cada categoria da Sidebar, criei um endpoint para exibir produtos de cada tipo:</h4>

![image](https://user-images.githubusercontent.com/106850969/233148579-d1331315-5101-4f28-97aa-2cc46f89b3d2.png)

https://user-images.githubusercontent.com/106850969/233148916-d4401908-9d1a-4bd1-b2e7-b0345d5e2a2c.mp4

<h4 align="center">Para o dashboard principal da página, criei dois endpoints separados: myproducts para exibir os produtos dos containers principais e um endpoint para exibir os produtos do carrossel de imagens, veja abaixo:</h4>

<h5> Endpoint para os produtos em destaque: </h5>

![image](https://user-images.githubusercontent.com/106850969/233149912-9900473d-a71b-4d12-8dda-37847b2fb73d.png)

https://user-images.githubusercontent.com/106850969/233150206-ce332b41-248b-441d-9c85-ea0b4fcadd33.mp4

<h5> Endpoint para os produtos do carrossel de imagens: </h5>

![image](https://user-images.githubusercontent.com/106850969/233150533-e1bb5fbf-2b0e-4474-a6f8-733118830e08.png)

https://user-images.githubusercontent.com/106850969/233150576-58558115-8d35-44ad-99c8-f3bdf778df33.mp4

<h3 align="center">Estas foram todos endpoints abordados pela minha aplicação em Kotlin com Spring Boot!</h3>
<p align="center">Se por algum motivo você não pode clonar este repositório, instale o Insomnia ou Postman em <br>
sua máquina e teste os endpoints dessa API a partir deste link: `https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app`

<h4 align="center">Endpoints de Users</h4>
<p align="center">Listagem: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/users</p>
<p align="center">Listagem por id (retire as chaves): https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/users/{id}</p>
<p align="center">Inserção: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/user</p>
<p align="center">Alteração: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/updateuser/{id}</p>
<p align="center">Exclusão: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/deleteuser/{id}</p>

<h4 align="center">Endpoints de Store</h4>
<p align="center">Listagem: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/stores</p>
<p align="center">Listagem por id (retire as chaves): https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/store/{id}</p>
<p align="center">Inserção: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/store</p>
<p align="center">Alteração: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/updatestore/{id}</p>
<p align="center">Exclusão: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/deletestore/{id}</p>

<h4 align="center">Endpoints de Customer_Types</h4>
<p align="center">Listagem: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/customertypes</p>
<p align="center">Listagem por id (retire as chaves): https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/customertype/{id}</p>
<p align="center">Inserção: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/customertype</p>
<p align="center">Alteração: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/updatecustomertype/{id}</p>
<p align="center">Exclusão: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/deletecustomertype/{id}</p>

<h4 align="center">Endpoints de Costumers</h4>
<p align="center">Listagem: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/costumers</p>
<p align="center">Listagem por id (retire as chaves): https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/costumer/{id}</p>
<p align="center">Inserção: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/costumer</p>
<p align="center">Alteração: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/updatecostumer/{id}</p>
<p align="center">Exclusão: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/deletecostumer/{id}</p>

<h4 align="center">Endpoints de Sales</h4>
<p align="center">Listagem: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/sales</p>
<p align="center">Listagem por id (retire as chaves): https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/sale/{id}</p>
<p align="center">Inserção: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/sale</p>
<p align="center">Alteração: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/updatesale/{id}</p>
<p align="center">Exclusão: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/deletesale/{id}</p>

<h4 align="center">Endpoints de Customer_Stores</h4>
<p align="center">Listagem: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/customerstores</p>
<p align="center">Listagem por id (retire as chaves): https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/customerstore/{id}</p>
<p align="center">Inserção: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/customerstore</p>
<p align="center">Alteração: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/updatecustomerstore/{id}</p>
<p align="center">Exclusão: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/deletecustomerstores/{id}</p>

<h4 align="center">Endpoints do Site - Sidebar</h4>
<p align="center">Categorias da sidebar: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/categories </p>
<p align="center">Categorias da sidebar -> Produtos da caregoria Healthy & Care: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/categories/healthyandcare </p>
<p align="center">Categorias da sidebar -> Produtos da caregoria Food: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/categories/food </p>
<p align="center">Categorias da sidebar -> Produtos da caregoria Pet: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/categories/pet </p>
<p align="center">Categorias da sidebar -> Produtos da caregoria hardware: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/categories/hardware </p>
<p align="center">Categorias da sidebar -> Produtos da caregoria garden's: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/categories/gardens </p>
<p align="center">Categorias da sidebar -> Produtos da caregoria Beauty and hair: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/categories/beautyandhair </p>

<h4 align="center">Endpoints do Site - Produtos em destaque (MyProducts)</h4>
<p align="center">Produtos dos containers: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/myproducts </p>
<p align="center">Produtos do Carrossel de imagens: https://3edd-2804-fec-d37d-1100-f586-db5f-298f-edde.ngrok-free.app/myproducts/carousel </p>
<br>
<h3 align="center"> E por aqui encerro a apresentação deste projeto! </h3>
<p align="center"> Qualquer dúvida posso ser contactada no email: iasmimfgodoy@outlook.com ou linkedin: https://www.linkedin.com/in/iasmimgodoydevweb/ </p>
<p align="center"> Iasmim Godoy</p>
