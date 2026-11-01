package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15655 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12955 f44775;

    /* JADX INFO: renamed from: ᩶ */
    public final C20271 f44776 = new C20271();

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC15655 f44777;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC13844 f44778;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8617(C4036 c4036);

    public AbstractC15655(C12955 c12955, EnumC13844 enumC13844, AbstractC15655 abstractC15655) {
        this.f44775 = c12955;
        this.f44778 = enumC13844;
        this.f44777 = abstractC15655;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m35582(C4848 c4848) {
        C20271 c20271 = this.f44776;
        boolean zIsEmpty = c20271.isEmpty();
        C12955 c12955 = this.f44775;
        AbstractC15655 abstractC15655 = c12955.f36437;
        try {
            c12955.f36437 = this;
            mo6591(c4848);
            c12955.f36437 = abstractC15655;
            if (zIsEmpty) {
                C4848 c4848M45783 = c20271.m45783();
                c20271.clear();
                AbstractC15655 abstractC15656 = this.f44777;
                return abstractC15656 != null ? abstractC15656.m35582(c4848M45783) : c4848M45783;
            }
            return C4848.m10283();
        } catch (Throwable th) {
            c12955.f36437 = abstractC15655;
            if (zIsEmpty) {
                c20271.clear();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo6591(C4848 c4848) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C4036 c4036 = (C4036) it.next();
            C7650 c7650 = (C7650) c4036.f8850;
            this.f44776.m45777(c4036);
            C12955 c12955 = this.f44775;
            InterfaceC19740 interfaceC19740M9363 = c12955.f36430.m9363(c4036.f8851.f7516);
            C19694 c19694 = c12955.f36431;
            c7650.getClass();
            InterfaceC5323 interfaceC5323M44730 = c19694.m44730((InterfaceC5323) c7650);
            try {
                try {
                    c12955.f36428.mo27130(c4036.f8855.f20027, this.f44778);
                    mo8617(c4036);
                } catch (C21865 e) {
                    c12955.f36426.m38271(c7650, e);
                }
                c12955.f36428.mo27129();
                c12955.f36431.m44730(interfaceC5323M44730);
                c12955.f36430.m9363(interfaceC19740M9363);
            } catch (Throwable th) {
                c12955.f36428.mo27129();
                c12955.f36431.m44730(interfaceC5323M44730);
                c12955.f36430.m9363(interfaceC19740M9363);
                throw th;
            }
        }
    }
}
