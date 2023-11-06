package test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Geometria.dto.Geometria;

public class GeometriaTest {
    private Geometria gm;  

    @BeforeEach
    public void setUp() {
        gm = new Geometria();
    }

    @Test
    public void testConstructorConId() {
        int id = 5;
        gm.setId(id);

        assertEquals(id, gm.getId());
        assertEquals("Pentagono", gm.getNom());
    }

    @Test
    public void testConstructorPorDefecto() {
        assertEquals(9, gm.getId());
        assertEquals("Default", gm.getNom());
    }

    @Test
    public void testAreaQuadrado() {
        int resultado = Geometria.areacuadrado(2);
        int esperado = 4;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testAreaCirculo() {
        double resultado = Geometria.areaCirculo(2);
        double esperado = 12.5664;
        double delta = 0.001;
        assertEquals(esperado, resultado, delta);
    }

    @Test
    public void testAreaTriangulo() {
        double resultado = Geometria.areatriangulo(2, 4);
        double esperado = 4;
        double delta = 0.001;
        assertEquals(esperado, resultado, delta);
    }

    @Test
    public void testSetNom() {
        gm.setNom("Triángulo");
        assertEquals("Triángulo", gm.getNom());
    }

    @Test
    public void testGetArea() {
        gm.setArea(15.5);
        assertEquals(15.5, gm.getArea(), 0.001);
    }

    @Test
    public void testSetArea() {
        gm.setArea(25.7);
        assertEquals(25.7, gm.getArea(), 0.001);
    }

    @Test
    void testToString() {
        gm.setArea(6.66);
        gm.setNom("Cuadrado");
        gm.setId(5);
        String esperado = "Geometria [id=5, nom=Cuadrado, area=6.66]";
        assertEquals(esperado, gm.toString());
    }
}
