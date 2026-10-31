package l;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: l.᩶᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1R8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20460 extends C5580 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputMethodManager f65963;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10582 f65964;

    public C20460(ActivityC10582 activityC10582) {
        this.f65964 = activityC10582;
        this.f65963 = (InputMethodManager) activityC10582.getSystemService("input_method");
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ֫ */
    public final void mo4692() {
        InputMethodManager inputMethodManager = this.f65963;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.f65964.f31765, 0);
        }
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4693(int i, C17574 c17574) {
        if (i != 66 || c17574.m41098()) {
            return false;
        }
        this.f65964.finish();
        return true;
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4695(int i, C17574 c17574) {
        if (i != 109 || c17574.m41098()) {
            return false;
        }
        this.f65964.finish();
        return true;
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo4696() {
        return this.f65964.f31760.m38185();
    }

    @Override // l.InterfaceC1346
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4694() {
        return this.f65964.f31760.m38184();
    }
}
