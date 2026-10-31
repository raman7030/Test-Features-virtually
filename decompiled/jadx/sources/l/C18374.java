package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18374 extends AbstractC3557 implements InterfaceC19994 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public WeakReference f57083;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC4968 f57084;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17668 f57085;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3060 f57086;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Context f57087;

    public C18374(C17668 c17668, Context context, InterfaceC4968 interfaceC4968) {
        this.f57085 = c17668;
        this.f57087 = context;
        this.f57084 = interfaceC4968;
        C3060 defaultShowAsAction = new C3060(context).setDefaultShowAsAction(1);
        this.f57086 = defaultShowAsAction;
        defaultShowAsAction.setCallback(this);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ᩳ */
    public final MenuInflater mo10838() {
        return new C7790(this.f57087);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ܽ */
    public final C3060 mo10836() {
        return this.f57086;
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10824() {
        C17668 c17668 = this.f57085;
        if (c17668.f54040 != this) {
            return;
        }
        if (c17668.f54041) {
            c17668.f54047 = this;
            c17668.f54046 = this.f57084;
        } else {
            ((C18102) this.f57084).mo14423(this);
        }
        this.f57084 = null;
        c17668.m41394(false);
        c17668.f54049.m50509();
        c17668.f54039.m26440(c17668.f54055);
        c17668.f54040 = null;
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ᩷ */
    public final void mo10839() {
        if (this.f57085.f54040 != this) {
            return;
        }
        C3060 c3060 = this.f57086;
        c3060.stopDispatchingItemsChanged();
        try {
            this.f57084.mo14424(this, c3060);
        } finally {
            c3060.startDispatchingItemsChanged();
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m42808() {
        C3060 c3060 = this.f57086;
        c3060.stopDispatchingItemsChanged();
        try {
            return ((C18102) this.f57084).m42223(this, c3060);
        } finally {
            c3060.startDispatchingItemsChanged();
        }
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10826(View view) {
        this.f57085.f54049.m50510(view);
        this.f57083 = new WeakReference(view);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10827(CharSequence charSequence) {
        this.f57085.f54049.m50511(charSequence);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ۧ */
    public final void mo10834(CharSequence charSequence) {
        this.f57085.f54049.m50515(charSequence);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ۧ */
    public final void mo10833(int i) {
        mo10834(this.f57085.f54053.getResources().getString(i));
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10825(int i) {
        mo10827((CharSequence) this.f57085.f54053.getResources().getString(i));
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ᩻ */
    public final CharSequence mo10840() {
        return this.f57085.f54049.m50517();
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ܿ */
    public final CharSequence mo10837() {
        return this.f57085.f54049.m50514();
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ֫ */
    public final void mo10829(boolean z) {
        super.mo10829(z);
        this.f57085.f54049.m50513(z);
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo10831() {
        return this.f57085.f54049.m50519();
    }

    @Override // l.AbstractC3557
    /* JADX INFO: renamed from: ۧ */
    public final View mo10832() {
        WeakReference weakReference = this.f57083;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.InterfaceC19994
    public final boolean onMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        InterfaceC4968 interfaceC4968 = this.f57084;
        if (interfaceC4968 != null) {
            return ((C18102) interfaceC4968).mo14425(this, menuItem);
        }
        return false;
    }

    @Override // l.InterfaceC19994
    public final void onMenuModeChange(C3060 c3060) {
        if (this.f57084 == null) {
            return;
        }
        mo10839();
        this.f57085.f54049.m50516();
    }
}
