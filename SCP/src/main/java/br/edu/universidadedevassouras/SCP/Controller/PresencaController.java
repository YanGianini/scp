package br.edu.universidadedevassouras.SCP.Controller;

import br.edu.universidadedevassouras.SCP.Model.Presenca;
import br.edu.universidadedevassouras.SCP.Repository.PresencaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/presenca")
public class PresencaController {
    @Autowired
    private PresencaDAO presencaDAO;

    @GetMapping
    public @ResponseBody Iterable<Presenca> getAll() {return presencaDAO.findAll(); }

    @GetMapping(path = "/presenca/{id}")
    public @ResponseBody Optional<Presenca> getPresenca(@PathVariable("id")Long id){
        return presencaDAO.findById(id);
    }

    @PostMapping
    public Presenca postPresenca(@RequestBody Presenca p){
        return presencaDAO.save(p);
    }

}
