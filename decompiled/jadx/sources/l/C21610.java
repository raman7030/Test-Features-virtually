package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.᩸ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21610 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C21610 f69386;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1148 f69387;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f69386 = C5382.f16736;
        } else {
            f69386 = C1148.f4163;
        }
    }

    public C21610(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f69387 = new C5382(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f69387 = new C0442(this, windowInsets);
        } else if (i >= 28) {
            this.f69387 = new C19494(this, windowInsets);
        } else {
            this.f69387 = new C18788(this, windowInsets);
        }
    }

    public C21610() {
        this.f69387 = new C1148(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21610 m48814(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C21610 c21610 = new C21610(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c21610.m48820(C17648.m41340(view));
            c21610.m48818(view.getRootView());
        }
        return c21610;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m48824() {
        return this.f69387.mo3937().f33109;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m48826() {
        return this.f69387.mo3937().f33111;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m48834() {
        return this.f69387.mo3937().f33110;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m48835() {
        return this.f69387.mo3937().f33108;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m48825() {
        return !this.f69387.mo3937().equals(C11007.f33107);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m48830() {
        return this.f69387.mo3939();
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21610 m48831() {
        return this.f69387.mo3943();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21610 m48828() {
        return this.f69387.mo3941();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5157 m48833() {
        return this.f69387.mo3945();
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21610 m48816() {
        return this.f69387.mo3933();
    }

    @Deprecated
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11007 m48832() {
        return this.f69387.mo3942();
    }

    @Deprecated
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11007 m48829() {
        return this.f69387.mo2001();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21610 m48817(int i, int i2, int i3, int i4) {
        return this.f69387.mo1997(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11007 m48815(int i) {
        return this.f69387.mo3932(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11007 m48827(int i) {
        return this.f69387.mo3940(i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m48822() {
        return this.f69387.mo3944(8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21610) {
            return C11003.equals(this.f69387, ((C21610) obj).f69387);
        }
        return false;
    }

    public final int hashCode() {
        C1148 c1148 = this.f69387;
        if (c1148 == null) {
            return 0;
        }
        return c1148.hashCode();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final WindowInsets m48823() {
        C1148 c1148 = this.f69387;
        if (c1148 instanceof C3971) {
            return ((C3971) c1148).f12605;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11007 m48813(C11007 c11007, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c11007.f33109 - i);
        int iMax2 = Math.max(0, c11007.f33111 - i2);
        int iMax3 = Math.max(0, c11007.f33110 - i3);
        int iMax4 = Math.max(0, c11007.f33108 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c11007 : C11007.m27341(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48821(C11007[] c11007Arr) {
        this.f69387.mo3936(c11007Arr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48819(C11007 c11007) {
        this.f69387.mo1998(c11007);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48820(C21610 c21610) {
        this.f69387.mo3935(c21610);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48818(View view) {
        this.f69387.mo3934(view);
    }
}
