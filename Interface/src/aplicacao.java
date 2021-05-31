public class aplicacao {
    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[2];

        pessoa[0] = new Pessoa("Fernando",26,"Masculino");
        pessoa[1] = new Pessoa("Bruno",26,"Masculino");

        livro[0] = new Livro("Aprendendo java","João da silva",300,pessoa[0]);
        livro[1] = new Livro("POO para iniciantes","João paulo",500,pessoa[1]);

        System.out.println(livro[0].detalhes());


    }
}
