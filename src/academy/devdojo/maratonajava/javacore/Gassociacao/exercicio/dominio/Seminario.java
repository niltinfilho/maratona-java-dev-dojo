package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Seminario {
    private String titulo;
    private String local;
    private Aluno[] alunos;
    private Professor[] professores;

    public Seminario(String titulo, String local) {
        this.titulo = titulo;
        this.local = local;
    }

    public void imprimirSeminario() {
        System.out.println("======== SEMINÁRIO ========");
        System.out.println("Título: " + this.titulo);
        System.out.println("Local: " + this.local);
        if (professores != null) {
            System.out.print("Palestrantes confirmados: ");
            for (Professor professor : professores) {
                System.out.print(professor.getNome() + ", ");
            }
            System.out.println();
        }
        if (alunos != null) {
            System.out.print("Alunos presentes: ");
            for (Aluno aluno : alunos) {
                System.out.print(aluno.getNome() + ", ");
            }
            System.out.println();
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
