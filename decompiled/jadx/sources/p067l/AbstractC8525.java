package p067l;

import android.os.ParcelFileDescriptor;
import bin.p000mt.plus.Features3;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۜۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C145 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8525 implements InterfaceC4502 {

    /* JADX INFO: renamed from: ᩶ */
    public final ParcelFileDescriptor f22876;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f22877 = false;

    /* JADX INFO: renamed from: ᩹ */
    public final int f22878;

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

    public AbstractC8525(ParcelFileDescriptor parcelFileDescriptor) {
        this.f22876 = parcelFileDescriptor;
        this.f22878 = parcelFileDescriptor.getFd();
    }

    @Override // p067l.InterfaceC4502
    public final void seek(long j) {
        Features3.seek(this.f22878, j);
    }

    @Override // p067l.InterfaceC4502
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = Features3.read(this.f22878, bArr, i, i2);
        if (i3 == 0) {
            return -1;
        }
        return i3;
    }

    @Override // p067l.InterfaceC4502
    public final void write(byte[] bArr, int i, int i2) {
        Features3.write(this.f22878, bArr, i, i2);
    }

    @Override // p067l.InterfaceC4502
    public final long length() {
        return Features3.length(this.f22878);
    }

    @Override // p067l.InterfaceC4502
    public final void setLength(long j) {
        Features3.truncate(this.f22878, j);
    }

    @Override // p067l.InterfaceC4502
    public final long position() {
        return Features3.tell(this.f22878);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4502 mo9520(long j, long j2) {
        return new C21937(mo9519(), j, j2);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4502 mo9522(long j, long j2) {
        return new C21937(this, j, j2);
    }

    @Override // p067l.InterfaceC4502
    /* JADX INFO: renamed from: ܺ */
    public final void mo9521() {
        Features3.sync(this.f22878);
    }

    @Override // p067l.InterfaceC4502
    public final boolean isClosed() {
        return this.f22877;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f22877) {
            return;
        }
        this.f22877 = true;
        this.f22876.close();
    }
}
