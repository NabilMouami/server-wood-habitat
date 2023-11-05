package stock.bois.stockbois.service;

import stock.bois.stockbois.dto.requestDto.BoisDurRequest;
import stock.bois.stockbois.model.BoisDur;

import java.util.List;

public interface BdSerice {
    public BoisDur getBoisDurById(Long id);
    public BoisDur addBoisDur(BoisDurRequest bdRequest);
    public List<BoisDur> getBoisDurs();
    public void deleteBoisDur(BoisDur bd);
    public BoisDur editBoisDur(BoisDurRequest bdRequestDto);
}
