package l;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۜۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBFX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6601 extends AbstractC0250 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f20328;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C23534 m18104(C8985 c8985) {
        C23534 c23534;
        try {
            if (c8985 == null) {
                throw new NullPointerException("field == null");
            }
            m16519();
            c23534 = (C23534) this.f20328.get(c8985);
            if (c23534 == null) {
                c23534 = new C23534(c8985);
                this.f20328.put(c8985, c23534);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c23534;
    }

    public C6601(C1662 c1662) {
        super("field_ids", c1662, 4);
        this.f20328 = new TreeMap();
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo6834() {
        return this.f20328.values();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15772 m18103(AbstractC13717 abstractC13717) {
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        m16524();
        AbstractC15772 abstractC15772 = (AbstractC15772) this.f20328.get((C8985) abstractC13717);
        if (abstractC15772 != null) {
            return abstractC15772;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18105(C18241 c18241) {
        m16524();
        int size = this.f20328.size();
        int iM16522 = size == 0 ? 0 : m16522();
        if (c18241.m42506()) {
            c18241.m42501(4, "field_ids_size:  ".concat(C14712.m35008(size)));
            c18241.m42501(4, "field_ids_off:   ".concat(C14712.m35008(iM16522)));
        }
        c18241.m42514(size);
        c18241.m42514(iM16522);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18102(C8985 c8985) {
        if (c8985 == null) {
            throw new NullPointerException("ref == null");
        }
        m16524();
        C23534 c23534 = (C23534) this.f20328.get(c8985);
        if (c23534 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c23534.m37188();
    }
}
