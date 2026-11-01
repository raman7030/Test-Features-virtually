package p067l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.ۡۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10755 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6061 f29822;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C10755(C6061 c6061) {
        this.f29822 = c6061;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C6061 c6061 = this.f29822;
        if (c6061.m13685()) {
            c6061.f15217.m5988();
            c6061.f15222.m5988();
            c6061.f15224.removeMessages(0);
            c6061.f15224.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
