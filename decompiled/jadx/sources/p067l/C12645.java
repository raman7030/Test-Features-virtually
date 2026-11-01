package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12645 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C17337 f35505;

    public /* synthetic */ C12645(C17337 c17337) {
        this.f35505 = c17337;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35505.m39317((AbstractC17043) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
