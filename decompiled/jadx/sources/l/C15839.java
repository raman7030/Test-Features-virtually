package l;

import com.alipay.sdk.m.w.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܺۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9U4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15839 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f48945 = C11321.m27962(C15839.class.getName());

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48944 = new byte[0];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48943 = {0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f48942 = Charset.forName(a.D);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m37495(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, f48942);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37496(Hashtable hashtable, byte[] bArr) {
        int i;
        if (bArr != null) {
            int i2 = 0;
            while (i2 < bArr.length) {
                int i3 = i2 + 1;
                int i4 = bArr[i2] & 255;
                if (i4 == 0 || (i = i3 + i4) > bArr.length) {
                    hashtable.clear();
                    return;
                }
                int i5 = 0;
                while (i5 < i4 && bArr[i3 + i5] != 61) {
                    i5++;
                }
                String strM37495 = m37495(i3, i5, bArr);
                if (i5 == i4) {
                    hashtable.put(strM37495, f48944);
                } else {
                    int i6 = i5 + 1;
                    int i7 = i4 - i6;
                    byte[] bArr2 = new byte[i7];
                    System.arraycopy(bArr, i3 + i6, bArr2, 0, i7);
                    hashtable.put(strM37495, bArr2);
                }
                i2 = i;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37498(HashMap map) {
        String str;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
            Iterator it = map.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                byte[] bArr = f48943;
                if (!zHasNext) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    return (byteArray == null || byteArray.length <= 0) ? bArr : byteArray;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                Charset charset = f48942;
                byteArrayOutputStream2.write(str2.getBytes(charset));
                if (value != null) {
                    if (value instanceof String) {
                        byteArrayOutputStream2.write(61);
                        byteArrayOutputStream2.write(((String) value).getBytes(charset));
                    } else {
                        if (!(value instanceof byte[])) {
                            throw new IllegalArgumentException("Invalid property value: " + value);
                        }
                        byte[] bArr2 = (byte[]) value;
                        if (bArr2.length > 0) {
                            byteArrayOutputStream2.write(61);
                            byteArrayOutputStream2.write(bArr2, 0, bArr2.length);
                        } else {
                            value = null;
                        }
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                if (byteArray2.length > 255) {
                    InterfaceC2148 interfaceC2148 = f48945;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    if (value == null) {
                        str = "";
                    } else {
                        str = "=" + value;
                    }
                    sb.append(str);
                    interfaceC2148.mo7103(sb.toString(), "Cannot have individual values larger that 255 chars. Offending value: {}");
                    return bArr;
                }
                byteArrayOutputStream.write((byte) byteArray2.length);
                byteArrayOutputStream.write(byteArray2, 0, byteArray2.length);
            }
        } catch (IOException e) {
            throw new RuntimeException(C16014.m37866("unexpected exception: ", e));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m37497(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
        byteArrayOutputStream2.write(str.getBytes(f48942));
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        int length = byteArray.length;
        byte[] bArr = f48943;
        if (length > 255) {
            f48945.mo7103(str, "Cannot have individual values larger that 255 chars. Offending value: {}");
            return bArr;
        }
        byteArrayOutputStream.write((byte) byteArray.length);
        byteArrayOutputStream.write(byteArray, 0, byteArray.length);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        return byteArray2.length > 0 ? byteArray2 : bArr;
    }
}
