package l;

import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩸ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBHA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21418 extends AbstractC0250 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f68981;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m48540(AbstractC16745 abstractC16745) {
        try {
            if (abstractC16745 == null) {
                throw new NullPointerException("method == null");
            }
            m16519();
            if (((C15066) this.f68981.get(abstractC16745)) == null) {
                this.f68981.put(abstractC16745, new C15066(abstractC16745));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C21418(C1662 c1662) {
        super("method_ids", c1662, 4);
        this.f68981 = new TreeMap();
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo6834() {
        return this.f68981.values();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15772 m48539(AbstractC13717 abstractC13717) {
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        m16524();
        AbstractC15772 abstractC15772 = (AbstractC15772) this.f68981.get((AbstractC16745) abstractC13717);
        if (abstractC15772 != null) {
            return abstractC15772;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48541(C18241 c18241) {
        m16524();
        int size = this.f68981.size();
        int iM16522 = size == 0 ? 0 : m16522();
        if (c18241.m42506()) {
            c18241.m42501(4, "method_ids_size: ".concat(C14712.m35008(size)));
            c18241.m42501(4, "method_ids_off:  ".concat(C14712.m35008(iM16522)));
        }
        c18241.m42514(size);
        c18241.m42514(iM16522);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48538(AbstractC16745 abstractC16745) {
        if (abstractC16745 == null) {
            throw new NullPointerException("ref == null");
        }
        m16524();
        C15066 c15066 = (C15066) this.f68981.get(abstractC16745);
        if (c15066 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c15066.m37188();
    }
}
