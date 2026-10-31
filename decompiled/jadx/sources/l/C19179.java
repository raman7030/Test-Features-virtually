package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.᩵ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4GW */
/* JADX INFO: loaded from: classes5.dex */
public final class C19179 implements InterfaceC2245 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f60431;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f60432;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f60433 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final File f60434;

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ᩻ܽ */
    public final boolean mo7441() {
        return true;
    }

    public C19179(File file, String str) {
        this.f60434 = file;
        this.f60432 = str;
        this.f60431 = new RandomAccessFile(file, str);
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) throws IOException {
        this.f60431.seek(j);
    }

    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) {
        return this.f60431.read(bArr, i, i2);
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f60431.write(bArr, i, i2);
    }

    @Override // l.InterfaceC2245
    public final long length() {
        return this.f60431.length();
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2245 mo7438(long j, long j2) {
        return new C20590(mo7437(), j, j2);
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) throws IOException {
        this.f60431.setLength(j);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC2245 mo7440(long j, long j2) {
        return new C20590(this, j, j2);
    }

    @Override // l.InterfaceC2245
    public final long position() {
        return this.f60431.getFilePointer();
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܺ */
    public final void mo7439() throws SyncFailedException {
        this.f60431.getFD().sync();
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ֫ܽ */
    public final FileChannel mo7436() {
        return C12084.convertMaybeLegacyFileChannelFromLibrary(this.f60431.getChannel());
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        return this.f60434.getName();
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC2245 mo7437() {
        return new C19179(this.f60434, this.f60432);
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f60433;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f60433) {
            return;
        }
        this.f60433 = true;
        boolean zEquals = this.f60432.equals("r");
        RandomAccessFile randomAccessFile = this.f60431;
        if (zEquals) {
            C0349.m1793(randomAccessFile);
        } else {
            randomAccessFile.close();
        }
    }
}
