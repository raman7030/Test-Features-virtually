package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ᩴ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C20498 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17143 f63296;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C20498(C17143 c17143) {
        this.f63296 = c17143;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C17143 c17143 = this.f63296;
        c17143.m38820();
        if (c17143.m38852()) {
            c17143.f51054.m5988();
            c17143.f51068.removeMessages(0);
            c17143.f51068.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
