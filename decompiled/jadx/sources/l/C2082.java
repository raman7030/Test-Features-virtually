package l;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: l.֫᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2082 implements TextWatcher {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final RunnableC2539 f6945;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2082(RunnableC2539 runnableC2539) {
        this.f6945 = runnableC2539;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f6945.run();
    }
}
