package l;

import android.os.Build;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8RW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16633 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C16633 f51080;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC6079 f51081;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f51082;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f51083;

    static {
        C16633 c16633;
        if (Build.VERSION.SDK_INT < 33) {
            c16633 = new C16633(2, 10);
        } else {
            C12429 c12429 = new C12429();
            for (int i = 1; i <= 10; i++) {
                c12429.mo6130((Object) Integer.valueOf(C3603.m11035(i)));
            }
            c16633 = new C16633(2, c12429.mo30595());
        }
        f51080 = c16633;
    }

    public C16633(int i, Set set) {
        this.f51082 = i;
        AbstractC6079 abstractC6079CopyOf = AbstractC6079.copyOf((Collection) set);
        this.f51081 = abstractC6079CopyOf;
        AbstractC20151 it = abstractC6079CopyOf.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f51083 = iMax;
    }

    public C16633(int i, int i2) {
        this.f51082 = i;
        this.f51083 = i2;
        this.f51081 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39166(int i) {
        AbstractC6079 abstractC6079 = this.f51081;
        if (abstractC6079 == null) {
            return i <= this.f51083;
        }
        int iM11035 = C3603.m11035(i);
        if (iM11035 == 0) {
            return false;
        }
        return abstractC6079.contains(Integer.valueOf(iM11035));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39165(int i, C18231 c18231) {
        if (this.f51081 != null) {
            return this.f51083;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.f51082;
        if (i2 >= 29) {
            return C1817.m6038(i3, i, c18231);
        }
        Object obj = C18045.f56237.get(Integer.valueOf(i3));
        return ((Integer) (obj != null ? obj : 0)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16633)) {
            return false;
        }
        C16633 c16633 = (C16633) obj;
        return this.f51082 == c16633.f51082 && this.f51083 == c16633.f51083 && C11003.equals(this.f51081, c16633.f51081);
    }

    public final int hashCode() {
        int i = ((this.f51082 * 31) + this.f51083) * 31;
        AbstractC6079 abstractC6079 = this.f51081;
        return i + (abstractC6079 == null ? 0 : abstractC6079.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f51082 + ", maxChannelCount=" + this.f51083 + ", channelMasks=" + this.f51081 + "]";
    }
}
