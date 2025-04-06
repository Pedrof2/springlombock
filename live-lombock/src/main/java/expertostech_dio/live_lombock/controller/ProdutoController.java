package expertostech_dio.live_lombock.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import expertostech_dio.live_lombock.model.ProdutoModel;
import expertostech_dio.live_lombock.repository.ProdutoRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/produto")
@AllArgsConstructor

public class ProdutoController {

 private final ProdutoRepository repository;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<ProdutoModel>> ListarTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar") 
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto){
        return ResponseEntity.ok(repository.save(produto));
    }
}
