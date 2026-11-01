package p067l;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.ۤ᩸ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes4.dex */
public final class C12406 extends C7672 {

    /* JADX INFO: renamed from: ֫ */
    public InputMethodManager f34658;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ViewOnLayoutChangeListenerC9723 f34659;

    public C12406(ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723) {
        this.f34659 = viewOnLayoutChangeListenerC9723;
        this.f34658 = (InputMethodManager) viewOnLayoutChangeListenerC9723.getSystemService("input_method");
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ֫ */
    public final void mo6924() {
        InputMethodManager inputMethodManager = this.f34658;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f34659.f26853, 0);
        }
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6925(int i, C19071 c19071) {
        if (i != 66) {
            return false;
        }
        ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723 = this.f34659;
        if (viewOnLayoutChangeListenerC9723.f26858.m31370()) {
            return false;
        }
        if (!viewOnLayoutChangeListenerC9723.f26858.m31369(viewOnLayoutChangeListenerC9723.f26853)) {
            return true;
        }
        viewOnLayoutChangeListenerC9723.finish();
        return true;
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6927(int i, C19071 c19071) {
        if (i != 109) {
            return false;
        }
        ViewOnLayoutChangeListenerC9723 viewOnLayoutChangeListenerC9723 = this.f34659;
        if (viewOnLayoutChangeListenerC9723.f26858.m31370()) {
            return false;
        }
        if (!viewOnLayoutChangeListenerC9723.f26858.m31369(viewOnLayoutChangeListenerC9723.f26853)) {
            return true;
        }
        viewOnLayoutChangeListenerC9723.finish();
        return true;
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6928() {
        return this.f34659.f26856.m40397();
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6926() {
        return this.f34659.f26856.m40396();
    }
}
