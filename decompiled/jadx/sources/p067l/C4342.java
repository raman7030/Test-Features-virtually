package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֫᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHY */
/* JADX INFO: loaded from: classes3.dex */
public final class C4342 extends AbstractC19094 {

    /* JADX INFO: renamed from: ܳ */
    public final TreeMap f9712;

    public C4342(C3948 c3948) {
        super("string_ids", c3948, 4);
        this.f9712 = new TreeMap();
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo8960() {
        return this.f9712.values();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17358 m8957(AbstractC15405 abstractC15405) {
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        m18450();
        AbstractC17358 abstractC17358 = (AbstractC17358) this.f9712.get((C14930) abstractC15405);
        if (abstractC17358 != null) {
            return abstractC17358;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m8959(C19705 c19705) {
        m18450();
        int size = this.f9712.size();
        int iM18448 = size == 0 ? 0 : m18448();
        if (c19705.m44765()) {
            c19705.m44760(4, "string_ids_size: ".concat(C16351.m37155(size)));
            c19705.m44760(4, "string_ids_off:  ".concat(C16351.m37155(iM18448)));
        }
        c19705.m44773(size);
        c19705.m44773(iM18448);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m8958(C14930 c14930) {
        C9312 c9312 = new C9312(c14930);
        synchronized (this) {
            m18445();
            C14930 value = c9312.getValue();
            if (((C9312) this.f9712.get(value)) != null) {
                return;
            }
            this.f9712.put(value, c9312);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8956(C14930 c14930) {
        if (c14930 == null) {
            throw new NullPointerException("string == null");
        }
        m18450();
        C9312 c9312 = (C9312) this.f9712.get(c14930);
        if (c9312 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c9312.m39358();
    }

    @Override // p067l.AbstractC19094
    /* JADX INFO: renamed from: ۢ */
    public final void mo3906() {
        Iterator it = this.f9712.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C9312) it.next()).m39357(i);
            i++;
        }
    }
}
