package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U73P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8671 implements InterfaceC7505 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f26440;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4871 f26441;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4871 f26442;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f26443;

    public C8671(C4871 c4871, C4871 c4872) {
        this.f26442 = c4871;
        this.f26441 = c4872;
        this.f26443 = c4871.length();
        this.f26440 = c4872.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m22458() {
        return this.f26443;
    }

    @Override // l.InterfaceC7505
    public final long length() {
        return this.f26443 + this.f26440;
    }

    @Override // l.InterfaceC7505
    /* JADX INFO: renamed from: ۧ */
    public final void mo8637(long j, byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        if (j >= 0 && i2 >= 0) {
            long j2 = i2;
            if (j <= length() - j2) {
                long j3 = this.f26443;
                if (j < j3) {
                    iMin = (int) Math.min(j2, j3 - j);
                    this.f26442.mo8637(j, bArr, i, iMin);
                } else {
                    iMin = 0;
                }
                int i3 = i2 - iMin;
                if (i3 > 0) {
                    this.f26441.mo8637(Math.max(0L, j - j3), bArr, i + iMin, i3);
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
            this.f26442.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f26441.close();
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
