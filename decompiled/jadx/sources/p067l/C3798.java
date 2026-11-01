package p067l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.֫֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3798 implements Closeable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12516 f8137;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC3579[] f8138;

    /* JADX INFO: renamed from: ᩸ */
    public final String f8139;

    /* JADX INFO: renamed from: ᩹ */
    public final long f8140;

    public C3798(C12516 c12516, String str, long j, InterfaceC3579[] interfaceC3579Arr) {
        this.f8137 = c12516;
        this.f8139 = str;
        this.f8140 = j;
        this.f8138 = interfaceC3579Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15370 m7412() {
        String str = this.f8139;
        return this.f8137.m28834(this.f8140, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3579 m7411(int i) {
        return this.f8138[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InterfaceC3579 interfaceC3579 : this.f8138) {
            C21407.m48495(interfaceC3579);
        }
    }
}
