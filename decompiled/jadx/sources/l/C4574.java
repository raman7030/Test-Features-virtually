package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۙۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes3.dex */
public final class C4574 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f14590;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f14591;

    public C4574(String str, int i) {
        this.f14590 = str;
        this.f14591 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4574)) {
            return false;
        }
        C4574 c4574 = (C4574) obj;
        return this.f14591 == c4574.f14591 && C11003.equals(this.f14590, c4574.f14590);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f14590) + (this.f14591 * 31);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m13432() {
        return this.f14590;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m13433() {
        return this.f14591;
    }

    public final String toString() {
        String str = this.f14590;
        int i = this.f14591;
        if (i < 0) {
            return str + " - (" + i + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return str + " - " + i;
    }
}
