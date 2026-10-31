package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۢ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9257 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8551 f28053;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C9257(ViewOnClickListenerC8551 viewOnClickListenerC8551) {
        this.f28053 = viewOnClickListenerC8551;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ViewOnClickListenerC8551 viewOnClickListenerC8551 = this.f28053;
        if (viewOnClickListenerC8551.f26145.getVisibility() == 0) {
            viewOnClickListenerC8551.f26145.setVisibility(8);
        }
    }
}
