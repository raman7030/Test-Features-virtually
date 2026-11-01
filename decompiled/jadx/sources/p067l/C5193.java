package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۗۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5193 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC14580 f12217;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C5193(AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580) {
        this.f12217 = abstractDialogInterfaceOnClickListenerC14580;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractDialogInterfaceOnClickListenerC14580 abstractDialogInterfaceOnClickListenerC14580 = this.f12217;
        if (abstractDialogInterfaceOnClickListenerC14580.m33345()) {
            abstractDialogInterfaceOnClickListenerC14580.f41631.setVisibility(8);
        }
    }
}
