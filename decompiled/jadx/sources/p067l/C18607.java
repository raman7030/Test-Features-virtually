package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܿۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C18607 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12096 f55573;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1627 f55574;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C18607(C1627 c1627, C12096 c12096) {
        this.f55574 = c1627;
        this.f55573 = c12096;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            int iM54296 = C24642.m54296(editable.toString());
            this.f55574.setProgress(Math.round((iM54296 - 80) / 5.0f));
            this.f55573.m32373(iM54296 / 100.0f);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
    }
}
