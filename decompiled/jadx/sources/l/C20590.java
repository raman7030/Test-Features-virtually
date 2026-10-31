package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩷ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AJ2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20590 implements InterfaceC2245 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2245 f66283;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f66284;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f66285;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f66286;

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo7436() {
        return null;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo7441() {
        return false;
    }

    public C20590(InterfaceC2245 interfaceC2245, long j, long j2) throws IOException {
        this.f66283 = interfaceC2245;
        this.f66286 = j;
        this.f66285 = j2;
        long length = interfaceC2245.length();
        if (j + j2 > length) {
            throw new IOException(String.format("fragment.offset=%d, fragment.length=%d, data.length=%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(length)));
        }
        seek(0L);
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) {
        long j2 = this.f66286;
        InterfaceC2245 interfaceC2245 = this.f66283;
        interfaceC2245.seek(j + j2);
        this.f66284 = interfaceC2245.position() - j2;
    }

    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f66285 - this.f66284;
        if (i2 > j) {
            if (j <= 0) {
                return -1;
            }
            i2 = (int) j;
        }
        int i3 = this.f66283.read(bArr, i, i2);
        if (i3 > 0) {
            this.f66284 += (long) i3;
        }
        return i3;
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("FragmentRandomAccessData is readonly");
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2245 mo7438(long j, long j2) {
        return new C20590(mo7437(), j, j2);
    }

    @Override // l.InterfaceC2245
    public final long length() {
        return this.f66285;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC2245 mo7440(long j, long j2) {
        return new C20590(this, j, j2);
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) throws IOException {
        throw new IOException("FragmentRandomAccessData is readonly");
    }

    @Override // l.InterfaceC2245
    public final long position() {
        return this.f66284;
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܺ */
    public final void mo7439() {
        this.f66283.mo7439();
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f66283.getName());
        sb.append("-Fragment(");
        sb.append(this.f66286);
        sb.append(",");
        return C15942.m37718(sb, this.f66285, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC2245 mo7437() {
        return new C20590(this.f66283.mo7437(), this.f66286, this.f66285);
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f66283.isClosed();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f66283.close();
    }
}
