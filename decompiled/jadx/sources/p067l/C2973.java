package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֡᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S578 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2973 {

    /* JADX INFO: renamed from: ֫ */
    public final String f5202;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f5203;

    /* JADX INFO: renamed from: ܽ */
    public final String f5204;

    /* JADX INFO: renamed from: ܿ */
    public final int f5205;

    /* JADX INFO: renamed from: ᩳ */
    public final String f5206;

    public C2973(int i, String str, String str2, String str3, boolean z) {
        this.f5205 = i;
        this.f5206 = str;
        this.f5204 = str2;
        this.f5202 = str3;
        this.f5203 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m4929() {
        return this.f5205;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m4927() {
        return this.f5206;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m4926() {
        return this.f5204;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m4925() {
        return this.f5202;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m4928() {
        return this.f5203;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2973)) {
            return false;
        }
        C2973 c2973 = (C2973) obj;
        return this.f5205 == c2973.f5205 && this.f5203 == c2973.f5203 && this.f5206.equals(c2973.f5206) && this.f5204.equals(c2973.f5204) && this.f5202.equals(c2973.f5202);
    }

    public final int hashCode() {
        return (this.f5202.hashCode() * this.f5204.hashCode() * this.f5206.hashCode()) + this.f5205 + (this.f5203 ? 64 : 0);
    }

    public final String toString() {
        return this.f5206 + "." + this.f5204 + this.f5202 + " (" + this.f5205 + (this.f5203 ? " itf" : "") + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
