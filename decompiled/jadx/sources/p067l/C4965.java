package p067l;

import android.util.Base64;
import com.alipay.sdk.p010m.p041p.C0187d;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.ۖ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8CV */
/* JADX INFO: loaded from: classes2.dex */
public class C4965 implements InterfaceC4699, InterfaceC20467, InterfaceC21493 {
    @Override // p067l.InterfaceC21493
    /* JADX INFO: renamed from: ֫ */
    public C18158 mo10526(C18158 c18158, SecretKey secretKey) {
        return c18158;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m10523(int i, int i2, CharSequence charSequence) {
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10525(String str, byte[] bArr) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(C0187d.f883a).generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqlaL2//kwVLAAn+mac25arQOjgrRXVr4kl2nrcaoW05YzgdQzyPvADHD1zv3gg33fS+wQlzfnvKUHDSxOFGHubeW36Qkk85sNIZuBZk5ezJx00OdZafzdC6wUr7mreDUlylJWEGbfVALtP8osW8gS1c8H2i4jsHvamAWpwsYR0QIDAQAB", 0)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(bArr);
            return signature.verify(Base64.decode(str, 0));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public void mo4126(C17613 c17613) {
        C13731 c13731 = new C13731();
        c13731.m31207(System.currentTimeMillis());
        c17613.m40105(c13731);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Class m10522(String str, boolean z) {
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10524(CharSequence charSequence, boolean z, int i, String str, int i2) {
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

    /* JADX INFO: renamed from: ֫ */
    public static int m10521(String str, CharSequence charSequence, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(str, i);
        }
        if (str.isEmpty()) {
            return Math.min(Math.max(0, i), charSequence.length());
        }
        int length = charSequence.length() - str.length();
        for (int iMax = Math.max(0, i); iMax <= length; iMax++) {
            if (m10524(charSequence, false, iMax, str, str.length())) {
                return iMax;
            }
        }
        return -1;
    }
}
