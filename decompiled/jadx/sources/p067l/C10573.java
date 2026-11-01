package p067l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8PN */
/* JADX INFO: loaded from: classes3.dex */
public final class C10573 implements InterfaceC2525 {

    /* JADX INFO: renamed from: ֫ */
    public long f29274;

    /* JADX INFO: renamed from: ۜ */
    public long f29275;

    /* JADX INFO: renamed from: ۡ */
    public long f29276;

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC16607 f29277;

    /* JADX INFO: renamed from: ۧ */
    public long f29278;

    /* JADX INFO: renamed from: ܳ */
    public long f29279;

    /* JADX INFO: renamed from: ܺ */
    public long f29280;

    /* JADX INFO: renamed from: ܽ */
    public final C20632 f29281;

    /* JADX INFO: renamed from: ܿ */
    public final long f29282;

    /* JADX INFO: renamed from: ᩳ */
    public final long f29283;

    /* JADX INFO: renamed from: ᩷ */
    public int f29284;

    /* JADX INFO: renamed from: ᩻ */
    public long f29285;

    public C10573(AbstractC16607 abstractC16607, long j, long j2, long j3, long j4, boolean z) {
        C23877.m52957(j >= 0 && j2 > j);
        this.f29277 = abstractC16607;
        this.f29282 = j;
        this.f29283 = j2;
        if (j3 == j2 - j || z) {
            this.f29280 = j4;
            this.f29284 = 4;
        } else {
            this.f29284 = 0;
        }
        this.f29281 = new C20632();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5  */
    @Override // p067l.InterfaceC2525
    /* JADX INFO: renamed from: ֫ */
    public final long mo3691(InterfaceC10375 interfaceC10375) throws IOException {
        long j;
        long jM12992;
        long j2;
        long j3;
        int i = this.f29284;
        long j4 = this.f29283;
        C20632 c20632 = this.f29281;
        if (i == 0) {
            j = 0;
            long position = interfaceC10375.getPosition();
            this.f29279 = position;
            this.f29284 = 1;
            long j5 = j4 - 65307;
            if (j5 > position) {
                return j5;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f29285 == this.f29274) {
                    jM12992 = -1;
                } else {
                    long position2 = interfaceC10375.getPosition();
                    if (!c20632.m46629(interfaceC10375, this.f29274)) {
                        jM12992 = this.f29285;
                        if (jM12992 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    } else {
                        c20632.m46630(interfaceC10375, false);
                        interfaceC10375.mo24036();
                        long j6 = this.f29276;
                        long j7 = c20632.f63743;
                        long j8 = j6 - j7;
                        int i2 = c20632.f63745 + c20632.f63742;
                        if (0 > j8 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.f29274 = position2;
                                this.f29278 = j7;
                            } else {
                                this.f29285 = interfaceC10375.getPosition() + ((long) i2);
                                this.f29275 = c20632.f63743;
                            }
                            long j9 = this.f29274;
                            jM12992 = this.f29285;
                            if (j9 - jM12992 < 100000) {
                                this.f29274 = jM12992;
                            } else {
                                long position3 = interfaceC10375.getPosition() - (((long) i2) * (j8 <= 0 ? 2L : 1L));
                                long j10 = this.f29274;
                                long j11 = this.f29285;
                                jM12992 = C5792.m12992((((j10 - j11) * j8) / (this.f29278 - this.f29275)) + position3, j11, j10 - 1);
                                j2 = -1;
                            }
                        } else {
                            j2 = -1;
                            jM12992 = -1;
                        }
                        if (jM12992 != j2) {
                            return jM12992;
                        }
                        this.f29284 = 3;
                        j3 = 2;
                    }
                }
                j2 = -1;
                if (jM12992 != j2) {
                    return jM12992;
                }
                this.f29284 = 3;
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
                c20632.m46629(interfaceC10375, j2);
                c20632.m46630(interfaceC10375, false);
                if (c20632.f63743 <= this.f29276) {
                    interfaceC10375.mo24040(c20632.f63745 + c20632.f63742);
                    this.f29285 = interfaceC10375.getPosition();
                    this.f29275 = c20632.f63743;
                    j2 = -1;
                } else {
                    interfaceC10375.mo24036();
                    this.f29284 = 4;
                    return -(this.f29275 + j3);
                }
            }
        } else {
            j = 0;
        }
        c20632.f63748 = 0;
        c20632.f63743 = j;
        c20632.f63746 = 0;
        c20632.f63745 = 0;
        c20632.f63742 = 0;
        if (!c20632.m46629(interfaceC10375, -1L)) {
            throw new EOFException();
        }
        c20632.m46630(interfaceC10375, false);
        interfaceC10375.mo24040(c20632.f63745 + c20632.f63742);
        long j12 = c20632.f63743;
        while ((c20632.f63748 & 4) != 4 && c20632.m46629(interfaceC10375, -1L) && interfaceC10375.getPosition() < j4 && c20632.m46630(interfaceC10375, true)) {
            try {
                interfaceC10375.mo24040(c20632.f63745 + c20632.f63742);
                j12 = c20632.f63743;
            } catch (EOFException unused) {
            }
        }
        this.f29280 = j12;
        this.f29284 = 4;
        return this.f29279;
    }

    @Override // p067l.InterfaceC2525
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11402 mo3692() {
        if (this.f29280 != 0) {
            return new C11244(this);
        }
        return null;
    }

    @Override // p067l.InterfaceC2525
    /* JADX INFO: renamed from: ֫ */
    public final void mo3693(long j) {
        this.f29276 = C5792.m12992(j, 0L, this.f29280 - 1);
        this.f29284 = 2;
        this.f29285 = this.f29282;
        this.f29274 = this.f29283;
        this.f29275 = 0L;
        this.f29278 = this.f29280;
    }
}
