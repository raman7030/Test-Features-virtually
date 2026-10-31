package l;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.FileUriExposedException;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0208 extends AbstractC1661 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f1453;

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo1456(C2450 c2450) {
        List listM7909 = c2450.m7909();
        this.f1453 = listM7909;
        Iterator it = listM7909.iterator();
        while (it.hasNext()) {
            if (((InterfaceC17889) it.next()).isDirectory()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC1661
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo1455(C2450 c2450) {
        if (this.f1453.size() == 1) {
            c2450.m7922().mo15162((InterfaceC17889) this.f1453.get(0));
        }
        ArrayList arrayList = new ArrayList(this.f1453.size());
        Iterator it = this.f1453.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10211((InterfaceC17889) it.next()));
        }
        c2450.m7922().mo6005(c2450.m7921(), arrayList, new RunnableC3737(this, c2450, arrayList, 0));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1454(C0208 c0208, C2450 c2450, ArrayList arrayList) {
        String strMo36971;
        c2450.m7922().m39736((List) null);
        if (arrayList.size() != 1) {
            strMo36971 = (String) C5378.stream(c0208.f1453).map(new C18554(0)).reduce(new C19260()).get();
        } else {
            strMo36971 = ((InterfaceC17889) c0208.f1453.get(0)).mo36971();
            if (strMo36971.equals("application/vnd.android.package-archive") && C3424.m10398()) {
                strMo36971 = "application/octet-stream";
            }
        }
        m1453(c2450.m7917(), arrayList, strMo36971);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1453(Main main, ArrayList arrayList, String str) {
        C17109 c17109 = new C17109(main);
        c17109.m40139();
        c17109.m40143(str);
        if (arrayList.size() == 1) {
            c17109.m40141(((C10211) arrayList.get(0)).m25626());
        }
        boolean z = Build.VERSION.SDK_INT < 30 && C5732.f17657 && !C3424.m10398();
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C10211) it.next()).m25622().mo27919()) {
                    z = false;
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC15440 abstractC15440M25622 = ((C10211) it2.next()).m25622();
            Uri uriM36522 = z ? abstractC15440M25622.m36522() : abstractC15440M25622.m36509();
            c17109.m40140(uriM36522);
            arrayList2.add(uriM36522);
        }
        if (arrayList2.size() > 1) {
            C11914.m29048(arrayList2);
        }
        try {
            c17109.m40142();
        } catch (Exception e) {
            if (Build.VERSION.SDK_INT >= 24 && (e instanceof FileUriExposedException)) {
                C5732.f17657 = false;
                m1453(main, arrayList, str);
            } else {
                main.m10223(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }
}
