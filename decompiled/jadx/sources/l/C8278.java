package l;

import android.text.Editable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: l.۠ܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47JB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8278 extends AbstractC3253 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f25448;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f25449;

    public C8278(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.f25449 = textInputLayout;
        this.f25448 = textInputLayout2;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f25449;
        if (textInputLayout.isErrorEnabled()) {
            textInputLayout.setErrorEnabled(false);
            C9876.m24967(this.f25448, -1, 0, -1, -1);
        }
    }
}
