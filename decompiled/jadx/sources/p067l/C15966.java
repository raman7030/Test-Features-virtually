package p067l;

/* JADX INFO: renamed from: l.ܳۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S8YL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15966 extends AbstractC13147 {

    /* JADX INFO: renamed from: ۜ */
    public int f46231;

    /* JADX INFO: renamed from: ۡ */
    public Integer f46232;

    /* JADX INFO: renamed from: ۢ */
    public String f46233;

    /* JADX INFO: renamed from: ᩷ */
    public String f46234;

    /* JADX INFO: renamed from: ᩻ */
    public Integer f46235;

    @Override // p067l.AbstractC2555
    /* JADX INFO: renamed from: ֫ */
    public final void mo3758(InterfaceC11944 interfaceC11944) {
        interfaceC11944.mo17969(this);
    }

    /* JADX INFO: renamed from: ܺ */
    public final Integer m36278() {
        return this.f46232;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36276(Integer num) {
        if (num.intValue() < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        Integer num2 = this.f46235;
        if (num2 == null || num2.intValue() >= num.intValue()) {
            this.f46232 = num;
            return;
        }
        throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36272(Integer num) {
        if (num.intValue() < 3) {
            throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
        }
        Integer num2 = this.f46232;
        if (num2 == null || num.intValue() >= num2.intValue()) {
            this.f46235 = num;
            return;
        }
        throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m36279() {
        return this.f46231;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36271(int i) {
        this.f46231 = i;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m36275() {
        return this.f46234;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36273(String str) {
        this.f46234 = str;
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m36274() {
        return this.f46233;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36277(String str) {
        this.f46233 = str;
    }
}
