import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
