package l;

import java.nio.charset.Charset;
import java.util.Random;
import org.bouncycastle.util.Arrays;

/* JADX INFO: renamed from: l.ᩳܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18086 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Random f56321;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2215 f56322;

    public C18086(Random random, C2215 c2215) {
        this.f56321 = random;
        this.f56322 = c2215;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11031 m42158(String str, String str2, char[] cArr, C14557 c14557, long j, C8914 c8914) {
        byte[] bArr = new byte[8];
        this.f56321.nextBytes(bArr);
        byte[] bArrM42159 = m42159(String.valueOf(cArr), str, str2);
        byte[] bArrM421510 = m42159(String.valueOf(cArr), str, str2);
        byte[] bArrM34746 = c14557.m34746();
        C12441 c12441 = new C12441();
        C2215 c2215 = this.f56322;
        byte[] bArrM39201 = C16674.m39201(c2215, bArrM421510, bArrM34746, bArr);
        c12441.m26077(bArrM39201.length, bArrM39201);
        c12441.m26077(8, bArr);
        byte[] bArrM26098 = c12441.m26098();
        byte[] bArrM34747 = c14557.m34746();
        C12441 c12442 = new C12441();
        c12442.m26075((byte) 1);
        c12442.m26075((byte) 1);
        c12442.m26086(0);
        c12442.m26088(0L);
        c12442.m26078(j);
        c12442.m26077(8, bArr);
        c12442.m26088(0L);
        if (c8914 != null) {
            c8914.m22986(c12442);
        }
        c12442.m26088(0L);
        byte[] bArrM26099 = c12442.m26098();
        byte[] bArrM39202 = C16674.m39201(c2215, bArrM42159, bArrM34747, bArrM26099);
        byte[] bArr2 = new byte[bArrM39202.length + bArrM26099.length];
        System.arraycopy(bArrM39202, 0, bArr2, 0, bArrM39202.length);
        System.arraycopy(bArrM26099, 0, bArr2, bArrM39202.length, bArrM26099.length);
        return new C11031(bArr2, bArrM26098, C16674.m39201(c2215, bArrM42159, Arrays.copyOfRange(bArr2, 0, 16)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m42159(String str, String str2, String str3) {
        byte[] bytes;
        C2215 c2215 = this.f56322;
        if (str == null) {
            Charset charset = C16674.f51186;
            bytes = new byte[0];
        } else {
            bytes = str.getBytes(C16674.f51186);
        }
        try {
            c2215.getClass();
            C15619 c15619M7389 = C2215.m7389("MD4");
            c15619M7389.m36816(bytes);
            byte[] bArrM36818 = c15619M7389.m36818();
            String upperCase = str2.toUpperCase();
            return C16674.m39201(c2215, bArrM36818, upperCase == null ? new byte[0] : upperCase.getBytes(C16674.f51186), str3 == null ? new byte[0] : str3.getBytes(C16674.f51186));
        } catch (C8024 e) {
            throw new C4952(e);
        }
    }
}
