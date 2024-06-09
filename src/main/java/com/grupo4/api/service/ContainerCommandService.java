package com.grupo4.api.service;

import com.grupo4.api.model.Container;
import com.grupo4.api.repository.MockContainerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContainerCommandService {

    private final MockContainerRepository repository;

    public ContainerCommandService(MockContainerRepository repository) {
        this.repository = repository;
    }

    public List<Container> getAllContainers() {
        return repository.findAll();
    }

    public Optional<Container> getContainerById(String id) {
        return repository.findById(id);
    }

    public Container createContainer(Container container) {
        return repository.save(container);
    }

    public void deleteContainer(String id) {
        repository.deleteById(id);
    }
}
