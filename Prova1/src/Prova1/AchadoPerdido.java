package Prova1;
import javax.swing.JOptionPane;



public class AchadoPerdido {

    private String titulo;
    private String descricao;
    private String localAchado;
    private String tipo;
    private String status;
    private String foto;
    private Usuario usuario;

    public AchadoPerdido(String titulo, String descricao, String localAchado, String tipo, String status, String foto, Usuario usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.localAchado = localAchado;
        this.tipo = tipo;
        this.status = status;
        this.foto = foto;
        this.usuario = usuario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setLocalAchado(String localAchado) {
        this.localAchado = localAchado;
    }

    public String getLocalAchado() {
        return localAchado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFoto() {
        return foto;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String buscarTitulo(String titulo) {
        return "Título: " + titulo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Local encontrado: " + localAchado;
    }

    public void visualizaDetalhes() {
        JOptionPane.showMessageDialog(null,
                "Título: " + titulo + "\n" +
                        "Foto: " + foto + "\n" +
                        "Local encontrado: " + localAchado + "\n" +
                        "Tipo: " + tipo + "\n" +
                        "Status: " + status + "\n" +
                        "Usuário: " + usuario.getNome());
    }
}