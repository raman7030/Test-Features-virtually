package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۖᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8RD */
/* JADX INFO: loaded from: classes2.dex */
public final class C2717 implements InterfaceC19383 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8353 f8478;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f8479;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC9773 f8480;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f8482;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f8485;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f8486 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f8481 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f8483 = C3603.f11423;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17714 f8484 = new C17714();

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo8454(long j) {
    }

    public C2717(InterfaceC19383 interfaceC19383, InterfaceC6950 interfaceC6950) {
        this.f8482 = interfaceC19383;
        this.f8485 = interfaceC6950;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8452() {
        this.f8479 = true;
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8456(C8353 c8353) {
        c8353.f25614.getClass();
        String str = c8353.f25614;
        C22632.m50631(C9786.m24807(str) == 3);
        boolean zEquals = c8353.equals(this.f8478);
        InterfaceC6950 interfaceC6950 = this.f8485;
        if (!zEquals) {
            this.f8478 = c8353;
            this.f8480 = interfaceC6950.mo18777(c8353) ? interfaceC6950.mo18779(c8353) : null;
        }
        InterfaceC9773 interfaceC9773 = this.f8480;
        InterfaceC19383 interfaceC19383 = this.f8482;
        if (interfaceC9773 == null) {
            interfaceC19383.mo8456(c8353);
            return;
        }
        C1297 c1297M21948 = c8353.m21948();
        c1297M21948.m4465("application/x-media3-cues");
        c1297M21948.m4445(str);
        c1297M21948.m4443(C13132.FOREVER_NS);
        c1297M21948.m4464(interfaceC6950.mo18778(c8353));
        interfaceC19383.mo8456(c1297M21948.m4440());
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo8458(InterfaceC9765 interfaceC9765, int i, boolean z) throws EOFException {
        if (this.f8480 == null) {
            return this.f8482.mo8458(interfaceC9765, i, z);
        }
        m8449(i);
        int i2 = interfaceC9765.read(this.f8483, this.f8481, i);
        if (i2 != -1) {
            this.f8481 += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8457(C17714 c17714, int i, int i2) {
        if (this.f8480 == null) {
            this.f8482.mo8457(c17714, i, i2);
            return;
        }
        m8449(i);
        c17714.m41461(this.f8481, i, this.f8483);
        this.f8481 += i;
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8455(final long j, final int i, int i2, int i3, C18677 c18677) {
        if (this.f8480 == null) {
            this.f8482.mo8455(j, i, i2, i3, c18677);
            return;
        }
        C22632.m50630("DRM on subtitles is not supported", c18677 == null);
        int i4 = (this.f8481 - i3) - i2;
        try {
            this.f8480.mo6618(this.f8483, i4, i2, C21062.m47908(), new InterfaceC23483() { // from class: l.ܺᩴۧ
                @Override // l.InterfaceC23483
                public final void accept(Object obj) {
                    C2717.m8450(this.f49665, j, i, (C12866) obj);
                }
            });
        } catch (RuntimeException e) {
            if (this.f8479) {
                C19956.m46036("Parsing subtitles failed, ignoring sample.", e);
            } else {
                throw e;
            }
        }
        int i5 = i4 + i2;
        this.f8486 = i5;
        if (i5 == this.f8481) {
            this.f8486 = 0;
            this.f8481 = 0;
        }
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo8451(InterfaceC9765 interfaceC9765, int i, boolean z) {
        return mo8458(interfaceC9765, i, z);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo8453(int i, C17714 c17714) {
        mo8457(c17714, i, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8450(C2717 c2717, long j, int i, C12866 c12866) {
        C22632.m50632(c2717.f8478);
        byte[] bArrM9124 = C2989.m9124(c12866.f38637, c12866.f38636);
        C17714 c17714 = c2717.f8484;
        c17714.getClass();
        c17714.m41462(bArrM9124.length, bArrM9124);
        c2717.f8482.mo8453(bArrM9124.length, c17714);
        long j2 = c12866.f38639;
        if (j2 == -9223372036854775807L) {
            C22632.m50634(c2717.f8478.f25620 == C13132.FOREVER_NS);
        } else {
            long j3 = c2717.f8478.f25620;
            j = j3 == C13132.FOREVER_NS ? j + j2 : j2 + j3;
        }
        c2717.f8482.mo8455(j, i | 1, bArrM9124.length, 0, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8449(int i) {
        int length = this.f8483.length;
        int i2 = this.f8481;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f8486;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f8483;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f8486, bArr2, 0, i3);
        this.f8486 = 0;
        this.f8481 = i3;
        this.f8483 = bArr2;
    }
}
