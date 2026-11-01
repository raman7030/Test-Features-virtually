package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۙۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes3.dex */
public final class C6716 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f17419;

    /* JADX INFO: renamed from: ۧ */
    public final int f17420;

    public C6716(String str, int i) {
        this.f17419 = str;
        this.f17420 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6716)) {
            return false;
        }
        C6716 c6716 = (C6716) obj;
        return this.f17420 == c6716.f17420 && C12826.equals(this.f17419, c6716.f17419);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f17419) + (this.f17420 * 31);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m15320() {
        return this.f17419;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m15321() {
        return this.f17420;
    }

    public final String toString() {
        String str = this.f17419;
        int i = this.f17420;
        if (i < 0) {
            return str + " - (" + i + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return str + " - " + i;
    }
}
