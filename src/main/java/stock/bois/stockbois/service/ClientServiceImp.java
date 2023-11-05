package stock.bois.stockbois.service;
import stock.bois.stockbois.dto.requestDto.ClientRequest;
import stock.bois.stockbois.model.Client;
import stock.bois.stockbois.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.*;

import java.util.List;
import java.util.Optional;

@Service

public class ClientServiceImp implements ClientService {
    @Autowired

    ClientRepository clientRepository;

    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client addClient(ClientRequest clientRequest) {
        Client cl = new Client();
         cl.setFullname(clientRequest.getFullname());
         cl.setPhone(clientRequest.getPhone());
         cl.setAdresse(clientRequest.getAdresse());
         cl.setVille(clientRequest.getVille());
         cl.setCne(clientRequest.getCne());
        return clientRepository.save(cl);
    }

    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

    @Override
    public Client editClient(ClientRequest clientRequest) {
        Client cl = new Client();
        cl.setFullname(clientRequest.getFullname());
        cl.setPhone(clientRequest.getPhone());
        cl.setAdresse(clientRequest.getAdresse());
        cl.setVille(clientRequest.getVille());
        cl.setCne(clientRequest.getCne());
        return clientRepository.save(cl);
    }
}
