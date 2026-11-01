package p067l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U73P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10609 implements InterfaceC9501 {

    /* JADX INFO: renamed from: ۙ */
    public final long f29365;

    /* JADX INFO: renamed from: ᩶ */
    public final C6998 f29366;

    /* JADX INFO: renamed from: ᩸ */
    public final C6998 f29367;

    /* JADX INFO: renamed from: ᩹ */
    public final long f29368;

    public C10609(C6998 c6998, C6998 c6999) {
        this.f29367 = c6998;
        this.f29366 = c6999;
        this.f29368 = c6998.length();
        this.f29365 = c6999.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m24427() {
        return this.f29368;
    }

    @Override // p067l.InterfaceC9501
    public final long length() {
        return this.f29368 + this.f29365;
    }

    @Override // p067l.InterfaceC9501
    /* JADX INFO: renamed from: ۧ */
    public final void mo10697(long j, byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        if (j >= 0 && i2 >= 0) {
            long j2 = i2;
            if (j <= length() - j2) {
                long j3 = this.f29368;
                if (j < j3) {
                    iMin = (int) Math.min(j2, j3 - j);
                    this.f29367.mo10697(j, bArr, i, iMin);
                } else {
                    iMin = 0;
                }
                int i3 = i2 - iMin;
                if (i3 > 0) {
                    this.f29366.mo10697(Math.max(0L, j - j3), bArr, i + iMin, i3);
                    return;
                }
                return;
            }
        }
        throw new EOFException("HLS fragment read exceeds virtual resource");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f29367.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f29366.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        if (e != null) {
            throw e;
        }
    }
}
