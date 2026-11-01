package p067l;

import android.text.Editable;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.ۤ۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12158 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ TextInputLayout f33990;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ EditText f33991;

    public C12158(TextInputLayout textInputLayout, EditText editText) {
        this.f33990 = textInputLayout;
        this.f33991 = editText;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C18805.m42861(this.f33990, this.f33991);
    }
}
