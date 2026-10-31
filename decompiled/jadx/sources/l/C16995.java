package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8LX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16995 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14172 f52127 = new C14172(null, 0, "audio/ac4");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f52128 = new C17714(16384);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52129;

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
    public final boolean mo4841(InterfaceC8424 interfaceC8424) throws EOFException, InterruptedIOException {
        C16184 c16184;
        int i;
        C17714 c17714 = new C17714(10);
        int i2 = 0;
        while (true) {
            c16184 = (C16184) interfaceC8424;
            c16184.mo22068(false, 0, 10, c17714.m41482());
            c17714.m41484(0);
            if (c17714.m41491() != 4801587) {
                break;
            }
            c17714.m41478(3);
            int iM41467 = c17714.m41467();
            i2 += iM41467 + 10;
            c16184.mo22067(iM41467, false);
        }
        c16184.mo22066();
        c16184.mo22067(i2, false);
        int i3 = i2;
        loop1: while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                c16184.mo22068(false, 0, 7, c17714.m41482());
                c17714.m41484(0);
                int iM41464 = c17714.m41464();
                if (iM41464 == 44096 || iM41464 == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArrM41482 = c17714.m41482();
                    if (bArrM41482.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArrM41482[2] & 255) << 8) | (bArrM41482[3] & 255);
                        if (i6 == 65535) {
                            i6 = ((bArrM41482[4] & 255) << 16) | ((bArrM41482[5] & 255) << 8) | (bArrM41482[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iM41464 == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        break loop1;
                    }
                    c16184.mo22067(i - 7, false);
                }
            }
            c16184.mo22066();
            i3++;
            if (i3 - i2 >= 8192) {
                break;
            }
            c16184.mo22067(i3, false);
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f52127.mo1003(interfaceC21830, new C19259(0, 1));
        interfaceC21830.mo3431();
        interfaceC21830.mo3430(new C20794(-9223372036854775807L));
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f52129 = false;
        this.f52127.mo1000();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        C17714 c17714 = this.f52128;
        int i = interfaceC8424.read(c17714.m41482(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        c17714.m41484(0);
        c17714.m41486(i);
        boolean z = this.f52129;
        C14172 c14172 = this.f52127;
        if (!z) {
            c14172.mo1001(4, 0L);
            this.f52129 = true;
        }
        c14172.mo1002(c17714);
        return 0;
    }
}
