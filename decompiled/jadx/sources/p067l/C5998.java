package p067l;

import android.text.Editable;
import android.text.TextWatcher;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۘ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public final class C5998 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C20751 f14863;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C5998(C20751 c20751) {
        this.f14863 = c20751;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C20751 c20751 = this.f14863;
        try {
            c20751.f64064 = new SimpleDateFormat(editable.toString(), Locale.ENGLISH);
            c20751.m33358(C23223.f72969);
            c20751.m33337(c20751.f64064.format(Long.valueOf(System.currentTimeMillis())));
        } catch (Exception e) {
            c20751.f64064 = null;
            c20751.m33358(C23223.f73004);
            c20751.m33337(e.getMessage());
        }
    }
}
