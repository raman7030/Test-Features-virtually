package p067l;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.FileUriExposedException;
import bin.p000mt.plus.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2566 extends AbstractC3947 {

    /* JADX INFO: renamed from: ۗ */
    public List f4232;

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo3869(C4697 c4697) {
        List listM9957 = c4697.m9957();
        this.f4232 = listM9957;
        Iterator it = listM9957.iterator();
        while (it.hasNext()) {
            if (((InterfaceC19370) it.next()).isDirectory()) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC3947
    /* JADX INFO: renamed from: ܽ */
    public final void mo3868(C4697 c4697) {
        if (this.f4232.size() == 1) {
            c4697.m9970().mo17065((InterfaceC19370) this.f4232.get(0));
        }
        ArrayList arrayList = new ArrayList(this.f4232.size());
        Iterator it = this.f4232.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12073((InterfaceC19370) it.next()));
        }
        c4697.m9970().mo8202(c4697.m9969(), arrayList, new RunnableC5920(this, c4697, arrayList, 0));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3867(C2566 c2566, C4697 c4697, ArrayList arrayList) {
        String strMo39137;
        c4697.m9970().m41977((List) null);
        if (arrayList.size() != 1) {
            strMo39137 = (String) C7480.stream(c2566.f4232).map(new C20002(0)).reduce(new C20673()).get();
        } else {
            strMo39137 = ((InterfaceC19370) c2566.f4232.get(0)).mo39137();
            if (strMo39137.equals("application/vnd.android.package-archive") && C5623.m12437()) {
                strMo39137 = "application/octet-stream";
            }
        }
        m3866(c4697.m9965(), arrayList, strMo39137);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3866(Main main, ArrayList arrayList, String str) {
        C1691 c1691 = new C1691(main);
        c1691.m42384();
        c1691.m42388(str);
        if (arrayList.size() == 1) {
            c1691.m42386(((C12073) arrayList.get(0)).m27648());
        }
        boolean z = Build.VERSION.SDK_INT < 30 && C7816.f20502 && !C5623.m12437();
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C12073) it.next()).m27644().mo29980()) {
                    z = false;
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC17043 abstractC17043M27644 = ((C12073) it2.next()).m27644();
            Uri uriM38680 = z ? abstractC17043M27644.m38680() : abstractC17043M27644.m38667();
            c1691.m42385(uriM38680);
            arrayList2.add(uriM38680);
        }
        if (arrayList2.size() > 1) {
            C13692.m31100(arrayList2);
        }
        try {
            c1691.m42387();
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 24 && (e instanceof FileUriExposedException)) {
                C7816.f20502 = false;
                m3866(main, arrayList, str);
            } else {
                main.m12259(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
