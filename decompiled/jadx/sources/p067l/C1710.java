package p067l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: l.ܿᩳ */
/* JADX INFO: compiled from: DB8V */
/* JADX INFO: loaded from: classes4.dex */
public final class C1710 {

    /* JADX INFO: renamed from: ֫ */
    public volatile ActivityC2023 f56654;

    /* JADX INFO: renamed from: ۧ */
    public final CopyOnWriteArraySet f56655 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ֫ */
    public final void m43146(InterfaceC1570 interfaceC1570) {
        ActivityC2023 activityC2023 = this.f56654;
        if (activityC2023 != null) {
            interfaceC1570.mo17505(activityC2023);
        }
        this.f56655.add(interfaceC1570);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43147(ActivityC2023 activityC2023) {
        this.f56654 = activityC2023;
        Iterator it = this.f56655.iterator();
        while (it.hasNext()) {
            ((InterfaceC1570) it.next()).mo17505(activityC2023);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43145() {
        this.f56654 = null;
    }
}
