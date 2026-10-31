package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֫᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHY */
/* JADX INFO: loaded from: classes3.dex */
public final class C2076 extends AbstractC17598 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f6928;

    public C2076(C1662 c1662) {
        super("string_ids", c1662, 4);
        this.f6928 = new TreeMap();
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Collection mo6834() {
        return this.f6928.values();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15772 m6831(AbstractC13717 abstractC13717) {
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        m16524();
        AbstractC15772 abstractC15772 = (AbstractC15772) this.f6928.get((C13217) abstractC13717);
        if (abstractC15772 != null) {
            return abstractC15772;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m6833(C18241 c18241) {
        m16524();
        int size = this.f6928.size();
        int iM16522 = size == 0 ? 0 : m16522();
        if (c18241.m42506()) {
            c18241.m42501(4, "string_ids_size: ".concat(C14712.m35008(size)));
            c18241.m42501(4, "string_ids_off:  ".concat(C14712.m35008(iM16522)));
        }
        c18241.m42514(size);
        c18241.m42514(iM16522);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6832(C13217 c13217) {
        C7306 c7306 = new C7306(c13217);
        synchronized (this) {
            m16519();
            C13217 value = c7306.getValue();
            if (((C7306) this.f6928.get(value)) != null) {
                return;
            }
            this.f6928.put(value, c7306);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6830(C13217 c13217) {
        if (c13217 == null) {
            throw new NullPointerException("string == null");
        }
        m16524();
        C7306 c7306 = (C7306) this.f6928.get(c13217);
        if (c7306 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c7306.m37188();
    }

    @Override // l.AbstractC17598
    /* JADX INFO: renamed from: ۢ */
    public final void mo1508() {
        Iterator it = this.f6928.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C7306) it.next()).m37187(i);
            i++;
        }
    }
}
