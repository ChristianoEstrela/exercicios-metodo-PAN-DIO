public class Mensagem {
    
        public static void mensagemBomDia() {
            System.out.println("Bom dia!");
        }    
        public static void mensagemBoaTarde() {
            System.out.println("Boa Tarde!");
        }        
        public static void mensagemBoaNoite() {
                System.out.println("Boa Noite!");
        }

        public static void obterMensagem(int hora) {

            switch (hora) {
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    mensagemBomDia();
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    mensagemBoaTarde();
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    mensagemBoaNoite();
                        break;
                default:
                    System.out.println("Digite uma hora correta!");
                    break;
        }
    }
           
}  

