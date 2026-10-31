package l;

/* JADX INFO: renamed from: l.ܰۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C13748 extends AbstractC10804 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f41039;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13748(C6735 c6735) {
        super(c6735);
        this.f41039 = c6735;
    }

    @Override // l.AbstractC10804
    /* JADX INFO: renamed from: ۧ */
    public final C2609 mo19922(C0779 c0779, EnumC19125 enumC19125, AbstractC4308 abstractC4308, boolean z) {
        C18837 c18837 = new C18837();
        AbstractC4308 abstractC4308M2971 = c0779.m2971();
        C6735 c6735 = this.f41039;
        if (abstractC4308M2971 != null) {
            c18837.m43511(new C23503(c6735, c0779, enumC19125, new EnumC19125[0]));
        }
        c18837.m43511(new C2337(c6735, c0779, abstractC4308, enumC19125));
        return c18837.m43517();
    }
}
