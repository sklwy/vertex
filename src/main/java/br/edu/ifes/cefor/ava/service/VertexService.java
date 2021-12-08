package br.edu.ifes.cefor.ava.service;

import br.edu.ifes.cefor.ava.domain.Vertex;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface VertexService {
    List<Vertex> generateVertex(File file) throws IOException;
}
