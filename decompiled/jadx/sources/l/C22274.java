package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 4778 */
/* JADX INFO: loaded from: classes.dex */
public final class C22274 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f72258;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f72259;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f72260;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f72261;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f72262;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m50001(long j, long j2) {
        for (int i = 0; i < 8; i++) {
            j = (j ^ ((long) (((int) (j2 >>> (i * 8))) & 255))) * 1099511628211L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m50003(String str) {
        Integer num;
        num = (Integer) this.f72262.get(str);
        return num == null ? 0 : this.f72261[num.intValue()] & 255;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50004() {
        if (!this.f72259) {
            return;
        }
        AbstractC15440 abstractC15440M36526 = this.f72258.m36526(".axml_kind.bin.tmp");
        AbstractC15440 abstractC15440M36527 = this.f72258.m36526("axml_kind.bin");
        boolean z = false;
        try {
            try {
                this.f72258.m36508();
                abstractC15440M36526.mo23552();
                C10130 c10130 = new C10130(this.f72261.length + 16);
                c10130.writeInt(1296128067);
                c10130.writeInt(1);
                c10130.writeInt(this.f72261.length);
                c10130.m25431(this.f72260);
                c10130.m25434(this.f72261);
                abstractC15440M36526.m36496(c10130);
                abstractC15440M36527.mo23552();
                if (!abstractC15440M36526.mo23551(abstractC15440M36527)) {
                    throw new IOException("Failed to publish AXML kind cache");
                }
                this.f72259 = false;
                try {
                    C15972.m37753();
                } catch (IOException | RuntimeException unused) {
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        abstractC15440M36526.mo23552();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException | RuntimeException unused2) {
            abstractC15440M36526.mo23552();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50005(String str, boolean z) {
        Integer num = (Integer) this.f72262.get(str);
        if (num == null) {
            return;
        }
        byte b = (byte) (z ? 2 : 1);
        if (this.f72261[num.intValue()] != b) {
            this.f72261[num.intValue()] = b;
            this.f72259 = true;
        }
    }

    public C22274(AbstractC15440 abstractC15440, long j, byte[] bArr, HashMap map) {
        this.f72258 = abstractC15440;
        this.f72260 = j;
        this.f72261 = bArr;
        this.f72262 = map;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21569 m50006() {
        return new C21569(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22274 m50002(AbstractC15440 abstractC15440, ArrayList arrayList) {
        int i;
        long jM50001 = m50001(-3750763034362895579L, arrayList.size());
        Iterator it = arrayList.iterator();
        long jM50002 = jM50001;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C13874 c13874 = (C13874) it.next();
            String str = c13874.f41355;
            long jM50003 = m50001(jM50002, str.length());
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                jM50003 = (((jM50003 ^ ((long) (cCharAt & 255))) * 1099511628211L) ^ ((long) (cCharAt >>> '\b'))) * 1099511628211L;
                i++;
            }
            Long l2 = c13874.f41356;
            jM50002 = m50001(jM50003, l2 == null ? Long.MIN_VALUE : l2.longValue());
        }
        HashMap map = new HashMap(arrayList.size() * 2);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            map.put(((C13874) arrayList.get(i2)).f41355, Integer.valueOf(i2));
        }
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("axml_kind.bin");
        int size = arrayList.size();
        byte[] bArr = null;
        if (abstractC15440M36526.mo23119()) {
            long j = size;
            if (abstractC15440M36526.mo23127() == 24 + j) {
                try {
                    C12951 c12951 = new C12951(abstractC15440M36526.m36506());
                    if (c12951.readInt() == 1296128067 && c12951.readInt() == 1 && c12951.readInt() == size && c12951.readLong() == jM50002 && c12951.readInt() == size && c12951.available() == j) {
                        byte[] bArr2 = new byte[size];
                        c12951.m31489(size, bArr2);
                        while (true) {
                            if (i >= size) {
                                bArr = bArr2;
                                break;
                            }
                            byte b = bArr2[i];
                            if (b != 0 && b != 1 && b != 2) {
                                break;
                            }
                            i++;
                        }
                    }
                } catch (IOException | RuntimeException unused) {
                }
            }
        }
        return new C22274(abstractC15440, jM50002, bArr == null ? new byte[arrayList.size()] : bArr, map);
    }
}
