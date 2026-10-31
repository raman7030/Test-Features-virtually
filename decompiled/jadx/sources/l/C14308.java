package l;

/* JADX INFO: renamed from: l.ܳۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S8YL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14308 extends AbstractC11342 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f43139;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Integer f43140;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f43141;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f43142;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Integer f43143;

    @Override // l.AbstractC0197
    /* JADX INFO: renamed from: ֫ */
    public final void mo1345(InterfaceC10076 interfaceC10076) {
        interfaceC10076.mo16050(this);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Integer m34145() {
        return this.f43140;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34143(Integer num) {
        if (num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        Integer num2 = this.f43143;
        if (num2 == null || num2.intValue() >= num.intValue()) {
            this.f43140 = num;
            return;
        }
        throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34139(Integer num) {
        if (num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        Integer num2 = this.f43140;
        if (num2 == null || num.intValue() >= num2.intValue()) {
            this.f43143 = num;
            return;
        }
        throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m34146() {
        return this.f43139;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34138(int i) {
        this.f43139 = i;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m34142() {
        return this.f43142;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34140(String str) {
        this.f43142 = str;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m34141() {
        return this.f43141;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34144(String str) {
        this.f43141 = str;
    }
}
