package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۧ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13041 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18404 f36671;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C13041(C18404 c18404) {
        this.f36671 = c18404;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C18404 c18404 = this.f36671;
        boolean zContains = c18404.f54950.contains(editable.toString().trim());
        c18404.f54955 = zContains;
        if (zContains) {
            if (!c18404.f54957 || c18404.f54951) {
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
