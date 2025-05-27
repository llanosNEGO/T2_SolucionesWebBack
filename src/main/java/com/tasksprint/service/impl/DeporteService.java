package com.tasksprint.service.impl;

import com.tasksprint.model.Deporte;
import com.tasksprint.repo.IDeporteRepo;
import com.tasksprint.repo.IGenericRepo;
import com.tasksprint.service.IDeporteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeporteService extends GenericService<Deporte, Integer> implements IDeporteService {
    private final IDeporteRepo repo;
    @Override
    protected IGenericRepo<Deporte, Integer> getRepo() { return repo;}
}

