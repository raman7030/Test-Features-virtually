package p067l;

import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.۠ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10236 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ TextInputLayout f28358;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ TextInputLayout f28359;

    public C10236(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.f28359 = textInputLayout;
        this.f28358 = textInputLayout2;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f28359;
        if (textInputLayout.isErrorEnabled()) {
            textInputLayout.setErrorEnabled(false);
            C11755.m26982(this.f28358, -1, 0, -1, -1);
        }
    }
}
