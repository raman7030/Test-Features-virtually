package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۤۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBEA */
/* JADX INFO: loaded from: classes4.dex */
public final class C10129 extends AbstractC17598 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f30486;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m25412(C23095 c23095) {
        try {
            if (c23095 == null) {
                throw new NullPointerException("prototype == null");
            }
            m16519();
            if (((C12245) this.f30486.get(c23095)) == null) {
                this.f30486.put(c23095, new C12245(c23095));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C10129(C1662 c1662) {
        super("proto_ids", c1662, 4);
        this.f30486 = new TreeMap();
    }

    @Override // l.AbstractC17598
    /* JADX INFO: renamed from: ۢ */
    public final void mo1508() {
        Iterator it = this.f30486.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C12245) it.next()).m37187(i);
            i++;
        }
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo6834() {
        return this.f30486.values();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15772 m25411(AbstractC13717 abstractC13717) {
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        if (!(abstractC13717 instanceof C4751)) {
            throw new IllegalArgumentException("cst not instance of CstProtoRef");
        }
        m16524();
        AbstractC15772 abstractC15772 = (AbstractC15772) this.f30486.get(((C4751) abstractC13717).m13898());
        if (abstractC15772 != null) {
            return abstractC15772;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m25413(C18241 c18241) {
        m16524();
        int size = this.f30486.size();
        int iM16522 = size == 0 ? 0 : m16522();
        if (size > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (c18241.m42506()) {
            c18241.m42501(4, "proto_ids_size:  ".concat(C14712.m35008(size)));
            c18241.m42501(4, "proto_ids_off:   ".concat(C14712.m35008(iM16522)));
        }
        c18241.m42514(size);
        c18241.m42514(iM16522);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m25410(C23095 c23095) {
        if (c23095 == null) {
            throw new NullPointerException("prototype == null");
        }
        m16524();
        C12245 c12245 = (C12245) this.f30486.get(c23095);
        if (c12245 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c12245.m37188();
    }
}
