package ec.espe.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class PropinaTest {

@Test
  void totalConPropina_calculaPropinaNormal() {
    //arrange
    double subtotal = 100.0;
    double porcentajePropina = 10.0;
    double esperado = 110.0;

    //act
    double obtenido = Propina.totalConPropina(subtotal, porcentajePropina);

    //assert
    assertEquals(esperado, obtenido, 0.000001);
  }

  //caso sin propina

  //propina la 100%

  //totalprpoina, con subtotal negativa 
  @Test
  void totalConPropina_subtotalNegativo_lanzaExcepcion() {
    assertThrows(IllegalArgumentException.class,
        () -> Propina.totalConPropina(-1.0, 10.0));
  }

  // TODO: Agregar al menos 2 pruebas adicionales:
  //  - porcentaje 0 devuelve subtotal
  //  - porcentaje 100 duplica subtotal
  //  - porcentaje fuera de rango lanza excepcion
}
