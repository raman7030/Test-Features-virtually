package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: U5VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10613 extends AbstractC3557 implements InterfaceC19994 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C22524 f31879;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Context f31880;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C3060 f31881;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f31882;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public WeakReference f31883;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC4968 f31884;

    public C10613(Context context, C22524 c22524, InterfaceC4968 interfaceC4968) {
        this.f31880 = context;
        this.f31879 = c22524;
        this.f31884 = interfaceC4968;
        C3060 defaultShowAsAction = new C3060(c22524.getContext()).setDefaultShowAsAction(1);
        this.f31881 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ۧ */
    public final void mo10834(CharSequence charSequence) {
        this.f31879.m50515(charSequence);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10827(CharSequence charSequence) {
        this.f31879.m50511(charSequence);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ۧ */
    public final void mo10833(int i) {
        mo10834(this.f31880.getString(i));
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10825(int i) {
        mo10827((CharSequence) this.f31880.getString(i));
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10829(boolean z) {
        super.mo10829(z);
        this.f31879.m50513(z);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo10831() {
        return this.f31879.m50519();
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10826(View view) {
        this.f31879.m50510(view);
        this.f31883 = view != null ? new WeakReference(view) : null;
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10839() {
        this.f31884.mo14424(this, this.f31881);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10824() {
        if (this.f31882) {
            return;
        }
        this.f31882 = true;
        this.f31884.mo14423(this);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ܽ */
    public final C3060 mo10836() {
        return this.f31881;
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ᩻ */
    public final CharSequence mo10840() {
        return this.f31879.m50517();
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ܿ */
    public final CharSequence mo10837() {
        return this.f31879.m50514();
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ۧ */
    public final View mo10832() {
        WeakReference weakReference = this.f31883;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ᩳ */
    public final MenuInflater mo10838() {
        return new C7790(this.f31879.getContext());
    }

    @Override // l.InterfaceC19994
    public final boolean onMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        return this.f31884.mo14425(this, menuItem);
    }

    @Override // l.InterfaceC19994
    public final void onMenuModeChange(C3060 c3060) {
        mo10839();
        this.f31879.m50516();
    }
}
