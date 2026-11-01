package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۘ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27XL */
/* JADX INFO: loaded from: classes2.dex */
public class C6346 {

    /* JADX INFO: renamed from: ܿ */
    public static final byte[][] f16445;

    /* JADX INFO: renamed from: ֫ */
    public String f16446;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f16447;

    /* JADX INFO: renamed from: ܽ */
    public String f16448;

    /* JADX INFO: renamed from: ᩳ */
    public int f16449;

    static {
        byte[] bArr = C20764.f65273;
        Charset charset = StandardCharsets.UTF_8;
        f16445 = new byte[][]{C20764.m46886(OpenSSHPublicKeyUtil.DSS, charset), C20764.m46886(OpenSSHPublicKeyUtil.RSA, charset), C20764.m46886("ecdsa-sha2-nistp256", charset), C20764.m46886("ecdsa-sha2-nistp384", charset), C20764.m46886("ecdsa-sha2-nistp521", charset), C20764.m46886(OpenSSHPublicKeyUtil.ED_25519, charset), C20764.m46886("ssh-ed448", charset)};
    }

    public C6346(String str, int i, byte[] bArr) {
        this(i, "", str, null, bArr);
    }

    public C6346(int i, String str, String str2, String str3, byte[] bArr) throws C14392 {
        this.f16448 = str;
        this.f16446 = str2;
        if (i == 0) {
            byte b = bArr[8];
            if (b == 100) {
                this.f16449 = 1;
            } else if (b == 114) {
                this.f16449 = 2;
            } else if (b == 101 && bArr[10] == 50) {
                this.f16449 = 6;
            } else if (b == 101 && bArr[10] == 52) {
                this.f16449 = 7;
            } else if (b == 97 && bArr[20] == 50) {
                this.f16449 = 3;
            } else if (b == 97 && bArr[20] == 51) {
                this.f16449 = 4;
            } else if (b == 97 && bArr[20] == 53) {
                this.f16449 = 5;
            } else {
                throw new C14392("invalid key type");
            }
        } else {
            this.f16449 = i;
        }
        this.f16447 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m14505() {
        int i = this.f16449;
        return (i == 1 || i == 2 || i == 6 || i == 7 || i == 3 || i == 4 || i == 5) ? C20764.m46882(f16445[i - 1]) : "UNKNOWN";
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo14506(String str) {
        String str2 = this.f16446;
        int length = str2.length();
        int length2 = str.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = str2.indexOf(44, i);
            if (iIndexOf == -1) {
                if (length2 != length - i) {
                    break;
                }
                return str2.regionMatches(true, i, str, 0, length2);
            }
            if (length2 == iIndexOf - i && str2.regionMatches(true, i, str, 0, length2)) {
                return true;
            }
            i = iIndexOf + 1;
        }
        return false;
    }
}
