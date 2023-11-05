package stock.bois.stockbois.service;
import stock.bois.stockbois.dto.requestDto.ClientRequest;
import stock.bois.stockbois.model.Client;

import java.util.List;

public interface ClientService {
    public Client getClientById(Long id);
    public Client addClient(ClientRequest clientRequest);
    public List<Client> getClients();
    public void deleteClient(Client client);
    public Client editClient(ClientRequest clientRequestDto);


}
