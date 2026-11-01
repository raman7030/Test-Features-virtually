package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩸᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBAP */
/* JADX INFO: loaded from: classes.dex */
public final class C23197 extends AbstractC19094 {

    /* JADX INFO: renamed from: ܳ */
    public final TreeMap f72879;

    /* JADX INFO: renamed from: ᩻ */
    public final TreeMap f72880;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m51679(C24989 c24989) {
        try {
            if (c24989 == null) {
                throw new NullPointerException("cstRef");
            }
            m18445();
            if (((C17160) this.f72879.get(c24989)) == null) {
                this.f72879.put(c24989, new C17160(c24989));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C23197(C3948 c3948) {
        super("call_site_ids", c3948, 4);
        this.f72879 = new TreeMap();
        this.f72880 = new TreeMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17358 m51676(AbstractC15405 abstractC15405) {
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        m18450();
        AbstractC17358 abstractC17358 = (AbstractC17358) this.f72879.get((C24989) abstractC15405);
        if (abstractC17358 != null) {
            return abstractC17358;
        }
        throw new IllegalArgumentException("not found");
    }

    @Override // p067l.AbstractC19094
    /* JADX INFO: renamed from: ۢ */
    public final void mo3906() {
        Iterator it = this.f72879.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C17160) it.next()).m39357(i);
            i++;
        }
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo8960() {
        return this.f72879.values();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51678(C16271 c16271, C23867 c23867) {
        this.f72880.put(c16271, c23867);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23867 m51677(C16271 c16271) {
        if (c16271 == null) {
            throw new NullPointerException("callSite == null");
        }
        return (C23867) this.f72880.get(c16271);
    }
}
