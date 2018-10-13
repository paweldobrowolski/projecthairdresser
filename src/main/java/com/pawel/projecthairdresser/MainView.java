package com.pawel.projecthairdresser;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.router.Route;


@Route
public class MainView extends VerticalLayout {

    private final ClientRepository clientRepository;
    final Grid<Client> clientGrid;

    public MainView(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
        this.clientGrid = new Grid<>(Client.class);
        add(clientGrid);
        listClients();
    }

    private void listClients(){
       // clientGrid.setItems(clientRepository.findAll());
    }
}
