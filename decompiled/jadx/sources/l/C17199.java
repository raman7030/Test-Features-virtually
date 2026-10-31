package l;

import java.util.HashSet;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܿ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17199 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7505 f52739;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f52740 = new HashSet();

    public C17199(InterfaceC7505 interfaceC7505) {
        this.f52739 = interfaceC7505;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m40461(C17199 c17199) {
        return c17199.f52739.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m40462(C17199 c17199, long j, int i) {
        if (i < 0) {
            c17199.getClass();
            throw new C19317();
        }
        HashSet hashSet = c17199.f52740;
        if (i != 0) {
            long j2 = ((((long) i) + j) - 1) / X931RNG.BLOCK64_RESEED_MAX;
            for (long j3 = j / X931RNG.BLOCK64_RESEED_MAX; j3 <= j2; j3++) {
                hashSet.add(Long.valueOf(j3));
                if (hashSet.size() > 256) {
                    throw new C19317();
                }
            }
        }
        byte[] bArr = new byte[i];
        c17199.f52739.mo8637(j, bArr, 0, i);
        return bArr;
    }
}
