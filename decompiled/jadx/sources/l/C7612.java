package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* JADX INFO: renamed from: l.۟ܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5HP */
/* JADX INFO: loaded from: classes3.dex */
public final class C7612 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC16700 f23554;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C7612(ViewOnClickListenerC16700 viewOnClickListenerC16700) {
        this.f23554 = viewOnClickListenerC16700;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ViewOnClickListenerC16700 viewOnClickListenerC16700 = this.f23554;
        View view = viewOnClickListenerC16700.f51275;
        boolean z = true;
        if (editable.length() != 0 && (editable.length() != 1 || editable.charAt(0) != '/')) {
            z = false;
        }
        view.setEnabled(z);
        viewOnClickListenerC16700.f51276.setEnabled(viewOnClickListenerC16700.f51275.isEnabled());
    }
}
