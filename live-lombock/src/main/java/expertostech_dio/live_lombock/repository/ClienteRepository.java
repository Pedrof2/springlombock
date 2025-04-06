package expertostech_dio.live_lombock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import expertostech_dio.live_lombock.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long>{

}
