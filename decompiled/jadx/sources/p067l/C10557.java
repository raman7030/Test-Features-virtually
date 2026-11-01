package p067l;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۡۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 192I */
/* JADX INFO: loaded from: classes3.dex */
public final class C10557 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ DialogInterfaceOnClickListenerC5863 f29235;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C10557(DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863) {
        this.f29235 = dialogInterfaceOnClickListenerC5863;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DialogInterfaceOnClickListenerC5863 dialogInterfaceOnClickListenerC5863 = this.f29235;
        if (dialogInterfaceOnClickListenerC5863.f14416) {
            return;
        }
        try {
            int i = Integer.parseInt(dialogInterfaceOnClickListenerC5863.f14422.getText().toString());
            int i2 = Integer.parseInt(dialogInterfaceOnClickListenerC5863.f14420.getText().toString());
            int i3 = Integer.parseInt(dialogInterfaceOnClickListenerC5863.f14419.getText().toString());
            int i4 = Integer.parseInt(dialogInterfaceOnClickListenerC5863.f14421.getText().toString());
            if (i >= 0 && i <= 100 && i2 >= 0 && i2 <= 255 && i3 >= 0 && i3 <= 255 && i4 >= 0 && i4 <= 255) {
                int iArgb = Color.argb(Math.round((i * 255) / 100.0f), i2, i3, i4);
                dialogInterfaceOnClickListenerC5863.f14423.m28499(iArgb);
                dialogInterfaceOnClickListenerC5863.m13150(iArgb, false);
                if (dialogInterfaceOnClickListenerC5863.f14425) {
                    DialogInterfaceC2564 dialogInterfaceC2564 = dialogInterfaceOnClickListenerC5863.f14417;
                    dialogInterfaceOnClickListenerC5863.f14425 = false;
                    dialogInterfaceC2564.m3854(false);
                }
            }
        } catch (Exception unused) {
        }
    }
}
