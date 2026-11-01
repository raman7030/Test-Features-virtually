package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C2829 extends AbstractC6363 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f4866;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        return (Void) c7251.f18916.mo5291(this, (Set) obj);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        Set set = (Set) obj;
        if ((c10485.f16705.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || !set.add(c10485)) {
            return null;
        }
        c10485.mo14803().mo5291(this, set);
        return null;
    }

    @Override // p067l.AbstractC6363, p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4510(C16637 c16637, Object obj) {
        Set set = (Set) obj;
        if (!set.add(c16637)) {
            return null;
        }
        c16637.mo14803().mo5291(this, set);
        c16637.f29021.mo5291(this, set);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        c21215.f66703.mo5291(this, (Set) obj);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        final Set set = (Set) obj;
        if (c21333.mo7388()) {
            C21230.forEach(this.f4866.m19505(c21333), new Consumer() { // from class: l.ᩴܶ֨
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C24719.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void m45213n(Object obj2) {
                    ((AbstractC6462) obj2).mo5291(this.f62632, set);
                }
            });
            return null;
        }
        C21230.forEach(c21333.mo14798(), new Consumer() { // from class: l.᩵ܶ֨
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj2) {
                ((AbstractC6462) obj2).mo5291(this.f65732, set);
            }
        });
        return null;
    }

    public C2829(C8374 c8374) {
        this.f4866 = c8374;
    }
}
