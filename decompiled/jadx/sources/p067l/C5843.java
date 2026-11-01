package p067l;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۘۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4G9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5843 implements InterfaceC4502 {

    /* JADX INFO: renamed from: ۗ */
    public Uri f14327;

    /* JADX INFO: renamed from: ۙ */
    public ParcelFileDescriptor f14328;

    /* JADX INFO: renamed from: ᩶ */
    public String f14329;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f14330 = false;

    /* JADX INFO: renamed from: ᩹ */
    public FileDescriptor f14331;

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

    public C5843(Uri uri, String str) throws FileNotFoundException {
        this.f14327 = uri;
        this.f14329 = str;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = C7050.m16233().openFileDescriptor(uri, str);
            this.f14328 = parcelFileDescriptorOpenFileDescriptor;
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new FileNotFoundException();
            }
            this.f14331 = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
        } catch (Error | RuntimeException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException();
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        }
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4502 mo9520(long j, long j2) {
        return new C21937(mo9519(), j, j2);
    }

    @Override // p067l.InterfaceC4502
    public final void seek(long j) throws IOException {
        try {
            Os.lseek(this.f14331, j, OsConstants.SEEK_SET);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4502 mo9522(long j, long j2) {
        return new C21937(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int i3 = Os.read(this.f14331, bArr, i, i2);
            if (i3 == 0) {
                return -1;
            }
            return i3;
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.InterfaceC4502
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            Os.write(this.f14331, bArr, i, i2);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.InterfaceC4502
    public final long length() throws IOException {
        FileDescriptor fileDescriptor = this.f14331;
        try {
            long jLseek = Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            long jLseek2 = Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_END);
            Os.lseek(fileDescriptor, jLseek, OsConstants.SEEK_SET);
            return jLseek2;
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.InterfaceC4502
    public final void setLength(long j) throws IOException {
        try {
            Os.ftruncate(this.f14331, j);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.InterfaceC4502
    public final long position() throws IOException {
        try {
            return Os.lseek(this.f14331, 0L, OsConstants.SEEK_CUR);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܺ */
    public final void mo9521() throws IOException {
        try {
            Os.fsync(this.f14331);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // p067l.InterfaceC4502
    public final boolean isClosed() {
        return this.f14330;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f14330) {
            return;
        }
        this.f14330 = true;
        boolean zEquals = this.f14329.equals("r");
        ParcelFileDescriptor parcelFileDescriptor = this.f14328;
        if (zEquals) {
            C2700.m4192(parcelFileDescriptor);
        } else {
            parcelFileDescriptor.close();
        }
    }

    @Override // p067l.InterfaceC4502
    public final String getName() {
        return C16253.m37021(this.f14327);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4502 mo9519() {
        return new C5843(this.f14327, this.f14329);
    }
}
