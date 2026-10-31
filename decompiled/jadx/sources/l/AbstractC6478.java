package l;

import android.os.ParcelFileDescriptor;
import bin.mt.plus.Features3;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۜۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C145 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6478 implements InterfaceC2245 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor f20001;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f20002 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f20003;

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

    public AbstractC6478(ParcelFileDescriptor parcelFileDescriptor) {
        this.f20001 = parcelFileDescriptor;
        this.f20003 = parcelFileDescriptor.getFd();
    }

    @Override // l.InterfaceC2245
    public final void seek(long j) {
        Features3.seek(this.f20003, j);
    }

    @Override // l.InterfaceC2245
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = Features3.read(this.f20003, bArr, i, i2);
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    @Override // l.InterfaceC2245
    public final void write(byte[] bArr, int i, int i2) {
        Features3.write(this.f20003, bArr, i, i2);
    }

    @Override // l.InterfaceC2245
    public final long length() {
        return Features3.length(this.f20003);
    }

    @Override // l.InterfaceC2245
    public final void setLength(long j) {
        Features3.truncate(this.f20003, j);
    }

    @Override // l.InterfaceC2245
    public final long position() {
        return Features3.tell(this.f20003);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2245 mo7438(long j, long j2) {
        return new C20590(mo7437(), j, j2);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC2245 mo7440(long j, long j2) {
        return new C20590(this, j, j2);
    }

    @Override // l.InterfaceC2245
    /* JADX INFO: renamed from: ܺ */
    public final void mo7439() {
        Features3.sync(this.f20003);
    }

    @Override // l.InterfaceC2245
    public final boolean isClosed() {
        return this.f20002;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f20002) {
            return;
        }
        this.f20002 = true;
        this.f20001.close();
    }
}
