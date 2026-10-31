package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1594 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C1594 f5641 = new C1594();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f5642 = new LinkedHashMap(64, 0.75f, true);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f5643;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f5644;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C7693 m5453(int i) {
        if (i < 0 || i > 10485760) {
            return null;
        }
        m5452(i);
        int i2 = this.f5644;
        int i3 = this.f5643;
        if (i2 + i3 + i > 10485760) {
            return null;
        }
        this.f5643 = i3 + i;
        return new C7693(this, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C14042 m5454(C23215 c23215) {
        C11927 c11927 = (C11927) this.f5642.get(c23215);
        if (c11927 == null) {
            return null;
        }
        c11927.f35658++;
        return new C14042(this, c11927);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C14042 m5455(C23215 c23215, byte[] bArr, C7693 c7693) {
        C7693.m20582(c7693, bArr.length);
        C11927 c11927 = (C11927) this.f5642.get(c23215);
        if (c11927 != null) {
            if (bArr.length > c11927.f35657.length && c11927.f35658 == 0) {
                this.f5642.remove(c23215);
                this.f5644 -= c11927.f35657.length;
            }
            c11927.f35658++;
            return new C14042(this, c11927);
        }
        C11927 c11928 = new C11927(bArr);
        c11928.f35658 = 1;
        this.f5642.put(c23215, c11928);
        this.f5644 += bArr.length;
        return new C14042(this, c11928);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1594 m5449() {
        return f5641;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5452(int i) {
        Iterator it = this.f5642.entrySet().iterator();
        while (this.f5644 + this.f5643 + i > 10485760 && it.hasNext()) {
            C11927 c11927 = (C11927) ((Map.Entry) it.next()).getValue();
            if (c11927.f35658 == 0) {
                this.f5644 -= c11927.f35657.length;
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5451(C1594 c1594, C7693 c7693) {
        synchronized (c1594) {
            if (c7693.f23762 > 0) {
                c1594.f5643 -= c7693.f23762;
                c7693.f23762 = 0;
            }
        }
    }
}
