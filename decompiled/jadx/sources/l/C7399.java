package l;

/* JADX INFO: renamed from: l.۟ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C7399 extends AbstractC10804 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f22777;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7399(C6735 c6735) {
        super(c6735);
        this.f22777 = c6735;
    }

    @Override // l.AbstractC10804
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 mo19922(C0779 c0779, EnumC19125 enumC19125, AbstractC4308 abstractC4308, boolean z) {
        C18837 c18837 = new C18837();
        AbstractC4308 abstractC4308M2971 = c0779.m2971();
        C6735 c6735 = this.f22777;
        if (abstractC4308M2971 != null) {
            c18837.m43511(new C23503(c6735, c0779, enumC19125, new EnumC19125[0]));
        }
        c18837.m43511(new C14330(c6735, c0779, abstractC4308, enumC19125));
        if (z) {
            return c18837.m43517();
        }
        if (enumC19125 == EnumC19125.f60272) {
            c18837.m43511(new C20682(c6735, c0779, abstractC4308));
        }
        c18837.m43511(new C14495(c6735, c0779, abstractC4308, enumC19125));
        return c18837.m43517();
    }
}
