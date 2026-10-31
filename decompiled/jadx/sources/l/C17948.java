package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ᩳۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17948 extends AbstractC3253 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23592 f55950;

    public C17948(C23592 c23592) {
        this.f55950 = c23592;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        C23592 c23592 = this.f55950;
        c23592.m52045();
        if (c23592.f76484 || c23592.f76482 == null) {
            return;
        }
        c23592.f76482.mo4107(string);
    }
}
