package p067l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۚۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7379 implements LongConsumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14084 f19329;

    public /* synthetic */ C7379(C14084 c14084) {
        this.f19329 = c14084;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f19329.m31958(j);
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C4603.$default$andThen(this, longConsumer);
    }
}
