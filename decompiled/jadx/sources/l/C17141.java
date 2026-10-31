package l;

import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ܿۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8QO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17141 implements InterfaceC0207 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f52532;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17847 f52533;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f52534;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f52535 = new C17714(32);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52536;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52537;

    public C17141(InterfaceC17847 interfaceC17847) {
        this.f52533 = interfaceC17847;
    }

    @Override // l.InterfaceC0207
    /* JADX INFO: renamed from: ֫ */
    public final void mo1452(C9248 c9248, InterfaceC21830 interfaceC21830, C19259 c19259) {
        this.f52533.mo22462(c9248, interfaceC21830, c19259);
        this.f52534 = true;
    }

    @Override // l.InterfaceC0207
    /* JADX INFO: renamed from: ֫ */
    public final void mo1450() {
        this.f52534 = true;
    }

    @Override // l.InterfaceC0207
    /* JADX INFO: renamed from: ֫ */
    public final void mo1451(int i, C17714 c17714) {
        int iM41485;
        boolean z = (i & 1) != 0;
        if (z) {
            iM41485 = c17714.m41485() + c17714.m41456();
        } else {
            iM41485 = -1;
        }
        if (this.f52534) {
            if (!z) {
                return;
            }
            this.f52534 = false;
            c17714.m41484(iM41485);
            this.f52532 = 0;
        }
        while (c17714.m41457() > 0) {
            int i2 = this.f52532;
            C17714 c17715 = this.f52535;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM41456 = c17714.m41456();
                    c17714.m41484(c17714.m41485() - 1);
                    if (iM41456 == 255) {
                        this.f52534 = true;
                        return;
                    }
                }
                int iMin = Math.min(c17714.m41457(), 3 - this.f52532);
                c17714.m41461(this.f52532, iMin, c17715.m41482());
                int i3 = this.f52532 + iMin;
                this.f52532 = i3;
                if (i3 == 3) {
                    c17715.m41484(0);
                    c17715.m41486(3);
                    c17715.m41478(1);
                    int iM41457 = c17715.m41456();
                    int iM41458 = c17715.m41456();
                    this.f52537 = (iM41457 & 128) != 0;
                    this.f52536 = (((iM41457 & 15) << 8) | iM41458) + 3;
                    int iM41472 = c17715.m41472();
                    int i4 = this.f52536;
                    if (iM41472 < i4) {
                        c17715.m41460(Math.min(o.a.b, Math.max(i4, c17715.m41472() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c17714.m41457(), this.f52536 - this.f52532);
                c17714.m41461(this.f52532, iMin2, c17715.m41482());
                int i5 = this.f52532 + iMin2;
                this.f52532 = i5;
                int i6 = this.f52536;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f52537) {
                        if (C3603.m11005(0, c17715.m41482(), this.f52536, -1) != 0) {
                            this.f52534 = true;
                            return;
                        }
                        c17715.m41486(this.f52536 - 4);
                    } else {
                        c17715.m41486(i6);
                    }
                    c17715.m41484(0);
                    this.f52533.mo22463(c17715);
                    this.f52532 = 0;
                }
            }
        }
    }
}
