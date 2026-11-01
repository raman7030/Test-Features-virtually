package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۘ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6440 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ TextInputLayout f16649;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C6440(TextInputLayout textInputLayout) {
        this.f16649 = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f16649;
        if (textInputLayout.isErrorEnabled()) {
            textInputLayout.setErrorEnabled(false);
        }
    }
}
