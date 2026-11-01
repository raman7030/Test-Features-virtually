package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7E3 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9878 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C16583 f27401;

    public /* synthetic */ C9878(C16583 c16583) {
        this.f27401 = c16583;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C16583.m37585(this.f27401, (String) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
