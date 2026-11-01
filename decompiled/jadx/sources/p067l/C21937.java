package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩷ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AJ2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21937 implements InterfaceC4502 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4502 f68964;

    /* JADX INFO: renamed from: ᩶ */
    public long f68965;

    /* JADX INFO: renamed from: ᩸ */
    public final long f68966;

    /* JADX INFO: renamed from: ᩹ */
    public final long f68967;

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ֫ܽ */
    public final /* synthetic */ FileChannel mo9518() {
        return null;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ᩻ܽ */
    public final /* synthetic */ boolean mo9523() {
        return false;
    }

    public C21937(InterfaceC4502 interfaceC4502, long j, long j2) throws IOException {
        this.f68964 = interfaceC4502;
        this.f68967 = j;
        this.f68966 = j2;
        long length = interfaceC4502.length();
        if (j + j2 > length) {
            throw new IOException(String.format("fragment.offset=%d, fragment.length=%d, data.length=%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(length)));
        }
        seek(0L);
    }

    @Override // p067l.InterfaceC4502
    public final void seek(long j) {
        long j2 = this.f68967;
        InterfaceC4502 interfaceC4502 = this.f68964;
        interfaceC4502.seek(j + j2);
        this.f68965 = interfaceC4502.position() - j2;
    }

    @Override // p067l.InterfaceC4502
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f68966 - this.f68965;
        if (i2 > j) {
            if (j <= 0) {
                return -1;
            }
            i2 = (int) j;
        }
        int i3 = this.f68964.read(bArr, i, i2);
        if (i3 > 0) {
            this.f68965 += (long) i3;
        }
        return i3;
    }

    @Override // p067l.InterfaceC4502
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        throw new IOException("FragmentRandomAccessData is readonly");
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4502 mo9520(long j, long j2) {
        return new C21937(mo9519(), j, j2);
    }

    @Override // p067l.InterfaceC4502
    public final long length() {
        return this.f68966;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4502 mo9522(long j, long j2) {
        return new C21937(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    public final void setLength(long j) throws IOException {
        throw new IOException("FragmentRandomAccessData is readonly");
    }

    @Override // p067l.InterfaceC4502
    public final long position() {
        return this.f68965;
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܺ */
    public final void mo9521() {
        this.f68964.mo9521();
    }

    @Override // p067l.InterfaceC4502
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f68964.getName());
        sb.append("-Fragment(");
        sb.append(this.f68967);
        sb.append(",");
        return C17520.m39893(sb, this.f68966, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4502 mo9519() {
        return new C21937(this.f68964.mo9519(), this.f68967, this.f68966);
    }

    @Override // p067l.InterfaceC4502
    public final boolean isClosed() {
        return this.f68964.isClosed();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f68964.close();
    }
}
