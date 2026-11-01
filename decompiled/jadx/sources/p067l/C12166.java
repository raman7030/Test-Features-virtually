package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۤ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D946 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12166 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final TextInputLayout f34005;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28086(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.getEditText();
        C12826.requireNonNull(editText);
        editText.addTextChangedListener(new C12166(textInputLayout));
    }

    public C12166(TextInputLayout textInputLayout) {
        this.f34005 = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f34005.setErrorEnabled(false);
    }
}
