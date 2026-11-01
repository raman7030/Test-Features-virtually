package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܿۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18578 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12096 f55439;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C18578(C12096 c12096) {
        this.f55439 = c12096;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f55439.m32541(editable.toString());
    }
}
