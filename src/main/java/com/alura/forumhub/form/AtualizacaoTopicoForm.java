package com.alura.forumhub.form;

import jakarta.validation.constraints.NotBlank;

public class AtualizacaoTopicoForm {
    @NotBlank
    private String titulo;

    @NotBlank
    private String mensagem;

    public String getTitulo() { return titulo; }
    public String getMensagem() { return mensagem; }
}
