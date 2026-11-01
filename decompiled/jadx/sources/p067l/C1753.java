package p067l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩳ᩻ */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes5.dex */
public final class C1753 extends AbstractC1018 implements InterfaceC1834 {

    /* JADX INFO: renamed from: ۗ */
    public WeakReference f60303;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC1088 f60304;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ C1718 f60305;

    /* JADX INFO: renamed from: ۬ */
    public final C0994 f60306;

    /* JADX INFO: renamed from: ᩶ */
    public final Context f60307;

    public C1753(C1718 c1718, Context context, InterfaceC1088 interfaceC1088) {
        this.f60305 = c1718;
        this.f60307 = context;
        this.f60304 = interfaceC1088;
        C0994 defaultShowAsAction = new C0994(context).setDefaultShowAsAction(1);
        this.f60306 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ᩳ */
    public final MenuInflater mo12818() {
        return new C1228(this.f60307);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ܽ */
    public final C0994 mo12816() {
        return this.f60306;
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12804() {
        C1718 c1718 = this.f60305;
        if (c1718.f57233 != this) {
            return;
        }
        if (c1718.f57234) {
            c1718.f57240 = this;
            c1718.f57239 = this.f60304;
        } else {
            ((C1740) this.f60304).mo16327(this);
        }
        this.f60304 = null;
        c1718.m43640(false);
        c1718.f57242.m52851();
        c1718.f57232.m28473(c1718.f57248);
        c1718.f57233 = null;
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ᩷ */
    public final void mo12819() {
        if (this.f60305.f57233 != this) {
            return;
        }
        C0994 c0994 = this.f60306;
        c0994.stopDispatchingItemsChanged();
        try {
            this.f60304.mo16328(this, c0994);
        } finally {
            c0994.startDispatchingItemsChanged();
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m45080() {
        C0994 c0994 = this.f60306;
        c0994.stopDispatchingItemsChanged();
        try {
            return ((C1740) this.f60304).m44482(this, c0994);
        } finally {
            c0994.startDispatchingItemsChanged();
        }
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12806(View view) {
        this.f60305.f57242.m52852(view);
        this.f60303 = new WeakReference(view);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12807(CharSequence charSequence) {
        this.f60305.f57242.m52853(charSequence);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ۧ */
    public final void mo12814(CharSequence charSequence) {
        this.f60305.f57242.m52857(charSequence);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ۧ */
    public final void mo12813(int i) {
        mo12814(this.f60305.f57246.getResources().getString(i));
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12805(int i) {
        mo12807((CharSequence) this.f60305.f57246.getResources().getString(i));
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ᩻ */
    public final CharSequence mo12820() {
        return this.f60305.f57242.m52859();
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ܿ */
    public final CharSequence mo12817() {
        return this.f60305.f57242.m52856();
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ֫ */
    public final void mo12809(boolean z) {
        super.mo12809(z);
        this.f60305.f57242.m52855(z);
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo12811() {
        return this.f60305.f57242.m52861();
    }

    @Override // p067l.AbstractC1018
    /* JADX INFO: renamed from: ۧ */
    public final View mo12812() {
        WeakReference weakReference = this.f60303;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p067l.InterfaceC1834
    public final boolean onMenuItemSelected(C0994 c0994, MenuItem menuItem) {
        InterfaceC1088 interfaceC1088 = this.f60304;
        if (interfaceC1088 != null) {
            return ((C1740) interfaceC1088).mo16329(this, menuItem);
        }
        return false;
    }

    @Override // p067l.InterfaceC1834
    public final void onMenuModeChange(C0994 c0994) {
        if (this.f60304 == null) {
            return;
        }
        mo12819();
        this.f60305.f57242.m52858();
    }
}
