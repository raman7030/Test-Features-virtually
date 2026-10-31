package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22966 implements Consumer {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5660 f73965;

    public /* synthetic */ C22966(C5660 c5660) {
        this.f73965 = c5660;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f73965.f17475.m45073((C0569) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}
