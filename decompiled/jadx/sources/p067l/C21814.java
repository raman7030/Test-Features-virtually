package p067l;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.᩶᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21814 extends C7672 {

    /* JADX INFO: renamed from: ֫ */
    public InputMethodManager f68639;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ ActivityC12426 f68640;

    public C21814(ActivityC12426 activityC12426) {
        this.f68640 = activityC12426;
        this.f68639 = (InputMethodManager) activityC12426.getSystemService("input_method");
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ֫ */
    public final void mo6924() {
        InputMethodManager inputMethodManager = this.f68639;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f68640.f34735, 0);
        }
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6925(int i, C19071 c19071) {
        if (i != 66 || c19071.m43344()) {
            return false;
        }
        this.f68640.finish();
        return true;
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6927(int i, C19071 c19071) {
        if (i != 109 || c19071.m43344()) {
            return false;
        }
        this.f68640.finish();
        return true;
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6928() {
        return this.f68640.f34730.m40397();
    }

    @Override // p067l.InterfaceC3648
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6926() {
        return this.f68640.f34730.m40396();
    }
}
