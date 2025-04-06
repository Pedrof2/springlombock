package expertostech_dio.live_lombock.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name  = "pedido")
@Getter
@Setter
@ToString
public class PedidoModel {

    @Id
    private String id;

    @ManyToOne (cascade=CascadeType.ALL)
    private ClienteModel cliente; //quem comprou? varios pedidos para um cliente

    @OneToMany (cascade=CascadeType.ALL)
    private List<PedidoItemModel> itens; //o que comprou, um pedido pode ter muitos itens

}
