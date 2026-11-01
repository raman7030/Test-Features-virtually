package p067l;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩸ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBHA */
/* JADX INFO: loaded from: classes5.dex */
public final class C22724 extends AbstractC2606 {

    /* JADX INFO: renamed from: ܳ */
    public final TreeMap f71679;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m50876(AbstractC18283 abstractC18283) {
        try {
            if (abstractC18283 == null) {
                throw new NullPointerException("method == null");
            }
            m18445();
            if (((C16687) this.f71679.get(abstractC18283)) == null) {
                this.f71679.put(abstractC18283, new C16687(abstractC18283));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C22724(C3948 c3948) {
        super("method_ids", c3948, 4);
        this.f71679 = new TreeMap();
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo8960() {
        return this.f71679.values();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17358 m50875(AbstractC15405 abstractC15405) {
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        m18450();
        AbstractC17358 abstractC17358 = (AbstractC17358) this.f71679.get((AbstractC18283) abstractC15405);
        if (abstractC17358 != null) {
            return abstractC17358;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m50877(C19705 c19705) {
        m18450();
        int size = this.f71679.size();
        int iM18448 = size == 0 ? 0 : m18448();
        if (c19705.m44765()) {
            c19705.m44760(4, "method_ids_size: ".concat(C16351.m37155(size)));
            c19705.m44760(4, "method_ids_off:  ".concat(C16351.m37155(iM18448)));
        }
        c19705.m44773(size);
        c19705.m44773(iM18448);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50874(AbstractC18283 abstractC18283) {
        if (abstractC18283 == null) {
            throw new NullPointerException("ref == null");
        }
        m18450();
        C16687 c16687 = (C16687) this.f71679.get(abstractC18283);
        if (c16687 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c16687.m39358();
    }
}
