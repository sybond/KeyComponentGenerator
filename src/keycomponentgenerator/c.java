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


/* Location:           Z:\home\sybond\Projects\KeyComponentGenerator\dist\KeyComponentGenerator_stable.jar
 * Qualified Name:     keycomponentgenerator.c
 * JD-Core Version:    0.7.0.1
 */