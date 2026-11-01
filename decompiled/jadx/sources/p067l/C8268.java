package p067l;

import com.alipay.sdk.p010m.p041p.C0187d;
import java.security.InvalidKeyException;
import java.security.PublicKey;

/* JADX INFO: renamed from: l.ۛܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1X3 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC23041(type = EnumC4245.SEQUENCE)
public class C8268 {

    /* JADX INFO: renamed from: ۜ */
    public static final String f21899 = "1.2.840.10045.2.1";

    /* JADX INFO: renamed from: ۢ */
    public static final String f21900 = "2.16.840.1.101.3.4.3.2";

    /* JADX INFO: renamed from: ܳ */
    public static final String f21901 = "1.2.840.113549.1.1.1";

    /* JADX INFO: renamed from: ܽ */
    public static final C24381 f21902 = new C24381(new byte[]{5, 0});

    /* JADX INFO: renamed from: ܿ */
    public static final String f21903 = "2.16.840.1.101.3.4.2.1";

    /* JADX INFO: renamed from: ᩳ */
    public static final String f21904 = "1.3.14.3.2.26";

    /* JADX INFO: renamed from: ᩷ */
    public static final String f21905 = "1.2.840.113549.1.1.1";

    /* JADX INFO: renamed from: ᩻ */
    public static final String f21906 = "1.2.840.10040.4.1";

    /* JADX INFO: renamed from: ֫ */
    @InterfaceC13653(index = 0, type = EnumC4245.OBJECT_IDENTIFIER)
    public String f21907;

    /* JADX INFO: renamed from: ۧ */
    @InterfaceC13653(index = 1, optional = true, type = EnumC4245.ANY)
    public C24381 f21908;

    public C8268() {
    }

    public C8268(String str, C24381 c24381) {
        this.f21907 = str;
        this.f21908 = c24381;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8268 m19057(EnumC15467 enumC15467) {
        int i = C12292.f34332[enumC15467.ordinal()];
        if (i == 1) {
            return new C8268(f21904, f21902);
        }
        if (i == 2) {
            return new C8268(f21903, f21902);
        }
        throw new RuntimeException("Unsupported digest algorithm: " + enumC15467);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC15467 m19058(PublicKey publicKey, int i) throws InvalidKeyException {
        String algorithm = publicKey.getAlgorithm();
        if (C0187d.f883a.equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return i < 18 ? EnumC15467.SHA1 : EnumC15467.SHA256;
        }
        if ("DSA".equalsIgnoreCase(algorithm)) {
            return i < 21 ? EnumC15467.SHA1 : EnumC15467.SHA256;
        }
        if (!"EC".equalsIgnoreCase(algorithm)) {
            throw new InvalidKeyException(C21466.m48631("Unsupported key algorithm: ", algorithm));
        }
        if (i == -1 || i >= 18) {
            return EnumC15467.SHA256;
        }
        throw new InvalidKeyException("ECDSA signatures only supported for minSdkVersion 18 and higher");
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC17804 m19059(PublicKey publicKey, EnumC15467 enumC15467, boolean z) throws InvalidKeyException {
        String str;
        C8268 c8268;
        String algorithm = publicKey.getAlgorithm();
        int[] iArr = C12292.f34332;
        int i = iArr[enumC15467.ordinal()];
        if (i == 1) {
            str = "SHA1";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + enumC15467);
            }
            str = "SHA256";
        }
        if (C0187d.f883a.equalsIgnoreCase(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
            return new C18665(str.concat("withRSA"), new C8268("1.2.840.113549.1.1.1", f21902));
        }
        if (!"DSA".equalsIgnoreCase(algorithm)) {
            if ("EC".equalsIgnoreCase(algorithm)) {
                return new C18665(str.concat("withECDSA"), new C8268(f21899, f21902));
            }
            throw new InvalidKeyException(C21466.m48631("Unsupported key algorithm: ", algorithm));
        }
        int i2 = iArr[enumC15467.ordinal()];
        if (i2 == 1) {
            c8268 = new C8268(f21906, f21902);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unexpected digest algorithm: " + enumC15467);
            }
            c8268 = new C8268(f21900, f21902);
        }
        return new C18665(str.concat(z ? "withDetDSA" : "withDSA"), c8268);
    }
}
