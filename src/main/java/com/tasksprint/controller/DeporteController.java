package com.tasksprint.controller;

import com.tasksprint.dto.CareerDTO;
import com.tasksprint.dto.DeporteDTO;
import com.tasksprint.model.Career;
import com.tasksprint.model.Deporte;
import com.tasksprint.service.IDeporteService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/deporte")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class DeporteController {
    private final IDeporteService service;
    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<DeporteDTO>> finAll() throws Exception {
        List<DeporteDTO> list = service.findAll().stream().map(this::converToDto).toList();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeporteDTO> findById(@PathVariable("id") Integer id) throws Exception {
        DeporteDTO obj = converToDto(service.findById(id));
        return ResponseEntity.ok(obj);
    }

    @PostMapping
    public ResponseEntity<Void> save(@Valid @RequestBody DeporteDTO dto) throws Exception{
        Deporte obj =  service.save(convertToEntity(dto));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_deporte()).toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<DeporteDTO> update(@Valid @PathVariable("id") Integer id, @RequestBody DeporteDTO dto) throws Exception{
        Deporte obj = service.update(convertToEntity(dto), id);
        return ResponseEntity.ok(converToDto(obj));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete (@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


    private DeporteDTO converToDto(Deporte obj) { return modelMapper.map(obj, DeporteDTO.class);}
    private Deporte convertToEntity(DeporteDTO dto) { return modelMapper.map(dto, Deporte.class);}


}

