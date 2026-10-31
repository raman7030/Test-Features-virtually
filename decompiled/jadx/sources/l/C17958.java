package l;

import android.text.Editable;
import android.widget.Button;

/* JADX INFO: renamed from: l.ᩳۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17958 extends AbstractC3253 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f55989;

    public C17958(Button button) {
        this.f55989 = button;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f55989.setEnabled(editable.length() > 0);
    }
}
