package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18569 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C24604 f55419;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ RunnableC3319 f55420;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean f55421;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ long f55423;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ boolean f55424;

    /* JADX INFO: renamed from: ܳ */
    public boolean f55422 = false;

    /* JADX INFO: renamed from: ᩻ */
    public C10748 f55425 = C10748.m24760();

    public C18569(C24604 c24604, long j, boolean z, boolean z2, RunnableC3319 runnableC3319) {
        this.f55419 = c24604;
        this.f55423 = j;
        this.f55424 = z;
        this.f55421 = z2;
        this.f55420 = runnableC3319;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f55419.f77901.m41282(), R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        ArrayList<C15886> arrayList = new ArrayList();
        C24604 c24604 = this.f55419;
        for (InterfaceC19370 interfaceC19370 : c24604.f77899) {
            AbstractC17043 abstractC17043Mo26445 = interfaceC19370.mo26445();
            String name = interfaceC19370.getName();
            if ((this.f55424 || this.f55421) && interfaceC19370.isDirectory() && !interfaceC19370.mo39144()) {
                for (AbstractC17043 abstractC17043 : abstractC17043Mo26445.mo25500(true)) {
                    StringBuilder sbM21133 = C9179.m21133(name, "/");
                    sbM21133.append(abstractC17043.getName());
                    m42258(arrayList, abstractC17043, sbM21133.toString());
                }
            }
            arrayList.add(new C15886(abstractC17043Mo26445, name));
        }
        try {
            for (C15886 c15886 : arrayList) {
                if (this.f55425.m24761()) {
                    this.f26234.m33953(c15886.f45990);
                }
                AbstractC17043 abstractC17044 = c15886.f45989;
                if (abstractC17044.mo29973() && abstractC17044.mo20486(this.f55423)) {
                    this.f55422 = true;
                }
            }
        } finally {
            if (this.f55422) {
                for (InterfaceC19370 interfaceC19371 : c24604.f77899) {
                    interfaceC19371.setTime(interfaceC19371.mo26445().mo25091());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42258(ArrayList arrayList, AbstractC17043 abstractC17043, String str) {
        if (abstractC17043.m38691()) {
            return;
        }
        if (!abstractC17043.mo25087()) {
            if (this.f55424) {
                arrayList.add(new C15886(abstractC17043, str));
                return;
            }
            return;
        }
        for (AbstractC17043 abstractC17044 : abstractC17043.mo25500(true)) {
            StringBuilder sbM21133 = C9179.m21133(str, "/");
            sbM21133.append(abstractC17044.getName());
            m42258(arrayList, abstractC17044, sbM21133.toString());
        }
        if (this.f55421) {
            arrayList.add(new C15886(abstractC17043, str));
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f55422) {
            this.f55420.run();
            C22682.m50793(R.string.MT_Protector);
        } else {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f55422) {
            this.f55420.run();
        }
        this.f55419.f77901.m41282().m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
