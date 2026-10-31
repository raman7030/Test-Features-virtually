package l;

import com.alipay.sdk.m.p.d;
import java.security.InvalidKeyException;
import java.security.PublicKey;

/* JADX INFO: renamed from: l.ۛܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1X3 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC21751(type = EnumC1974.SEQUENCE)
public class C6207 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String f19038 = "1.2.840.10045.2.1";

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String f19039 = "2.16.840.1.101.3.4.3.2";

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String f19040 = "1.2.840.113549.1.1.1";

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C23161 f19041 = new C23161(new byte[]{5, 0});

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String f19042 = "2.16.840.1.101.3.4.2.1";

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f19043 = "1.3.14.3.2.26";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f19044 = "1.2.840.113549.1.1.1";

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String f19045 = "1.2.840.10040.4.1";

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    @InterfaceC11873(index = 0, type = EnumC1974.OBJECT_IDENTIFIER)
    public String f19046;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    @InterfaceC11873(index = 1, optional = true, type = EnumC1974.ANY)
    public C23161 f19047;

    public C6207() {
    }

    public C6207(String str, C23161 c23161) {
        this.f19046 = str;
        this.f19047 = c23161;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6207 m17125(EnumC13782 enumC13782) {
        int i = C10441.f31368[enumC13782.ordinal()];
        if (i == 1) {
            return new C6207(f19043, f19041);
        }
        if (i == 2) {
            return new C6207(f19042, f19041);
        }
        throw new RuntimeException("Unsupported digest algorithm: " + enumC13782);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC13782 m17126(PublicKey publicKey, int i) throws InvalidKeyException {
        String algorithm = publicKey.getAlgorithm();
        if (d.a.equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return i < 18 ? EnumC13782.SHA1 : EnumC13782.SHA256;
        }
        if ("DSA".equalsIgnoreCase(algorithm)) {
            return i < 21 ? EnumC13782.SHA1 : EnumC13782.SHA256;
        }
        if (!"EC".equalsIgnoreCase(algorithm)) {
            throw new InvalidKeyException(C20094.m46315("Unsupported key algorithm: ", algorithm));
        }
        if (i == -1 || i >= 18) {
            return EnumC13782.SHA256;
        }
        throw new InvalidKeyException("ECDSA signatures only supported for minSdkVersion 18 and higher");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC16241 m17127(PublicKey publicKey, EnumC13782 enumC13782, boolean z) throws InvalidKeyException {
        String str;
        C6207 c6207;
        String algorithm = publicKey.getAlgorithm();
        int[] iArr = C10441.f31368;
        int i = iArr[enumC13782.ordinal()];
        if (i == 1) {
            str = "SHA1";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + enumC13782);
            }
            str = "SHA256";
        }
        if (d.a.equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return new C17147(str.concat("withRSA"), new C6207("1.2.840.113549.1.1.1", f19041));
        }
        if (!"DSA".equalsIgnoreCase(algorithm)) {
            if ("EC".equalsIgnoreCase(algorithm)) {
                return new C17147(str.concat("withECDSA"), new C6207(f19038, f19041));
            }
            throw new InvalidKeyException(C20094.m46315("Unsupported key algorithm: ", algorithm));
        }
        int i2 = iArr[enumC13782.ordinal()];
        if (i2 == 1) {
            c6207 = new C6207(f19045, f19041);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + enumC13782);
            }
            c6207 = new C6207(f19039, f19041);
        }
        return new C17147(str.concat(z ? "withDetDSA" : "withDSA"), c6207);
    }
}
