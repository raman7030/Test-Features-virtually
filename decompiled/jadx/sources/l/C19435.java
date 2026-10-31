package l;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: X99G */
/* JADX INFO: loaded from: classes5.dex */
public final class C19435 extends AbstractC3912 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f62862;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f62864;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f62865;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C23411 f62866;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f62868;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f62863 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62867 = -1;

    public C19435(AbstractC15440 abstractC15440) throws EOFException {
        C23411 c23411M36513 = abstractC15440.m36513("r");
        this.f62866 = c23411M36513;
        long length = c23411M36513.length();
        int i = (int) length;
        if (length != i) {
            throw new ArithmeticException();
        }
        this.f62862 = i;
        this.f62868 = new byte[i];
        this.f62866.seek(0L);
        this.f62866.readFully(this.f62868);
        this.f62865 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44776(C12918 c12918) {
        if (c12918.m31418() != this) {
            throw new RuntimeException();
        }
        Iterator it = new C15034(c12918).iterator();
        C20846 c20846 = null;
        int i = -1;
        int i2 = -1;
        while (it.hasNext()) {
            Iterator it2 = ((C7980) it.next()).getMethods().iterator();
            while (it2.hasNext()) {
                C20846 c20846Mo3570 = ((C16611) it2.next()).mo3570();
                if (c20846Mo3570 != null) {
                    int i3 = c20846Mo3570.f67488;
                    if (i == -1) {
                        c20846 = c20846Mo3570;
                        i = i3;
                        i2 = i;
                    } else if (i3 < i) {
                        i = i3;
                    } else if (i3 > i2) {
                        c20846 = c20846Mo3570;
                        i2 = i3;
                    }
                }
            }
        }
        if (c20846 == null) {
            return;
        }
        int iM47669 = (c20846.m47669() * 2) + c20846.f67488 + 16;
        Iterator it3 = c20846.mo3811().iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((C15905) it3.next()).mo14556().iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            iM47669 = Math.max(iM47669, ((AbstractC21427) it4).m48544());
        }
        if (this.f62863 != -1) {
            throw new IllegalStateException();
        }
        this.f62863 = i;
        this.f62867 = iM47669;
        if (this.f62866 == null) {
            AbstractC15440 abstractC15440M36527 = C16293.f50113.m36527();
            abstractC15440M36527.m36503(this.f62868, i, iM47669 - i);
            this.f62864 = abstractC15440M36527;
            this.f62866 = abstractC15440M36527.m36513("r");
            this.f62865 = -i;
        }
        byte[] bArr = this.f62868;
        int length = bArr.length - (iM47669 - i);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        byte[] bArr3 = this.f62868;
        System.arraycopy(bArr3, iM47669, bArr2, i, bArr3.length - iM47669);
        System.out.println("FileDexBuffer.optimize() save memory: " + ((this.f62868.length - length) / 1024) + "KB");
        this.f62868 = bArr2;
    }

    @Override // l.AbstractC3912
    /* JADX INFO: renamed from: ֫ */
    public final byte mo11933(int i) {
        byte b;
        int i2 = this.f62863;
        int i3 = this.f62867;
        boolean z = true;
        if (i2 != -1 && i > i2 - 1) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            return this.f62868[i];
        }
        if (i < i2 || i + 1 > i3) {
            throw new RuntimeException();
        }
        synchronized (this.f62866) {
            try {
                try {
                    this.f62866.seek(this.f62865 + i);
                    b = this.f62866.readByte();
                } catch (IOException e) {
                    throw new C15431(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // l.AbstractC3912
    /* JADX INFO: renamed from: ᩻ */
    public final int mo11943(int i) {
        boolean z;
        short sMo21172;
        int i2 = this.f62863;
        int i3 = this.f62867;
        if (i2 == -1 || i <= i2 - 2) {
            z = true;
        } else if (i >= i3) {
            i -= i3 - i2;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = this.f62868;
            return (bArr[i + 1] << 8) | (bArr[i] & 255);
        }
        if (i < i2 || i + 2 > i3) {
            return (mo11933(i + 1) << 8) | (mo11933(i) & 255);
        }
        synchronized (this.f62866) {
            try {
                try {
                    this.f62866.seek(this.f62865 + i);
                    sMo21172 = (short) this.f62866.mo21172();
                } catch (IOException e) {
                    throw new C15431(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sMo21172;
    }

    @Override // l.AbstractC3912
    /* JADX INFO: renamed from: ۧ */
    public final int mo11937(int i) {
        int i2;
        int i3 = this.f62863;
        int i4 = this.f62867;
        boolean z = true;
        if (i3 != -1 && i > i3 - 4) {
            if (i >= i4) {
                i -= i4 - i3;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f62868;
            return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        if (i < i3 || i + 4 > i4) {
            return (mo11933(i + 3) << 24) | (mo11933(i) & 255) | ((mo11933(i + 1) & 255) << 8) | ((mo11933(i + 2) & 255) << 16);
        }
        synchronized (this.f62866) {
            try {
                try {
                    this.f62866.seek(this.f62865 + i);
                    i2 = this.f62866.readInt();
                } catch (IOException e) {
                    throw new C15431(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    @Override // l.AbstractC3912
    /* JADX INFO: renamed from: ܽ */
    public final long mo11940(int i) {
        long j;
        int i2 = this.f62863;
        int i3 = this.f62867;
        boolean z = true;
        if (i2 != -1 && i > i2 - 8) {
            if (i >= i3) {
                i -= i3 - i2;
            } else {
                z = false;
            }
        }
        if (z) {
            byte[] bArr = this.f62868;
            return (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 4]) & 255) << 32) | ((long) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 40);
        }
        if (i < i2 || i + 8 > i3) {
            return ((long) ((mo11933(i) & 255) | ((mo11933(i + 1) & 255) << 8) | ((mo11933(i + 2) & 255) << 16))) | ((((long) mo11933(i + 3)) & 255) << 24) | ((((long) mo11933(i + 4)) & 255) << 32) | ((((long) mo11933(i + 5)) & 255) << 40) | ((((long) mo11933(i + 6)) & 255) << 48) | (((long) mo11933(i + 7)) << 56);
        }
        synchronized (this.f62866) {
            try {
                try {
                    this.f62866.seek(this.f62865 + i);
                    j = this.f62866.readLong();
                } catch (IOException e) {
                    throw new C15431(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // l.AbstractC3912
    public final int length() {
        return this.f62862;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f62868 = null;
        C23411 c23411 = this.f62866;
        if (c23411 != null) {
            c23411.close();
            this.f62866 = null;
        }
        AbstractC15440 abstractC15440 = this.f62864;
        if (abstractC15440 != null) {
            abstractC15440.mo27929();
            this.f62864 = null;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        C0349.m1793(this);
    }
}
