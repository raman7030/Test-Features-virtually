package p067l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۤ᩻ */
/* JADX INFO: compiled from: U5VL */
/* JADX INFO: loaded from: classes4.dex */
public final class C1368 extends AbstractC1018 implements InterfaceC1834 {

    /* JADX INFO: renamed from: ۗ */
    public C1959 f34851;

    /* JADX INFO: renamed from: ۙ */
    public Context f34852;

    /* JADX INFO: renamed from: ۤ */
    public C0994 f34853;

    /* JADX INFO: renamed from: ۫ */
    public boolean f34854;

    /* JADX INFO: renamed from: ۬ */
    public WeakReference f34855;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC1088 f34856;

    public C1368(Context context, C1959 c1959, InterfaceC1088 interfaceC1088) {
        this.f34852 = context;
        this.f34851 = c1959;
        this.f34856 = interfaceC1088;
        C0994 defaultShowAsAction = new C0994(c1959.getContext()).setDefaultShowAsAction(1);
        this.f34853 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ۧ */
    public final void mo12814(CharSequence charSequence) {
        this.f34851.m52857(charSequence);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12807(CharSequence charSequence) {
        this.f34851.m52853(charSequence);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ۧ */
    public final void mo12813(int i) {
        mo12814(this.f34852.getString(i));
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12805(int i) {
        mo12807((CharSequence) this.f34852.getString(i));
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12809(boolean z) {
        super.mo12809(z);
        this.f34851.m52855(z);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo12811() {
        return this.f34851.m52861();
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12806(View view) {
        this.f34851.m52852(view);
        this.f34855 = view != null ? new WeakReference(view) : null;
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo12819() {
        this.f34856.mo16328(this, this.f34853);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12804() {
        if (this.f34854) {
            return;
        }
        this.f34854 = true;
        this.f34856.mo16327(this);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ܽ */
    public final C0994 mo12816() {
        return this.f34853;
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ᩻ */
    public final CharSequence mo12820() {
        return this.f34851.m52859();
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ܿ */
    public final CharSequence mo12817() {
        return this.f34851.m52856();
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ۧ */
    public final View mo12812() {
        WeakReference weakReference = this.f34855;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ᩳ */
    public final MenuInflater mo12818() {
        return new C1228(this.f34851.getContext());
    }

    @Override // p067l.InterfaceC1834
    public final boolean onMenuItemSelected(C0994 c0994, MenuItem menuItem) {
        return this.f34856.mo16329(this, menuItem);
    }

    @Override // p067l.InterfaceC1834
    public final void onMenuModeChange(C0994 c0994) {
        mo12819();
        this.f34851.m52858();
    }
}
