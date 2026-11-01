package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.֨ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05XT */
/* JADX INFO: loaded from: classes2.dex */
public final class C3280 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ViewOnClickListenerC9986 f6390;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C3280(ViewOnClickListenerC9986 viewOnClickListenerC9986) {
        this.f6390 = viewOnClickListenerC9986;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int iM27008;
        String string = editable.toString();
        boolean zM27005 = C11774.m27005(string);
        ViewOnClickListenerC9986 viewOnClickListenerC9986 = this.f6390;
        String strM48945 = (!zM27005 || (iM27008 = C11774.m27008(string)) >= viewOnClickListenerC9986.f27661.f78320.mo5207()) ? null : viewOnClickListenerC9986.f27661.f78320.m48945(iM27008);
        if (strM48945 != null && !strM48945.isEmpty()) {
            viewOnClickListenerC9986.f27659.setText(strM48945);
            viewOnClickListenerC9986.f27659.setEnabled(false);
            viewOnClickListenerC9986.f27659.setAlpha(0.5f);
        } else {
            viewOnClickListenerC9986.f27659.setEnabled(true);
            viewOnClickListenerC9986.f27659.setAlpha(1.0f);
        }
    }
}
