package p067l;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ܶܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14GC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16877 {

    /* JADX INFO: renamed from: ֫ */
    public int f49972;

    /* JADX INFO: renamed from: ۧ */
    public Mac f49973;

    public C16877() {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            this.f49973 = mac;
            this.f49972 = mac.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38442(byte[] bArr) {
        try {
            this.f49973.init(new SecretKeySpec(bArr, "HmacSHA1"));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }
}
