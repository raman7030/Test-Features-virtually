package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۠ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBEG */
/* JADX INFO: loaded from: classes4.dex */
public final class C9983 extends AbstractC19094 {

    /* JADX INFO: renamed from: ܳ */
    public final TreeMap f27653;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m23291(C22978 c22978) {
        try {
            if (c22978 == null) {
                throw new NullPointerException("methodHandle == null");
            }
            m18445();
            if (((C3277) this.f27653.get(c22978)) == null) {
                this.f27653.put(c22978, new C3277(c22978));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17358 m23290(AbstractC15405 abstractC15405) {
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        m18450();
        AbstractC17358 abstractC17358 = (AbstractC17358) this.f27653.get((C22978) abstractC15405);
        if (abstractC17358 != null) {
            return abstractC17358;
        }
        throw new IllegalArgumentException("not found");
    }

    public C9983(C3948 c3948) {
        super("method_handles", c3948, 8);
        this.f27653 = new TreeMap();
    }

    @Override // p067l.AbstractC19094
    /* JADX INFO: renamed from: ۢ */
    public final void mo3906() {
        Iterator it = this.f27653.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C3277) it.next()).m39357(i);
            i++;
        }
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo8960() {
        return this.f27653.values();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m23289(C22978 c22978) {
        return ((C3277) this.f27653.get(c22978)).m39358();
    }
}
