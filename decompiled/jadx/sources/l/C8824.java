package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۡۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8824 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3885 f26898;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C8824(C3885 c3885) {
        this.f26898 = c3885;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C3885 c3885 = this.f26898;
        if (c3885.m11749()) {
            c3885.f12410.m3717();
            c3885.f12415.m3717();
            c3885.f12417.removeMessages(0);
            c3885.f12417.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
