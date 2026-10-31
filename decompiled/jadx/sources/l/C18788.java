package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ᩴܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C18788 extends C3971 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11007 f59304;

    public C18788(C21610 c21610, WindowInsets windowInsets) {
        super(c21610, windowInsets);
        this.f59304 = null;
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ۢ */
    public boolean mo3939() {
        return this.f12605.isConsumed();
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ۧ */
    public C21610 mo3941() {
        return C21610.m48814(null, this.f12605.consumeStableInsets());
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ܽ */
    public C21610 mo3943() {
        return C21610.m48814(null, this.f12605.consumeSystemWindowInsets());
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ܳ */
    public final C11007 mo3942() {
        if (this.f59304 == null) {
            WindowInsets windowInsets = this.f12605;
            this.f59304 = C11007.m27341(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f59304;
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ֫ */
    public void mo1998(C11007 c11007) {
        this.f59304 = c11007;
    }
}
