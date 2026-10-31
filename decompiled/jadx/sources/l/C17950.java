package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8U2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17950 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16538 f55960;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f55962;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C23896 f55963;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f55965;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C6307 f55967;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f55969;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f55970;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f55971;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f55973;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f55961 = new byte[42];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f55966 = new C17714(new byte[32768], 0);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f55972 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C4896 f55964 = new C4896();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f55968 = 0;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        C23896 c23896M38956 = new C16559().m38956(interfaceC8424, C17449.f53305);
        if (c23896M38956 != null) {
            c23896M38956.m52639();
        }
        C17714 c17714 = new C17714(4);
        ((C16184) interfaceC8424).mo22068(false, 0, 4, c17714.m41482());
        return c17714.m41479() == 1716281667;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f55970 = interfaceC21830;
        this.f55962 = interfaceC21830.mo3429(0, 1);
        interfaceC21830.mo3431();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        InterfaceC9505 c20794;
        long j;
        boolean zM10668;
        int i = this.f55968;
        C23896 c23896 = null;
        boolean z = true;
        if (i == 0) {
            interfaceC8424.mo22066();
            long jMo22069 = interfaceC8424.mo22069();
            C23896 c23896M38956 = new C16559().m38956(interfaceC8424, !this.f55972 ? null : C17449.f53305);
            if (c23896M38956 != null && c23896M38956.m52639() != 0) {
                c23896 = c23896M38956;
            }
            interfaceC8424.mo22070((int) (interfaceC8424.mo22069() - jMo22069));
            this.f55963 = c23896;
            this.f55968 = 1;
            return 0;
        }
        byte[] bArr = this.f55961;
        if (i == 1) {
            interfaceC8424.mo22061(0, bArr.length, bArr);
            interfaceC8424.mo22066();
            this.f55968 = 2;
            return 0;
        }
        if (i == 2) {
            C17714 c17714 = new C17714(4);
            interfaceC8424.readFully(c17714.m41482(), 0, 4);
            if (c17714.m41479() != 1716281667) {
                throw C9080.m23440("Failed to read FLAC stream marker.", (Throwable) null);
            }
            this.f55968 = 3;
            return 0;
        }
        if (i == 3) {
            C6307 c6307M17436 = this.f55967;
            boolean z2 = false;
            while (!z2) {
                interfaceC8424.mo22066();
                byte[] bArr2 = new byte[4];
                C16302 c16302 = new C16302(bArr2, 4);
                interfaceC8424.mo22061(0, 4, bArr2);
                boolean zM38352 = c16302.m38352();
                int iM38343 = c16302.m38343(7);
                int iM38344 = c16302.m38343(24) + 4;
                if (iM38343 == 0) {
                    byte[] bArr3 = new byte[38];
                    interfaceC8424.readFully(bArr3, 0, 38);
                    c6307M17436 = new C6307(bArr3, 4);
                } else {
                    if (c6307M17436 == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iM38343 == 3) {
                        C17714 c17715 = new C17714(iM38344);
                        interfaceC8424.readFully(c17715.m41482(), 0, iM38344);
                        c6307M17436 = c6307M17436.m17437(C13362.m32373(c17715));
                    } else if (iM38343 == 4) {
                        C17714 c17716 = new C17714(iM38344);
                        interfaceC8424.readFully(c17716.m41482(), 0, iM38344);
                        c17716.m41478(4);
                        c6307M17436 = c6307M17436.m17439(Arrays.asList(C21499.m48666(c17716, false, false).f3786));
                    } else if (iM38343 == 6) {
                        C17714 c17717 = new C17714(iM38344);
                        interfaceC8424.readFully(c17717.m41482(), 0, iM38344);
                        c17717.m41478(4);
                        c6307M17436 = c6307M17436.m17436(AbstractC14545.of((Object) C3133.m9555(c17717)));
                    } else {
                        interfaceC8424.mo22070(iM38344);
                    }
                }
                String str = C3603.f11424;
                this.f55967 = c6307M17436;
                z2 = zM38352;
            }
            this.f55967.getClass();
            this.f55965 = Math.max(this.f55967.f19528, 6);
            C8353 c8353M17438 = this.f55967.m17438(bArr, this.f55963);
            InterfaceC19383 interfaceC19383 = this.f55962;
            C1297 c1297M21948 = c8353M17438.m21948();
            c1297M21948.m4462("audio/flac");
            interfaceC19383.mo8456(c1297M21948.m4440());
            this.f55962.mo8454(this.f55967.m17435());
            this.f55968 = 4;
            return 0;
        }
        long j2 = 0;
        if (i == 4) {
            interfaceC8424.mo22066();
            C17714 c17718 = new C17714(2);
            interfaceC8424.mo22061(0, 2, c17718.m41482());
            int iM41464 = c17718.m41464();
            if ((iM41464 >> 2) != 16382) {
                interfaceC8424.mo22066();
                throw C9080.m23440("First frame does not start with sync code.", (Throwable) null);
            }
            interfaceC8424.mo22066();
            this.f55973 = iM41464;
            InterfaceC21830 interfaceC21830 = this.f55970;
            String str2 = C3603.f11424;
            long position = interfaceC8424.getPosition();
            long length = interfaceC8424.getLength();
            this.f55967.getClass();
            C6307 c6307 = this.f55967;
            C10541 c10541 = c6307.f19529;
            if (c10541 != null && c10541.f31649.length > 0) {
                c20794 = new C12657(c6307, position);
            } else if (length == -1 || c6307.f19533 <= 0) {
                c20794 = new C20794(c6307.m17435());
            } else {
                C16538 c16538 = new C16538(c6307, this.f55973, position, length);
                this.f55960 = c16538;
                c20794 = c16538.m52771();
            }
            interfaceC21830.mo3430(c20794);
            this.f55968 = 5;
            return 0;
        }
        if (i != 5) {
            throw new IllegalStateException();
        }
        this.f55962.getClass();
        this.f55967.getClass();
        C16538 c16539 = this.f55960;
        if (c16539 != null && c16539.m52773()) {
            return this.f55960.m52770(interfaceC8424, c23615);
        }
        if (this.f55971 == -1) {
            C6307 c6308 = this.f55967;
            interfaceC8424.mo22066();
            interfaceC8424.mo22060(1);
            byte[] bArr4 = new byte[1];
            interfaceC8424.mo22061(0, 1, bArr4);
            boolean z3 = (bArr4[0] & 1) == 1;
            interfaceC8424.mo22060(2);
            int i2 = z3 ? 7 : 6;
            C17714 c17719 = new C17714(i2);
            byte[] bArrM41482 = c17719.m41482();
            int i3 = 0;
            while (i3 < i2) {
                int iMo22065 = interfaceC8424.mo22065(i3, i2 - i3, bArrM41482);
                if (iMo22065 == -1) {
                    break;
                }
                i3 += iMo22065;
            }
            c17719.m41486(i3);
            interfaceC8424.mo22066();
            try {
                long jM41476 = c17719.m41476();
                if (!z3) {
                    jM41476 *= (long) c6308.f19536;
                }
                j2 = jM41476;
            } catch (NumberFormatException unused) {
                z = false;
            }
            if (!z) {
                throw C9080.m23440((String) null, (Throwable) null);
            }
            this.f55971 = j2;
        } else {
            C17714 c177110 = this.f55966;
            int iM41483 = c177110.m41483();
            if (iM41483 < 32768) {
                int i4 = interfaceC8424.read(c177110.m41482(), iM41483, 32768 - iM41483);
                z = i4 == -1;
                if (!z) {
                    c177110.m41486(iM41483 + i4);
                } else if (c177110.m41457() == 0) {
                    long j3 = this.f55971 * 1000000;
                    C6307 c6309 = this.f55967;
                    String str3 = C3603.f11424;
                    this.f55962.mo8455(j3 / ((long) c6309.f19537), 1, this.f55969, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int iM41485 = c177110.m41485();
            int i5 = this.f55969;
            int i6 = this.f55965;
            if (i5 < i6) {
                c177110.m41478(Math.min(i6 - i5, c177110.m41457()));
            }
            this.f55967.getClass();
            int iM41486 = c177110.m41485();
            while (true) {
                int iM41484 = c177110.m41483() - 16;
                C4896 c4896 = this.f55964;
                if (iM41486 > iM41484) {
                    if (z) {
                        while (true) {
                            if (iM41486 <= c177110.m41483() - this.f55965) {
                                c177110.m41484(iM41486);
                                try {
                                    zM10668 = C3485.m10668(c177110, this.f55967, this.f55973, c4896);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM10668 = false;
                                }
                                if (c177110.m41485() > c177110.m41483()) {
                                    zM10668 = false;
                                }
                                if (zM10668) {
                                    c177110.m41484(iM41486);
                                    j = c4896.f15458;
                                    break;
                                }
                                iM41486++;
                            } else {
                                c177110.m41484(c177110.m41483());
                            }
                        }
                    } else {
                        c177110.m41484(iM41486);
                    }
                    j = -1;
                    break;
                }
                c177110.m41484(iM41486);
                if (C3485.m10668(c177110, this.f55967, this.f55973, c4896)) {
                    c177110.m41484(iM41486);
                    j = c4896.f15458;
                    break;
                }
                iM41486++;
            }
            int iM41487 = c177110.m41485() - iM41485;
            c177110.m41484(iM41485);
            this.f55962.mo8453(iM41487, c177110);
            int i7 = this.f55969 + iM41487;
            this.f55969 = i7;
            if (j != -1) {
                long j4 = this.f55971 * 1000000;
                C6307 c63010 = this.f55967;
                String str4 = C3603.f11424;
                this.f55962.mo8455(j4 / ((long) c63010.f19537), 1, i7, 0, null);
                this.f55969 = 0;
                this.f55971 = j;
            }
            int length2 = c177110.m41482().length - c177110.m41483();
            if (c177110.m41457() < 16 && length2 < 16) {
                int iM41457 = c177110.m41457();
                System.arraycopy(c177110.m41482(), c177110.m41485(), c177110.m41482(), 0, iM41457);
                c177110.m41484(0);
                c177110.m41486(iM41457);
            }
        }
        return 0;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        if (j == 0) {
            this.f55968 = 0;
        } else {
            C16538 c16538 = this.f55960;
            if (c16538 != null) {
                c16538.m52772(j2);
            }
        }
        this.f55971 = j2 != 0 ? -1L : 0L;
        this.f55969 = 0;
        this.f55966.m41481(0);
    }
}
