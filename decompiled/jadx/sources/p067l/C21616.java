package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21616 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6863 f68132;

    public /* synthetic */ C21616(C6863 c6863) {
        this.f68132 = c6863;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C6863.m15725(this.f68132, (C15579) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
