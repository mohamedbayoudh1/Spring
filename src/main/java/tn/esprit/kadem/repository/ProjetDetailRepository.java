package tn.esprit.kadem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.kadem.entity.ProjetDetail;
import java.util.List;


@Repository//2




public interface ProjetDetailRepository extends JpaRepository<ProjetDetail, Long > //1
{




   // List<ProjetDetail> findByTechnologieIsNotNull();






}
