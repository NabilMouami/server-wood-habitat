package stock.bois.stockbois.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stock.bois.stockbois.dto.requestDto.BoisDurRequest;
import stock.bois.stockbois.dto.requestDto.ClientRequest;
import stock.bois.stockbois.model.BoisDur;
import stock.bois.stockbois.model.Client;
import stock.bois.stockbois.repository.BoisDurRepository;
import stock.bois.stockbois.service.BdSerice;

import java.util.List;

@RestController
@RequestMapping("/api/boisdurs")

public class BdController {
    @Autowired
    BdSerice bdSerice;
    BoisDurRepository bdRepository;
    @PostMapping("")
    public ResponseEntity<BoisDur> addBois(
            @RequestBody final BoisDurRequest bdRequestDto) {
        BoisDur bdResponseDto = bdSerice.addBoisDur(bdRequestDto);
        return new ResponseEntity<>(bdResponseDto, HttpStatus.OK);
    }
    @GetMapping("")
    public ResponseEntity<List<BoisDur>> getBois() {
        List<BoisDur> bdResponseDto = bdSerice.getBoisDurs();
        return new ResponseEntity<>(bdResponseDto, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<BoisDur> updateVoisDur(@RequestBody BoisDurRequest bdRequest,@PathVariable Long id){
        BoisDur bdr = bdSerice.getBoisDurById(id);
        if (bdr == null){
            return ResponseEntity.notFound().build();
        }
        else{
            BoisDurRequest boisdur = new BoisDurRequest();
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
            BoisDur updatedBois = bdSerice.editBoisDur(boisdur);
            return ResponseEntity.ok(updatedBois);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<BoisDur> deleteBois(@PathVariable Long id){

        BoisDur bdr = bdSerice.getBoisDurById(id);
        if (bdr == null)
            return ResponseEntity.notFound().build();
        bdSerice.deleteBoisDur(bdr);
        return ResponseEntity.ok().build();

    }

}
