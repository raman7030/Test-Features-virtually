package p067l;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P50D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23894 implements IntConsumer {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ AtomicReference f75880;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ OutputStream f75881;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ long f75882;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9142 f75883;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C19130[] f75884;

    public /* synthetic */ C23894(C9142 c9142, C19130[] c19130Arr, long j, OutputStream outputStream, AtomicReference atomicReference) {
        this.f75883 = c9142;
        this.f75884 = c19130Arr;
        this.f75882 = j;
        this.f75881 = outputStream;
        this.f75880 = atomicReference;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C9142.m21087(this.f75883, this.f75884, this.f75882, this.f75881, this.f75880, i);
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C11309.$default$andThen(this, intConsumer);
    }
}
