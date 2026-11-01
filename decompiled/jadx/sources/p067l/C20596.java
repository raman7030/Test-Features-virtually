package p067l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩵ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4GW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20596 implements InterfaceC4502 {

    /* JADX INFO: renamed from: ۙ */
    public final RandomAccessFile f63662;

    /* JADX INFO: renamed from: ᩶ */
    public final String f63663;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f63664 = false;

    /* JADX INFO: renamed from: ᩹ */
    public final File f63665;

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ᩻ܽ */
    public final boolean mo9523() {
        return true;
    }

    public C20596(File file, String str) {
        this.f63665 = file;
        this.f63663 = str;
        this.f63662 = new RandomAccessFile(file, str);
    }

    @Override // p067l.InterfaceC4502
    public final void seek(long j) throws IOException {
        this.f63662.seek(j);
    }

    @Override // p067l.InterfaceC4502
    public final int read(byte[] bArr, int i, int i2) {
        return this.f63662.read(bArr, i, i2);
    }

    @Override // p067l.InterfaceC4502
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f63662.write(bArr, i, i2);
    }

    @Override // p067l.InterfaceC4502
    public final long length() {
        return this.f63662.length();
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4502 mo9520(long j, long j2) {
        return new C21937(mo9519(), j, j2);
    }

    @Override // p067l.InterfaceC4502
    public final void setLength(long j) throws IOException {
        this.f63662.setLength(j);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4502 mo9522(long j, long j2) {
        return new C21937(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    public final long position() {
        return this.f63662.getFilePointer();
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܺ */
    public final void mo9521() throws SyncFailedException {
        this.f63662.getFD().sync();
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ֫ܽ */
    public final FileChannel mo9518() {
        return C13853.convertMaybeLegacyFileChannelFromLibrary(this.f63662.getChannel());
    }

    @Override // p067l.InterfaceC4502
    public final String getName() {
        return this.f63665.getName();
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4502 mo9519() {
        return new C20596(this.f63665, this.f63663);
    }

    @Override // p067l.InterfaceC4502
    public final boolean isClosed() {
        return this.f63664;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f63664) {
            return;
        }
        this.f63664 = true;
        boolean zEquals = this.f63663.equals("r");
        RandomAccessFile randomAccessFile = this.f63662;
        if (zEquals) {
            C2700.m4192(randomAccessFile);
        } else {
            randomAccessFile.close();
        }
    }
}
