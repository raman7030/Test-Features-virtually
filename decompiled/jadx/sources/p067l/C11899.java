package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۤۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes3.dex */
public final class C11899 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC7875 f33140;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C11899(AbstractC7875 abstractC7875) {
        this.f33140 = abstractC7875;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractC7875 abstractC7875 = this.f33140;
        if (abstractC7875.f20672 && abstractC7875.f20669.isFocused()) {
            try {
                abstractC7875.f20671.mo27932((CharSequence) String.valueOf((Integer.parseInt(editable.toString()) * abstractC7875.f20673) / abstractC7875.f20674));
            } catch (Exception unused) {
            }
        }
    }
}
