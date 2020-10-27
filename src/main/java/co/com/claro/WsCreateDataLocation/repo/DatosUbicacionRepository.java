package co.com.claro.WsCreateDataLocation.repo;

import co.com.claro.WsCreateDataLocation.entity.DatosUbicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DatosUbicacionRepository extends JpaRepository<DatosUbicacion, String>, JpaSpecificationExecutor<DatosUbicacion> {

    Optional<DatosUbicacion> findByNumeroIdentificacionAndTipoIdentificacion(String numeroIdentificacion, String tipoIdentificacion);

}