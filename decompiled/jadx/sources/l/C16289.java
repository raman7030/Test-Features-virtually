package l;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16289 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17701 f50080 = new C17701("audio/ac3");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f50081 = new C17714(2786);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f50082;

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
        C17714 c17714 = new C17714(10);
        int i = 0;
        while (true) {
            c16184 = (C16184) interfaceC8424;
            c16184.mo22068(false, 0, 10, c17714.m41482());
            c17714.m41484(0);
            if (c17714.m41491() != 4801587) {
                break;
            }
            c17714.m41478(3);
            int iM41467 = c17714.m41467();
            i += iM41467 + 10;
            c16184.mo22067(iM41467, false);
        }
        c16184.mo22066();
        c16184.mo22067(i, false);
        int i2 = i;
        loop1: while (true) {
            int i3 = 0;
            while (true) {
                c16184.mo22068(false, 0, 6, c17714.m41482());
                c17714.m41484(0);
                if (c17714.m41464() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iM16512 = C5893.m16512(c17714.m41482());
                if (iM16512 == -1) {
                    break loop1;
                }
                c16184.mo22067(iM16512 - 6, false);
            }
            c16184.mo22066();
            i2++;
            if (i2 - i >= 8192) {
                break;
            }
            c16184.mo22067(i2, false);
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
        this.f50080.mo1003(interfaceC21830, new C19259(0, 1));
        interfaceC21830.mo3431();
        interfaceC21830.mo3430(new C20794(-9223372036854775807L));
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f50082 = false;
        this.f50080.mo1000();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        C17714 c17714 = this.f50081;
        int i = interfaceC8424.read(c17714.m41482(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        c17714.m41484(0);
        c17714.m41486(i);
        boolean z = this.f50082;
        C17701 c17701 = this.f50080;
        if (!z) {
            c17701.mo1001(4, 0L);
            this.f50082 = true;
        }
        c17701.mo1002(c17714);
        return 0;
    }
}
