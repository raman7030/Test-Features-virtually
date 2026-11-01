package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۢ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11166 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnClickListenerC10495 f30999;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C11166(ViewOnClickListenerC10495 viewOnClickListenerC10495) {
        this.f30999 = viewOnClickListenerC10495;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ViewOnClickListenerC10495 viewOnClickListenerC10495 = this.f30999;
        if (viewOnClickListenerC10495.f29060.getVisibility() == 0) {
            viewOnClickListenerC10495.f29060.setVisibility(8);
        }
    }
}
