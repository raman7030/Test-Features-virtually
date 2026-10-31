package l;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩺֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P50D */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22649 implements IntConsumer {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f73154;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f73155;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f73156;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7127 f73157;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17636[] f73158;

    public /* synthetic */ C22649(C7127 c7127, C17636[] c17636Arr, long j, OutputStream outputStream, AtomicReference atomicReference) {
        this.f73157 = c7127;
        this.f73158 = c17636Arr;
        this.f73156 = j;
        this.f73155 = outputStream;
        this.f73154 = atomicReference;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        C7127.m19144(this.f73157, this.f73158, this.f73156, this.f73155, this.f73154, i);
    }

    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }
}
