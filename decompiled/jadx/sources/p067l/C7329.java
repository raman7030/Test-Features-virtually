package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C7329 extends AbstractC14409 {
    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return Boolean.TRUE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        return (Boolean) c7251.f18916.mo5291(this, (Object) null);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4509(C10485 c10485, Object obj) {
        return Boolean.FALSE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        if (c21333.mo7388()) {
            return Boolean.FALSE;
        }
        if (!c21333.mo14781()) {
            return Boolean.TRUE;
        }
        Iterator it = c21333.mo14798().iterator();
        while (it.hasNext()) {
            if (!((AbstractC6462) it.next()).mo14808()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
