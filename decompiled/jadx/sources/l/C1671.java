package l;

import java.util.Set;

/* JADX INFO: renamed from: l.֫۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5Z9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1671 extends AbstractC10844 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12918 f5842;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f5843;

    public C1671(C12918 c12918, int i) {
        this.f5842 = c12918;
        this.f5843 = i;
    }

    @Override // l.AbstractC10844
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13848 mo5672() {
        AbstractC3912 abstractC3912M31418 = this.f5842.m31418();
        int i = this.f5843;
        int iMo11935 = abstractC3912M31418.mo11935(i + 4);
        if (iMo11935 == 0) {
            return InterfaceC13848.f41311;
        }
        return new C7499(this, i + 16, iMo11935);
    }

    @Override // l.AbstractC10844
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13848 mo5673() {
        C12918 c12918 = this.f5842;
        AbstractC3912 abstractC3912M31418 = c12918.m31418();
        int i = this.f5843;
        int iMo11935 = abstractC3912M31418.mo11935(i + 8);
        if (iMo11935 != 0) {
            return new C7499(this, (c12918.m31418().mo11935(i + 4) * 8) + i + 16, iMo11935);
        }
        return InterfaceC13848.f41311;
    }

    @Override // l.AbstractC10844
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13848 mo5674() {
        C12918 c12918 = this.f5842;
        AbstractC3912 abstractC3912M31418 = c12918.m31418();
        int i = this.f5843;
        int iMo11935 = abstractC3912M31418.mo11935(i + 12);
        if (iMo11935 != 0) {
            int iMo11936 = c12918.m31418().mo11935(i + 4);
            int i2 = iMo11936 * 8;
            return new C7499(this, (c12918.m31418().mo11935(i + 8) * 8) + i2 + i + 16, iMo11935);
        }
        return InterfaceC13848.f41311;
    }

    @Override // l.AbstractC10844
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set mo5671() {
        C12918 c12918 = this.f5842;
        return AbstractC10844.m27106(c12918, c12918.m31418().mo11935(this.f5843));
    }
}
