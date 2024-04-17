import java.util.Scanner;
public class MiniProjeto1 {
    public static void  main(String[] args) throws Exception {
        System.out.println("Um gatinho foge de sua casa e se perde de sua família, após muito tempo andadando ele se encontra faminto e desamparado com medo doque pode estar a espreita um brilho de esperança aparece quando ele percebe que o caminho se divide em 2 uma bifurcação. \nQual caminho o gato deverá seguir? O da esquerda ou direita? \nDigite 'direita' ou 'esquerda' ");
        Scanner x = new Scanner(System.in);
        String esqDire = x.nextLine();
        if(esqDire.equals("esquerda")){
        System.out.println("No caminho da esquerda o gatinho avista um javali muito bravo. O que você quer faze? Brigar ou fugir? \nDigite 'brigar' ou 'fugir'");
            String BrigarFugir = x.nextLine();
                if (BrigarFugir.equals("brigar")){
                    System.out.println("O gatinho então vai a briga, mas o javali é muito mais forte, por isso o ele não consegue vencer e morre RIP");
                }
                else if(BrigarFugir.equals("fugir")){
                    System.out.println("O gato foge em direção a um cercado onde há uma casa pequena, lá ele avista um caseiro que o adota.");
                }
        }
        else if(esqDire.equals("direita")){
            System.out.println("Após seguir por muito tempo no caminho da direita o gatinho ver um rio que sebpara a floresta da cidade. Qual caminho o gato irá seguir? Atravessar o rio ou tentar buscar outro caminho? \nDigite 'atravessar o rio' ou 'buscar outro caminho'");
            String RioCaminho = x.nextLine();
                if(RioCaminho.equals("atravessar o rio")){
                    System.out.println("O gato se aproveita de um pedaço de madeira que está flutuando no rio e sobe nela para atravesar-lo. Com isso ele chega na civilização e encontra sua família.");
                }
                else if(RioCaminho.equals("buscar outro caminho")){
                    System.out.println("O gatinho tenta procurar outro caminho, mas não encontra. Com isso ele vai ficando cansado e com fome, e morre RIP");
            }
            x.close();
        }
        System.out.println("FIM");
    }
}