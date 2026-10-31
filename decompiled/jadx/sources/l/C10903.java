package l;

import android.text.Editable;
import android.widget.Button;

/* JADX INFO: renamed from: l.ۧۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10903 extends AbstractC3253 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f32777;

    public C10903(Button button) {
        this.f32777 = button;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f32777.setEnabled(editable.length() == 6);
    }
}
