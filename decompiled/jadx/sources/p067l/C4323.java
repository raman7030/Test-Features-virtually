package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.֫᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4323 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18404 f9642;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C4323(C18404 c18404) {
        this.f9642 = c18404;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        C18404 c18404 = this.f9642;
        boolean z = c18404.f54952 && string.contains("static") && string.contains("final");
        c18404.f54957 = z;
        if (z) {
            if (!c18404.f54955 || c18404.f54951) {
                return;
            }
            c18404.f54951 = true;
            c18404.m38420(3).setVisibility(0);
            return;
        }
        if (c18404.f54951) {
            c18404.f54951 = false;
            c18404.m38420(3).setVisibility(8);
        }
    }
}
