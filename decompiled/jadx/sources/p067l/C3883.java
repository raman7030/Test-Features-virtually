package p067l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3883 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C3883 f8420 = new C3883();

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f8421 = new LinkedHashMap(64, 0.75f, true);

    /* JADX INFO: renamed from: ۧ */
    public int f8422;

    /* JADX INFO: renamed from: ܽ */
    public int f8423;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C9680 m7683(int i) {
        if (i < 0 || i > 10485760) {
            return null;
        }
        m7682(i);
        int i2 = this.f8423;
        int i3 = this.f8422;
        if (i2 + i3 + i > 10485760) {
            return null;
        }
        this.f8422 = i3 + i;
        return new C9680(this, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C15714 m7684(C24432 c24432) {
        C13704 c13704 = (C13704) this.f8421.get(c24432);
        if (c13704 == null) {
            return null;
        }
        c13704.f38667++;
        return new C15714(this, c13704);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C15714 m7685(C24432 c24432, byte[] bArr, C9680 c9680) {
        C9680.m22562(c9680, bArr.length);
        C13704 c13704 = (C13704) this.f8421.get(c24432);
        if (c13704 != null) {
            if (bArr.length > c13704.f38666.length && c13704.f38667 == 0) {
                this.f8421.remove(c24432);
                this.f8423 -= c13704.f38666.length;
            }
            c13704.f38667++;
            return new C15714(this, c13704);
        }
        C13704 c13705 = new C13704(bArr);
        c13705.f38667 = 1;
        this.f8421.put(c24432, c13705);
        this.f8423 += bArr.length;
        return new C15714(this, c13705);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3883 m7679() {
        return f8420;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m7682(int i) {
        Iterator it = this.f8421.entrySet().iterator();
        while (this.f8423 + this.f8422 + i > 10485760 && it.hasNext()) {
            C13704 c13704 = (C13704) ((Map.Entry) it.next()).getValue();
            if (c13704.f38667 == 0) {
                this.f8423 -= c13704.f38666.length;
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7681(C3883 c3883, C9680 c9680) {
        synchronized (c3883) {
            if (c9680.f26675 > 0) {
                c3883.f8422 -= c9680.f26675;
                c9680.f26675 = 0;
            }
        }
    }
}
