public class metodos {
    public void metodoPublico() {
        System.out.println("Método público");
        // Visível em toda parte: Um método ou atributo public pode ser acessado de qualquer classe, seja dentro do mesmo pacote ou de outros pacotes.
        // Uso comum: Geralmente utilizado para métodos e atributos que precisam ser acessíveis de fora da classe, como os métodos principais da API ou serviços públicos.
    }

    private void metodoPrivado() {
        System.out.println("Método privado");
        // Visível apenas dentro da própria classe: Um método ou atributo private só pode ser acessado dentro da classe onde foi declarado.
        // Uso comum: Utilizado para ocultar dados e métodos internos, oferecendo encapsulamento. Acessos são geralmente controlados por métodos públicos (getters e setters).
    }
    protected void metodoProtegido() {
        System.out.println("Método protegido");
        // Visível para a própria classe, para classes do mesmo pacote e para subclasses: Um método ou atributo protected é acessível dentro da própria classe, 
        // em classes do mesmo pacote e também em subclasses (mesmo que estejam em pacotes diferentes).
        // Uso comum: Usado quando métodos ou atributos precisam ser acessados ou modificados por subclasses, mas ainda se quer ocultar o acesso para classes fora do pacote.
    }

    public static void main (String[] args){
        metodos metodo = new metodos();

        metodo.metodoPublico();
        metodo.metodoPrivado();
        metodo.metodoProtegido();
    }
}
