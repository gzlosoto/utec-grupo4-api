package com.grupo4.api.controller;

import com.grupo4.api.model.Container;
import com.grupo4.api.service.ContainerCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/containers")
public class ContainerCommandController {

    private final ContainerCommandService service;

    @Autowired
    public ContainerCommandController(ContainerCommandService service) {
        this.service = service;
    }

    @GetMapping
    public List<Container> getAllContainers() {
        return service.getAllContainers();
    }

    @GetMapping("/{id}")
    public Optional<Container> getContainerById(@PathVariable String id) {
        return service.getContainerById(id);
    }

    @PostMapping
    public Container createContainer(@RequestBody Container container) {
        return service.createContainer(container);
    }

    @DeleteMapping("/{id}")
    public void deleteContainer(@PathVariable String id) {
        service.deleteContainer(id);
    }
}
