package l;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۡۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes3.dex */
public final class C8616 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC3677 f26320;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C8616(DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677) {
        this.f26320 = dialogInterfaceOnClickListenerC3677;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = this.f26320;
        if (dialogInterfaceOnClickListenerC3677.f11612) {
            return;
        }
        try {
            int i = Integer.parseInt(dialogInterfaceOnClickListenerC3677.f11618.getText().toString());
            int i2 = Integer.parseInt(dialogInterfaceOnClickListenerC3677.f11616.getText().toString());
            int i3 = Integer.parseInt(dialogInterfaceOnClickListenerC3677.f11615.getText().toString());
            int i4 = Integer.parseInt(dialogInterfaceOnClickListenerC3677.f11617.getText().toString());
            if (i >= 0 && i <= 100 && i2 >= 0 && i2 <= 255 && i3 >= 0 && i3 <= 255 && i4 >= 0 && i4 <= 255) {
                int iArgb = Color.argb(Math.round((i * 255) / 100.0f), i2, i3, i4);
                dialogInterfaceOnClickListenerC3677.f11619.m26466(iArgb);
                dialogInterfaceOnClickListenerC3677.m11190(iArgb, false);
                if (dialogInterfaceOnClickListenerC3677.f11621) {
                    DialogInterfaceC0206 dialogInterfaceC0206 = dialogInterfaceOnClickListenerC3677.f11613;
                    dialogInterfaceOnClickListenerC3677.f11621 = false;
                    dialogInterfaceC0206.m1441(false);
                }
            }
        } catch (Exception unused) {
        }
    }
}
