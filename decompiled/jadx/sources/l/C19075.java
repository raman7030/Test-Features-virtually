package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ᩴ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes4.dex */
public final class C19075 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f60062;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C19075(C15545 c15545) {
        this.f60062 = c15545;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C15545 c15545 = this.f60062;
        c15545.m36659();
        if (c15545.m36691()) {
            c15545.f47922.m3717();
            c15545.f47936.removeMessages(0);
            c15545.f47936.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
