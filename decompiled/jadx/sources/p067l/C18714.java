package p067l;

import java.util.HashSet;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܿ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18714 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9501 f55920;

    /* JADX INFO: renamed from: ۧ */
    public final HashSet f55921 = new HashSet();

    public C18714(InterfaceC9501 interfaceC9501) {
        this.f55920 = interfaceC9501;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m42708(C18714 c18714) {
        return c18714.f55920.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m42709(C18714 c18714, long j, int i) {
        if (i < 0) {
            c18714.getClass();
            throw new C20727();
        }
        HashSet hashSet = c18714.f55921;
        if (i != 0) {
            long j2 = ((((long) i) + j) - 1) / X931RNG.BLOCK64_RESEED_MAX;
            for (long j3 = j / X931RNG.BLOCK64_RESEED_MAX; j3 <= j2; j3++) {
                hashSet.add(Long.valueOf(j3));
                if (hashSet.size() > 256) {
                    throw new C20727();
                }
            }
        }
        byte[] bArr = new byte[i];
        c18714.f55920.mo10697(j, bArr, 0, i);
        return bArr;
    }
}
