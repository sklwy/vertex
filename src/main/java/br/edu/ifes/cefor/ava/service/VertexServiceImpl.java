package br.edu.ifes.cefor.ava.service;

import br.edu.ifes.cefor.ava.domain.Vertex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VertexServiceImpl implements VertexService {

    @Override
    public List<Vertex> generateVertex(File file) throws IOException {
        List<Vertex> values = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();

            while (line != null) {
                line = bufferedReader.readLine();
                if (Objects.nonNull(line)) {
                    String[] parts = line.split(" ");
                    Vertex vertex = new Vertex(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
                    values.add(vertex);
                }
            }
        }
        return values;
    }
}
