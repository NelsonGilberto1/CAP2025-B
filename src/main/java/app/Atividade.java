package app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Atividade {
    private String descricao;

    public String getDetalhes();

    public abstract String getDetalhes();
}