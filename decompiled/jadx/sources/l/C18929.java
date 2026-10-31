package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VN */
/* JADX INFO: loaded from: classes4.dex */
public final class C18929 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f59646;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f59647;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f59648;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f59649;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23411 f59650;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f59651;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f59652;

    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    public C18929(C23411 c23411) throws IOException {
        long jM43689;
        long jM436810;
        boolean z;
        boolean z2;
        this.f59650 = c23411;
        long length = c23411.length();
        long j = length - 22;
        for (long jMax = Math.max(0L, length - 65557); j >= jMax; jMax = jMax) {
            m43686(j);
            if (m43690() == 101010256) {
                long j2 = 12 + j;
                m43686(j2);
                long jM43690 = ((long) m43690()) & 4294967295L;
                long jM43691 = ((long) m43690()) & 4294967295L;
                C23411 c23412 = this.f59650;
                int i = c23412.read();
                int i2 = c23412.read();
                if ((i | i2) < 0) {
                    throw new EOFException();
                }
                boolean z3 = false;
                boolean z4 = ((long) ((i2 << 8) | i)) == (length - j) - 22;
                boolean z5 = jM43691 == 4294967295L || jM43690 == 4294967295L;
                boolean z6 = jM43691 <= j && jM43690 <= j - jM43691;
                if (z4 && (z5 || z6)) {
                    this.f59651 = j;
                    m43686(j2);
                    long jM43692 = ((long) m43690()) & 4294967295L;
                    long jM43693 = ((long) m43690()) & 4294967295L;
                    if (jM43693 == 4294967295L || jM43692 == 4294967295L) {
                        long j3 = j - 20;
                        if (j3 >= 0) {
                            m43686(j3);
                            if (m43690() == 117853008) {
                                m43692(4);
                                m43686(m43689());
                                if (m43690() == 101075792) {
                                    m43689();
                                    m43692(12);
                                    m43689();
                                    m43692(8);
                                    jM43689 = m43689();
                                    jM436810 = m43689();
                                    z = true;
                                } else {
                                    z = false;
                                    jM43689 = 0;
                                    jM436810 = 0;
                                }
                            } else {
                                z = false;
                                jM43689 = 0;
                                jM436810 = 0;
                            }
                        } else {
                            z = false;
                            jM43689 = 0;
                            jM436810 = 0;
                        }
                    } else {
                        z = false;
                        jM43689 = 0;
                        jM436810 = 0;
                    }
                    if (z) {
                        jM43692 = jM43689;
                        jM43693 = jM436810;
                    }
                    if (jM43693 < 0 || jM43692 < 0 || jM43693 > j || jM43692 > j - jM43693) {
                        throw new IOException("Central Directory exceeds EOCD");
                    }
                    this.f59652 = z;
                    this.f59647 = jM43692;
                    this.f59646 = jM43693;
                    if (jM43693 >= 32) {
                        try {
                            m43686(jM43693 - 16);
                            if (m43689() == 2334950737559900225L && m43689() == 3617552046287187010L) {
                                m43686(jM43693 - 24);
                                long jM436811 = m43689();
                                long j4 = (jM43693 - jM436811) - 8;
                                if (j4 >= 0) {
                                    m43686(j4);
                                    if (m43689() == jM436811) {
                                        z3 = true;
                                        jM43693 = j4;
                                    }
                                }
                            }
                            z2 = z3;
                        } catch (Exception unused) {
                            z2 = false;
                        }
                    } else {
                        z2 = z3;
                    }
                    this.f59649 = jM43693;
                    this.f59648 = z2;
                    return;
                }
            }
            j--;
        }
        throw new IOException("Archive is not a ZIP archive");
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m43688() {
        return this.f59650.length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43686(long j) {
        this.f59650.seek(j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m43697() {
        return this.f59650.getFilePointer();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43692(int i) throws IOException {
        if (i < 0) {
            throw new IOException(C19370.m44628(i, "Skip "));
        }
        C23411 c23411 = this.f59650;
        long filePointer = c23411.getFilePointer() + ((long) i);
        if (filePointer > c23411.length()) {
            throw new EOFException();
        }
        c23411.seek(filePointer);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m43687(int i) throws IOException {
        if (i < 0) {
            throw new IOException(C19370.m44628(i, "Read "));
        }
        long j = i;
        C23411 c23411 = this.f59650;
        if (j > c23411.length() - c23411.getFilePointer()) {
            throw new EOFException();
        }
        byte[] bArr = new byte[i];
        c23411.m51858(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m43690() throws EOFException {
        C23411 c23411 = this.f59650;
        int i = c23411.read();
        int i2 = c23411.read();
        int i3 = c23411.read();
        int i4 = c23411.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        return (i4 << 24) | i | (i2 << 8) | (i3 << 16);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m43689() throws EOFException {
        C23411 c23411 = this.f59650;
        long j = c23411.read();
        long j2 = c23411.read();
        long j3 = c23411.read();
        long j4 = c23411.read();
        long j5 = c23411.read();
        long j6 = c23411.read();
        long j7 = c23411.read();
        long j8 = c23411.read();
        if ((j | j2 | j3 | j4 | j5 | j6 | j7 | j8) < 0) {
            throw new EOFException();
        }
        return (j8 << 56) | j | (j2 << 8) | (j3 << 16) | (j4 << 24) | (j5 << 32) | (j6 << 40) | (j7 << 48);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m43698() {
        return this.f59652;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m43694() {
        return this.f59649;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m43685() {
        return this.f59646;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m43691() {
        return this.f59647;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m43696() {
        return this.f59651;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m43693() {
        return this.f59648;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 m43695() {
        return this.f59650;
    }
}
