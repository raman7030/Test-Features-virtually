package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BH4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20296 extends AbstractC15405 {

    /* JADX INFO: renamed from: ۗ */
    public final C24318 f62699;

    /* JADX INFO: renamed from: ۙ */
    public final C21637 f62700;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f62701 = new ArrayList();

    /* JADX INFO: renamed from: ᩶ */
    public C14260 f62702;

    /* JADX INFO: renamed from: ᩸ */
    public final int f62703;

    /* JADX INFO: renamed from: ᩹ */
    public C16271 f62704;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "InvokeDynamic";
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20296 m45828(int i, C21637 c21637) {
        return new C20296(i, c21637);
    }

    public C20296(int i, C21637 c21637) {
        this.f62703 = i;
        this.f62700 = c21637;
        this.f62699 = C24318.m53648(c21637.m48854().mo4819());
    }

    /* JADX INFO: renamed from: ܺ */
    public final C24989 m45835() {
        ArrayList arrayList = this.f62701;
        C24989 c24989 = new C24989(this, arrayList.size());
        arrayList.add(c24989);
        return c24989;
    }

    /* JADX INFO: renamed from: ۠ */
    public final ArrayList m45834() {
        return this.f62701;
    }

    public final String toString() {
        return mo4819();
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        C14260 c14260 = this.f62702;
        StringBuilder sbM11879 = C5410.m11879("InvokeDynamic(", c14260 != null ? c14260.mo4819() : "Unknown", ":");
        sbM11879.append(this.f62703);
        sbM11879.append(", ");
        sbM11879.append(this.f62700.mo4819());
        sbM11879.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return sbM11879.toString();
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        C20296 c20296 = (C20296) abstractC15405;
        int iCompare = Integer.compare(this.f62703, c20296.f62703);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.f62700.compareTo(c20296.f62700);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f62702.compareTo((AbstractC15405) c20296.f62702);
        return iCompareTo2 != 0 ? iCompareTo2 : this.f62704.compareTo(c20296.f62704);
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m45837() {
        return this.f62703;
    }

    /* JADX INFO: renamed from: ۚ */
    public final C21637 m45833() {
        return this.f62700;
    }

    /* JADX INFO: renamed from: ֨ */
    public final C24318 m45830() {
        return this.f62699;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C9566 m45836() {
        return this.f62699.m53655();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45831(C14260 c14260) {
        if (this.f62702 != null) {
            throw new IllegalArgumentException("already added declaring class");
        }
        if (c14260 == null) {
            throw new NullPointerException("declaringClass == null");
        }
        this.f62702 = c14260;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45832(C16271 c16271) {
        if (this.f62704 != null) {
            throw new IllegalArgumentException("already added call site");
        }
        this.f62704 = c16271;
    }

    /* JADX INFO: renamed from: ֡ */
    public final C16271 m45829() {
        return this.f62704;
    }
}
