package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89PU */
/* JADX INFO: loaded from: classes4.dex */
public class C17842 implements InterfaceC12479 {
    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ۧ */
    public final Map mo28732(Object obj) {
        return ((C15691) obj).m35741();
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ᩳ */
    public final Map mo28736(Object obj) {
        return ((C15691) obj).m35737();
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo28733(Object obj) {
        return !((C15691) obj).m35736();
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ܿ */
    public final Object mo28735(Object obj) {
        ((C15691) obj).m35740();
        return obj;
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ܽ */
    public final Object mo28734(Object obj) {
        return C15691.m35735((C21728) obj);
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ֫ */
    public final void mo28731(Object obj) {
        ((C21728) obj).getClass();
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ֫ */
    public final Object mo28729(Object obj, Object obj2) {
        C15691 c15691 = (C15691) obj;
        C15691 c15692 = (C15691) obj2;
        if (!c15691.m35736()) {
            c15691.m35739();
        }
        ((C13681) c15691.m35741()).putAll(C9657.m22467(c15692.m35737()));
        return c15691;
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ֫ */
    public final void mo28730(int i, Object obj, Object obj2) {
        if (obj == null) {
            return;
        }
        Map mapM35737 = ((C15691) obj).m35737();
        C21728 c21728 = (C21728) obj2;
        if (mapM35737.isEmpty()) {
            return;
        }
        Iterator it = mapM35737.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AbstractC16402.m37220(i);
            c21728.getClass();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }
}
