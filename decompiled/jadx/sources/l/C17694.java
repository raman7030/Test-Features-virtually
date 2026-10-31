package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9QZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17694 implements InterfaceC10639 {
    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ۧ */
    public final Map mo26692(Object obj) {
        return (C7669) obj;
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ֫ */
    public final void mo26691(Object obj) {
        ((C4847) obj).getClass();
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ᩳ */
    public final Map mo26696(Object obj) {
        return (C7669) obj;
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo26693(Object obj) {
        return !((C7669) obj).m20490();
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ܿ */
    public final Object mo26695(Object obj) {
        ((C7669) obj).m20491();
        return obj;
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ܽ */
    public final Object mo26694(Object obj) {
        return C7669.m20488().m20492();
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ֫ */
    public final Object mo26689(Object obj, Object obj2) {
        C7669 c7669M20492 = (C7669) obj;
        C7669 c7669 = (C7669) obj2;
        if (!c7669.isEmpty()) {
            if (!c7669M20492.m20490()) {
                c7669M20492 = c7669M20492.m20492();
            }
            c7669M20492.m20489(c7669);
        }
        return c7669M20492;
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ֫ */
    public final void mo26690(int i, Object obj, Object obj2) {
        C7669 c7669 = (C7669) obj;
        C4847 c4847 = (C4847) obj2;
        if (c7669.isEmpty()) {
            return;
        }
        Iterator it = c7669.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            c4847.getClass();
            AbstractC14766.m35073(i);
            throw null;
        }
    }
}
