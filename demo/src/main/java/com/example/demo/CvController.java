package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv")
public class CvController {

    @Autowired
    private ExperienciaRepository experienciaRepository;

    @Autowired
    private EducacaoRepository educacaoRepository;

    @Autowired
    private ResumoRepository resumoRepository;

    @GetMapping("/experiencias")
    public List<Experiencia> getExperiencias() {
        return experienciaRepository.findAll();
    }

    @GetMapping("/educacao")
    public List<Educacao> getEducacao() {
        return educacaoRepository.findAll();
    }

    @GetMapping("/resumo")
    public Resumo getResumo() {
        List<Resumo> resumos = resumoRepository.findAll();
        if (!resumos.isEmpty()) {
            return resumos.get(0); 
        } else {
            return null; 
        }
    }

    @PostMapping("/experiencias")
    public String addExperiencia(@RequestBody Experiencia experiencia) {
        experienciaRepository.save(experiencia);
        return "Experiência adicionada com sucesso";
    }

    @PostMapping("/educacao")
    public String addEducacao(@RequestBody Educacao educacao) {
        educacaoRepository.save(educacao);
        return "Educação adicionada com sucesso";
    }

    @PostMapping("/resumo")
    public String addResumo(@RequestBody Resumo resumo) {
        resumoRepository.save(resumo);
        return "Resumo adicionado com sucesso";
    }
}
