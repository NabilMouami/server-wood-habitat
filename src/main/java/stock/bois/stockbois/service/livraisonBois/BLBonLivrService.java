package stock.bois.stockbois.service.livraisonBois;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.bois.stockbois.dto.requestDto.LivrBoisDto;
import stock.bois.stockbois.model.BoisBlanc;
import stock.bois.stockbois.model.LivrBois;
import stock.bois.stockbois.repository.BoisBlancRepository;
import stock.bois.stockbois.repository.BonLivrRepository;

@Service

public class BLBonLivrService {
    @Autowired
    BonLivrRepository BnRepository;
    BoisBlancRepository blRepository;
    public LivrBois addBonLivrBois(LivrBoisDto bonlivrReq, Long id){
        LivrBois bon = new LivrBois();
        BoisBlanc bd = blRepository.findById(id).orElse(null);
        bd.setPieces(bonlivrReq.getPieces());
        blRepository.save(bd);
        bon.setType(bonlivrReq.getType());
        bon.setMarque(bonlivrReq.getMarque());
        bon.setPrix_unity(bonlivrReq.getPrix_unity());
        bon.setQte(bonlivrReq.getQte());
        bon.setPrix_total(bonlivrReq.getPrix_total());
        bon.setLongueur(bonlivrReq.getLongueur());
        bon.setQuantity(bonlivrReq.getQuantity());
        bon.setNum_bon(bonlivrReq.getNum_bon());
        bon.setRemise(bonlivrReq.getRemise());
        return  BnRepository.save(bon);

    }
}
