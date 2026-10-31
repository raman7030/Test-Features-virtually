package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۤۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X81I */
/* JADX INFO: loaded from: classes3.dex */
public final class C10028 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5794 f30182;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C10028(AbstractC5794 abstractC5794) {
        this.f30182 = abstractC5794;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractC5794 abstractC5794 = this.f30182;
        if (abstractC5794.f17826 && abstractC5794.f17823.isFocused()) {
            try {
                abstractC5794.f17825.mo25910((CharSequence) String.valueOf((Integer.parseInt(editable.toString()) * abstractC5794.f17827) / abstractC5794.f17828));
            } catch (Exception unused) {
            }
        }
    }
}
