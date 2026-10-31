package l;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.ۤ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10561 extends C5580 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputMethodManager f31694;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC7738 f31695;

    public C10561(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738) {
        this.f31695 = viewOnLayoutChangeListenerC7738;
        this.f31694 = (InputMethodManager) viewOnLayoutChangeListenerC7738.getSystemService("input_method");
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ֫ */
    public final void mo4692() {
        InputMethodManager inputMethodManager = this.f31694;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f31695.f23940, 0);
        }
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4693(int i, C17574 c17574) {
        if (i != 66) {
            return false;
        }
        ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = this.f31695;
        if (viewOnLayoutChangeListenerC7738.f23945.m29315()) {
            return false;
        }
        if (!viewOnLayoutChangeListenerC7738.f23945.m29314(viewOnLayoutChangeListenerC7738.f23940)) {
            return true;
        }
        viewOnLayoutChangeListenerC7738.finish();
        return true;
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4695(int i, C17574 c17574) {
        if (i != 109) {
            return false;
        }
        ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = this.f31695;
        if (viewOnLayoutChangeListenerC7738.f23945.m29315()) {
            return false;
        }
        if (!viewOnLayoutChangeListenerC7738.f23945.m29314(viewOnLayoutChangeListenerC7738.f23940)) {
            return true;
        }
        viewOnLayoutChangeListenerC7738.finish();
        return true;
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4696() {
        return this.f31695.f23943.m38185();
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4694() {
        return this.f31695.f23943.m38184();
    }
}
