package l;

import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class C14495 extends AbstractC21387 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f44398;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC19125 f44399;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14495(C6735 c6735, C0779 c0779, AbstractC4308 abstractC4308, EnumC19125 enumC19125) {
        super(c6735, c0779, abstractC4308);
        this.f44398 = c6735;
        this.f44399 = enumC19125;
    }

    @Override // l.AbstractC21387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21387 mo7602(C0779 c0779) {
        return new C14495(this.f44398, c0779, this.f68884, this.f44399);
    }

    @Override // l.AbstractC21387
    /* JADX INFO: renamed from: ֫ */
    public final void mo34201(C0384 c0384, C1386 c1386) {
        AbstractC4308 abstractC4308M1868 = c0384.m1868(this.f68884);
        boolean zM12913 = abstractC4308M1868.m12913(EnumC9454.UNDETVAR);
        C6735 c6735 = this.f44398;
        C0779 c0779 = this.f68886;
        EnumC19125 enumC19125 = this.f44399;
        if (zM12913) {
            C0779 c07710 = (C0779) abstractC4308M1868;
            if (!c07710.m2969()) {
                c07710.m2967(enumC19125.mo7226(), c0779, c6735.f20923);
                for (EnumC19125 enumC19126 : enumC19125 == EnumC19125.f60275 ? EnumSet.allOf(EnumC19125.class) : EnumSet.of(enumC19125)) {
                    Iterator it = c07710.m2963(enumC19126).iterator();
                    while (it.hasNext()) {
                        c0779.m2967(enumC19126, (AbstractC4308) it.next(), c6735.f20923);
                    }
                }
            }
        }
        EnumC19125 enumC19127 = EnumC19125.f60275;
        Iterator it2 = (enumC19125 == enumC19127 ? EnumSet.of(enumC19127) : EnumSet.complementOf(EnumSet.of(enumC19125))).iterator();
        while (it2.hasNext()) {
            Iterator it3 = c0779.m2963((EnumC19125) it2.next()).iterator();
            while (it3.hasNext()) {
                AbstractC4308 abstractC4308M1869 = c0384.m1868((AbstractC4308) it3.next());
                if (abstractC4308M1869.m12913(EnumC9454.UNDETVAR)) {
                    C0779 c07711 = (C0779) abstractC4308M1869;
                    if (!c07711.m2969()) {
                        c07711.m2967(enumC19125, c0384.m1859(this.f68884), c6735.f20923);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC21387
    public final String toString() {
        return String.format("%s[undet=%s,t=%s,bound=%s]", C14495.class.getSimpleName(), this.f68886.f14167, this.f68884, this.f44399);
    }
}
