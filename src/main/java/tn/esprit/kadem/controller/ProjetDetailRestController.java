package tn.esprit.kadem.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kadem.entity.ProjetDetail;
import tn.esprit.kadem.service.ProjetDetailServiceImpl;
import java.util.List;

@Tag(name ="Product Management")
@RestController
@RequestMapping("/projet-detail")
public class ProjetDetailRestController {
    @Autowired
    ProjetDetailServiceImpl projetDetailService;

    // http://localhost:8081/SpringMVC/projet-detail/add-projet-detail
    @Operation(description ="pour ajouterr un projet")
    @PostMapping("/add-projet-detail")
    public ProjetDetail addProjetDetail(@RequestBody ProjetDetail p)
    {
        ProjetDetail projetDetail = projetDetailService.addProjetDetail(p);
        return projetDetail;
    }
    // http://localhost:8081/SpringMVC/projet-detail/remove-projet-detail/{projet-detail-id}
    @Operation(description ="pour supprimer un projet")
    @DeleteMapping("/remove-projet-detail/{projet-detail-id}")
    public void removeProjetDetail(@PathVariable("projet-detail-id") Long projetDetailId) {
        projetDetailService.removeProjetDetail(projetDetailId);

    }

    // http://localhost:8081/SpringMVC/projet-detail/modify-projet-detail
    @Operation(description ="pour modifier le detail d'un projet")
    @PutMapping("/modify-projet-detail")
    public ProjetDetail modifyProjetDetail(@RequestBody ProjetDetail p) {
        ProjetDetail projetDetail = projetDetailService.modifyProjetDetail(p);
        return projetDetail;
    }

    // http://localhost:8081/SpringMVC/projet-detail/retrieve-all-projetdetails
    @Operation(description ="pour Retrouver all products")
    @GetMapping("/retrieve-all-projetdetails")
    public List<ProjetDetail> getProjetDetails() {
        List< ProjetDetail > listProjetDetails = projetDetailService.retrieveAllProjetDetails();
        return listProjetDetails;
    }

    // http://localhost:8081/SpringMVC/projet-detail/retrieve-projet-detail/id
    @Operation(description ="Retrieve products par Id exacte")
    @GetMapping("/retrieve-projet-detail/{projet-detail-id}")
    public ProjetDetail retrieveProjetDetail(@PathVariable("projet-detail-id") Long projetDetailId) {
        ProjetDetail projetDetail = projetDetailService.retrieveProjetDetail(projetDetailId);
        return projetDetail;
    }
}
