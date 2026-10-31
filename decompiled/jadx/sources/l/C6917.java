package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H7FZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6917 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f21354;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f21355 = new ArrayList(2);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f21356;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f21357;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
    }

    public C6917(C21029 c21029, C2450 c2450, AbstractC3163 abstractC3163, ArrayList arrayList) {
        this.f21354 = c2450;
        this.f21356 = abstractC3163;
        this.f21357 = arrayList;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f21354.m7917(), R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws Exception {
        ArrayList arrayList = this.f21357;
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) arrayList.get(0);
        InterfaceC17889 interfaceC178810 = (InterfaceC17889) arrayList.get(1);
        String path = interfaceC17889.getPath();
        String path2 = interfaceC178810.getPath();
        String strM24393 = C9523.m24393(interfaceC17889.getParent(), System.currentTimeMillis() + ".tmp");
        AbstractC3163 abstractC3163 = this.f21356;
        String strMo9709 = abstractC3163.mo9709(strM24393);
        abstractC3163.mo9684(path, strMo9709);
        String strM24404 = C9523.m24404(strMo9709);
        ArrayList arrayList2 = this.f21355;
        arrayList2.add(strM24404);
        try {
            abstractC3163.mo9684(path2, path);
            arrayList2.add(C9523.m24404(path));
            try {
                abstractC3163.mo9684(strMo9709, path2);
                arrayList2.add(C9523.m24404(path2));
                arrayList2.remove(C9523.m24404(strMo9709));
            } catch (Exception e) {
                if (abstractC3163.mo9696(path, path2)) {
                    arrayList2.remove(C9523.m24404(path));
                    if (abstractC3163.mo9696(strMo9709, path)) {
                        arrayList2.remove(C9523.m24404(strMo9709));
                    }
                }
                throw e;
            }
        } catch (Exception e2) {
            if (abstractC3163.mo9696(strMo9709, path)) {
                arrayList2.remove(C9523.m24404(strMo9709));
            }
            throw e2;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f21354.m7917().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        ArrayList arrayList = this.f21355;
        if (!arrayList.isEmpty()) {
            C2450 c2450 = this.f21354;
            c2450.m7906();
            c2450.m7908(arrayList);
            c2450.m7905();
        }
        C15528.m36595(this.f21356.mo9688());
    }
}
