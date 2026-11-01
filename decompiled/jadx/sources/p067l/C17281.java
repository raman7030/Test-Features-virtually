package p067l;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ܺۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17281 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ CompoundButton f51512;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C24320 f51513;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C17281(CompoundButton compoundButton, C24320 c24320) {
        this.f51512 = compoundButton;
        this.f51513 = c24320;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        CompoundButton compoundButton = this.f51512;
        if (compoundButton == null || compoundButton.isChecked()) {
            C5883.m13223(this.f51513, (Spannable) editable);
        }
    }
}
