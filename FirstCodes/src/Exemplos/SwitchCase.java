package Exemplos;

public class SwitchCase {
    public static void main(String[] args) {
        int diaDaSemana = 3;
        String nomeDia = "";
        
        switch (diaDaSemana) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda";
                break;        
            case 3:
                nomeDia = "terça";
                break;
            case 4:
                nomeDia = "quarta";
                break;
            case 5:
                nomeDia = "quinta";
                break;
            case 6:
                nomeDia = "sexta";
                break;
            case 7:
                nomeDia = "sábado";
            break;
        }

        System.out.println("O dia " + diaDaSemana + " é " + nomeDia);
    }
}
