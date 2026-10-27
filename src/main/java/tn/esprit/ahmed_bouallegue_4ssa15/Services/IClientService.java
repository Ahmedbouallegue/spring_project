package tn.esprit.ahmed_bouallegue_4ssa15.Services;

import tn.esprit.ahmed_bouallegue_4ssa15.domain.Client;

import java.util.List;

public interface IClientService {
    Client createClient(Client client);

    Client getClientById(Long id);

    Client updateClient(Client client);

    void deleteClient(Long id);

    List<Client> getAllClients();
}
