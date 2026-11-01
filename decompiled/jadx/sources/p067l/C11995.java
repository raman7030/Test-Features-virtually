package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۤۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBEA */
/* JADX INFO: loaded from: classes4.dex */
public final class C11995 extends AbstractC19094 {

    /* JADX INFO: renamed from: ܳ */
    public final TreeMap f33448;

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m27432(C24318 c24318) {
        try {
            if (c24318 == null) {
                throw new NullPointerException("prototype == null");
            }
            m18445();
            if (((C14006) this.f33448.get(c24318)) == null) {
                this.f33448.put(c24318, new C14006(c24318));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C11995(C3948 c3948) {
        super("proto_ids", c3948, 4);
        this.f33448 = new TreeMap();
    }

    @Override // p067l.AbstractC19094
    /* JADX INFO: renamed from: ۢ */
    public final void mo3906() {
        Iterator it = this.f33448.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C14006) it.next()).m39357(i);
            i++;
        }
    }

    @Override // p067l.AbstractC7971
    /* JADX INFO: renamed from: ᩳ */
    public final Collection mo8960() {
        return this.f33448.values();
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17358 m27431(AbstractC15405 abstractC15405) {
        if (abstractC15405 == null) {
            throw new NullPointerException("cst == null");
        }
        if (!(abstractC15405 instanceof C6884)) {
            throw new IllegalArgumentException("cst not instance of CstProtoRef");
        }
        m18450();
        AbstractC17358 abstractC17358 = (AbstractC17358) this.f33448.get(((C6884) abstractC15405).m15778());
        if (abstractC17358 != null) {
            return abstractC17358;
        }
        throw new IllegalArgumentException("not found");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m27433(C19705 c19705) {
        m18450();
        int size = this.f33448.size();
        int iM18448 = size == 0 ? 0 : m18448();
        if (size > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (c19705.m44765()) {
            c19705.m44760(4, "proto_ids_size:  ".concat(C16351.m37155(size)));
            c19705.m44760(4, "proto_ids_off:   ".concat(C16351.m37155(iM18448)));
        }
        c19705.m44773(size);
        c19705.m44773(iM18448);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m27430(C24318 c24318) {
        if (c24318 == null) {
            throw new NullPointerException("prototype == null");
        }
        m18450();
        C14006 c14006 = (C14006) this.f33448.get(c24318);
        if (c14006 == null) {
            throw new IllegalArgumentException("not found");
        }
        return c14006.m39358();
    }
}
