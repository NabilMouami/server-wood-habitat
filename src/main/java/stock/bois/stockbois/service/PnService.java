package stock.bois.stockbois.service;

import stock.bois.stockbois.dto.requestDto.PanneauRequest;
import stock.bois.stockbois.model.Panneau;

import java.util.List;

public interface PnService {
    public Panneau getPanneauBYId(Long id);
    public Panneau addBoisDur(PanneauRequest pnRequest);
    public List<Panneau> getPanneaux();
    public void deletePanneau(Panneau pn);
    public Panneau editPanneau(PanneauRequest pnRequest);
}

