package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۘ᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27XL */
/* JADX INFO: loaded from: classes2.dex */
public class C4185 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[][] f13632;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f13633;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f13634;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f13635;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f13636;

    static {
        byte[] bArr = C19356.f62660;
        Charset charset = StandardCharsets.UTF_8;
        f13632 = new byte[][]{C19356.m44592(OpenSSHPublicKeyUtil.DSS, charset), C19356.m44592(OpenSSHPublicKeyUtil.RSA, charset), C19356.m44592("ecdsa-sha2-nistp256", charset), C19356.m44592("ecdsa-sha2-nistp384", charset), C19356.m44592("ecdsa-sha2-nistp521", charset), C19356.m44592(OpenSSHPublicKeyUtil.ED_25519, charset), C19356.m44592("ssh-ed448", charset)};
    }

    public C4185(String str, int i, byte[] bArr) {
        this(i, "", str, null, bArr);
    }

    public C4185(int i, String str, String str2, String str3, byte[] bArr) throws C12651 {
        this.f13635 = str;
        this.f13633 = str2;
        if (i == 0) {
            byte b = bArr[8];
            if (b == 100) {
                this.f13636 = 1;
            } else if (b == 114) {
                this.f13636 = 2;
            } else if (b == 101 && bArr[10] == 50) {
                this.f13636 = 6;
            } else if (b == 101 && bArr[10] == 52) {
                this.f13636 = 7;
            } else if (b == 97 && bArr[20] == 50) {
                this.f13636 = 3;
            } else if (b == 97 && bArr[20] == 51) {
                this.f13636 = 4;
            } else if (b == 97 && bArr[20] == 53) {
                this.f13636 = 5;
            } else {
                throw new C12651("invalid key type");
            }
        } else {
            this.f13636 = i;
        }
        this.f13634 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12630() {
        int i = this.f13636;
        return (i == 1 || i == 2 || i == 6 || i == 7 || i == 3 || i == 4 || i == 5) ? C19356.m44588(f13632[i - 1]) : "UNKNOWN";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo12631(String str) {
        String str2 = this.f13633;
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
