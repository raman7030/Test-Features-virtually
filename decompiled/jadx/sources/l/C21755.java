package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.᩸ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes.dex */
public final class C21755 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC5527 f69721;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C21755(RunnableC5527 runnableC5527) {
        this.f69721 = runnableC5527;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f69721.run();
    }
}
