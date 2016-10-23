java.awt.Toolkit
javax.swing.JLabel
javax.swing.text.AttributeSet
javax.swing.text.Document
javax.swing.text.DocumentFilter
javax.swing.text.DocumentFilter.FilterBypass

a
  

  a {}
  
  replace, , , , 
  
     = getDocument()getText0, getDocument()getLength()
     = 
     (getDocument()getLength()length()<=48matchesa()
    
      replace, , , , 
      
    
    aa).setText("Key (only 0-9 and A-F allowed)");
    Toolkit.getDefaultToolkit().beep();
  }
  
  public final void insertString(DocumentFilter.FilterBypass paramFilterBypass, int paramInt, String paramString, AttributeSet paramAttributeSet)
  {
    String str = paramFilterBypass.getDocument().getText(0, paramFilterBypass.getDocument().getLength());
    str = str + paramString;
    if ((paramFilterBypass.getDocument().getLength() + paramString.length() <= 48) && (str.matches(MainJFrame.a())))
    {
      super.insertString(paramFilterBypass, paramInt, paramString, paramAttributeSet);
      return;
    }
    Toolkit.getDefaultToolkit().beep();
  }
}
