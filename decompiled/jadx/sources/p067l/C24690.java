package p067l;

import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩻ۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6N2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24690 {
    /* JADX INFO: renamed from: ֫ */
    public static C4847 m54340(Uri uri, C8870 c8870) {
        return m54341(uri, (InterfaceC18588) c8870, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4847 m54341(Uri uri, InterfaceC18588 interfaceC18588, boolean z) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery arguments require a worker");
        }
        if (uri == null || (!"file".equals(uri.getScheme()) && !"content".equals(uri.getScheme()))) {
            throw new IOException("Unsupported gallery URI");
        }
        m54342(interfaceC18588);
        final AbstractC17043 c16433 = "content".equals(uri.getScheme()) ? new C16433(uri) : C18524.m42105(new Intent().setData(uri));
        C11450 c11450 = new C11450(c16433);
        m54342(interfaceC18588);
        final C4744 c4744 = C4744.f10749;
        List<InterfaceC19370> list = Collections.EMPTY_LIST;
        if ("file".equals(uri.getScheme())) {
            Future futureSubmit = C4081.f8987.submit(new Callable() { // from class: l.ܳۚۜ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c4744.mo9708(c16433.m38669(), true);
                }
            });
            try {
                list = (List) futureSubmit.get(500L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
                futureSubmit.cancel(false);
            }
        }
        m54342(interfaceC18588);
        ArrayList arrayList = new ArrayList();
        InterfaceC19370 interfaceC19370 = c11450;
        for (InterfaceC19370 interfaceC19371 : list) {
            m54342(interfaceC18588);
            if (interfaceC19371.getPath().equals(c11450.getPath())) {
                arrayList.add(interfaceC19371);
                interfaceC19370 = interfaceC19371;
            } else if (interfaceC19371.mo39135() && (interfaceC19371.mo39137().startsWith("image/") || (z && C8597.m20012(interfaceC19371)))) {
                arrayList.add(interfaceC19371);
            }
        }
        if (interfaceC19370 == c11450) {
            arrayList.add(c11450);
        }
        C9486.m22095(arrayList, 0, false);
        return new C4847(c4744, arrayList, arrayList.indexOf(interfaceC19370));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4847 m54339(Uri uri, ArrayList arrayList, C8870 c8870) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery arguments require a worker");
        }
        m54342(c8870);
        if (uri == null || !"file".equals(uri.getScheme()) || !C18524.m42105(new Intent().setData(uri)).mo38688()) {
            throw new IOException("Gallery source cannot be reopened independently");
        }
        C4847 c4847M54341 = m54341(uri, (InterfaceC18588) c8870, true);
        ArrayList arrayList2 = new ArrayList(c4847M54341.m10274());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC19370) it.next()).getPath());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            m54342(c8870);
            if (str == null || !str.startsWith("/")) {
                throw new IOException("Invalid restored gallery path");
            }
            if (hashSet.add(str)) {
                AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
                if (!abstractC17043M42109.mo38688()) {
                    throw new IOException("Selected gallery source cannot be reopened independently");
                }
                arrayList2.add(new C11450(abstractC17043M42109));
            }
        }
        return new C4847(c4847M54341.m10275(), arrayList2, c4847M54341.m10273());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54342(InterfaceC18588 interfaceC18588) throws InterruptedIOException {
        if (interfaceC18588.mo3924()) {
            throw new InterruptedIOException("Gallery argument request canceled");
        }
    }
}
