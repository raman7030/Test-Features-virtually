package p067l;

import android.text.Editable;
import android.widget.Button;

/* JADX INFO: renamed from: l.ᩳۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19436 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Button f59186;

    public C19436(Button button) {
        this.f59186 = button;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f59186.setEnabled(editable.length() > 0);
    }
}
