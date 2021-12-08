package br.edu.ifes.cefor.ava;

import br.edu.ifes.cefor.ava.domain.Vertex;
import br.edu.ifes.cefor.ava.service.VertexServiceImpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Logger;

public class VertexApplication {

    private static final Logger LOGGER = Logger.getLogger(VertexApplication.class.getName());

    public static void main(String[] args) throws IOException {

        Path path = Path.of("/home/tiago/Desktop/Repository/vertex/src/main/resources/324.txt");
        File file = new File(String.valueOf(path));

        VertexServiceImpl service = new VertexServiceImpl();
        List<Vertex> vertices = service.generateVertex(file);

        vertices.forEach(vertex -> {
            LOGGER.info(vertex.toString());
        });
    }
}
