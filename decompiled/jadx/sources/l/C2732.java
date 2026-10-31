package l;

import android.util.Base64;
import com.alipay.sdk.m.p.d;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.ۖ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8CV */
/* JADX INFO: loaded from: classes2.dex */
public class C2732 implements InterfaceC2452, InterfaceC19043, InterfaceC20123 {
    @Override // l.InterfaceC20123
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16614 mo8479(C16614 c16614, SecretKey secretKey) {
        return c16614;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8476(int i, int i2, CharSequence charSequence) {
        if (charSequence instanceof String) {
            return ((String) charSequence).substring(i, i2);
        }
        if (i < 0 || i2 < i || i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2) {
            return "";
        }
        int i3 = i2 - i;
        char[] cArr = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            cArr[i4] = charSequence.charAt(i + i4);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8478(String str, byte[] bArr) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(d.a).generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqlaL2//kwVLAAn+mac25arQOjgrRXVr4kl2nrcaoW05YzgdQzyPvADHD1zv3gg33fS+wQlzfnvKUHDSxOFGHubeW36Qkk85sNIZuBZk5ezJx00OdZafzdC6wUr7mreDUlylJWEGbfVALtP8osW8gS1c8H2i4jsHvamAWpwsYR0QIDAQAB", 0)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(bArr);
            return signature.verify(Base64.decode(str, 0));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public void mo1728(C16040 c16040) {
        C11955 c11955 = new C11955();
        c11955.m29153(System.currentTimeMillis());
        c16040.m37918(c11955);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class m8475(String str, boolean z) {
        try {
            try {
                return Class.forName(str);
            } catch (Throwable unused) {
                return Class.forName(str, true, ClassLoader.getSystemClassLoader());
            }
        } catch (Throwable th) {
            if (z) {
                System.err.println("Caught " + th);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8477(CharSequence charSequence, boolean z, int i, String str, int i2) {
        char upperCase;
        char upperCase2;
        if (i >= 0 && i <= charSequence.length() - i2 && str.length() - i2 >= 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                char cCharAt = charSequence.charAt(i + i3);
                char cCharAt2 = str.charAt(i3);
                if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8474(String str, CharSequence charSequence, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(str, i);
        }
        if (str.isEmpty()) {
            return Math.min(Math.max(0, i), charSequence.length());
        }
        int length = charSequence.length() - str.length();
        for (int iMax = Math.max(0, i); iMax <= length; iMax++) {
            if (m8477(charSequence, false, iMax, str, str.length())) {
                return iMax;
            }
        }
        return -1;
    }
}
