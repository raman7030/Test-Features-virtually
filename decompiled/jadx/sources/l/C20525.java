package l;

import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.᩷֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P98B */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20525 implements InterfaceC18862, InterfaceC7305 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66134;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66135;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66136;

    public /* synthetic */ C20525(Object obj, Object obj2, Object obj3) {
        this.f66135 = obj;
        this.f66136 = obj2;
        this.f66134 = obj3;
    }

    @Override // l.InterfaceC7305
    /* JADX INFO: renamed from: ֫ */
    public void mo10987(C10211 c10211) {
        String name;
        String name2;
        C10211 c10212 = (C10211) this.f66135;
        C2450 c2450 = (C2450) this.f66136;
        C16560 c16560 = (C16560) this.f66134;
        c10211.m25619();
        AbstractC15440 abstractC15440M25622 = c10212.m25622();
        AbstractC15440 abstractC15440M25623 = c10211.m25622();
        boolean zM39064 = c2450.m7921().m39064();
        if (abstractC15440M25622.getName().equals(abstractC15440M25623.getName())) {
            int i = R.string.MT_Protector;
            name = C4925.m14306(zM39064 ? R.string.MT_Protector : R.string.MT_Protector, abstractC15440M25622.getName());
            if (!zM39064) {
                i = R.string.MT_Protector;
            }
            name2 = C4925.m14306(i, abstractC15440M25623.getName());
        } else {
            name = abstractC15440M25622.getName();
            name2 = abstractC15440M25623.getName();
        }
        C7309 c7309 = new C7309(c10212.m25622(), c10211.m25622(), name, name2, c2450.m7922(), c16560.m39044());
        if (!zM39064) {
            c7309.m19594();
        }
        C7348.m19710(c2450.m7921(), c7309);
    }

    @Override // l.InterfaceC18862
    /* JADX INFO: renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) this.f66135;
        C5732 c5732 = (C5732) this.f66136;
        InterfaceC5711 interfaceC5711 = (InterfaceC5711) this.f66134;
        C9340.m24035(interfaceC17889, OpenAuthTask.Duplex);
        c5732.m16166(interfaceC5711, abstractC15440, false);
    }
}
