package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܽ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBAY */
/* JADX INFO: loaded from: classes5.dex */
public final class C18423 extends AbstractC19094 {

    /* JADX INFO: renamed from: ܳ */
    public final TreeMap f55059;

    public C18423(C3948 c3948) {
        super("type_ids", c3948, 4);
        this.f55059 = new TreeMap();
    }

    @Override // p067l.AbstractC19094
    /* JADX INFO: renamed from: ۢ */
    public final void mo3906() {
        Iterator it = this.f55059.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C13060) it.next()).m39357(i);
            i++;
        }
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo8960() {
        return this.f55059.values();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17358 m41990(AbstractC15405 abstractC15405) {
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        m18450();
        AbstractC17358 abstractC17358 = (AbstractC17358) this.f55059.get(((C14260) abstractC15405).m32771());
        if (abstractC17358 != null) {
            return abstractC17358;
        }
        throw new IllegalArgumentException("not found: " + abstractC15405);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m41993(C19705 c19705) {
        m18450();
        TreeMap treeMap = this.f55059;
        int size = treeMap.size();
        int iM18448 = size == 0 ? 0 : m18448();
        if (size > 65536) {
            throw new C7419(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536), null);
        }
        if (c19705.m44765()) {
            c19705.m44760(4, "type_ids_size:   ".concat(C16351.m37155(size)));
            c19705.m44760(4, "type_ids_off:    ".concat(C16351.m37155(iM18448)));
        }
        c19705.m44773(size);
        c19705.m44773(iM18448);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m41992(C9566 c9566) {
        try {
            if (c9566 == null) {
                throw new NullPointerException("type == null");
            }
            m18445();
            if (((C13060) this.f55059.get(c9566)) == null) {
                this.f55059.put(c9566, new C13060(new C14260(c9566)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C13060 m41991(C14260 c14260) {
        C13060 c13060;
        try {
            if (c14260 == null) {
                throw new NullPointerException("type == null");
            }
            m18445();
            C9566 c9566M32771 = c14260.m32771();
            c13060 = (C13060) this.f55059.get(c9566M32771);
            if (c13060 == null) {
                c13060 = new C13060(c14260);
                this.f55059.put(c9566M32771, c13060);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c13060;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41988(C9566 c9566) {
        if (c9566 == null) {
            throw new NullPointerException("type == null");
        }
        m18450();
        C13060 c13060 = (C13060) this.f55059.get(c9566);
        if (c13060 == null) {
            throw new IllegalArgumentException("not found: " + c9566);
        }
        return c13060.m39358();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41989(C14260 c14260) {
        if (c14260 == null) {
            throw new NullPointerException("type == null");
        }
        return m41988(c14260.m32771());
    }
}
