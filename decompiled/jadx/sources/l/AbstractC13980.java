package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13980 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f41692;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18837 f41693 = new C18837();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC13980 f41694;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC12075 f41695;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6476(C1755 c1755);

    public AbstractC13980(C11139 c11139, EnumC12075 enumC12075, AbstractC13980 abstractC13980) {
        this.f41692 = c11139;
        this.f41695 = enumC12075;
        this.f41694 = abstractC13980;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33462(C2609 c2609) {
        C18837 c18837 = this.f41693;
        boolean zIsEmpty = c18837.isEmpty();
        C11139 c11139 = this.f41692;
        AbstractC13980 abstractC13980 = c11139.f33437;
        try {
            c11139.f33437 = this;
            mo4345(c2609);
            c11139.f33437 = abstractC13980;
            if (zIsEmpty) {
                C2609 c2609M43517 = c18837.m43517();
                c18837.clear();
                AbstractC13980 abstractC13981 = this.f41694;
                return abstractC13981 != null ? abstractC13981.m33462(c2609M43517) : c2609M43517;
            }
            return C2609.m8239();
        } catch (Throwable th) {
            c11139.f33437 = abstractC13980;
            if (zIsEmpty) {
                c18837.clear();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo4345(C2609 c2609) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C1755 c1755 = (C1755) it.next();
            C5557 c5557 = (C5557) c1755.f6074;
            this.f41693.m43511(c1755);
            C11139 c11139 = this.f41692;
            InterfaceC18278 interfaceC18278M7284 = c11139.f33430.m7284(c1755.f6075.f4745);
            C18230 c18230 = c11139.f33431;
            c5557.getClass();
            InterfaceC3109 interfaceC3109M42471 = c18230.m42471((InterfaceC3109) c5557);
            try {
                try {
                    c11139.f33428.mo25113(c1755.f6079.f17186, this.f41695);
                    mo6476(c1755);
                } catch (C20515 e) {
                    c11139.f33426.m36110(c5557, e);
                }
                c11139.f33428.mo25112();
                c11139.f33431.m42471(interfaceC3109M42471);
                c11139.f33430.m7284(interfaceC18278M7284);
            } catch (Throwable th) {
                c11139.f33428.mo25112();
                c11139.f33431.m42471(interfaceC3109M42471);
                c11139.f33430.m7284(interfaceC18278M7284);
                throw th;
            }
        }
    }
}
