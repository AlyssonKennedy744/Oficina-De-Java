import java.util.*;


public class qsts_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selecione a questão que deseja de (1 a 30): ");
        int qst = input.nextInt();
        switch (qst) {
            case 1:
                int sum = 0;
                
                for (int i = 0; i<3; i++)
                {   
                    System.out.println("Digite um número");
                    int num = input.nextInt();
                    sum += num;
                }

                System.out.println("A soma dos valores digitados é igual a "+  sum);
                break;
            case 2:
                System.out.println("Insira um número: ");
                int num_qst_2 = input.nextInt();
                System.out.println("Dobro: "+ num_qst_2+"\nTriplo: "+num_qst_2+"\nQuadruplo: "+ num_qst_2);
                break;
            case 3:
                System.out.println("Digite sua altura em M:");
                double altura = input.nextDouble();
                System.out.println("Digite o seu peso em KG: ");
                double peso = input.nextDouble();

                System.out.println("O seu IMC é de: "+ .2%(peso/(altura*altura)/(2+3+5)));
                break;
            case 4:
                System.out.println("Digite o seu número: ");
                double num_1_qst_4 = input.nextDouble();
                System.out.println("Digite o seu número: ");
                double num_2_qst_4 = input.nextDouble();
                System.out.println("Digite o seu número: ");
                double num_3_qst_4 = input.nextDouble();

                double media = (((num_1_qst_4*2) + (num_2_qst_4*3) + (num_3_qst_4*5))/10);
                System.out.println("A média ponderada dos números selecionados: "+media);
                
                break;
            case 5:
                System.out.println("Digite sua idade: ");
                int idade = input.nextInt();

                System.out.println("A sua idade "+idade+" em dias é "+idade*365);
                break;
            case 6:
                System.out.println("Digite o seu salário:");
                double salario = input.nextDouble();
                System.out.println("O seu salário com o reajuste fica"+ salario*1.15);
                break;

            case 7:
                System.out.println("Digite um número");
                int num_qst_7 = input.nextInt();
                System.out.println("O antecessor do seu número é "+(num_qst_7-1)+ " e o seu sucessor é "+(num_qst_7+1));
                break;
            case 8:
                System.out.println("Digite a quantidade de dias que você trabalhou: ");
                int dias = input.nextInt();
                System.out.println("Digite o valor da sua diária: ");
                double valor_diaria = input.nextDouble();

                System.out.println("O valor do seu salário é de: "+(dias*valor_diaria));
                break;

            case 9:
                System.out.println("Digite o valor do produto: ");
                double valor_produto = input.nextDouble();

                System.out.println("O valor do seu produto com desconto é "+(valor_produto*0.90));
                break;
            case 10:
                System.out.println("Digite o seu peso em KG: ");
                double peso_kg = input.nextDouble();

                System.out.println("O seu peso em libras é igual a: "+(peso_kg*2.20462));
                break;
            case 11:
                System.out.println("Digite um número");
                int num_1_qst_11 = input.nextInt();
                System.out.println("Digite um número");
                int num_2_qst_11 = input.nextInt();

                if (num_1_qst_11 < num_2_qst_11){
                    System.out.println("O maior número é" + num_2_qst_11);
                }else if(num_1_qst_11 > num_2_qst_11){
                    System.out.println("O maior número é "+ num_1_qst_11);
                }else{
                    System.out.println("Os números são iguais");
                }
                break;
            case 12:
                System.out.println("Digite um número");
                int num_1_qst_12 = input.nextInt();
                System.out.println("Digite um número");
                int num_2_qst_12 = input.nextInt();
                System.out.println("Digite um número");
                int num_3_qst_12 = input.nextInt();

                if (num_1_qst_12 < num_2_qst_12){
                    if (num_1_qst_12 > num_3_qst_12){
                        System.out.println("O menor número é: "+ num_3_qst_12);
                    }else if (num_1_qst_12 < num_3_qst_12){
                        System.out.println("O menor número é: "+ num_1_qst_12);
                    }
                }else if (num_1_qst_12 > num_2_qst_12 ){
                    if (num_2_qst_12 < num_3_qst_12){
                        System.out.println("O menor número é "+num_2_qst_12);
                    } else if (num_2_qst_12 > num_3_qst_12){
                        System.out.println("O menor número é "+num_3_qst_12);
                    }
                }else {
                    if (num_3_qst_12 < num_1_qst_12){
                        System.out.println("O menor número é o "+ num_3_qst_12);
                    }else{
                        System.out.println("Não pensei irmão");
                    }
                }
                break;
            case 13:
                System.out.println("Digite um número para saber se é par ou impar: ");
                int num_par_impar = input.nextInt();
                if (num_par_impar%2 != 0){
                    System.out.println("O número é impar");
                }else {
                    System.out.println("O número é par");
                }
                break;
            case 14:
                System.out.println("Digite o seu sexo: ");
                String sexo = input.next();
                System.out.println("Digite a sua altura em M: ");
                double altura_qst_14 = input.nextDouble();
                System.out.println("Digite o seu peso em KG: ");
                double peso_qst_14 = input.nextDouble();

                double IMC = (peso_qst_14 / (altura_qst_14*altura_qst_14));
                
                System.out.println(IMC);

                if (IMC < 16.9) {
                    System.out.println("Você pessoa do de sexo "+sexo+" está muito abaixo do peso");
                }else if (IMC <= 17 || IMC <= 18.4 ){
                    System.out.println("Você pessoa do de sexo "+sexo+" está abaixo do peso");
                }else if (IMC <= 18.5 || IMC <= 24.9 ){
                    System.out.println("Você pessoa do de sexo "+sexo+" está com o peso normal");
                }else if (IMC <= 25 || IMC <= 29.9 ){
                    System.out.println("Você pessoa do de sexo "+sexo+" está acima do peso");
                }else if (IMC <= 30 || IMC <= 34.9){
                    System.out.println("Você pessoa do de sexo "+sexo+" está com obesidade I");
                }else if (IMC <= 35 || IMC <= 40 ){
                    System.out.println("Você pessoa do de sexo "+sexo+" está com obesidade II");
                }else {
                    System.out.println("Você pessoa do sexo "+sexo+" está com obesidade III");
                }
                break;
            case 15:
                System.out.println("Digite um número: ");
                double num_qst_15 = input.nextDouble();

                if (num_qst_15 % 3 == 0 && num_qst_15 % 5 == 0){
                    System.out.println("O número é multiplo de 3 e 5");
                } else {
                    System.out.println("O número não é multiplo de 3 e 5");
                }
                break;
            case 16:
                System.out.println("Digite um número: ");
                double num_1_qst_16 = input.nextDouble();
                System.out.println("Digite outro número: ");
                double num_2_qst_16 = input.nextDouble();

                if (num_1_qst_16 < 0 && num_2_qst_16 < 0){
                    System.out.println(num_1_qst_16 * num_2_qst_16);
                }else {
                    System.out.println(num_1_qst_16 + num_2_qst_16);
                }
                break;
            case 17:
                System.out.println("Digite o seu salário: ");
                double salario_qst_17 = input.nextDouble();

                if (salario_qst_17 < 1000){
                    System.out.println("Seu aumento foi de 10% e ficou "+(salario_qst_17*1.10));
                }else{
                    System.out.println("Seu aumento será de 5% e ficou "+(salario_qst_17*1.05));
                }
                break;
            case 18:
                System.out.println("Digite um número");
                int dia = input.nextInt();
                switch (dia) {
                    case 1:
                        System.out.println("Hoje é domingo");
                        break;
                    case 2:
                        System.out.println("Hoje é segunda");
                        break;
                    case 3:
                        System.out.println("Hoje é terça");
                        break;
                    case 4:
                        System.out.println("Hoje é quarta");
                        break;
                    case 5:
                        System.out.println("Hoje é quinta");
                        break;
                    case 6:
                        System.out.println("Hoje é sexta");
                        break;
                    case 7:
                        System.out.println("Hoje é sábado");
                        break;
                    default:
                        break;
                }
            case 19:
                System.out.println("Digite seu primeiro número");
                int num_1_qst_19 = input.nextInt();
                System.out.println("Digite seu segundo número");
                int num_2_qst_19 = input.nextInt();
                System.out.println("Digite seu terceiro número");
                int num_3_qst_19 = input.nextInt();

                if (num_1_qst_19 < num_2_qst_19){
                    if (num_2_qst_19 < num_3_qst_19){
                        System.out.println(num_1_qst_19+","+num_2_qst_19+","+num_3_qst_19);
                    }else if (num_3_qst_19 < num_1_qst_19){
                        System.out.println(num_3_qst_19+","+num_1_qst_19+","+num_2_qst_19);
                    }
                }else if (num_2_qst_19 < num_1_qst_19){
                    if (num_1_qst_19 < num_3_qst_19) {
                        System.out.println(num_2_qst_19+","+num_1_qst_19+","+num_3_qst_19);
                    }else if (num_3_qst_19 < num_2_qst_19){
                        System.out.println(num_3_qst_19+","+num_2_qst_19+","+num_1_qst_19);
                    }
                }
                break;
            
            case 20:
                System.out.println("Digite a sua idade:");
                int idade_qst_19 = input.nextInt();
                
                if (idade_qst_19 <= 9){
                    System.out.println("mirim");
                }else if (idade_qst_19 <= 10 || idade_qst_19 <=13){
                    System.out.println("infantil");
                }else if (idade_qst_19 <= 14 || idade_qst_19 <= 17){
                    System.out.println("juvenil");
                }else{
                    System.out.println("Adulto");
                }
                break;

            case 21:
                for (int num_21 = 0; num_21 <= 10; num_21++){
                    System.out.println(num_21);
                }
                break;
            case 22:
                for (int num_22 = 0; num_22 <=20; num_22++){
                    if (num_22 % 2 == 0){
                        System.out.println(num_22);
                    }else{
                        continue;
                    }
                }
                break;
            case 23:
                for (int num_23 = 0; num_23 <= 19; num_23++){
                    if (num_23 % 2 != 0){
                        System.out.println(num_23);
                    }else{
                        continue;
                    }
                }
                break;
            case 24:
                for (int num_24 = 0; num_24 <= 30; num_24++){
                    if (num_24 % 3 == 0){
                        System.out.println(num_24);
                    }else{
                        continue;
                    }
                }
                break;
            case 25:
                for (int num_25 = 10; num_25 >= 0; num_25--){
                    System.out.println(num_25);
                }
                break;
            case 26:
                System.out.println("Insira um número");
                int num_tabuada = input.nextInt();
                for (int i = 0; i <=10 ; i++){
                    System.out.println(num_tabuada+" x "+i);
                }
                break;
            case 27:
                for (int num_27 = 1; num_27 <=100; num_27++){
                    if (num_27 % 3 == 0 && num_27 % 5 ==0) {
                        System.out.println("BuzzFizz");
                    }
                    else if (num_27 % 3 == 0){
                        System.out.println("Fizz");
                    } else if (num_27 % 5 == 0){
                        System.out.println("Buzz");
                    } else {
                        continue;
                    }
                }
                break;
            case 28:
                System.out.println("Digite um número:");
                int num_28 = input.nextInt();
                for (int i = 1; i <= 100; i++){
                    if (num_28 % i == 0){
                        System.out.println("Os divisores são:\n"+i);
                    }else {
                        continue;
                    }
                }
                break;
            case 29:
                int soma = 0;
                int contador = 0;

                while (true) {
                    System.out.println("Digite um número para somar a média\nSe quiser que pare digite 0");
                    int num_29 = input.nextInt();
                    if (num_29 == 0){
                        break;
                    }else{
                        soma += num_29;
                        contador++;
                    }
                
                    
                }
                if (contador > 0){
                    int media_29 = (soma/contador);
                    System.out.println("A média aritmética é "+media_29);
                }else{
                    System.out.println("Nenhum número foi colador");
                }
                break;
            case 30:
                double maior_30 = 0;
                
                while (true){
                    double num_30 = input.nextDouble();
                    if (num_30 == 0){
                        break;
                    }else{
                        if (maior_30 == 0 || num_30 > maior_30){
                            maior_30 = num_30;
                        }else{
                            continue;
                        }
                    }
                }
                if (maior_30 != 0){
                    System.out.println("O maior número é "+maior_30);
                }else{
                    System.out.println("nenhum numero foi inserido");
                }
                break;



            default:
                break;
            
                
                }

        
                
        }
    }
