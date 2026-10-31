package l;

/* JADX INFO: renamed from: l.ܶܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15304 implements InterfaceC4722 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18621 f46945;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f46946 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f46947;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f46948;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f46949;

    public C15304(C18621 c18621, int i) {
        this.f46945 = c18621;
        this.f46949 = i;
        this.f46947 = c18621.m43177();
        AbstractC0275 abstractC0275M43170 = c18621.m43170();
        if (abstractC0275M43170 != null) {
            this.f46948 = (int) abstractC0275M43170.mo1615();
        } else {
            this.f46948 = 0;
        }
    }

    @Override // l.InterfaceC4722
    public final String a() {
        if (this.f46946 == null) {
            AbstractC0275 abstractC0275M43170 = this.f46945.m43170();
            if (abstractC0275M43170 != null) {
                this.f46946 = abstractC0275M43170.m1612();
            }
            if (this.f46946 == null) {
                this.f46946 = "";
            }
        }
        return this.f46946;
    }

    @Override // l.InterfaceC4722
    public final int b() {
        return this.f46948;
    }

    @Override // l.InterfaceC4722
    public final int c() {
        return this.f46949;
    }

    @Override // l.InterfaceC4722
    public final int d() {
        return this.f46947;
    }

    public final String toString() {
        return "d@" + hashCode() + this.f46946 + this.f46947 + this.f46949 + this.f46948;
    }
}
