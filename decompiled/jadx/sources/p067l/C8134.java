package p067l;

import android.text.Editable;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۛ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8134 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ TextInputLayout f21438;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ EditText f21439;

    public C8134(TextInputLayout textInputLayout, EditText editText) {
        this.f21438 = textInputLayout;
        this.f21439 = editText;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C18805.m42865(this.f21438, this.f21439);
    }
}
