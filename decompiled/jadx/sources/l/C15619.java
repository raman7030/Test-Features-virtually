package l;

import java.util.HashMap;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ܺ֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9IW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15619 implements InterfaceC0968 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap f48097;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Digest f48098;

    static {
        HashMap map = new HashMap();
        f48097 = map;
        map.put(XMSSKeyParameters.SHA_512, new C6448());
        map.put("SHA256", new C20560());
        map.put("MD4", new C9271());
        map.put("MD5", new C8565());
    }

    public C15619(String str) {
        InterfaceC20203 interfaceC20203 = (InterfaceC20203) f48097.get(str);
        if (interfaceC20203 == null) {
            throw new IllegalArgumentException(C4860.m14172("No MessageDigest ", str, " defined in BouncyCastle"));
        }
        this.f48098 = (Digest) interfaceC20203.create();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36816(byte[] bArr) {
        this.f48098.update(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36817(byte[] bArr, int i, int i2) {
        this.f48098.update(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m36818() {
        Digest digest = this.f48098;
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36820() {
        this.f48098.reset();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36819() {
        return this.f48098.getDigestSize();
    }
}
