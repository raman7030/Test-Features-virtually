package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: DAFW */
/* JADX INFO: loaded from: classes3.dex */
public final class C4409 extends AbstractC2938 {
    @Override // l.AbstractC2938
    /* JADX INFO: renamed from: ֫ */
    public final Object mo8958(Object obj) throws Exception {
        C19660 c19660 = (C19660) obj;
        C1654 c1654M9142 = C2998.m9142(c19660);
        c1654M9142.f5781 = c19660;
        return c1654M9142;
    }

    @Override // l.AbstractC2938
    /* JADX INFO: renamed from: ֫ */
    public final void mo8959(Object obj, InterfaceC9994 interfaceC9994) {
        C1654 c1654 = (C1654) interfaceC9994.mo25153();
        C11003.toString(c1654);
        c1654.m45490();
        try {
            c1654.m45497().m19870();
        } catch (C12651 unused) {
        }
    }

    @Override // l.AbstractC2938
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC9994 mo8960(Object obj) {
        return new C16383((C1654) obj);
    }

    @Override // l.AbstractC2938
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8961(Object obj, InterfaceC9994 interfaceC9994) {
        C1654 c1654 = (C1654) interfaceC9994.mo25153();
        if (c1654.m45496()) {
            return false;
        }
        try {
            if (!c1654.m45497().m19868()) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC9994.mo25155().toEpochMilli();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 2000) {
                return true;
            }
            try {
                c1654.m5594(".");
                return true;
            } catch (IOException unused) {
                return false;
            }
        } catch (C12651 e) {
            e.toString();
            return false;
        }
    }
}
