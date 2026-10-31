package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.֫᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2056 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16872 f6859;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2056(C16872 c16872) {
        this.f6859 = c16872;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        C16872 c16872 = this.f6859;
        boolean z = c16872.f51773 && string.contains("static") && string.contains("final");
        c16872.f51778 = z;
        if (z) {
            if (!c16872.f51776 || c16872.f51772) {
                return;
            }
            c16872.f51772 = true;
            c16872.m36259(3).setVisibility(0);
            return;
        }
        if (c16872.f51772) {
            c16872.f51772 = false;
            c16872.m36259(3).setVisibility(8);
        }
    }
}
