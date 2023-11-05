package stock.bois.stockbois.service;

import stock.bois.stockbois.dto.requestDto.BoisBlancRequest;
import stock.bois.stockbois.model.BoisBlanc;

import java.util.List;

public interface BlService {
    public BoisBlanc getBoisBlancById(Long id);
    public BoisBlanc addBoisBlanc(BoisBlancRequest blRequest);
    public List<BoisBlanc> getBoisBlancs();
    public void deleteBoisBlanc(BoisBlanc bl);
    public BoisBlanc editBoisBlanc(BoisBlancRequest blRequestDto);
}
