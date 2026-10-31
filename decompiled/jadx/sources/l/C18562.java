package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ᩴۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: NA5M */
/* JADX INFO: loaded from: classes4.dex */
public final class C18562 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f57605;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C18562(C2978 c2978) {
        this.f57605 = c2978;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f57605.setEnabled(editable.toString().toLowerCase().startsWith("https://"));
    }
}
