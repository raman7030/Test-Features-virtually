package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܽ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBAY */
/* JADX INFO: loaded from: classes5.dex */
public final class C16892 extends AbstractC17598 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f51879;

    public C16892(C1662 c1662) {
        super("type_ids", c1662, 4);
        this.f51879 = new TreeMap();
    }

    @Override // l.AbstractC17598
    /* JADX INFO: renamed from: ۢ */
    public final void mo1508() {
        Iterator it = this.f51879.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C11249) it.next()).m37187(i);
            i++;
        }
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo6834() {
        return this.f51879.values();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15772 m39749(AbstractC13717 abstractC13717) {
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        m16524();
        AbstractC15772 abstractC15772 = (AbstractC15772) this.f51879.get(((C12512) abstractC13717).m30696());
        if (abstractC15772 != null) {
            return abstractC15772;
        }
        throw new IllegalArgumentException("not found: " + abstractC13717);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39752(C18241 c18241) {
        m16524();
        TreeMap treeMap = this.f51879;
        int size = treeMap.size();
        int iM16522 = size == 0 ? 0 : m16522();
        if (size > 65536) {
            throw new C5314(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", Integer.valueOf(treeMap.values().size()), 65536), null);
        }
        if (c18241.m42506()) {
            c18241.m42501(4, "type_ids_size:   ".concat(C14712.m35008(size)));
            c18241.m42501(4, "type_ids_off:    ".concat(C14712.m35008(iM16522)));
        }
        c18241.m42514(size);
        c18241.m42514(iM16522);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m39751(C7573 c7573) {
        try {
            if (c7573 == null) {
                throw new NullPointerException("type == null");
            }
            m16519();
            if (((C11249) this.f51879.get(c7573)) == null) {
                this.f51879.put(c7573, new C11249(new C12512(c7573)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C11249 m39750(C12512 c12512) {
        C11249 c11249;
        try {
            if (c12512 == null) {
                throw new NullPointerException("type == null");
            }
            m16519();
            C7573 c7573M30696 = c12512.m30696();
            c11249 = (C11249) this.f51879.get(c7573M30696);
            if (c11249 == null) {
                c11249 = new C11249(c12512);
                this.f51879.put(c7573M30696, c11249);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c11249;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39747(C7573 c7573) {
        if (c7573 == null) {
            throw new NullPointerException("type == null");
        }
        m16524();
        C11249 c11249 = (C11249) this.f51879.get(c7573);
        if (c11249 == null) {
            throw new IllegalArgumentException("not found: " + c7573);
        }
        return c11249.m37188();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39748(C12512 c12512) {
        if (c12512 == null) {
            throw new NullPointerException("type == null");
        }
        return m39747(c12512.m30696());
    }
}
