package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PU */
/* JADX INFO: loaded from: classes4.dex */
public class C16282 implements InterfaceC10639 {
    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ۧ */
    public final Map mo26692(Object obj) {
        return ((C14018) obj).m33621();
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ᩳ */
    public final Map mo26696(Object obj) {
        return ((C14018) obj).m33617();
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo26693(Object obj) {
        return !((C14018) obj).m33616();
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ܿ */
    public final Object mo26695(Object obj) {
        ((C14018) obj).m33620();
        return obj;
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ܽ */
    public final Object mo26694(Object obj) {
        return C14018.m33615((C20370) obj);
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ֫ */
    public final void mo26691(Object obj) {
        ((C20370) obj).getClass();
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ֫ */
    public final Object mo26689(Object obj, Object obj2) {
        C14018 c14018 = (C14018) obj;
        C14018 c14019 = (C14018) obj2;
        if (!c14018.m33616()) {
            c14018.m33619();
        }
        ((C11903) c14018.m33621()).putAll(C7669.m20487(c14019.m33617()));
        return c14018;
    }

    @Override // l.InterfaceC10639
    /* JADX INFO: renamed from: ֫ */
    public final void mo26690(int i, Object obj, Object obj2) {
        if (obj == null) {
            return;
        }
        Map mapM33617 = ((C14018) obj).m33617();
        C20370 c20370 = (C20370) obj2;
        if (mapM33617.isEmpty()) {
            return;
        }
        Iterator it = mapM33617.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC14766.m35073(i);
            c20370.getClass();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
