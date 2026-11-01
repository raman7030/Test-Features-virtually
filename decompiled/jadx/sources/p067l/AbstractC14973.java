package p067l;

import com.alipay.sdk.p010m.p041p.C0187d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import javax.crypto.EncryptedPrivateKeyInfo;

/* JADX INFO: renamed from: l.۬ܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1W4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14973 {

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f42779 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public String f42780;

    /* JADX INFO: renamed from: ֡ */
    public void mo15880() {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo34289() {
    }

    /* JADX INFO: renamed from: ۘ */
    public abstract String mo12362();

    /* JADX INFO: renamed from: ۜ */
    public abstract byte[] mo12363();

    /* JADX INFO: renamed from: ᩴ */
    public boolean mo34294() {
        return this instanceof C23691;
    }

    /* JADX INFO: renamed from: ᩵ */
    public void mo34295() {
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract byte[] mo12364();

    /* JADX INFO: renamed from: ۧ */
    public final void m34291(String str) {
        this.f42780 = str;
        f42779.put(mo12362(), str);
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m34290() {
        return this.f42780;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final X509Certificate m34296() {
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(mo12363()));
    }

    /* JADX INFO: renamed from: ܺ */
    public final PrivateKey m34292() {
        byte[] bArrMo12364 = mo12364();
        try {
            return KeyFactory.getInstance(new EncryptedPrivateKeyInfo(bArrMo12364).getAlgName()).generatePrivate(new PKCS8EncodedKeySpec(bArrMo12364));
        } catch (IOException unused) {
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArrMo12364);
            try {
                try {
                    return KeyFactory.getInstance(C0187d.f883a).generatePrivate(pKCS8EncodedKeySpec);
                } catch (InvalidKeySpecException unused2) {
                    return KeyFactory.getInstance("EC").generatePrivate(pKCS8EncodedKeySpec);
                }
            } catch (InvalidKeySpecException unused3) {
                return KeyFactory.getInstance("DSA").generatePrivate(pKCS8EncodedKeySpec);
            }
        }
    }

    public final String toString() {
        return mo12362();
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m34293() {
        C11996 c11996 = new C11996();
        if (this != C10280.f28450) {
            c11996.writeByte(0);
            c11996.m27459(mo12362());
            c11996.m27454(mo12363());
            c11996.m27454(mo12364());
        } else {
            c11996.m27445(true);
        }
        return c11996.m27464();
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC14973 m34288(byte[] bArr) {
        C14677 c14677 = new C14677(bArr);
        if (c14677.m33585()) {
            return C10280.f28450;
        }
        return new C5586(c14677.m33583(), c14677.m33593(), c14677.m33583());
    }

    /* JADX INFO: renamed from: ۖ */
    public String mo15882() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۢ */
    public String mo15884() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܳ */
    public String mo15886() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo15881(String str) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo15885() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ܿ */
    public String mo15887() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ᩳ */
    public byte[] mo15888() {
        throw new UnsupportedOperationException();
    }
}
