package tn.esprit.kadem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kadem.entity.ProjetDetail;
import tn.esprit.kadem.repository.ProjetDetailRepository;
import java.util.List;

@Service
public class ProjetDetailServiceImpl {
    @Autowired
    ProjetDetailRepository projetDetailRepository;
    public ProjetDetail addProjetDetail(ProjetDetail p) {

        return projetDetailRepository.save(p);

    }

    public void removeProjetDetail(Long projetDetailId) {

        projetDetailRepository.deleteById(projetDetailId);

    }

    public ProjetDetail modifyProjetDetail(ProjetDetail projetDetail) {

        return projetDetailRepository.save(projetDetail);

    }

    public List<ProjetDetail> retrieveAllProjetDetails() {

        return projetDetailRepository.findAll();

    }

    public ProjetDetail retrieveProjetDetail(Long projetDetailId) {

        return projetDetailRepository.findById(projetDetailId).get();


    }
}
