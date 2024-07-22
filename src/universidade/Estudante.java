package universidade;

public class Estudante {
    private String nome;
    private String ra;
    private double[] notas;

    /**
     * Constrói um novo estudante
     * @param nome O nome completo do estudante.
     * @param ra O RA no formato UFABC.
     * @param notas As notas obtidas de 0 a 10.
     */

    public Estudante(String nome, String ra, double[] notas) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
    }

    private void validaRa(String ra) {
        if (!ra.matches("\\d{11}")){
            throw new IllegalAccessException("RA fora do formato");
        }
    }

    /**
     * Consulta o nome do estudante
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Consulta o RA
     * @return
     * @throws IllegalAccessException 
     */
    public String getRa() {
        validaRa(ra);
        return ra;
    }
    public double[] getNotas() {
        return notas;
    }

    /**
     * Altera o nome do estudante
     * @param nome
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Muda o numero do RA
     * @param ra O novo RA
     * 
     */

    public void setRa(String ra) {
        validaRa(ra);
        this.ra = ra;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    private double somaNotas() {
        double soma = 0.0;

        for (var nota : notas) {
            soma += nota;
        }
        return soma;
    }

    public double getMedia() {
        if (notas.length == 0) {
            return 0.0;

            return somaNotas() / notas.length;
        }
    }
    
    
    
}