package p067l;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۫ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13982 {

    /* JADX INFO: renamed from: ֫ */
    public int f39467;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f39468 = new byte[32768];

    /* JADX INFO: renamed from: ܽ */
    public long f39469 = 18;

    /* JADX INFO: renamed from: ܿ */
    public final InputStream f39470;

    /* JADX INFO: renamed from: ᩳ */
    public int f39471;

    public C13982(InputStream inputStream) {
        this.f39470 = inputStream;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m31772() throws IOException {
        long j = this.f39469;
        if (j >= 268435456) {
            throw new C7947("TGA input exceeds byte limit");
        }
        int i = this.f39467;
        int i2 = this.f39471;
        byte[] bArr = this.f39468;
        if (i == i2) {
            int iMin = (int) Math.min(bArr.length, 268435456 - j);
            InputStream inputStream = this.f39470;
            int i3 = inputStream.read(bArr, 0, iMin);
            this.f39471 = i3;
            this.f39467 = 0;
            if (i3 == 0) {
                int i4 = inputStream.read();
                if (i4 < 0) {
                    throw new EOFException("Truncated TGA pixels");
                }
                this.f39469++;
                return i4;
            }
            if (i3 < 0) {
                throw new EOFException("Truncated TGA pixels");
            }
        }
        this.f39469++;
        int i5 = this.f39467;
        this.f39467 = i5 + 1;
        return bArr[i5] & 255;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31773(long j) throws IOException {
        if (j < 18 || j > 268435456) {
            throw new IOException("Invalid TGA offset");
        }
        long j2 = this.f39469 - ((long) this.f39467);
        int i = this.f39471;
        if (i > 0 && j >= j2 && j <= ((long) i) + j2) {
            this.f39467 = (int) (j - j2);
            this.f39469 = j;
        } else {
            C13853.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) this.f39470).getChannel()).position(j);
            this.f39469 = j;
            this.f39471 = 0;
            this.f39467 = 0;
        }
    }
}
