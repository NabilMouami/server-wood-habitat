package stock.bois.stockbois.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import stock.bois.stockbois.dto.requestDto.ClientRequest;
import stock.bois.stockbois.repository.ClientRepository;
import stock.bois.stockbois.service.ClientService;
import stock.bois.stockbois.model.Client;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clients")

public class ClientController {
    @Autowired

    ClientService clientService;
    ClientRepository clientRepository;




    @PostMapping("")
    public ResponseEntity<Client> addClient(
            @RequestBody final ClientRequest authorRequestDto) {
        Client authorResponseDto = clientService.addClient(authorRequestDto);
        return new ResponseEntity<>(authorResponseDto, HttpStatus.OK);
    }
    @GetMapping("")
    public ResponseEntity<List<Client>> getClients() {
        List<Client> authorResponseDto = clientService.getClients();
        return new ResponseEntity<>(authorResponseDto, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Client> updateUser(@RequestBody ClientRequest client,@PathVariable Long id){
        Client cli = clientService.getClientById(id);
        if (cli == null){
            return ResponseEntity.notFound().build();
        }
        else{
            ClientRequest cl = new ClientRequest();
            cl.setFullname(client.getFullname());
            cl.setPhone(client.getPhone());
            cl.setAdresse(client.getAdresse());
            cl.setVille(client.getVille());
            cl.setCne(client.getCne());
            Client updatedUser = clientService.editClient(cl);
            return ResponseEntity.ok(updatedUser);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Client> deleteClient(@PathVariable Long id){

        Client client = clientService.getClientById(id);
        if (client == null)
            return ResponseEntity.notFound().build();
        clientService.deleteClient(client);
        return ResponseEntity.ok().build();

    }

}
