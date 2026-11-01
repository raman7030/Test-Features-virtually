package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.۫ۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes3.dex */
public final class C13910 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC7875 f39256;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C13910(AbstractC7875 abstractC7875) {
        this.f39256 = abstractC7875;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractC7875 abstractC7875 = this.f39256;
        if (abstractC7875.f20672 && abstractC7875.f20671.isFocused()) {
            try {
                abstractC7875.f20669.mo27932((CharSequence) String.valueOf((Integer.parseInt(editable.toString()) * abstractC7875.f20674) / abstractC7875.f20673));
            } catch (Exception unused) {
            }
        }
    }
}
