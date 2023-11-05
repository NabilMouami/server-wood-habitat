package stock.bois.stockbois.controller.bonlivr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stock.bois.stockbois.dto.requestDto.LivrBoisDto;
import stock.bois.stockbois.model.LivrBois;
import stock.bois.stockbois.repository.BoisBlancRepository;
import stock.bois.stockbois.repository.BoisDurRepository;
import stock.bois.stockbois.repository.BonLivrRepository;
import stock.bois.stockbois.service.livraisonBois.BDBonLivrService;
import stock.bois.stockbois.service.livraisonBois.BLBonLivrService;

@RestController
@RequestMapping("/api/bon/boisblanc/livrbd")
public class BlvBLController {
    @Autowired
    BonLivrRepository BnRepository;
    BoisBlancRepository blRepository;
    BLBonLivrService bonlivrService;
    @PutMapping("/{id}")
    public ResponseEntity<LivrBois> AddBonLivr(@RequestBody LivrBoisDto Lv, @PathVariable Long id){
        LivrBois lvb = bonlivrService.addBonLivrBois(Lv,id);
        return ResponseEntity.ok(lvb);

    }
}
