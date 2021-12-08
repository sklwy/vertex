package br.edu.ifes.cefor.ava.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Vertex {

    private int vertexX;
    private int vertexY;

    public Vertex(int vertexX, int vertexY) {
        this.vertexX = vertexX;
        this.vertexY = vertexY;
    }

    public int getVertexX() {
        return vertexX;
    }

    public void setVertexX(int vertexX) {
        this.vertexX = vertexX;
    }

    public int getVertexY() {
        return vertexY;
    }

    public void setVertexY(int vertexY) {
        this.vertexY = vertexY;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder
                .toString(this, ToStringStyle.JSON_STYLE, true, true);
    }
}
