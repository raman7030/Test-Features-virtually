package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: SAKA */
/* JADX INFO: loaded from: classes4.dex */
public final class C17046 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23396 f52237;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1000 f52238;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52239;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f52241;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52242;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f52240 = false;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8817 f52243 = C8817.m22790();

    public C17046(C23396 c23396, long j, boolean z, boolean z2, RunnableC1000 runnableC1000) {
        this.f52237 = c23396;
        this.f52241 = j;
        this.f52242 = z;
        this.f52239 = z2;
        this.f52238 = runnableC1000;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f52237.f75155.m39056(), R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        ArrayList<C14223> arrayList = new ArrayList();
        C23396 c23396 = this.f52237;
        for (InterfaceC17889 interfaceC17889 : c23396.f75153) {
            AbstractC15440 abstractC15440Mo24433 = interfaceC17889.mo24433();
            String name = interfaceC17889.getName();
            if ((this.f52242 || this.f52239) && interfaceC17889.isDirectory() && !interfaceC17889.mo36978()) {
                for (AbstractC15440 abstractC15440 : abstractC15440Mo24433.mo23549(true)) {
                    StringBuilder sbM19190 = C7166.m19190(name, "/");
                    sbM19190.append(abstractC15440.getName());
                    m40013(arrayList, abstractC15440, sbM19190.toString());
                }
            }
            arrayList.add(new C14223(abstractC15440Mo24433, name));
        }
        try {
            for (C14223 c14223 : arrayList) {
                if (this.f52243.m22791()) {
                    this.f23322.m31861(c14223.f42897);
                }
                AbstractC15440 abstractC15441 = c14223.f42896;
                if (abstractC15441.mo27912() && abstractC15441.mo18537(this.f52241)) {
                    this.f52240 = true;
                }
            }
        } finally {
            if (this.f52240) {
                for (InterfaceC17889 interfaceC178810 : c23396.f75153) {
                    interfaceC178810.setTime(interfaceC178810.mo24433().mo23117());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40013(ArrayList arrayList, AbstractC15440 abstractC15440, String str) {
        if (abstractC15440.m36533()) {
            return;
        }
        if (!abstractC15440.mo23113()) {
            if (this.f52242) {
                arrayList.add(new C14223(abstractC15440, str));
                return;
            }
            return;
        }
        for (AbstractC15440 abstractC15441 : abstractC15440.mo23549(true)) {
            StringBuilder sbM19190 = C7166.m19190(str, "/");
            sbM19190.append(abstractC15441.getName());
            m40013(arrayList, abstractC15441, sbM19190.toString());
        }
        if (this.f52239) {
            arrayList.add(new C14223(abstractC15440, str));
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f52240) {
            this.f52238.run();
            C21374.m48457(R.string.MT_Protector);
        } else {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f52240) {
            this.f52238.run();
        }
        this.f52237.f75155.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
