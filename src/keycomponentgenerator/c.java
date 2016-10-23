package keycomponentgenerator;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

final class c
  implements CaretListener
{
  c(MainJFrame paramMainJFrame) {}
  
  public final void caretUpdate(CaretEvent paramCaretEvent)
  {
    MainJFrame.a(this.a, paramCaretEvent);
  }
}

