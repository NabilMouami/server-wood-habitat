package stock.bois.stockbois.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.bois.stockbois.dto.requestDto.BoisBlancRequest;
import stock.bois.stockbois.model.BoisBlanc;
import stock.bois.stockbois.repository.BoisBlancRepository;

import java.util.List;
@Service

public class BlServiceImp implements BlService {
    @Autowired
    BoisBlancRepository blRepository;
    @Override
    public BoisBlanc getBoisBlancById(Long id) {
        return blRepository.findById(id).orElse(null);
    }

    @Override
    public BoisBlanc addBoisBlanc(BoisBlancRequest blRequest) {
        BoisBlanc boisblanc = new BoisBlanc();
        boisblanc.setMarque(blRequest.getMarque());
        boisblanc.setFornisseur(blRequest.getFornisseur());
        boisblanc.setN_fardou(blRequest.getN_fardou());
        boisblanc.setPieces(blRequest.getPieces());
        boisblanc.setLongueur(blRequest.getLongueur());
        boisblanc.setLarg(blRequest.getLarg());
        boisblanc.setEpaisseur(blRequest.getEpaisseur());
        boisblanc.setVolume(blRequest.getVolume());
        boisblanc.setPrix_unity(blRequest.getPrix_unity());
        boisblanc.setDate_creation(blRequest.getDate_creation());
        return blRepository.save(boisblanc);
    }

    @Override
    public List<BoisBlanc> getBoisBlancs() {
        return blRepository.findAll();
    }

    @Override
    public void deleteBoisBlanc(BoisBlanc bl) {
       blRepository.delete(bl);
    }

    @Override
    public BoisBlanc editBoisBlanc(BoisBlancRequest blRequest) {
        BoisBlanc boisblanc = new BoisBlanc();
        boisblanc.setMarque(blRequest.getMarque());
        boisblanc.setFornisseur(blRequest.getFornisseur());
        boisblanc.setN_fardou(blRequest.getN_fardou());
        boisblanc.setPieces(blRequest.getPieces());
        boisblanc.setLongueur(blRequest.getLongueur());
        boisblanc.setLarg(blRequest.getLarg());
        boisblanc.setEpaisseur(blRequest.getEpaisseur());
        boisblanc.setVolume(blRequest.getVolume());
        boisblanc.setPrix_unity(blRequest.getPrix_unity());
        boisblanc.setDate_creation(blRequest.getDate_creation());
        return blRepository.save(boisblanc);
    }
}
