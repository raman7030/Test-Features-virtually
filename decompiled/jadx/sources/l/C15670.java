package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܺۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes4.dex */
public final class C15670 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC3677 f48236;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C15670(DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677) {
        this.f48236 = dialogInterfaceOnClickListenerC3677;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = this.f48236;
        if (dialogInterfaceOnClickListenerC3677.f11612) {
            return;
        }
        String string = editable.toString();
        if (C9896.m24997(string)) {
            int iM25001 = C9896.m25001(string);
            dialogInterfaceOnClickListenerC3677.f11619.m26466(iM25001);
            dialogInterfaceOnClickListenerC3677.m11190(iM25001, false);
            if (dialogInterfaceOnClickListenerC3677.f11621) {
                DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceOnClickListenerC3677.f11613;
                dialogInterfaceOnClickListenerC3677.f11621 = false;
                dialogInterfaceC0206.m1441(false);
            }
        }
    }
}
