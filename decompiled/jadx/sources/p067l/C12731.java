package p067l;

import android.text.Editable;
import android.widget.Button;

/* JADX INFO: renamed from: l.ۧۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12731 extends AbstractC5460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Button f35755;

    public C12731(Button button) {
        this.f35755 = button;
    }

    @Override // p067l.AbstractC5460, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f35755.setEnabled(editable.length() == 6);
    }
}
