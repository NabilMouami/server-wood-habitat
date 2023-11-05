package stock.bois.stockbois.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stock.bois.stockbois.dto.requestDto.BoisDurRequest;
import stock.bois.stockbois.model.BoisDur;
import stock.bois.stockbois.repository.BoisDurRepository;

import java.util.List;
@Service

public class BdServiceImp implements BdSerice{
    @Autowired
    BoisDurRepository bdRepository;
    @Override
    public BoisDur getBoisDurById(Long id) {
        return bdRepository.findById(id).orElse(null);
    }

    @Override
    public BoisDur addBoisDur(BoisDurRequest bdRequest) {
        BoisDur boisdur = new BoisDur();
        boisdur.setMarque(bdRequest.getMarque());
        boisdur.setFornisseur(bdRequest.getFornisseur());
        boisdur.setN_fardou(bdRequest.getN_fardou());
        boisdur.setPieces(bdRequest.getPieces());
        boisdur.setLongueur(bdRequest.getLongueur());
        boisdur.setLarg(bdRequest.getLarg());
        boisdur.setEpaisseur(bdRequest.getEpaisseur());
        boisdur.setVolume(bdRequest.getVolume());
        boisdur.setPrix_unity(bdRequest.getPrix_unity());
        boisdur.setDate_creation(bdRequest.getDate_creation());
        return bdRepository.save(boisdur);
    }

    @Override
    public List<BoisDur> getBoisDurs() {
        return bdRepository.findAll();
    }

    @Override
    public void deleteBoisDur(BoisDur bd) {
       bdRepository.delete(bd);
    }

    @Override
    public BoisDur editBoisDur(BoisDurRequest bdRequest) {
        BoisDur boisdur = new BoisDur();
        boisdur.setMarque(bdRequest.getMarque());
        boisdur.setFornisseur(bdRequest.getFornisseur());
        boisdur.setN_fardou(bdRequest.getN_fardou());
        boisdur.setPieces(bdRequest.getPieces());
        boisdur.setLongueur(bdRequest.getLongueur());
        boisdur.setLarg(bdRequest.getLarg());
        boisdur.setEpaisseur(bdRequest.getEpaisseur());
        boisdur.setVolume(bdRequest.getVolume());
        boisdur.setPrix_unity(bdRequest.getPrix_unity());
        boisdur.setDate_creation(bdRequest.getDate_creation());
        return bdRepository.save(boisdur);
    }
}
