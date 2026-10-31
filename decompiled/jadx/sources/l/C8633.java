package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8PN */
/* JADX INFO: loaded from: classes3.dex */
public final class C8633 implements InterfaceC0165 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f26356;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f26357;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f26358;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC14982 f26359;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f26360;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f26361;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f26362;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19217 f26363;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f26364;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f26365;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f26366;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f26367;

    public C8633(AbstractC14982 abstractC14982, long j, long j2, long j3, long j4, boolean z) {
        C22632.m50631(j >= 0 && j2 > j);
        this.f26359 = abstractC14982;
        this.f26364 = j;
        this.f26365 = j2;
        if (j3 == j2 - j || z) {
            this.f26362 = j4;
            this.f26366 = 4;
        } else {
            this.f26366 = 0;
        }
        this.f26363 = new C19217();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    @Override // l.InterfaceC0165
    /* JADX INFO: renamed from: ֫ */
    public final long mo1283(InterfaceC8424 interfaceC8424) throws IOException {
        long j;
        long jM11016;
        long j2;
        long j3;
        int i = this.f26366;
        long j4 = this.f26365;
        C19217 c19217 = this.f26363;
        if (i == 0) {
            j = 0;
            long position = interfaceC8424.getPosition();
            this.f26361 = position;
            this.f26366 = 1;
            long j5 = j4 - 65307;
            if (j5 > position) {
                return j5;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f26367 == this.f26356) {
                    jM11016 = -1;
                } else {
                    long position2 = interfaceC8424.getPosition();
                    if (!c19217.m44335(interfaceC8424, this.f26356)) {
                        jM11016 = this.f26367;
                        if (jM11016 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    } else {
                        c19217.m44336(interfaceC8424, false);
                        interfaceC8424.mo22066();
                        long j6 = this.f26358;
                        long j7 = c19217.f60512;
                        long j8 = j6 - j7;
                        int i2 = c19217.f60514 + c19217.f60511;
                        if (0 > j8 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.f26356 = position2;
                                this.f26360 = j7;
                            } else {
                                this.f26367 = interfaceC8424.getPosition() + ((long) i2);
                                this.f26357 = c19217.f60512;
                            }
                            long j9 = this.f26356;
                            jM11016 = this.f26367;
                            if (j9 - jM11016 < 100000) {
                                this.f26356 = jM11016;
                            } else {
                                long position3 = interfaceC8424.getPosition() - (((long) i2) * (j8 <= 0 ? 2L : 1L));
                                long j10 = this.f26356;
                                long j11 = this.f26367;
                                jM11016 = C3603.m11016((((j10 - j11) * j8) / (this.f26360 - this.f26357)) + position3, j11, j10 - 1);
                                j2 = -1;
                            }
                        } else {
                            j2 = -1;
                            jM11016 = -1;
                        }
                        if (jM11016 != j2) {
                            return jM11016;
                        }
                        this.f26366 = 3;
                        j3 = 2;
                    }
                }
                j2 = -1;
                if (jM11016 != j2) {
                    return jM11016;
                }
                this.f26366 = 3;
                j3 = 2;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j3 = 2;
                j2 = -1;
            }
            while (true) {
                c19217.m44335(interfaceC8424, j2);
                c19217.m44336(interfaceC8424, false);
                if (c19217.f60512 <= this.f26358) {
                    interfaceC8424.mo22070(c19217.f60514 + c19217.f60511);
                    this.f26367 = interfaceC8424.getPosition();
                    this.f26357 = c19217.f60512;
                    j2 = -1;
                } else {
                    interfaceC8424.mo22066();
                    this.f26366 = 4;
                    return -(this.f26357 + j3);
                }
            }
        } else {
            j = 0;
        }
        c19217.f60517 = 0;
        c19217.f60512 = j;
        c19217.f60515 = 0;
        c19217.f60514 = 0;
        c19217.f60511 = 0;
        if (!c19217.m44335(interfaceC8424, -1L)) {
            throw new EOFException();
        }
        c19217.m44336(interfaceC8424, false);
        interfaceC8424.mo22070(c19217.f60514 + c19217.f60511);
        long j12 = c19217.f60512;
        while ((c19217.f60517 & 4) != 4 && c19217.m44335(interfaceC8424, -1L) && interfaceC8424.getPosition() < j4 && c19217.m44336(interfaceC8424, true)) {
            try {
                interfaceC8424.mo22070(c19217.f60514 + c19217.f60511);
                j12 = c19217.f60512;
            } catch (EOFException unused) {
            }
        }
        this.f26362 = j12;
        this.f26366 = 4;
        return this.f26361;
    }

    @Override // l.InterfaceC0165
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9505 mo1284() {
        if (this.f26362 != 0) {
            return new C9339(this);
        }
        return null;
    }

    @Override // l.InterfaceC0165
    /* JADX INFO: renamed from: ֫ */
    public final void mo1285(long j) {
        this.f26358 = C3603.m11016(j, 0L, this.f26362 - 1);
        this.f26366 = 2;
        this.f26367 = this.f26364;
        this.f26356 = this.f26365;
        this.f26357 = 0L;
        this.f26360 = this.f26362;
    }
}
