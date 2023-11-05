package stock.bois.stockbois.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.bois.stockbois.dto.requestDto.PanneauRequest;
import stock.bois.stockbois.model.Panneau;
import stock.bois.stockbois.repository.PanneauRepository;

import java.util.List;
@Service

public class PnServiceImp implements PnService {
    @Autowired
    PanneauRepository pnRepository;
    @Override
    public Panneau getPanneauBYId(Long id) {
        return pnRepository.findById(id).orElse(null);
    }

    @Override
    public Panneau addBoisDur(PanneauRequest pnRequest) {
        return null;
    }

    @Override
    public List<Panneau> getPanneaux() {
        return null;
    }

    @Override
    public void deletePanneau(Panneau pn) {

    }

    @Override
    public Panneau editPanneau(PanneauRequest pnRequest) {
        return null;
    }
}
