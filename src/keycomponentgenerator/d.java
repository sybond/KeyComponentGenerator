package keycomponentgenerator;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

final class d
  extends MouseAdapter
{
  d(MainJFrame paramMainJFrame) {}
  
  public final void mouseReleased(MouseEvent paramMouseEvent)
  {
    MainJFrame.b(this.a, paramMouseEvent);
  }
}

