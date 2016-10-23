package keycomponentgenerator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

final class b
  extends MouseAdapter
{
  b(MainJFrame paramMainJFrame) {}
  
  public final void mouseClicked(MouseEvent paramMouseEvent)
  {
    MainJFrame.a(this.a, paramMouseEvent);
  }
}
