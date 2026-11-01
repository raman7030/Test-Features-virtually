package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۜ᩺֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F64Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C9084 extends AbstractC11508 implements InterfaceC10765 {

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC3167 f24619 = EnumC3167.f5951;

    /* JADX INFO: renamed from: ۗ */
    public final int f24620;

    /* JADX INFO: renamed from: ۙ */
    public final int f24621;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        throw null;
    }

    public C9084(C14645 c14645, int i) {
        super(c14645, f24619, i);
        int iM13856 = c14645.m33504().m13856(i + 2);
        if (iM13856 == 0) {
            this.f24620 = 1;
            this.f24621 = 0;
            return;
        }
        int iMo13857 = c14645.m33504().mo13857(i + 4);
        if (((long) iM13856) * ((long) iMo13857) > 2147483647L) {
            throw new C17034(null, "Invalid array-payload instruction: element width*count overflows", new Object[0]);
        }
        this.f24620 = iM13856;
        this.f24621 = iMo13857;
    }

    @Override // p067l.InterfaceC10765
    /* JADX INFO: renamed from: ᩷ */
    public final int mo21004() {
        return this.f24620;
    }

    @Override // p067l.InterfaceC10765
    /* JADX INFO: renamed from: ۬ */
    public final List mo21003() {
        int i = this.f32112 + 8;
        int i2 = this.f24620;
        if (i2 == 1) {
            return new C18471(this, i);
        }
        if (i2 == 2) {
            return new C19142(this, i);
        }
        if (i2 == 4) {
            return new C16459(this, i);
        }
        if (i2 == 8) {
            return new C25177(this, i);
        }
        throw new C17034(null, "Invalid element width: %d", Integer.valueOf(i2));
    }

    @Override // p067l.AbstractC11508, p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۚ */
    public final int mo6216() {
        return (((this.f24620 * this.f24621) + 1) / 2) + 4;
    }
}
