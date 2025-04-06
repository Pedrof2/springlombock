package expertostech_dio.live_lombock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import expertostech_dio.live_lombock.model.PedidoModel;

public interface PedidoRepository extends JpaRepository<PedidoModel, String> {

}
