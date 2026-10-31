package l;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ܺۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15691 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CompoundButton f48374;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23097 f48375;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C15691(CompoundButton compoundButton, C23097 c23097) {
        this.f48374 = compoundButton;
        this.f48375 = c23097;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        CompoundButton compoundButton = this.f48374;
        if (compoundButton == null || compoundButton.isChecked()) {
            C3698.m11276(this.f48375, (Spannable) editable);
        }
    }
}
