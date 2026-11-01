package p067l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۤ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC12475 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C15826 f34934;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f34935;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ int f34936;

    public /* synthetic */ CallableC12475(C15826 c15826, int i, int i2) {
        this.f34934 = c15826;
        this.f34935 = i;
        this.f34936 = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C15826.m35912(this.f34934, this.f34935, this.f34936);
    }
}
