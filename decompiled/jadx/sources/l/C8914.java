package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9E2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8914 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f27092 = C11321.m27961(C8914.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f27093 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22984(C12441 c12441) throws C13146 {
        while (true) {
            AbstractC13418 abstractC13418M29354 = C12008.m29354(c12441);
            if (abstractC13418M29354.m32434() == EnumC3541.MsvAvEOL) {
                return;
            }
            f27092.mo7090("Read TargetInfo {} --> {}", abstractC13418M29354.m32434(), abstractC13418M29354.m32435());
            this.f27093.add(abstractC13418M29354);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22986(C12441 c12441) {
        for (AbstractC13418 abstractC13418 : this.f27093) {
            f27092.mo7090("Writing TargetInfo {} --> {}", abstractC13418.m32434(), abstractC13418.m32435());
            abstractC13418.mo6172(c12441);
        }
        new C10597().mo6172(c12441);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8914 m22982() {
        C8914 c8914 = new C8914();
        c8914.f27093 = new ArrayList(this.f27093);
        return c8914;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13418 m22983(EnumC3541 enumC3541) {
        for (AbstractC13418 abstractC13418 : this.f27093) {
            if (abstractC13418.m32434() == enumC3541) {
                return abstractC13418;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22985(AbstractC13418 abstractC13418) {
        for (AbstractC13418 abstractC13419 : this.f27093) {
            if (abstractC13419.m32434() == abstractC13418.m32434()) {
                this.f27093.remove(abstractC13419);
                break;
            }
        }
        this.f27093.add(abstractC13418);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22987(EnumC3541 enumC3541) {
        Iterator it = this.f27093.iterator();
        while (it.hasNext()) {
            if (((AbstractC13418) it.next()).m32434() == enumC3541) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "TargetInfo{targetInfo=" + this.f27093 + '}';
    }
}
