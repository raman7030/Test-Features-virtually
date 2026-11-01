package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: DAFW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6559 extends AbstractC5160 {
    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11026(Object obj) throws Exception {
        C21054 c21054 = (C21054) obj;
        C3940 c3940M11193 = C5218.m11193(c21054);
        c3940M11193.f8561 = c21054;
        return c3940M11193;
    }

    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ֫ */
    public final void mo11027(Object obj, InterfaceC11866 interfaceC11866) {
        C3940 c3940 = (C3940) interfaceC11866.mo27170();
        C12826.toString(c3940);
        c3940.m47801();
        try {
            c3940.m47808().m21843();
        } catch (C14392 unused) {
        }
    }

    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC11866 mo11028(Object obj) {
        return new C17938((C3940) obj);
    }

    @Override // p067l.AbstractC5160
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11029(Object obj, InterfaceC11866 interfaceC11866) {
        C3940 c3940 = (C3940) interfaceC11866.mo27170();
        if (c3940.m47807()) {
            return false;
        }
        try {
            if (!c3940.m47808().m21841()) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - interfaceC11866.mo27172().toEpochMilli();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 2000) {
                return true;
            }
            try {
                c3940.m7824(".");
                return true;
            } catch (IOException unused) {
                return false;
            }
        } catch (C14392 e) {
            e.toString();
            return false;
        }
    }
}
