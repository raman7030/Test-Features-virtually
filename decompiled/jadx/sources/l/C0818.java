package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F180 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0818 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2985;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1000 f2986;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f2987 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2988;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14929 f2989;

    public C0818(C14929 c14929, boolean z, boolean z2, RunnableC1000 runnableC1000) {
        this.f2989 = c14929;
        this.f2988 = z;
        this.f2985 = z2;
        this.f2986 = runnableC1000;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f2989.f45514.m39056(), R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C11293 c11293M31569;
        ArrayList<C9555> arrayList = new ArrayList();
        ArrayList<C9555> arrayList2 = new ArrayList();
        C14929 c14929 = this.f2989;
        Iterator it = c14929.f45513.iterator();
        while (it.hasNext()) {
            C9555 c9555 = (C9555) ((InterfaceC17889) it.next());
            if (c9555.m24436()) {
                arrayList.add(c9555);
            } else {
                arrayList2.add(c9555);
            }
        }
        int iM11081 = c14929.f45512.m11081();
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean z = this.f2985;
        boolean z2 = this.f2988;
        if (!zIsEmpty) {
            for (C9555 c9556 : arrayList2) {
                this.f23322.m31861(c9556.getName());
                String path = c9556.getPath();
                AbstractC15440 abstractC15440M39866 = C16999.m39866(path, new String[0]);
                if ((abstractC15440M39866 instanceof C12993) && (c11293M31569 = ((C12993) abstractC15440M39866).m31569()) != null) {
                    path = c11293M31569.mo23554();
                }
                C20402.m46726(path, iM11081, z2, z);
                c9556.m24429(c9556.mo24428().m38834(iM11081));
                this.f2987 = true;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList<C7874> arrayList3 = new ArrayList();
        for (C9555 c9557 : arrayList) {
            AbstractC15440 abstractC15440Mo24433 = c9557.mo24433();
            String name = c9557.getName();
            abstractC15440Mo24433.getClass();
            if (abstractC15440Mo24433 instanceof C13198) {
                arrayList3.add(new C7874(abstractC15440Mo24433.mo32036(), name, c9557));
            }
            if (z || z2) {
                if (c9557.isDirectory() && !c9557.mo36978()) {
                    for (AbstractC15440 abstractC15440 : abstractC15440Mo24433.mo23549(true)) {
                        StringBuilder sbM19190 = C7166.m19190(name, "/");
                        sbM19190.append(abstractC15440.getName());
                        m3066(arrayList3, abstractC15440, sbM19190.toString());
                    }
                }
            }
        }
        C8817 c8817M22790 = C8817.m22790();
        for (C7874 c7874 : arrayList3) {
            if (c8817M22790.m22791()) {
                this.f23322.m31861(c7874.f24417);
            }
            if (c7874.f24415.m32030(iM11081)) {
                C9555 c9558 = c7874.f24416;
                if (c9558 != null) {
                    c9558.m24429(c9558.mo24428().m38834(iM11081));
                }
                this.f2987 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3066(ArrayList arrayList, AbstractC15440 abstractC15440, String str) {
        if (abstractC15440.m36533()) {
            return;
        }
        if (!abstractC15440.mo23113()) {
            if (this.f2985 && (abstractC15440 instanceof C13198)) {
                arrayList.add(new C7874((C13198) abstractC15440, str, null));
                return;
            }
            return;
        }
        if (this.f2988 && (abstractC15440 instanceof C13198)) {
            arrayList.add(new C7874((C13198) abstractC15440, str, null));
        }
        for (AbstractC15440 abstractC15441 : abstractC15440.mo23549(true)) {
            StringBuilder sbM19190 = C7166.m19190(str, "/");
            sbM19190.append(abstractC15441.getName());
            m3066(arrayList, abstractC15441, sbM19190.toString());
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f2986.run();
        C21374.m48457(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f2987) {
            this.f2986.run();
        }
        this.f2989.f45514.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
