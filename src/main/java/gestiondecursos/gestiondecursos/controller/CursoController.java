package gestiondecursos.gestiondecursos.controller;


import gestiondecursos.gestiondecursos.entity.Curso;
import gestiondecursos.gestiondecursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;
    @GetMapping
    private String home(){
        return "redirect:/cursos";
    }
    @GetMapping("/cursos")
    public String listarCursos(Model model){
        List<Curso> cursos = cursoRepository.findAll();
        cursos=cursoRepository.findAll();
        model.addAttribute("cursos",cursos);
        return "cursos";
    }
}
