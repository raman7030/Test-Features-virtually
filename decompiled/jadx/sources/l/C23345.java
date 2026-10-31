package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.᩻֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8IZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23345 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f75002;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17714 f75003;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16302 f75004;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17714 f75005;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f75006;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f75007;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f75008;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f75009;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f75010;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f75011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6412 f75012;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f75013;

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
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    public C23345(int i) {
        this.f75010 = (i & 2) != 0 ? i | 1 : i;
        this.f75012 = new C6412(null, 0, "audio/mp4a-latm", true);
        this.f75003 = new C17714(2048);
        this.f75002 = -1;
        this.f75009 = -1L;
        C17714 c17714 = new C17714(10);
        this.f75005 = c17714;
        byte[] bArrM41482 = c17714.m41482();
        this.f75004 = new C16302(bArrM41482, bArrM41482.length);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) throws EOFException, InterruptedIOException {
        int iM51760 = m51760(interfaceC8424);
        int i = 0;
        int i2 = 0;
        int i3 = iM51760;
        do {
            C17714 c17714 = this.f75005;
            C16184 c16184 = (C16184) interfaceC8424;
            c16184.mo22068(false, 0, 2, c17714.m41482());
            c17714.m41484(0);
            if ((c17714.m41464() & 65526) == 65520) {
                i++;
                if (i >= 4 && i2 > 188) {
                    return true;
                }
                c16184.mo22068(false, 0, 4, c17714.m41482());
                C16302 c16302 = this.f75004;
                c16302.m38354(14);
                int iM38343 = c16302.m38343(13);
                if (iM38343 > 6) {
                    c16184.mo22067(iM38343 - 6, false);
                    i2 += iM38343;
                } else {
                    i3++;
                    c16184.mo22066();
                }
            } else {
                i3++;
                c16184.mo22066();
            }
            c16184.mo22067(i3, false);
            i = 0;
            i2 = 0;
        } while (i3 - iM51760 < 8192);
        return false;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f75006 = interfaceC21830;
        this.f75012.mo1003(interfaceC21830, new C19259(0, 1));
        interfaceC21830.mo3431();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f75008 = false;
        this.f75012.mo1000();
        this.f75011 = j2;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        int i;
        boolean z;
        C6412 c6412;
        C22632.m50632(this.f75006);
        long length = interfaceC8424.getLength();
        int i2 = this.f75010;
        int i3 = i2 & 2;
        if (i3 != 0 || ((i2 & 1) != 0 && length != -1)) {
            C16302 c16302 = this.f75004;
            C17714 c17714 = this.f75005;
            if (!this.f75007) {
                this.f75002 = -1;
                interfaceC8424.mo22066();
                long j = 0;
                if (interfaceC8424.getPosition() == 0) {
                    m51760(interfaceC8424);
                }
                int i4 = 0;
                for (int i5 = 0; interfaceC8424.mo22068(true, i5, 2, c17714.m41482()); i5 = 0) {
                    try {
                        c17714.m41484(i5);
                        if (!((c17714.m41464() & 65526) == 65520)) {
                            i4 = 0;
                            break;
                        }
                        if (!interfaceC8424.mo22068(true, i5, 4, c17714.m41482())) {
                            break;
                        }
                        c16302.m38354(14);
                        int iM38343 = c16302.m38343(13);
                        if (iM38343 <= 6) {
                            this.f75007 = true;
                            throw C9080.m23440("Malformed ADTS stream", (Throwable) null);
                        }
                        j += (long) iM38343;
                        i4++;
                        if (i4 == 1000 || !interfaceC8424.mo22067(iM38343 - 6, true)) {
                            break;
                            break;
                        }
                    } catch (EOFException unused) {
                    }
                }
                interfaceC8424.mo22066();
                if (i4 > 0) {
                    this.f75002 = (int) (j / ((long) i4));
                } else {
                    this.f75002 = -1;
                }
                this.f75007 = true;
            }
        }
        C17714 c17715 = this.f75003;
        int i6 = interfaceC8424.read(c17715.m41482(), 0, 2048);
        boolean z2 = i6 == -1;
        boolean z3 = this.f75013;
        C6412 c6413 = this.f75012;
        if (z3) {
            i = -1;
            c6413 = c6413;
            z = true;
        } else {
            boolean z4 = (i2 & 1) != 0 && this.f75002 > 0;
            if (z4 && c6413.m17743() == -9223372036854775807L && !z2) {
                i = -1;
                c6413 = c6413;
                z = true;
            } else {
                if (z4 && c6413.m17743() != -9223372036854775807L) {
                    this.f75006.mo3430(new C9130((int) ((((long) this.f75002) * 8000000) / c6413.m17743()), this.f75002, length, this.f75009, i3 != 0));
                    i = -1;
                } else {
                    i = -1;
                    this.f75006.mo3430(new C20794(-9223372036854775807L));
                }
                z = true;
                this.f75013 = true;
            }
        }
        if (z2) {
            return i;
        }
        c17715.m41484(0);
        c17715.m41486(i6);
        if (this.f75008) {
            c6412 = c6413;
        } else {
            c6412 = c6413;
            c6412.mo1001(4, this.f75011);
            this.f75008 = z;
        }
        c6412.mo1002(c17715);
        return 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m51760(InterfaceC8424 interfaceC8424) {
        int i = 0;
        while (true) {
            C17714 c17714 = this.f75005;
            interfaceC8424.mo22061(0, 10, c17714.m41482());
            c17714.m41484(0);
            if (c17714.m41491() != 4801587) {
                break;
            }
            c17714.m41478(3);
            int iM41467 = c17714.m41467();
            i += iM41467 + 10;
            interfaceC8424.mo22060(iM41467);
        }
        interfaceC8424.mo22066();
        interfaceC8424.mo22060(i);
        if (this.f75009 == -1) {
            this.f75009 = i;
        }
        return i;
    }
}
