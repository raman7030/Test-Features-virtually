package l;

import android.util.Base64;
import com.alipay.sdk.m.b0.a;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.۬᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13377 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f40003 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32385(String str, byte[] bArr, String str2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance(a.f);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            C9145.m23514("DESUtils", "encryptAES", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32386(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f40003;
            cArr[i2 + 1] = cArr2[b & 15];
            cArr[i2] = cArr2[((byte) (b >>> 4)) & 15];
        }
        return new String(cArr);
    }
}
