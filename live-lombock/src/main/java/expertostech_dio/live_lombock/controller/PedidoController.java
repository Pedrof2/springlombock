package expertostech_dio.live_lombock.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import expertostech_dio.live_lombock.model.PedidoModel;
import expertostech_dio.live_lombock.repository.PedidoRepository;
import lombok.AllArgsConstructor;



@RestController
@RequestMapping("api/pedido")
@AllArgsConstructor
public class PedidoController {

    private final PedidoRepository repository;

 

     @GetMapping("/listarTodos")
    public ResponseEntity<List<PedidoModel>> ListarTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/salvar") 
    public ResponseEntity<PedidoModel> salvar(@RequestBody PedidoModel pedido){

        if(pedido.getId() == null || pedido.getId().isEmpty()){
            pedido.setId(UUID.randomUUID().toString());
        }
        
        return ResponseEntity.ok(repository.save(pedido));
    }
}
