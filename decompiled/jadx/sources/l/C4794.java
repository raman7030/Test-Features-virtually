package l;

/* JADX INFO: renamed from: l.ۙܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4TR */
/* JADX INFO: loaded from: classes3.dex */
public final class C4794 extends AbstractC6226 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C3383 f15195;

    public C4794(C18906 c18906, int i, int i2, int i3) {
        super(c18906);
        this.f19075 = i;
        this.f19072 = i2;
        this.f19073 = i3;
    }

    public C4794(C18906 c18906, String str, C21916[] c21916Arr, int i) {
        super(c18906);
        this.f15195 = ((C9028) super.mo1509()).mo14959().m32179(str, c21916Arr);
        this.f19072 = 3;
        this.f19073 = i;
    }

    @Override // l.AbstractC6226, l.InterfaceC1454
    public final int getValue() {
        C3383 c3383;
        if (mo5004() == 3 && (c3383 = this.f15195) != null) {
            return c3383.m10321();
        }
        return super.getValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13995(int i) {
        this.f19075 = i;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m13998(int i) {
        if (i != 3 && this.f15195 != null) {
            this.f15195 = null;
        }
        this.f19072 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m13997(int i) {
        this.f19073 = i;
    }

    @Override // l.AbstractC6226, l.InterfaceC1454
    /* JADX INFO: renamed from: ܿۧ */
    public final C3383 mo5008() {
        C3383 c3383 = this.f15195;
        if (c3383 != null) {
            return c3383;
        }
        throw new RuntimeException("stringItem == null");
    }

    @Override // l.AbstractC6226
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9922 mo1509() {
        return (C9028) super.mo1509();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13996(String str, C21916[] c21916Arr) {
        this.f15195 = ((C9028) super.mo1509()).mo14959().m32179(str, c21916Arr);
        this.f19072 = 3;
    }

    @Override // l.AbstractC6226, l.InterfaceC1454
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4277 mo1510() {
        return (C8322) super.mo1510();
    }

    @Override // l.AbstractC6226, l.InterfaceC1454
    public final C18906 getEntry() {
        return (C18906) super.getEntry();
    }

    @Override // l.AbstractC6226, l.InterfaceC1454
    public final InterfaceC21211 getEntry() {
        return (C18906) super.getEntry();
    }

    @Override // l.InterfaceC1454
    /* JADX INFO: renamed from: ᩷֫ */
    public final int mo1511() {
        C18906 c18906 = (C18906) super.getEntry();
        int iMo29409 = c18906.mo29409();
        for (int i = 0; i < iMo29409; i++) {
            if (c18906.getValue(i) == this) {
                return i;
            }
        }
        return -1;
    }
}
