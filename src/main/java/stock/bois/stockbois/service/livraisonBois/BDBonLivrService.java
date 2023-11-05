package stock.bois.stockbois.service.livraisonBois;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.bois.stockbois.dto.requestDto.LivrBoisDto;
import stock.bois.stockbois.model.BoisDur;
import stock.bois.stockbois.model.LivrBois;
import stock.bois.stockbois.repository.BoisDurRepository;
import stock.bois.stockbois.repository.BonLivrRepository;

import java.util.List;
@Service

public class BDBonLivrService {
    @Autowired
    BonLivrRepository BnRepository;
    BoisDurRepository bdRepository;


    public LivrBois addBonLivrBois(LivrBoisDto bonlivrReq, Long id){
        LivrBois bon = new LivrBois();
        BoisDur bd = bdRepository.findById(id).orElse(null);
        bd.setPieces(bonlivrReq.getPieces());
        bdRepository.save(bd);
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
