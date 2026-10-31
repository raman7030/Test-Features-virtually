package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۚۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5272 implements LongConsumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12327 f16492;

    public /* synthetic */ C5272(C12327 c12327) {
        this.f16492 = c12327;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f16492.m29898(j);
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }
}
