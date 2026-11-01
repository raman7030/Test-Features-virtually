package p067l;

import java.util.HashMap;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ܺ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17212 implements InterfaceC3288 {

    /* JADX INFO: renamed from: ۧ */
    public static HashMap f51236;

    /* JADX INFO: renamed from: ֫ */
    public final Digest f51237;

    static {
        HashMap map = new HashMap();
        f51236 = map;
        map.put(XMSSKeyParameters.SHA_512, new C8496());
        map.put("SHA256", new C21908());
        map.put("MD4", new C11179());
        map.put("MD5", new C10508());
    }

    public C17212(String str) {
        InterfaceC21569 interfaceC21569 = (InterfaceC21569) f51236.get(str);
        if (interfaceC21569 == null) {
            throw new IllegalArgumentException(C6988.m16053("No MessageDigest ", str, " defined in BouncyCastle"));
        }
        this.f51237 = (Digest) interfaceC21569.create();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38982(byte[] bArr) {
        this.f51237.update(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38983(byte[] bArr, int i, int i2) {
        this.f51237.update(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m38984() {
        Digest digest = this.f51237;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38986() {
        this.f51237.reset();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m38985() {
        return this.f51237.getDigestSize();
    }
}
