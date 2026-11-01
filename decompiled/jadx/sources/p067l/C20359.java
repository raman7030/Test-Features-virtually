package p067l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VN */
/* JADX INFO: loaded from: classes4.dex */
public final class C20359 {

    /* JADX INFO: renamed from: ֫ */
    public final long f62877;

    /* JADX INFO: renamed from: ۧ */
    public final long f62878;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f62879;

    /* JADX INFO: renamed from: ܽ */
    public final long f62880;

    /* JADX INFO: renamed from: ܿ */
    public final C24618 f62881;

    /* JADX INFO: renamed from: ᩳ */
    public final long f62882;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f62883;

    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    public C20359(C24618 c24618) throws IOException {
        long jM45955;
        long jM45956;
        boolean z;
        boolean z2;
        this.f62881 = c24618;
        long length = c24618.length();
        long j = length - 22;
        for (long jMax = Math.max(0L, length - 65557); j >= jMax; jMax = jMax) {
            m45952(j);
            if (m45956() == 101010256) {
                long j2 = 12 + j;
                m45952(j2);
                long jM45957 = ((long) m45956()) & 4294967295L;
                long jM45958 = ((long) m45956()) & 4294967295L;
                C24618 c24619 = this.f62881;
                int i = c24619.read();
                int i2 = c24619.read();
                if ((i | i2) < 0) {
                    throw new EOFException();
                }
                boolean z3 = false;
                boolean z4 = ((long) ((i2 << 8) | i)) == (length - j) - 22;
                boolean z5 = jM45958 == 4294967295L || jM45957 == 4294967295L;
                boolean z6 = jM45958 <= j && jM45957 <= j - jM45958;
                if (z4 && (z5 || z6)) {
                    this.f62882 = j;
                    m45952(j2);
                    long jM45959 = ((long) m45956()) & 4294967295L;
                    long jM459510 = ((long) m45956()) & 4294967295L;
                    if (jM459510 == 4294967295L || jM45959 == 4294967295L) {
                        long j3 = j - 20;
                        if (j3 >= 0) {
                            m45952(j3);
                            if (m45956() == 117853008) {
                                m45958(4);
                                m45952(m45955());
                                if (m45956() == 101075792) {
                                    m45955();
                                    m45958(12);
                                    m45955();
                                    m45958(8);
                                    jM45955 = m45955();
                                    jM45956 = m45955();
                                    z = true;
                                } else {
                                    z = false;
                                    jM45955 = 0;
                                    jM45956 = 0;
                                }
                            } else {
                                z = false;
                                jM45955 = 0;
                                jM45956 = 0;
                            }
                        } else {
                            z = false;
                            jM45955 = 0;
                            jM45956 = 0;
                        }
                    } else {
                        z = false;
                        jM45955 = 0;
                        jM45956 = 0;
                    }
                    if (z) {
                        jM45959 = jM45955;
                        jM459510 = jM45956;
                    }
                    if (jM459510 < 0 || jM45959 < 0 || jM459510 > j || jM45959 > j - jM459510) {
                        throw new IOException("Central Directory exceeds EOCD");
                    }
                    this.f62883 = z;
                    this.f62878 = jM45959;
                    this.f62877 = jM459510;
                    if (jM459510 >= 32) {
                        try {
                            m45952(jM459510 - 16);
                            if (m45955() == 2334950737559900225L && m45955() == 3617552046287187010L) {
                                m45952(jM459510 - 24);
                                long jM459511 = m45955();
                                long j4 = (jM459510 - jM459511) - 8;
                                if (j4 >= 0) {
                                    m45952(j4);
                                    if (m45955() == jM459511) {
                                        z3 = true;
                                        jM459510 = j4;
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
                    this.f62880 = jM459510;
                    this.f62879 = z2;
                    return;
                }
            }
            j--;
        }
        throw new IOException("Archive is not a ZIP archive");
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m45954() {
        return this.f62881.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45952(long j) {
        this.f62881.seek(j);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m45963() {
        return this.f62881.getFilePointer();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45958(int i) throws IOException {
        if (i < 0) {
            throw new IOException(C20778.m46922(i, "Skip "));
        }
        C24618 c24618 = this.f62881;
        long filePointer = c24618.getFilePointer() + ((long) i);
        if (filePointer > c24618.length()) {
            throw new EOFException();
        }
        c24618.seek(filePointer);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m45953(int i) throws IOException {
        if (i < 0) {
            throw new IOException(C20778.m46922(i, "Read "));
        }
        long j = i;
        C24618 c24618 = this.f62881;
        if (j > c24618.length() - c24618.getFilePointer()) {
            throw new EOFException();
        }
        byte[] bArr = new byte[i];
        c24618.m54256(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m45956() throws EOFException {
        C24618 c24618 = this.f62881;
        int i = c24618.read();
        int i2 = c24618.read();
        int i3 = c24618.read();
        int i4 = c24618.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        return (i4 << 24) | i | (i2 << 8) | (i3 << 16);
    }

    /* JADX INFO: renamed from: ۡ */
    public final long m45955() throws EOFException {
        C24618 c24618 = this.f62881;
        long j = c24618.read();
        long j2 = c24618.read();
        long j3 = c24618.read();
        long j4 = c24618.read();
        long j5 = c24618.read();
        long j6 = c24618.read();
        long j7 = c24618.read();
        long j8 = c24618.read();
        if ((j | j2 | j3 | j4 | j5 | j6 | j7 | j8) < 0) {
            throw new EOFException();
        }
        return (j8 << 56) | j | (j2 << 8) | (j3 << 16) | (j4 << 24) | (j5 << 32) | (j6 << 40) | (j7 << 48);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m45964() {
        return this.f62883;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m45960() {
        return this.f62880;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m45951() {
        return this.f62877;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m45957() {
        return this.f62878;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m45962() {
        return this.f62882;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m45959() {
        return this.f62879;
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9866 m45961() {
        return this.f62881;
    }
}
