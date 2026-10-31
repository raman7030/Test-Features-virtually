package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܿۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8W7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17056 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10235 f52257;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C17056(C10235 c10235) {
        this.f52257 = c10235;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f52257.m30477(editable.toString());
    }
}
