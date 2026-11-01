package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F180 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3146 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f5759;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ RunnableC3319 f5760;

    /* JADX INFO: renamed from: ܳ */
    public boolean f5761 = false;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f5762;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C16557 f5763;

    public C3146(C16557 c16557, boolean z, boolean z2, RunnableC3319 runnableC3319) {
        this.f5763 = c16557;
        this.f5762 = z;
        this.f5759 = z2;
        this.f5760 = runnableC3319;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f5763.f48629.m41282(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C13102 c13102M33654;
        ArrayList<C11450> arrayList = new ArrayList();
        ArrayList<C11450> arrayList2 = new ArrayList();
        C16557 c16557 = this.f5763;
        Iterator it = c16557.f48628.iterator();
        while (it.hasNext()) {
            C11450 c11450 = (C11450) ((InterfaceC19370) it.next());
            if (c11450.m26448()) {
                arrayList.add(c11450);
            } else {
                arrayList2.add(c11450);
            }
        }
        int iM13057 = c16557.f48627.m13057();
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z = this.f5759;
        boolean z2 = this.f5762;
        if (!zIsEmpty) {
            for (C11450 c11451 : arrayList2) {
                this.f26234.m33953(c11451.getName());
                String path = c11451.getPath();
                AbstractC17043 abstractC17043M42109 = C18524.m42109(path, new String[0]);
                if ((abstractC17043M42109 instanceof C14717) && (c13102M33654 = ((C14717) abstractC17043M42109).m33654()) != null) {
                    path = c13102M33654.mo25505();
                }
                C21759.m49049(path, iM13057, z2, z);
                c11451.m26441(c11451.mo26440().m41060(iM13057));
                this.f5761 = true;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList<C9852> arrayList3 = new ArrayList();
        for (C11450 c11452 : arrayList) {
            AbstractC17043 abstractC17043Mo26445 = c11452.mo26445();
            String name = c11452.getName();
            abstractC17043Mo26445.getClass();
            if (abstractC17043Mo26445 instanceof C14912) {
                arrayList3.add(new C9852(abstractC17043Mo26445.mo34134(), name, c11452));
            }
            if (z || z2) {
                if (c11452.isDirectory() && !c11452.mo39144()) {
                    for (AbstractC17043 abstractC17043 : abstractC17043Mo26445.mo25500(true)) {
                        StringBuilder sbM21133 = C9179.m21133(name, "/");
                        sbM21133.append(abstractC17043.getName());
                        m5380(arrayList3, abstractC17043, sbM21133.toString());
                    }
                }
            }
        }
        C10748 c10748M24760 = C10748.m24760();
        for (C9852 c9852 : arrayList3) {
            if (c10748M24760.m24761()) {
                this.f26234.m33953(c9852.f27333);
            }
            if (c9852.f27331.m34128(iM13057)) {
                C11450 c11453 = c9852.f27332;
                if (c11453 != null) {
                    c11453.m26441(c11453.mo26440().m41060(iM13057));
                }
                this.f5761 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5380(ArrayList arrayList, AbstractC17043 abstractC17043, String str) {
        if (abstractC17043.m38691()) {
            return;
        }
        if (!abstractC17043.mo25087()) {
            if (this.f5759 && (abstractC17043 instanceof C14912)) {
                arrayList.add(new C9852((C14912) abstractC17043, str, null));
                return;
            }
            return;
        }
        if (this.f5762 && (abstractC17043 instanceof C14912)) {
            arrayList.add(new C9852((C14912) abstractC17043, str, null));
        }
        for (AbstractC17043 abstractC17044 : abstractC17043.mo25500(true)) {
            StringBuilder sbM21133 = C9179.m21133(str, "/");
            sbM21133.append(abstractC17044.getName());
            m5380(arrayList, abstractC17044, sbM21133.toString());
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f5760.run();
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f5761) {
            this.f5760.run();
        }
        this.f5763.f48629.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
