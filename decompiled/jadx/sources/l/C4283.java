package l;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۘ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4283 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f13833;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C4283(TextInputLayout textInputLayout) {
        this.f13833 = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f13833;
        if (textInputLayout.isErrorEnabled()) {
            textInputLayout.setErrorEnabled(false);
        }
    }
}
