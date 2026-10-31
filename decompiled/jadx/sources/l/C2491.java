package l;

import java.nio.channels.ClosedChannelException;

/* JADX INFO: renamed from: l.ۖۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C2491 implements AutoCloseable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f7937;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22951 f7938;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f7939;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f7940;

    public C2491(int i, long j, C22951 c22951) {
        this.f7938 = c22951;
        this.f7937 = j;
        this.f7940 = i;
    }

    public final int length() {
        return this.f7940;
    }

    public final boolean isOpen() {
        return !this.f7939 && this.f7938.f73935;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f7939) {
                return;
            }
            this.f7939 = true;
            this.f7938.m51076(this.f7940, this.f7937);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7987(int i, byte[] bArr, int i2, int i3) {
        if (isOpen()) {
            C9005.m23246(this.f7940, i, i3);
            C9005.m23245(bArr.length, i2, i3);
            this.f7938.m51072(this.f7937 + ((long) i), bArr, i2, i3);
            return;
        }
        throw new ClosedChannelException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7988(int i, byte[] bArr, int i2, int i3) {
        if (isOpen()) {
            C9005.m23246(this.f7940, i, i3);
            C9005.m23245(bArr.length, i2, i3);
            this.f7938.m51074(this.f7937 + ((long) i), bArr, i2, i3);
            return;
        }
        throw new ClosedChannelException();
    }
}
