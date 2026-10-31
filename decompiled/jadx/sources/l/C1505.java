package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.֫֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1505 implements Closeable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10678 f5356;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1274[] f5357;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f5358;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f5359;

    public C1505(C10678 c10678, String str, long j, InterfaceC1274[] interfaceC1274Arr) {
        this.f5356 = c10678;
        this.f5358 = str;
        this.f5359 = j;
        this.f5357 = interfaceC1274Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13680 m5186() {
        String str = this.f5358;
        return this.f5356.m26795(this.f5359, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1274 m5185(int i) {
        return this.f5357[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InterfaceC1274 interfaceC1274 : this.f5357) {
            C20032.m46179(interfaceC1274);
        }
    }
}
