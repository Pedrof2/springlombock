package expertostech_dio.live_lombock.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import expertostech_dio.live_lombock.model.ClienteModel;
import expertostech_dio.live_lombock.repository.ClienteRepository;



@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<ClienteModel>> ListarTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar") 
    public ResponseEntity<ClienteModel> salvar(@RequestBody ClienteModel Cliente){
        return ResponseEntity.ok(repository.save(Cliente));
    }

    
}
