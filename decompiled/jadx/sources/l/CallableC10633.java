package l;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: l.ۤ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC10633 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14159 f31963;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31964;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31965;

    public /* synthetic */ CallableC10633(C14159 c14159, int i, int i2) {
        this.f31963 = c14159;
        this.f31964 = i;
        this.f31965 = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C14159.m33780(this.f31963, this.f31964, this.f31965);
    }
}
