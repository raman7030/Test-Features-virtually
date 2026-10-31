package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۧ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11229 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16872 f33672;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C11229(C16872 c16872) {
        this.f33672 = c16872;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C16872 c16872 = this.f33672;
        boolean zContains = c16872.f51771.contains(editable.toString().trim());
        c16872.f51776 = zContains;
        if (zContains) {
            if (!c16872.f51778 || c16872.f51772) {
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
