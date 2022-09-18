package br.edu.universidadedevassouras.SCP.Model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class PessoaDTO {
    private String Nome;
    private String CPF;
    private Integer Matricula;
    private Date Nascimento;
    private String Genero;
    private String Usuario;
    private String Senha;

}
