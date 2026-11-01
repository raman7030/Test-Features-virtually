package p067l;

import android.os.Build;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18176 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C18176 f54260;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8146 f54261;

    /* JADX INFO: renamed from: ۧ */
    public final int f54262;

    /* JADX INFO: renamed from: ܽ */
    public final int f54263;

    static {
        C18176 c18176;
        if (Build.VERSION.SDK_INT < 33) {
            c18176 = new C18176(2, 10);
        } else {
            C14181 c14181 = new C14181();
            for (int i = 1; i <= 10; i++) {
                c14181.mo8328((Object) Integer.valueOf(C5792.m13011(i)));
            }
            c18176 = new C18176(2, c14181.mo32660());
        }
        f54260 = c18176;
    }

    public C18176(int i, Set set) {
        this.f54262 = i;
        AbstractC8146 abstractC8146CopyOf = AbstractC8146.copyOf((Collection) set);
        this.f54261 = abstractC8146CopyOf;
        AbstractC21520 it = abstractC8146CopyOf.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f54263 = iMax;
    }

    public C18176(int i, int i2) {
        this.f54262 = i;
        this.f54263 = i2;
        this.f54261 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m41394(int i) {
        AbstractC8146 abstractC8146 = this.f54261;
        if (abstractC8146 == null) {
            return i <= this.f54263;
        }
        int iM13011 = C5792.m13011(i);
        if (iM13011 == 0) {
            return false;
        }
        return abstractC8146.contains(Integer.valueOf(iM13011));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41393(int i, C19695 c19695) {
        if (this.f54261 != null) {
            return this.f54263;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f54262;
        if (i2 >= 29) {
            return C4095.m8236(i3, i, c19695);
        }
        Object obj = C19518.f59439.get(Integer.valueOf(i3));
        return ((Integer) (obj != null ? obj : 0)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18176)) {
            return false;
        }
        C18176 c18176 = (C18176) obj;
        return this.f54262 == c18176.f54262 && this.f54263 == c18176.f54263 && C12826.equals(this.f54261, c18176.f54261);
    }

    public final int hashCode() {
        int i = ((this.f54262 * 31) + this.f54263) * 31;
        AbstractC8146 abstractC8146 = this.f54261;
        return i + (abstractC8146 == null ? 0 : abstractC8146.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f54262 + ", maxChannelCount=" + this.f54263 + ", channelMasks=" + this.f54261 + "]";
    }
}
