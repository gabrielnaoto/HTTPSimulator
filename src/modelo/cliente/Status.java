/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.cliente;

/**
 *
 * @author ignoi
 */
public enum Status {

    OK(200, "Ok", "A requisição foi bem sucedida."),
    MOVED_PERMANENTLY(301, "Moved Permanently", "O recurso foi movido permanentemente para outra URI."),
    FOUND(302, "Found", "O recurso foi movido temporariamente para outra URI."),
    NOT_MODIFIED(304, "Not Modified", "O recurso não foi alterado."),
    UNAUTHORIZED(401, "Unauthorized", "A URI especificada exige autenticação do cliente. O cliente pode tentar fazer novas requisições."),
    FORBIDDEN(403, "Forbidden", "O servidor entende a requisição, mas se recusa em atendê-la. O cliente não deve tentar fazer uma nova requisição."),
    NOT_FOUND(404, "Not Found", "O servidor não encontrou nenhuma URI correspondente."),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed", "O método especificado na requisição não é válido na URI. A resposta deve incluir um cabeçalho Allow com uma lista dos métodos aceitos."),
    REQUEST_TIMED_OUT(408, "Request Timed Out", "A requisição venceu"),
    GONE(410, "Gone", "O recurso solicitado está indisponível mas seu endereço atual não é conhecido."),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error", "O servidor não foi capaz de concluir a requisição devido a um erro inesperado."),
    BAD_GATEWAY(502, "Bad Gateway", "O servidor, enquanto agindo como proxy ou gateway, recebeu uma resposta inválida do servidor upstream a que fez uma requisição."),
    SERVICE_UNAVAILABLE(503, "Service Unavailable", "O servidor não é capaz de processar a requisição pois está temporariamente indisponível.");

    private final int codigo;
    private final String nome;
    private final String descricao;

    private Status(int codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return codigo + " " + nome;
    }

    @Override
    public String toString() {
        return codigo + " " + nome;
    }

}
