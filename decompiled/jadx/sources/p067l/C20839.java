package p067l;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X99G */
/* JADX INFO: loaded from: classes5.dex */
public final class C20839 extends AbstractC6086 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public int f65478;

    /* JADX INFO: renamed from: ۤ */
    public AbstractC17043 f65480;

    /* JADX INFO: renamed from: ۫ */
    public int f65481;

    /* JADX INFO: renamed from: ۬ */
    public C24618 f65482;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f65484;

    /* JADX INFO: renamed from: ۙ */
    public int f65479 = -1;

    /* JADX INFO: renamed from: ᩶ */
    public int f65483 = -1;

    public C20839(AbstractC17043 abstractC17043) throws EOFException {
        C24618 c24618M38671 = abstractC17043.m38671("r");
        this.f65482 = c24618M38671;
        long length = c24618M38671.length();
        int i = (int) length;
        if (length != i) {
            throw new ArithmeticException();
        }
        this.f65478 = i;
        this.f65484 = new byte[i];
        this.f65482.seek(0L);
        this.f65482.readFully(this.f65484);
        this.f65481 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47071(C14645 c14645) {
        if (c14645.m33504() != this) {
            throw new RuntimeException();
        }
        Iterator it = new C16656(c14645).iterator();
        C22180 c22180 = null;
        int i = -1;
        int i2 = -1;
        while (it.hasNext()) {
            Iterator it2 = ((C9952) it.next()).getMethods().iterator();
            while (it2.hasNext()) {
                C22180 c22180Mo5857 = ((C18155) it2.next()).mo5857();
                if (c22180Mo5857 != null) {
                    int i3 = c22180Mo5857.f70170;
                    if (i == -1) {
                        c22180 = c22180Mo5857;
                        i = i3;
                        i2 = i;
                    } else if (i3 < i) {
                        i = i3;
                    } else if (i3 > i2) {
                        c22180 = c22180Mo5857;
                        i2 = i3;
                    }
                }
            }
        }
        if (c22180 == null) {
            return;
        }
        int iM49997 = (c22180.m49997() * 2) + c22180.f70170 + 16;
        Iterator it3 = c22180.mo6068().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((C17484) it3.next()).mo16460().iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            iM49997 = Math.max(iM49997, ((AbstractC22732) it4).m50881());
        }
        if (this.f65479 != -1) {
            throw new IllegalStateException();
        }
        this.f65479 = i;
        this.f65483 = iM49997;
        if (this.f65482 == null) {
            AbstractC17043 abstractC17043M38685 = C17853.f53280.m38685();
            abstractC17043M38685.m38661(this.f65484, i, iM49997 - i);
            this.f65480 = abstractC17043M38685;
            this.f65482 = abstractC17043M38685.m38671("r");
            this.f65481 = -i;
        }
        byte[] bArr = this.f65484;
        int length = bArr.length - (iM49997 - i);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = this.f65484;
        System.arraycopy(bArr3, iM49997, bArr2, i, bArr3.length - iM49997);
        System.out.println("FileDexBuffer.optimize() save memory: " + ((this.f65484.length - length) / 1024) + "KB");
        this.f65484 = bArr2;
    }

    @Override // p067l.AbstractC6086
    /* JADX INFO: renamed from: ֫ */
    public final byte mo13853(int i) {
        byte b;
        int i2 = this.f65479;
        int i3 = this.f65483;
        boolean z = true;
        if (i2 != -1 && i > i2 - 1) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            return this.f65484[i];
        }
        if (i < i2 || i + 1 > i3) {
            throw new RuntimeException();
        }
        synchronized (this.f65482) {
            try {
                try {
                    this.f65482.seek(this.f65481 + i);
                    b = this.f65482.readByte();
                } catch (IOException e) {
                    throw new C17034(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // p067l.AbstractC6086
    /* JADX INFO: renamed from: ᩻ */
    public final int mo13863(int i) {
        boolean z;
        short sMo23137;
        int i2 = this.f65479;
        int i3 = this.f65483;
        if (i2 == -1 || i <= i2 - 2) {
            z = true;
        } else if (i >= i3) {
            i -= i3 - i2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = this.f65484;
            return (bArr[i + 1] << 8) | (bArr[i] & 255);
        }
        if (i < i2 || i + 2 > i3) {
            return (mo13853(i + 1) << 8) | (mo13853(i) & 255);
        }
        synchronized (this.f65482) {
            try {
                try {
                    this.f65482.seek(this.f65481 + i);
                    sMo23137 = (short) this.f65482.mo23137();
                } catch (IOException e) {
                    throw new C17034(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sMo23137;
    }

    @Override // p067l.AbstractC6086
    /* JADX INFO: renamed from: ۧ */
    public final int mo13857(int i) {
        int i2;
        int i3 = this.f65479;
        int i4 = this.f65483;
        boolean z = true;
        if (i3 != -1 && i > i3 - 4) {
            if (i >= i4) {
                i -= i4 - i3;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f65484;
            return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        if (i < i3 || i + 4 > i4) {
            return (mo13853(i + 3) << 24) | (mo13853(i) & 255) | ((mo13853(i + 1) & 255) << 8) | ((mo13853(i + 2) & 255) << 16);
        }
        synchronized (this.f65482) {
            try {
                try {
                    this.f65482.seek(this.f65481 + i);
                    i2 = this.f65482.readInt();
                } catch (IOException e) {
                    throw new C17034(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    @Override // p067l.AbstractC6086
    /* JADX INFO: renamed from: ܽ */
    public final long mo13860(int i) {
        long j;
        int i2 = this.f65479;
        int i3 = this.f65483;
        boolean z = true;
        if (i2 != -1 && i > i2 - 8) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f65484;
            return (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 4]) & 255) << 32) | ((long) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 40);
        }
        if (i < i2 || i + 8 > i3) {
            return ((long) ((mo13853(i) & 255) | ((mo13853(i + 1) & 255) << 8) | ((mo13853(i + 2) & 255) << 16))) | ((((long) mo13853(i + 3)) & 255) << 24) | ((((long) mo13853(i + 4)) & 255) << 32) | ((((long) mo13853(i + 5)) & 255) << 40) | ((((long) mo13853(i + 6)) & 255) << 48) | (((long) mo13853(i + 7)) << 56);
        }
        synchronized (this.f65482) {
            try {
                try {
                    this.f65482.seek(this.f65481 + i);
                    j = this.f65482.readLong();
                } catch (IOException e) {
                    throw new C17034(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // p067l.AbstractC6086
    public final int length() {
        return this.f65478;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f65484 = null;
        C24618 c24618 = this.f65482;
        if (c24618 != null) {
            c24618.close();
            this.f65482 = null;
        }
        AbstractC17043 abstractC17043 = this.f65480;
        if (abstractC17043 != null) {
            abstractC17043.mo29990();
            this.f65480 = null;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        C2700.m4192(this);
    }
}
