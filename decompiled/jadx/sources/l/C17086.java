package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܿۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17086 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10235 f52390;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15821 f52391;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C17086(C15821 c15821, C10235 c10235) {
        this.f52391 = c15821;
        this.f52390 = c10235;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            int iM51895 = C23436.m51895(editable.toString());
            this.f52391.setProgress(Math.round((iM51895 - 80) / 5.0f));
            this.f52390.m30309(iM51895 / 100.0f);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
    }
}
