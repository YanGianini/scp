package br.edu.universidadedevassouras.SCP.service;

import br.edu.universidadedevassouras.SCP.Model.Presenca;
import br.edu.universidadedevassouras.SCP.Model.PresencaDTO;
import br.edu.universidadedevassouras.SCP.Repository.PessoaDAO;
import br.edu.universidadedevassouras.SCP.Repository.PresencaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresencaService {
    @Autowired
    private PessoaDAO pessoaDAO;
    @Autowired
    private PresencaDAO presencaDAO;

    public Presenca save (PresencaDTO presencaDTO){
        Presenca presenca = new Presenca();
        presenca.setData(presencaDTO.getData());
        presenca.setSituacao(presencaDTO.getSituacao());
        if(pessoaDAO.findById(presencaDTO.getPessoaidPessoa()).isPresent()){
            presenca.setPessoaidPessoa(pessoaDAO.findById(presencaDTO.getPessoaidPessoa()).get());
        }
        presencaDAO.save(presenca);
        return presenca;
    }
}
