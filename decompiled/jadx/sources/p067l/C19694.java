package p067l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W403 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19694 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC5323 f59868;

    /* JADX INFO: renamed from: ۧ */
    public HashMap f59869;

    /* JADX INFO: renamed from: ᩳ */
    public static final C6468 f59867 = new C6468();

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC5323 f59866 = new C12989();

    /* JADX INFO: renamed from: ֫ */
    public static C19694 m44728(C5127 c5127) {
        C6468 c6468 = f59867;
        C19694 c19694 = (C19694) c5127.m10905(c6468);
        if (c19694 != null) {
            return c19694;
        }
        C19694 c19695 = new C19694();
        c19695.f59869 = new HashMap();
        c5127.m10908(c6468, c19695);
        c19695.f59868 = f59866;
        return c19695;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44732(InterfaceC18352 interfaceC18352) {
        HashMap map = this.f59869;
        InterfaceC5323 interfaceC5323 = this.f59868;
        if (interfaceC5323 == f59866) {
            interfaceC18352.mo8280();
            return;
        }
        C20271 c20271 = (C20271) map.get(interfaceC5323);
        if (c20271 == null) {
            InterfaceC5323 interfaceC5324 = this.f59868;
            C20271 c20272 = new C20271();
            map.put(interfaceC5324, c20272);
            c20271 = c20272;
        }
        c20271.m45777(interfaceC18352);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44731(AbstractC7257 abstractC7257) {
        HashMap map = this.f59869;
        C20271 c20271 = (C20271) map.get(abstractC7257);
        if (c20271 != null) {
            Iterator it = c20271.iterator();
            while (it.hasNext()) {
                ((InterfaceC18352) it.next()).mo8280();
            }
            map.remove(abstractC7257);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5323 m44729() {
        InterfaceC5323 interfaceC5323 = this.f59868;
        this.f59868 = f59866;
        return interfaceC5323;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5323 m44730(InterfaceC5323 interfaceC5323) {
        InterfaceC5323 interfaceC5324 = this.f59868;
        this.f59868 = interfaceC5323;
        return interfaceC5324;
    }
}
