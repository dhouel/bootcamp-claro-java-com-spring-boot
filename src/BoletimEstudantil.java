public class BoletimEstudantil {
    public static void main(String[] args) {
        int nota1=7;
        int nota2=8;
        int nota3=5;
        int nota4=6;
        int media=(nota1+nota2+nota3+nota4)/4;
        System.out.println(" ");
        if (media>6){
            System.out.println("Aprovado, Média: "+media);
        }else if (media>4) {
            System.out.println("Recuperação, Média: "+media);
        } else {
            System.out.println("Reprovado, Média: "+media);
        }

    }
}
