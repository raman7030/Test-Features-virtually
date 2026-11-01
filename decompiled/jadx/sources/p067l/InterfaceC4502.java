package p067l;

import java.io.Closeable;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۖۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W4H2 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4502 extends Closeable {
    String getName();

    boolean isClosed();

    long length();

    long position();

    int read(byte[] bArr, int i, int i2);

    void seek(long j);

    void setLength(long j);

    void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ֫ܽ */
    FileChannel mo9518();

    /* JADX INFO: renamed from: ۡ */
    InterfaceC4502 mo9519();

    /* JADX INFO: renamed from: ۧ */
    InterfaceC4502 mo9520(long j, long j2);

    /* JADX INFO: renamed from: ܺ */
    void mo9521();

    /* JADX INFO: renamed from: ܽ */
    InterfaceC4502 mo9522(long j, long j2);

    /* JADX INFO: renamed from: ᩻ܽ */
    boolean mo9523();
}
