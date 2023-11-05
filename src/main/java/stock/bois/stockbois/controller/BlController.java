package stock.bois.stockbois.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stock.bois.stockbois.dto.requestDto.BoisBlancRequest;
import stock.bois.stockbois.model.BoisBlanc;
import stock.bois.stockbois.repository.BoisBlancRepository;
import stock.bois.stockbois.service.BlService;

import java.util.List;

@RestController
@RequestMapping("/api/boisblancs")

public class BlController {
    @Autowired
    BlService blService;
    BoisBlancRepository blRepository;
    @PostMapping("")
    public ResponseEntity<BoisBlanc> addBois(
            @RequestBody final BoisBlancRequest blRequestDto) {
        BoisBlanc blResponseDto = blService.addBoisBlanc(blRequestDto);
        return new ResponseEntity<>(blResponseDto, HttpStatus.OK);
    }
    @GetMapping("")
    public ResponseEntity<List<BoisBlanc>> getBois() {
        List<BoisBlanc> bdResponseDto = blService.getBoisBlancs();
        return new ResponseEntity<>(bdResponseDto, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<BoisBlanc> updateVoisDur(@RequestBody BoisBlancRequest blRequest,@PathVariable Long id){
        BoisBlanc bdl = blService.getBoisBlancById(id);
        if (bdl == null){
            return ResponseEntity.notFound().build();
        }
        else{
            BoisBlancRequest boisdur = new BoisBlancRequest();
            boisdur.setMarque(blRequest.getMarque());
            boisdur.setFornisseur(blRequest.getFornisseur());
            boisdur.setN_fardou(blRequest.getN_fardou());
            boisdur.setPieces(blRequest.getPieces());
            boisdur.setLongueur(blRequest.getLongueur());
            boisdur.setLarg(blRequest.getLarg());
            boisdur.setEpaisseur(blRequest.getEpaisseur());
            boisdur.setVolume(blRequest.getVolume());
            boisdur.setPrix_unity(blRequest.getPrix_unity());
            boisdur.setDate_creation(blRequest.getDate_creation());
            BoisBlanc updatedBois = blService.editBoisBlanc(boisdur);
            return ResponseEntity.ok(updatedBois);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<BoisBlanc> deleteBois(@PathVariable Long id){

        BoisBlanc bdl = blService.getBoisBlancById(id);
        if (bdl == null)
            return ResponseEntity.notFound().build();
        blService.deleteBoisBlanc(bdl);
        return ResponseEntity.ok().build();

    }
}
