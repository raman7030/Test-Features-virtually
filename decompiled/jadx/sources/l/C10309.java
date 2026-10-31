package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۤ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D946 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10309 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f31042;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26062(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.getEditText();
        C11003.requireNonNull(editText);
        editText.addTextChangedListener(new C10309(textInputLayout));
    }

    public C10309(TextInputLayout textInputLayout) {
        this.f31042 = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f31042.setErrorEnabled(false);
    }
}
