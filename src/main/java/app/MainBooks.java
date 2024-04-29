package app;

import model.Book;
import service.BooksCatalogService;

import java.util.List;

public class MainBooks {
    public static void main(String[] args) {
        BooksCatalogService booksCatalogService = new BooksCatalogService();

        booksCatalogService.addBook(new Book("A Jornada do Herói", "João Silva", 2001));
        booksCatalogService.addBook(new Book("O Mistério da Casa Verde", "Maria Santos", 2005));
        booksCatalogService.addBook(new Book("A Última Fronteira", "Pedro Costa", 2010));
        booksCatalogService.addBook(new Book("O Canto do Sabiá", "Ana Pereira", 2015));
        booksCatalogService.addBook(new Book("A Luz no Fim do Túnel", "Carlos Souza", 2020));
        booksCatalogService.addBook(new Book("O Segredo do Vale", "Beatriz Ferreira", 2003));
        booksCatalogService.addBook(new Book("A Sombra do Passado", "Luiz Oliveira", 2008));
        booksCatalogService.addBook(new Book("O Voo da Águia", "Paula Rodrigues", 2013));
        booksCatalogService.addBook(new Book("A Chave do Tempo", "Antônio Almeida", 2018));
        booksCatalogService.addBook(new Book("O Labirinto das Emoções", "Fábio Almeida", 2002));
        booksCatalogService.addBook(new Book("A Dança dos Sonhos", "Marcos Castro", 2007));
        booksCatalogService.addBook(new Book("O Eco da Montanha", "Fernanda Dias", 2012));
        booksCatalogService.addBook(new Book("A Ponte para o Infinito", "Francisco Cunha", 2017));
        booksCatalogService.addBook(new Book("O Espelho da Alma", "Adriana Barbosa", 2004));
        booksCatalogService.addBook(new Book("A Canção do Vento", "Fábio Almeida", 2009));
        booksCatalogService.addBook(new Book("O Sussurro das Ondas", "Gabriela Silva", 2014));
        booksCatalogService.addBook(new Book("A Trilha da Verdade", "Rafael Santos", 2019));
        booksCatalogService.addBook(new Book("O Despertar da Consciência", "Patrícia Costa", 2006));
        booksCatalogService.addBook(new Book("A Busca do Ser", "Marcelo Pereira", 2011));
        booksCatalogService.addBook(new Book("O Caminho do Coração", "Fábio Almeida", 2016));
        booksCatalogService.addBook(new Book("A Essência da Vida", "Eduardo Oliveira", 2001));
        booksCatalogService.addBook(new Book("O Toque da Inspiração", "Camila Ferreira", 2006));
        booksCatalogService.addBook(new Book("A Voz do Silêncio", "Roberto Almeida", 2011));
        booksCatalogService.addBook(new Book("O Olhar do Infinito", "Márcia Lima", 2016));
        booksCatalogService.addBook(new Book("A Inspiração do Poeta", "André Castro", 2003));
        booksCatalogService.addBook(new Book("O Sopro da Vida", "Carolina Dias", 2008));
        booksCatalogService.addBook(new Book("A Melodia do Amor", "Bruno Cunha", 2013));
        booksCatalogService.addBook(new Book("O Reflexo do Universo", "Rita Barbosa", 2018));
        booksCatalogService.addBook(new Book("A Harmonia do Ser", "Fábio Almeida", 2005));
        booksCatalogService.addBook(new Book("O Pulsar da Existência", "Sandra Santos", 2010));
        booksCatalogService.addBook(new Book("A Sinfonia da Natureza", "Rodrigo Costa", 2015));
        booksCatalogService.addBook(new Book("O Desabrochar da Flor", "Tânia Pereira", 2020));
        booksCatalogService.addBook(new Book("A Profundidade do Olhar", "Maurício Souza", 2007));
        booksCatalogService.addBook(new Book("O Brilho da Estrela", "Vera Oliveira", 2012));
        booksCatalogService.addBook(new Book("A Inspiração do Amanhecer", "Ricardo Ferreira", 2017));
        booksCatalogService.addBook(new Book("O Encanto do Crepúsculo", "Rosângela Almeida", 2004));
        booksCatalogService.addBook(new Book("A Magia do Entardecer", "Gustavo Lima", 2009));
        booksCatalogService.addBook(new Book("O Mistério do Anoitecer", "Cláudia Castro", 2014));
        booksCatalogService.addBook(new Book("A Beleza do Alvorecer", "Otávio Dias", 2019));
        booksCatalogService.addBook(new Book("O Segredo do Ocaso", "Mônica Cunha", 2006));
        booksCatalogService.addBook(new Book("A Canção do Entardecer", "Douglas Barbosa", 2011));
        booksCatalogService.addBook(new Book("O Encanto do Amanhecer", "Priscila Silva", 2016));
        booksCatalogService.addBook(new Book("A Melodia do Crepúsculo", "Reginaldo Santos", 2003));
        booksCatalogService.addBook(new Book("O Mistério do Alvorecer", "Vanessa Costa", 2008));
        booksCatalogService.addBook(new Book("A Beleza do Ocaso", "Júlio Pereira", 2013));
        booksCatalogService.addBook(new Book("O Segredo do Anoitecer", "Elisângela Souza", 2018));
        booksCatalogService.addBook(new Book("A Canção do Amanhecer", "Leandro Oliveira", 2005));
        booksCatalogService.addBook(new Book("O Encanto do Crepúsculo", "Simone Ferreira", 2010));
        booksCatalogService.addBook(new Book("A Melodia do Entardecer", "Fábio Almeida", 2015));
        booksCatalogService.addBook(new Book("O Mistério do Ocaso", "Renata Lima", 2020));


        List<Book> booksFoundByAuthor = booksCatalogService.findByAuthor("Fábio Almeida");
        if ((!booksFoundByAuthor.isEmpty())) {
            System.out.println("Books found for the requested author:");
            //System.out.println(booksFoundByAuthor);
            for (Book book : booksFoundByAuthor) {
                System.out.println(book.toString());
            }
            System.out.println("Total: " + booksFoundByAuthor.size() + " books found.\n");
        }
        else {
            System.out.println("No books found.\n");
        }

        System.out.println("First book found for the given title:");
        System.out.println(booksCatalogService.findByTitle("O Mistério do Ocaso")+"\n");

        List<Book> booksFoundByYearsRange = booksCatalogService.findByYearInterval(2000,2020);

        if ((!booksFoundByAuthor.isEmpty())) {
            System.out.println("Books found for the requested year interval:");
            //System.out.println(booksFoundByYearsRange);
            for (Book book : booksFoundByYearsRange) {
                System.out.println(book.toString());
            }
            System.out.println("Total: " + booksFoundByYearsRange.size() + " books found");
        }else {
            System.out.println("\nNo books found");
        }

    }

}
