package l;

import android.text.Editable;
import android.text.TextWatcher;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۘ۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 052E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3819 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19342 f12056;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C3819(C19342 c19342) {
        this.f12056 = c19342;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C19342 c19342 = this.f12056;
        try {
            c19342.f60832 = new SimpleDateFormat(editable.toString(), Locale.ENGLISH);
            c19342.m31272(C21943.f70257);
            c19342.m31251(c19342.f60832.format(Long.valueOf(System.currentTimeMillis())));
        } catch (Exception e) {
            c19342.f60832 = null;
            c19342.m31272(C21943.f70293);
            c19342.m31251(e.getMessage());
        }
    }
}
