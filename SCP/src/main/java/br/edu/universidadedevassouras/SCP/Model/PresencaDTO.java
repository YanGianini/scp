package br.edu.universidadedevassouras.SCP.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
public class PresencaDTO {
    private Date Data;
    private Boolean Situacao;
    private Long pessoaidPessoa;
}
