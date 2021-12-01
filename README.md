# pais-api
API de registo de píses
Esta API foi criada como resposta a um desafio feito pela 2iBi Software como requisito para um concurso de contratação para "Back-End Engineer".
O desafio consistia em desenvolver uma API RESTful, em Java e um gerenciador de bases de dados relacional a escolha do candidato.
Era suposto criar uma classe Pais com as propriedades id (gerado automaticamente), nome, capital, região, sub-região e área.
A API devia possibilitar a criação de um novo país, alistar os países cadastrados, alterar os dados de um dado país ora cadastrado, eliminar um país ora cadastrado e alistar os paises em função de qualquer uma das suas propriedades.

Para testar a applicação, antes de mais, é necessário criar uma base de dados denominada "pais", em MySQL. De seguida, é necessário localizar o ficheiro "application.propreties" no qual são fornecidas as credenciais de acesso à base de dados.
Feito isto, executar a aplicação, seja no IDE ou após a criação em um exectável (.jar), e seguir as orientações:

Para criar um novo país, a API é http://localhost:8080/pais-api/paises, o método é POST, o Content-Type é application/json, o conteúdo o conjunto de propriedades e respectivos valores.
Ex: fetch('http://localhost:8080/pais-api/paises', {method: 'post', headers: {'Content-Type': 'application/json'}, body: JSON.stringify({"area": 123, "capital": "Maputo", "nome": "Moçambique", "regiao": "África", "subRegiao": "África Autral"})});

Para visualizar a lista dos países ora cadastrados, a API é http://localhost:8080/pais-api/paises e o método é GET.
Ex: fetch('http://localhost:8080/pais-api/paises').then(r => r.json()).then(console.log);

Para alterar os dados de um país ora cadastrado, a API é http://localhost:8080/pais-api/paises/{id}, onde {id} é o identificador do país em questão, o método é PUT e o conteúdo é o conjunto de propriedades e valores do país.
Ex: fetch('http://localhost:8080/pais-api/paises/1', {method: 'put', headers: {'Content-Type': 'application/json'}, body: JSON.stringify({"id": 1, "area": 321, "capital": "Maputo", "nome": "Moçambique", "regiao": "Africa", "subRegiao": "SADC"})});

Para eliminar um país ora cadastrado, a API é http://localhost:8080/pais-api/paises/{id}, onde {id} é o identificador do país em questão, e o método é DELETE.
Ex: fetch('http://localhost:8080/pais-api/paises/1', {method: 'delete'});

Para alistar os países em função de qualquer uma das suas propriedades, a API é http://localhost:8080/pais-api/paises/{orderby}, onde {orderby} é a propriedade com a qual se pretende basear o ordenamento dos paíeses, o método é GET.
Ex: fetch('http://localhost:8080/pais-api/paises/nome').then(r => r.json()).then(console.log);

Para maiores pormenores, o contacto é amanjate@outlook.com.
