<h1 align="center">TRAVEL-PLANNING</h1>

### Classes

- Tempo: essa classe é responsável por fazer toda a manipulação de datas, horas e fusos horários do sistema.
    - Atributos:
        - `embarque`: é privado, do tipo da classe `LocalDateTime`, e é responsável por armazenar a data e a hora do embarque da pessoa viajante.
	    - `origem`: é privado, do tipo String, e é responsável por armazenar o nome da cidade de origem da viagem.
	    - `destino`: é privado, do tipo String, e é responsável por armazenar o nome da cidade de destino da viagem.
	    - `duracao`: é privado, do tipo inteiro, e é responsável por armazenar a duração da viagem em horas, no caso é a duração do voo especificamente.
        - `formato`: é privado, do tipo String, e é responsável por representar o formato que a data e a hora deve ter ao ser entrada pela pessoa usuária (ex: "dd/MM/yyyy HH:mm:ss").
	
    - Métodos:
        - Construtor: o método construtor dessa classe `Tempo` deve receber quatro argumentos: String `embarque`, String `origem`, String `destino`, `int` `duracao`, que devem ser usados para inicializar os respectivos atributos. Note que o atributo `embarque` é do tipo `LocalDateTime`, e o argumento recebido é do tipo String, então você deve usar os métodos da classe `LocalDateTime` para fazer essa manipulação.
        - `retonarDesembarqueHorarioLocalDestino`: esse método é público e retorna um valor do tipo String representando data e hora no formato dd/MM/yyyy HH:mm:ss. Ele é responsável por descobrir qual será a data e horário local da cidade destino da pessoa viajante no seu desembarque (levando em consideração a duração do voo). Por exemplo, considerando que o embarque na cidade de origem foi no dia 22/01/22, o voo saiu às 13:00 para a cidade destino que tem uma diferença de 12 horas no fuso horário, ou seja, na cidade destino o embarque da pessoa viajante foi dia 23/04/22 à 01:00. Supondo que o voo tem duração de 24 horas, então esse método deve retornar a String "24/04/22 01:00:00", que representa a data e a hora que o desembarque será feito, levando em consideração o horário da cidade de destino.
        - `retonarDesembarqueHorarioLocalOrigem`: esse método é público e também retorna um valor do tipo String representado data e hora no formato dd/MM/yyyy HH:mm:ss. De forma similar ao anterior, este método deve calcular qual será a data e o horário local na cidade de origem em que a pessoa desembarcará na cidade destino. Considerando o mesmo exemplo anterior, em que o embarque na cidade de origem foi no dia 22/01/22, o voo saiu às 13:00 para a cidade destino que tem uma diferença de 24 horas no fuso horário. Supondo que o voo tem duração de 24 horas, então esse método deve retornar a String "23/04/22 13:00:00", que representa a data e a hora que o desembarque será feito levando em consideração o horário da cidade de origem. Essa informação é relevante para que a pessoa viajante possa avisar aos familiares a que horas elas podem tentar contactar a pessoa viajante.
    
- Viagem: essa classe é responsável por concentrar a manipulação entre voo e os horário. Ela utiliza métodos da classe `Tempo` e da classe `Voo` para enviar as informações para o método `main` que está na classe `Principal`.
    - Atributos:
        - `embarque`: esse atributo é privado do tipo String, e é responsável por armazenar a data e a hora do embarque da pessoa usuária do sistema.
        - `origem`: é privado, do tipo String, e é responsável por armazenar a entrada da pessoa usuária com o nome da cidade de origem da viagem.
        - `destino`: é privado, do tipo String, e é responsável por armazenar o nome da cidade de destino da viagem que é entrada pela pessoa usuária.
        - `distanciaKm`: esse atributo é privado, do tipo `double`, e é responsável por armazenar a entrada da pessoa usuária, indicando a distância em quilômetros entre a cidade de origem e a de destino.
        - `voo`: é do privado do tipo `Voo`, e é responsável por chamar os métodos da classe `Voo`.
	
    - Métodos:
        - Construtor: esse método recebe quatro atributos: `String embarque`, `String origem`, `String destino`, `double distanciaKm`, que são usados para inicializar seus atributos respectivamente.
        - `retonarDesembarqueHorarioLocalDestino`: esse método é público e tem retorno do tipo String. Ele é responsável por instanciar um objeto do tipo `Tempo` e usar o método `retonarDesembarqueHorarioLocalDestino` da classe `Tempo` para receber a String que representa a data e a hora local da cidade de destino durante o desembarque da pessoa viajante.
        - `retornarDuracaoVoo`: esse método é público e tem retorno do tipo inteiro. Ele é responsável por usar o atributo `voo` passando o atributo `distanciaKm` para o método `retornarTempoVoo` da classe `Voo` que retorna um valor do tipo inteiro representando a duração do voo em horas.
        - `retornarInformacaoViagem`: é público e retorna um valor do tipo String que é o resumo da viagem, assim como foi determinado pela empresa aérea. 

- Voo: essa classe é responsável por manipular os métodos relacioandos ao voo.
    - Atributos:
        - `tempoVoo`: esse atributo é privado e do tipo inteiro, usado para armazenar o tempo do voo em horas.
	
    - Métodos:
        - `retornarTempoVoo`: esse método é público e retorna um valor do tipo inteiro que representa a duração do voo em horas. Ele recebe um atributo do tipo `double`, que representa a distância em quilômetros entre a cidade de origem e a cidade de destino. Para esse cálculo, considere que um avião comercial em velocidade de cruzeiro percorre 700 quilômetros por hora. Por exemplo, se a distância entre a cidade de origem e a de destindo é de 8.000 quilômetros, considerando que a velocidade média do avião é de 700 quilômetros por hora, o voo teria duração de 11,4 horas, e esse método deverá retornar o valor 11 (o arrendondamento ocorre porque o retorno é do tipo inteiro).
        - `retornarInformacaoVoo`: esse método é público e tem retorno do tipo String que representa o resumo das informações sobre o voo. Ele recebe quatro argumentos: `String embarque`, `String origem`, `String desembarque`, `String destino`, e os utiliza para formar uma String com o resumo do voo.

### Languagens/Frameworks/Ferramentas

[![My Skills With Front-End](https://skillicons.dev/icons?i=java,maven)](https://skillicons.dev)

## 🚀 Instalando o projeto

Para instalar o projeto, siga estas etapas:

```
mvn install
```
