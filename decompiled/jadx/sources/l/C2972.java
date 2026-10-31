package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۗۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2972 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC12849 f9418;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2972(AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849) {
        this.f9418 = abstractDialogInterfaceOnClickListenerC12849;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AbstractDialogInterfaceOnClickListenerC12849 abstractDialogInterfaceOnClickListenerC12849 = this.f9418;
        if (abstractDialogInterfaceOnClickListenerC12849.m31259()) {
            abstractDialogInterfaceOnClickListenerC12849.f38589.setVisibility(8);
        }
    }
}
