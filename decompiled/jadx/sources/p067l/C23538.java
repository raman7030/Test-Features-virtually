package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 4778 */
/* JADX INFO: loaded from: classes.dex */
public final class C23538 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f74982;

    /* JADX INFO: renamed from: ۧ */
    public boolean f74983;

    /* JADX INFO: renamed from: ܽ */
    public final long f74984;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f74985;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f74986;

    /* JADX INFO: renamed from: ֫ */
    public static long m52329(long j, long j2) {
        for (int i = 0; i < 8; i++) {
            j = (j ^ ((long) (((int) (j2 >>> (i * 8))) & 255))) * 1099511628211L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized int m52331(String str) {
        Integer num;
        num = (Integer) this.f74986.get(str);
        return num == null ? 0 : this.f74985[num.intValue()] & 255;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m52332() {
        if (!this.f74983) {
            return;
        }
        AbstractC17043 abstractC17043M38684 = this.f74982.m38684(".axml_kind.bin.tmp");
        AbstractC17043 abstractC17043M38685 = this.f74982.m38684("axml_kind.bin");
        boolean z = false;
        try {
            try {
                this.f74982.m38666();
                abstractC17043M38684.mo25503();
                C11996 c11996 = new C11996(this.f74985.length + 16);
                c11996.writeInt(1296128067);
                c11996.writeInt(1);
                c11996.writeInt(this.f74985.length);
                c11996.m27451(this.f74984);
                c11996.m27454(this.f74985);
                abstractC17043M38684.m38654(c11996);
                abstractC17043M38685.mo25503();
                if (!abstractC17043M38684.mo25502(abstractC17043M38685)) {
                    throw new IOException("Failed to publish AXML kind cache");
                }
                this.f74983 = false;
                try {
                    C17548.m39937();
                } catch (IOException | RuntimeException unused) {
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    if (!z) {
                        abstractC17043M38684.mo25503();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException | RuntimeException unused2) {
            abstractC17043M38684.mo25503();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m52333(String str, boolean z) {
        Integer num = (Integer) this.f74986.get(str);
        if (num == null) {
            return;
        }
        byte b = (byte) (z ? 2 : 1);
        if (this.f74985[num.intValue()] != b) {
            this.f74985[num.intValue()] = b;
            this.f74983 = true;
        }
    }

    public C23538(AbstractC17043 abstractC17043, long j, byte[] bArr, HashMap map) {
        this.f74982 = abstractC17043;
        this.f74984 = j;
        this.f74985 = bArr;
        this.f74986 = map;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22868 m52334() {
        return new C22868(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23538 m52330(AbstractC17043 abstractC17043, ArrayList arrayList) {
        int i;
        long jM52329 = m52329(-3750763034362895579L, arrayList.size());
        Iterator it = arrayList.iterator();
        long jM523210 = jM52329;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C15554 c15554 = (C15554) it.next();
            String str = c15554.f44436;
            long jM523211 = m52329(jM523210, str.length());
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                jM523211 = (((jM523211 ^ ((long) (cCharAt & 255))) * 1099511628211L) ^ ((long) (cCharAt >>> '\b'))) * 1099511628211L;
                i++;
            }
            Long l2 = c15554.f44437;
            jM523210 = m52329(jM523211, l2 == null ? Long.MIN_VALUE : l2.longValue());
        }
        HashMap map = new HashMap(arrayList.size() * 2);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            map.put(((C15554) arrayList.get(i2)).f44436, Integer.valueOf(i2));
        }
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("axml_kind.bin");
        int size = arrayList.size();
        byte[] bArr = null;
        if (abstractC17043M38684.mo25093()) {
            long j = size;
            if (abstractC17043M38684.mo25101() == 24 + j) {
                try {
                    C14677 c14677 = new C14677(abstractC17043M38684.m38664());
                    if (c14677.readInt() == 1296128067 && c14677.readInt() == 1 && c14677.readInt() == size && c14677.readLong() == jM523210 && c14677.readInt() == size && c14677.available() == j) {
                        byte[] bArr2 = new byte[size];
                        c14677.m33576(size, bArr2);
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
        return new C23538(abstractC17043, jM523210, bArr == null ? new byte[arrayList.size()] : bArr, map);
    }
}
