package l;

import android.text.Editable;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۤ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10300 extends AbstractC3253 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f31027;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f31028;

    public C10300(TextInputLayout textInputLayout, EditText editText) {
        this.f31027 = textInputLayout;
        this.f31028 = editText;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C17294.m40610(this.f31027, this.f31028);
    }
}
