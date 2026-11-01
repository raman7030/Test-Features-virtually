package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.֡᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6SM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2983 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C14443 f5267;

    /* JADX INFO: renamed from: ۙ */
    public final int f5268;

    /* JADX INFO: renamed from: ᩶ */
    public final int f5269;

    /* JADX INFO: renamed from: ᩸ */
    public final int f5270;

    /* JADX INFO: renamed from: ᩹ */
    public final int f5271;

    public C2983(C14443 c14443, int i, int i2) {
        if (i < 0 || i2 < 0 || ((long) i) + ((long) i2) > c14443.length()) {
            throw new IllegalArgumentException("Legacy page range exceeds joined text");
        }
        this.f5268 = i;
        this.f5269 = i2;
        this.f5270 = c14443.m34523(i);
        this.f5271 = c14443.m34523(i + i2);
        this.f5267 = new C14443(c14443.m34522(), c14443.m33057());
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m4999(int i) throws IOException {
        this.f5267.length();
        if (i < -1 || i > this.f5269) {
            throw new IOException("Legacy coordinate exceeds active page");
        }
        if (i == -1) {
            return -1;
        }
        return this.f5268 + i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5000(InputStream inputStream, long j, InterfaceC21090 interfaceC21090) throws IOException {
        int iMin;
        C14443 c14443 = this.f5267;
        try {
            c14443.length();
            C25112 c25112 = new C25112(j, inputStream);
            if (j != 0) {
                if (c25112.readInt() != -1568513661) {
                    throw new IOException("Invalid legacy position stack magic");
                }
                int i = c25112.readByte() | (c25112.readByte() << 8);
                if (c25112.m55113() != ((long) i) * 8) {
                    throw new IOException("Invalid legacy position stack length");
                }
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = c25112.readInt();
                    int i4 = c25112.readInt();
                    int i5 = this.f5268;
                    int i6 = this.f5270;
                    c14443.length();
                    if (i3 < 0 || i4 < 0) {
                        iMin = -1;
                    } else {
                        int iMin2 = Math.min(i3, this.f5271 - i6) + i6;
                        iMin = (int) Math.min(((long) (iMin2 == i6 ? i5 : c14443.m34524(iMin2))) + ((long) i4), ((long) i5) + ((long) this.f5269));
                    }
                    interfaceC21090.mo15304(i3, i4, iMin);
                }
                c25112.m55115();
                inputStream.close();
                return;
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f5267.close();
    }
}
