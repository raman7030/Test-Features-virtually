package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩺֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F64Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C7066 extends AbstractC9617 implements InterfaceC8835 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC0841 f21738 = EnumC0841.f3177;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f21739;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21740;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final String mo1789() {
        throw null;
    }

    public C7066(C12918 c12918, int i) {
        super(c12918, f21738, i);
        int iM11936 = c12918.m31418().m11936(i + 2);
        if (iM11936 == 0) {
            this.f21739 = 1;
            this.f21740 = 0;
            return;
        }
        int iMo11937 = c12918.m31418().mo11937(i + 4);
        if (((long) iM11936) * ((long) iMo11937) > 2147483647L) {
            throw new C15431(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
        this.f21739 = iM11936;
        this.f21740 = iMo11937;
    }

    @Override // l.InterfaceC8835
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo19046() {
        return this.f21739;
    }

    @Override // l.InterfaceC8835
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List mo19045() {
        int i = this.f29164 + 8;
        int i2 = this.f21739;
        if (i2 == 1) {
            return new C16943(this, i);
        }
        if (i2 == 2) {
            return new C17649(this, i);
        }
        if (i2 == 4) {
            return new C14826(this, i);
        }
        if (i2 == 8) {
            return new C23999(this, i);
        }
        throw new C15431(null, "Invalid element width: %d", Integer.valueOf(i2));
    }

    @Override // l.AbstractC9617, l.InterfaceC22677
    /* JADX INFO: renamed from: ۚ */
    public final int mo3974() {
        return (((this.f21739 * this.f21740) + 1) / 2) + 4;
    }
}
