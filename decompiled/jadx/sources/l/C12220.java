package l;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۫ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12220 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f36453;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f36454 = new byte[32768];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f36455 = 18;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InputStream f36456;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f36457;

    public C12220(InputStream inputStream) {
        this.f36456 = inputStream;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29710() throws IOException {
        long j = this.f36455;
        if (j >= 268435456) {
            throw new C5870("TGA input exceeds byte limit");
        }
        int i = this.f36453;
        int i2 = this.f36457;
        byte[] bArr = this.f36454;
        if (i == i2) {
            int iMin = (int) Math.min(bArr.length, 268435456 - j);
            InputStream inputStream = this.f36456;
            int i3 = inputStream.read(bArr, 0, iMin);
            this.f36457 = i3;
            this.f36453 = 0;
            if (i3 == 0) {
                int i4 = inputStream.read();
                if (i4 < 0) {
                    throw new EOFException("Truncated TGA pixels");
                }
                this.f36455++;
                return i4;
            }
            if (i3 < 0) {
                throw new EOFException("Truncated TGA pixels");
            }
        }
        this.f36455++;
        int i5 = this.f36453;
        this.f36453 = i5 + 1;
        return bArr[i5] & 255;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29711(long j) throws IOException {
        if (j < 18 || j > 268435456) {
            throw new IOException("Invalid TGA offset");
        }
        long j2 = this.f36455 - ((long) this.f36453);
        int i = this.f36457;
        if (i > 0 && j >= j2 && j <= ((long) i) + j2) {
            this.f36453 = (int) (j - j2);
            this.f36455 = j;
        } else {
            C12084.convertMaybeLegacyFileChannelFromLibrary(((FileInputStream) this.f36456).getChannel()).position(j);
            this.f36455 = j;
            this.f36457 = 0;
            this.f36453 = 0;
        }
    }
}
