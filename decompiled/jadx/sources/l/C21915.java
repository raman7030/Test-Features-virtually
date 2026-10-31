package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩸᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBAP */
/* JADX INFO: loaded from: classes.dex */
public final class C21915 extends AbstractC17598 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TreeMap f70165;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final TreeMap f70166;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m49326(C23801 c23801) {
        try {
            if (c23801 == null) {
                throw new NullPointerException("cstRef");
            }
            m16519();
            if (((C15563) this.f70165.get(c23801)) == null) {
                this.f70165.put(c23801, new C15563(c23801));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C21915(C1662 c1662) {
        super("call_site_ids", c1662, 4);
        this.f70165 = new TreeMap();
        this.f70166 = new TreeMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15772 m49323(AbstractC13717 abstractC13717) {
        if (abstractC13717 == null) {
            throw new NullPointerException("cst == null");
        }
        m16524();
        AbstractC15772 abstractC15772 = (AbstractC15772) this.f70165.get((C23801) abstractC13717);
        if (abstractC15772 != null) {
            return abstractC15772;
        }
        throw new IllegalArgumentException("not found");
    }

    @Override // l.AbstractC17598
    /* JADX INFO: renamed from: ۢ */
    public final void mo1508() {
        Iterator it = this.f70165.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C15563) it.next()).m37187(i);
            i++;
        }
    }

    @Override // l.AbstractC5895
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo6834() {
        return this.f70165.values();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49325(C14628 c14628, C22620 c22620) {
        this.f70166.put(c14628, c22620);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22620 m49324(C14628 c14628) {
        if (c14628 == null) {
            throw new NullPointerException("callSite == null");
        }
        return (C22620) this.f70166.get(c14628);
    }
}
