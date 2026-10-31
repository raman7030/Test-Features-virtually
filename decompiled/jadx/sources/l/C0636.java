package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֡᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S578 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0636 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f2430;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f2431;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f2432;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f2433;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f2434;

    public C0636(int i, String str, String str2, String str3, boolean z) {
        this.f2433 = i;
        this.f2434 = str;
        this.f2432 = str2;
        this.f2430 = str3;
        this.f2431 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m2589() {
        return this.f2433;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m2587() {
        return this.f2434;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m2586() {
        return this.f2432;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m2585() {
        return this.f2430;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m2588() {
        return this.f2431;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0636)) {
            return false;
        }
        C0636 c0636 = (C0636) obj;
        return this.f2433 == c0636.f2433 && this.f2431 == c0636.f2431 && this.f2434.equals(c0636.f2434) && this.f2432.equals(c0636.f2432) && this.f2430.equals(c0636.f2430);
    }

    public final int hashCode() {
        return (this.f2430.hashCode() * this.f2432.hashCode() * this.f2434.hashCode()) + this.f2433 + (this.f2431 ? 64 : 0);
    }

    public final String toString() {
        return this.f2434 + "." + this.f2432 + this.f2430 + " (" + this.f2433 + (this.f2431 ? " itf" : "") + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
