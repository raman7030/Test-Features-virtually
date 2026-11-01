package p067l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ᩳۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19426 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C24790 f59147;

    public C19426(C24790 c24790) {
        this.f59147 = c24790;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        C24790 c24790 = this.f59147;
        c24790.m54448();
        if (c24790.f79229 || c24790.f79227 == null) {
            return;
        }
        c24790.f79227.mo6351(string);
    }
}
