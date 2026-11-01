package p067l;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3294 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f6437;

    public C3294(ArrayList arrayList) {
        this.f6437 = arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final WebResourceResponse m5743(Uri uri) {
        InterfaceC2623 interfaceC2623;
        String str;
        Iterator it = this.f6437.iterator();
        do {
            interfaceC2623 = null;
            if (!it.hasNext()) {
                return null;
            }
            C7318 c7318 = (C7318) it.next();
            c7318.getClass();
            str = c7318.f19156;
            if (!uri.getScheme().equals(C0170a.f680s) && ((uri.getScheme().equals(C0170a.f680s) || uri.getScheme().equals(C0171b.f688a)) && uri.getAuthority().equals(c7318.f19154) && uri.getPath().startsWith(str))) {
                interfaceC2623 = c7318.f19155;
            }
        } while (interfaceC2623 == null);
        return interfaceC2623.mo3980(uri.getPath().replaceFirst(str, ""));
    }
}
