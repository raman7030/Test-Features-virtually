package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۠᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10442 implements Consumer {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7089 f28871;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f28872;

    public /* synthetic */ C10442(C7089 c7089, boolean z) {
        this.f28871 = c7089;
        this.f28872 = z;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void m45213n(Object obj) {
        C7089.m16320(this.f28871, this.f28872, (ActivityC18686) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C24719.$default$andThen(this, consumer);
    }
}
