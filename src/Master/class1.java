package Master;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(amazoin.class)
public class class1 {
	@Parameters("give")
  @Test
  public void f(String give) {
  
  }
}
