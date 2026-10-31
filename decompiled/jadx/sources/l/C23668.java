package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final class C23668 extends C23503 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f76662;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23668(C6735 c6735, C0779 c0779) {
        super(c6735, c0779, EnumC19125.f60273, EnumC19125.f60275, EnumC19125.f60272);
        this.f76662 = c6735;
    }

    @Override // l.C23503, l.C14330, l.AbstractC21387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21387 mo7602(C0779 c0779) {
        return new C23668(this.f76662, c0779);
    }

    @Override // l.C14330, l.AbstractC21387
    /* JADX INFO: renamed from: ֫ */
    public final void mo34201(C0384 c0384, C1386 c1386) {
        AbstractC4308 abstractC4308M17553;
        C6735 c6735 = this.f76662;
        C6319 c6319 = c6735.f20923;
        Iterator it = c0384.f1814.iterator();
        while (it.hasNext()) {
            C0779 c0779 = (C0779) ((AbstractC4308) it.next());
            C0779 c07710 = this.f68886;
            c0779.m2965(c6319, C2609.of((Object) c07710.f14167), C2609.of((Object) c07710.m2971()));
            EnumC19125 enumC19125 = EnumC19125.f60272;
            C2609 c2609M12902 = AbstractC4308.m12902(c0779.m2963(enumC19125), new C17859(c0384));
            if (c2609M12902.isEmpty()) {
                abstractC4308M17553 = c6735.f20922.f66526;
            } else if (c2609M12902.f8241.isEmpty()) {
                abstractC4308M17553 = (AbstractC4308) c2609M12902.f8240;
            } else {
                abstractC4308M17553 = c6319.m17553(c2609M12902);
            }
            if (abstractC4308M17553 == null || abstractC4308M17553.mo12948()) {
                c6735.m18350(c0779, enumC19125);
            }
        }
        super.mo34201(c0384, c1386);
    }
}
