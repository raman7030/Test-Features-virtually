package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 542M */
/* JADX INFO: loaded from: classes4.dex */
public final class C11490 extends AbstractC6363 {
    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return Boolean.TRUE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        return (Boolean) c7251.f18916.mo5291(this, (Void) obj);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        return Boolean.valueOf((c10485.f16705.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0);
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4510(C16637 c16637, Object obj) {
        return Boolean.FALSE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        return (Boolean) c21215.f66703.mo5291(this, (Void) obj);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        Void r3 = (Void) obj;
        if ((c21333 instanceof C9814) || (c21333 instanceof C7921)) {
            return Boolean.FALSE;
        }
        Iterator it = c21333.mo14798().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((AbstractC6462) it.next()).mo5291(this, r3)).booleanValue()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
