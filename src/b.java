import java.util.Random;

public final class b
{
  public static byte[] b(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    Random localRandom = new Random(200883L);
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte[i] = ((byte)(paramArrayOfByte[i] ^ localRandom.nextInt(256)));
    }
    return arrayOfByte;
  }
}
