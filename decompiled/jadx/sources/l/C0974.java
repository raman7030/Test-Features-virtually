package l;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֨۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J71Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C0974 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f3662;

    public C0974(ArrayList arrayList) {
        this.f3662 = arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m3440(Uri uri) {
        InterfaceC0268 interfaceC0268;
        String str;
        Iterator it = this.f3662.iterator();
        do {
            interfaceC0268 = null;
            if (!it.hasNext()) {
                return null;
            }
            C5208 c5208 = (C5208) it.next();
            c5208.getClass();
            str = c5208.f16315;
            if (!uri.getScheme().equals(a.s) && ((uri.getScheme().equals(a.s) || uri.getScheme().equals(b.a)) && uri.getAuthority().equals(c5208.f16313) && uri.getPath().startsWith(str))) {
                interfaceC0268 = c5208.f16314;
            }
        } while (interfaceC0268 == null);
        return interfaceC0268.mo1582(uri.getPath().replaceFirst(str, ""));
    }
}
