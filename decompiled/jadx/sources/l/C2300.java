package l;

import android.text.Editable;

/* JADX INFO: renamed from: l.ۖۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M74S */
/* JADX INFO: loaded from: classes2.dex */
public final class C2300 extends AbstractC3253 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC23466 f7426;

    public C2300(RunnableC23466 runnableC23466) {
        this.f7426 = runnableC23466;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f7426.run();
    }
}
