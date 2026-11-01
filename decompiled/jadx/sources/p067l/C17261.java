package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܺۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes4.dex */
public final class C17261 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogInterfaceOnClickListenerC5863 f51374;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C17261(DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863) {
        this.f51374 = dialogInterfaceOnClickListenerC5863;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863 = this.f51374;
        if (dialogInterfaceOnClickListenerC5863.f14416) {
            return;
        }
        String string = editable.toString();
        if (C11774.m27012(string)) {
            int iM27016 = C11774.m27016(string);
            dialogInterfaceOnClickListenerC5863.f14423.m28499(iM27016);
            dialogInterfaceOnClickListenerC5863.m13150(iM27016, false);
            if (dialogInterfaceOnClickListenerC5863.f14425) {
                DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceOnClickListenerC5863.f14417;
                dialogInterfaceOnClickListenerC5863.f14425 = false;
                dialogInterfaceC2564.m3854(false);
            }
        }
    }
}
