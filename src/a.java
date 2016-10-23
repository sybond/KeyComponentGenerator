import java.io.PrintStream;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
{
  private static final String c = new String(b.b(new byte[] { -4, -45, -124, 87, 92, 89, 68, 15, 65, -35, -2, -76, -13, -16, -108, -47, -79, -127, -82, -123 }));
  private static char[] a = "0123456789ABCDEF".toCharArray();
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject = new byte[24];
      switch (paramArrayOfByte.length)
      {
      case 8: 
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, 8);
        System.arraycopy(paramArrayOfByte, 0, localObject, 8, 8);
        System.arraycopy(paramArrayOfByte, 0, localObject, 16, 8);
        break;
      case 16: 
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, 16);
        System.arraycopy(paramArrayOfByte, 0, localObject, 16, 8);
        break;
      case 24: 
        System.arraycopy(paramArrayOfByte, 0, localObject, 0, 24);
      }
      paramArrayOfByte = Cipher.getInstance(c);
      localObject = new SecretKeySpec((byte[])localObject, c.substring(0, 6));
      paramArrayOfByte.init(1, (Key)localObject);
      localObject = new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      return paramArrayOfByte.doFinal((byte[])localObject);
    }
    catch (Exception localException)
    {
      System.out.println(localException.getMessage());
    }
    return null;
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length << 1];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      arrayOfChar[(i << 1)] = a[(j >>> 4)];
      arrayOfChar[((i << 1) + 1)] = a[(j & 0xF)];
    }
    return new String(arrayOfChar);
  }
  
  public static byte[] a(String paramString)
  {
    int i;
    byte[] arrayOfByte = new byte[(i = paramString.length()) / 2];
    for (int j = 0; j < i; j += 2) {
      arrayOfByte[(j / 2)] = ((byte)((Character.digit(paramString.charAt(j), 16) << 4) + Character.digit(paramString.charAt(j + 1), 16)));
    }
    return arrayOfByte;
  }
  
  private static byte[] a(byte paramByte)
  {
    byte[] arrayOfByte = new byte[2];
    Random localRandom = new Random();
    arrayOfByte[0] = ((byte)localRandom.nextInt(256));
    int i;
    if ((((i = (i = (i = (i = (i = arrayOfByte[0]) & 0xFF) ^ i >> 4) ^ i >> 2) ^ i >> 1) & 0x1) != 0 ? 1 : 0) == 0)
    {
      int tmp67_66 = 0;
      byte[] tmp67_65 = arrayOfByte;
      tmp67_65[tmp67_66] = ((byte)(tmp67_65[tmp67_66] ^ 0x1));
    }
    arrayOfByte[1] = ((byte)(paramByte ^ arrayOfByte[0]));
    return arrayOfByte;
  }
  
  public static byte[][] a(byte[] paramArrayOfByte, int paramInt)
  {
    byte[][] arrayOfByte = new byte[paramArrayOfByte.length][paramInt];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramInt;
      byte b = paramArrayOfByte[i];
      if (j < 2) {
        j = 2;
      }
      byte[] arrayOfByte2 = new byte[j];
      byte[] arrayOfByte1 = a(b);
      int k = 0;
      arrayOfByte2[k] = arrayOfByte1[0];
      arrayOfByte2[(k + 1)] = arrayOfByte1[1];
      arrayOfByte1 = a(arrayOfByte1[1]);
      arrayOfByte[i] = arrayOfByte2;
    }
    return arrayOfByte;
  }
}


/* Location:           Z:\home\sybond\Projects\KeyComponentGenerator\dist\KeyComponentGenerator_stable.jar
 * Qualified Name:     a
 * JD-Core Version:    0.7.0.1
 */