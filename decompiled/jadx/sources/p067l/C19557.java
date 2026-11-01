package p067l;

import java.nio.charset.Charset;
import java.util.Random;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.ᩳܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C19557 {

    /* JADX INFO: renamed from: ֫ */
    public Random f59533;

    /* JADX INFO: renamed from: ۧ */
    public C4473 f59534;

    public C19557(Random random, C4473 c4473) {
        this.f59533 = random;
        this.f59534 = c4473;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12852 m44417(String str, String str2, char[] cArr, C16203 c16203, long j, C10840 c10840) {
        byte[] bArr = new byte[8];
        this.f59533.nextBytes(bArr);
        byte[] bArrM44418 = m44418(String.valueOf(cArr), str, str2);
        byte[] bArrM44419 = m44418(String.valueOf(cArr), str, str2);
        byte[] bArrM36895 = c16203.m36895();
        C14192 c14192 = new C14192();
        C4473 c4473 = this.f59534;
        byte[] bArrM41436 = C18215.m41436(c4473, bArrM44419, bArrM36895, bArr);
        c14192.m28102(bArrM41436.length, bArrM41436);
        c14192.m28102(8, bArr);
        byte[] bArrM28123 = c14192.m28123();
        byte[] bArrM36896 = c16203.m36895();
        C14192 c14193 = new C14192();
        c14193.m28100((byte) 1);
        c14193.m28100((byte) 1);
        c14193.m28111(0);
        c14193.m28113(0L);
        c14193.m28103(j);
        c14193.m28102(8, bArr);
        c14193.m28113(0L);
        if (c10840 != null) {
            c10840.m24960(c14193);
        }
        c14193.m28113(0L);
        byte[] bArrM28124 = c14193.m28123();
        byte[] bArrM41437 = C18215.m41436(c4473, bArrM44418, bArrM36896, bArrM28124);
        byte[] bArr2 = new byte[bArrM41437.length + bArrM28124.length];
        System.arraycopy(bArrM41437, 0, bArr2, 0, bArrM41437.length);
        System.arraycopy(bArrM28124, 0, bArr2, bArrM41437.length, bArrM28124.length);
        return new C12852(bArr2, bArrM28123, C18215.m41436(c4473, bArrM44418, Arrays.copyOfRange(bArr2, 0, 16)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m44418(String str, String str2, String str3) {
        byte[] bytes;
        C4473 c4473 = this.f59534;
        if (str == null) {
            Charset charset = C18215.f54371;
            bytes = new byte[0];
        } else {
            bytes = str.getBytes(C18215.f54371);
        }
        try {
            c4473.getClass();
            C17212 c17212M9472 = C4473.m9472("MD4");
            c17212M9472.m38982(bytes);
            byte[] bArrM38984 = c17212M9472.m38984();
            String upperCase = str2.toUpperCase();
            return C18215.m41436(c4473, bArrM38984, upperCase == null ? new byte[0] : upperCase.getBytes(C18215.f54371), str3 == null ? new byte[0] : str3.getBytes(C18215.f54371));
        } catch (C9994 e) {
            throw new C7075(e);
        }
    }
}
