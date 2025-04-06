package expertostech_dio.live_lombock.model;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "PedidoItem")
public class PedidoItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id; 

    @ManyToOne (cascade=CascadeType.ALL)
    private ProdutoModel produto;

    private BigDecimal valor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }


    public BigDecimal getValor() {
        return valor;
    }

    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
   


}
