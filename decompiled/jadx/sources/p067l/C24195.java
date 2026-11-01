package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩺ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24195 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7748 f76696;

    public /* synthetic */ C24195(C7748 c7748) {
        this.f76696 = c7748;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f76696.f20322.m47369((C2909) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
