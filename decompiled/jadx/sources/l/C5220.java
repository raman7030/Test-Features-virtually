package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C5220 extends AbstractC12669 {
    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        return (Boolean) c5138.f16077.mo2962(this, (Object) null);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2142(C8541 c8541, Object obj) {
        return Boolean.FALSE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        if (c19955.mo5146()) {
            return Boolean.FALSE;
        }
        if (!c19955.mo12917()) {
            return Boolean.TRUE;
        }
        Iterator it = c19955.mo12934().iterator();
        while (it.hasNext()) {
            if (!((AbstractC4308) it.next()).mo12944()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
