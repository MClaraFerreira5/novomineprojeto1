public class Personagem {
        String nome;
        int energia;

        public Personagem(String nome, int energia){
            this.nome = nome;
            this.energia = energia;

        }

        public void ajustar(int energia) {
            if (energia != 0){
                System.out.println("Seu personagem perdeu energia");
            }
        }
}

