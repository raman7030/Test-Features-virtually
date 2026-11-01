package p067l;

import java.nio.channels.ClosedChannelException;

/* JADX INFO: renamed from: l.ۖۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C4736 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ */
    public final long f10725;

    /* JADX INFO: renamed from: ᩶ */
    public final C24181 f10726;

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f10727;

    /* JADX INFO: renamed from: ᩹ */
    public final int f10728;

    public C4736(int i, long j, C24181 c24181) {
        this.f10726 = c24181;
        this.f10725 = j;
        this.f10728 = i;
    }

    public final int length() {
        return this.f10728;
    }

    public final boolean isOpen() {
        return !this.f10727 && this.f10726.f76665;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f10727) {
                return;
            }
            this.f10727 = true;
            this.f10726.m53467(this.f10728, this.f10725);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10035(int i, byte[] bArr, int i2, int i3) {
        if (isOpen()) {
            C10927.m25190(this.f10728, i, i3);
            C10927.m25189(bArr.length, i2, i3);
            this.f10726.m53463(this.f10725 + ((long) i), bArr, i2, i3);
            return;
        }
        throw new ClosedChannelException();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10036(int i, byte[] bArr, int i2, int i3) {
        if (isOpen()) {
            C10927.m25190(this.f10728, i, i3);
            C10927.m25189(bArr.length, i2, i3);
            this.f10726.m53465(this.f10725 + ((long) i), bArr, i2, i3);
            return;
        }
        throw new ClosedChannelException();
    }
}
