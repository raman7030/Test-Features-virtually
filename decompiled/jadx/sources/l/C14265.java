package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14265 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22028 f42967;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C14265(C22028 c22028) {
        this.f42967 = c22028;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f42967.m49567(charSequence);
    }
}
