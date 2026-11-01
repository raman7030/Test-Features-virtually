package p067l;

/* JADX INFO: renamed from: l.ܶܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16913 implements InterfaceC6856 {

    /* JADX INFO: renamed from: ֫ */
    public C20066 f50071;

    /* JADX INFO: renamed from: ۧ */
    public String f50072 = null;

    /* JADX INFO: renamed from: ܽ */
    public int f50073;

    /* JADX INFO: renamed from: ܿ */
    public int f50074;

    /* JADX INFO: renamed from: ᩳ */
    public int f50075;

    public C16913(C20066 c20066, int i) {
        this.f50071 = c20066;
        this.f50075 = i;
        this.f50073 = c20066.m45443();
        AbstractC2630 abstractC2630M45436 = c20066.m45436();
        if (abstractC2630M45436 != null) {
            this.f50074 = (int) abstractC2630M45436.mo4015();
        } else {
            this.f50074 = 0;
        }
    }

    @Override // p067l.InterfaceC6856
    /* JADX INFO: renamed from: a */
    public final String mo15698a() {
        if (this.f50072 == null) {
            AbstractC2630 abstractC2630M45436 = this.f50071.m45436();
            if (abstractC2630M45436 != null) {
                this.f50072 = abstractC2630M45436.m4012();
            }
            if (this.f50072 == null) {
                this.f50072 = "";
            }
        }
        return this.f50072;
    }

    @Override // p067l.InterfaceC6856
    /* JADX INFO: renamed from: b */
    public final int mo15699b() {
        return this.f50074;
    }

    @Override // p067l.InterfaceC6856
    /* JADX INFO: renamed from: c */
    public final int mo15700c() {
        return this.f50075;
    }

    @Override // p067l.InterfaceC6856
    /* JADX INFO: renamed from: d */
    public final int mo15701d() {
        return this.f50073;
    }

    public final String toString() {
        return "d@" + hashCode() + this.f50072 + this.f50073 + this.f50075 + this.f50074;
    }
}
