public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Salsicha","Felippe","Caramelo","Vira-lata");
        Gato cat = new Gato("Cyndi","Célia","Malhada","Nobreza Vitoriana");
        Veterinario vet = new Veterinario("Dr. Venceslau", 123456, 75.0);

        cat.fala();
        dog.fala();
        verificaFicha(cat);
        verificaFicha(vet);
        verificaFicha(dog);
        vet.consulta(cat);
        vet.consulta(dog);
    }
    public static void verificaFicha(Cadastravel cad){
        System.out.println("Consultando a ficha...");
        cad.mostraFicha();
    }
}
