package p067l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9QZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19184 implements InterfaceC12479 {
    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ۧ */
    public final Map mo28732(Object obj) {
        return (C9657) obj;
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ֫ */
    public final void mo28731(Object obj) {
        ((C6975) obj).getClass();
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ᩳ */
    public final Map mo28736(Object obj) {
        return (C9657) obj;
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo28733(Object obj) {
        return !((C9657) obj).m22470();
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ܿ */
    public final Object mo28735(Object obj) {
        ((C9657) obj).m22471();
        return obj;
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ܽ */
    public final Object mo28734(Object obj) {
        return C9657.m22468().m22472();
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ֫ */
    public final Object mo28729(Object obj, Object obj2) {
        C9657 c9657M22472 = (C9657) obj;
        C9657 c9657 = (C9657) obj2;
        if (!c9657.isEmpty()) {
            if (!c9657M22472.m22470()) {
                c9657M22472 = c9657M22472.m22472();
            }
            c9657M22472.m22469(c9657);
        }
        return c9657M22472;
    }

    @Override // p067l.InterfaceC12479
    /* JADX INFO: renamed from: ֫ */
    public final void mo28730(int i, Object obj, Object obj2) {
        C9657 c9657 = (C9657) obj;
        C6975 c6975 = (C6975) obj2;
        if (c9657.isEmpty()) {
            return;
        }
        Iterator it = c9657.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            c6975.getClass();
            AbstractC16402.m37220(i);
            throw null;
        }
    }
}
