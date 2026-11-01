package p067l;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۜۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBFX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8642 extends AbstractC2606 {

    /* JADX INFO: renamed from: ܳ */
    public final TreeMap f23205;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C24735 m20056(C10908 c10908) {
        C24735 c24735;
        try {
            if (c10908 == null) {
                throw new NullPointerException("field == null");
            }
            m18445();
            c24735 = (C24735) this.f23205.get(c10908);
            if (c24735 == null) {
                c24735 = new C24735(c10908);
                this.f23205.put(c10908, c24735);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c24735;
    }

    public C8642(C3948 c3948) {
        super("field_ids", c3948, 4);
        this.f23205 = new TreeMap();
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo8960() {
        return this.f23205.values();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17358 m20055(AbstractC15405 abstractC15405) {
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        m18450();
        AbstractC17358 abstractC17358 = (AbstractC17358) this.f23205.get((C10908) abstractC15405);
        if (abstractC17358 != null) {
            return abstractC17358;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m20057(C19705 c19705) {
        m18450();
        int size = this.f23205.size();
        int iM18448 = size == 0 ? 0 : m18448();
        if (c19705.m44765()) {
            c19705.m44760(4, "field_ids_size:  ".concat(C16351.m37155(size)));
            c19705.m44760(4, "field_ids_off:   ".concat(C16351.m37155(iM18448)));
        }
        c19705.m44773(size);
        c19705.m44773(iM18448);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m20054(C10908 c10908) {
        if (c10908 == null) {
            throw new NullPointerException("ref == null");
        }
        m18450();
        C24735 c24735 = (C24735) this.f23205.get(c10908);
        if (c24735 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c24735.m39358();
    }
}
