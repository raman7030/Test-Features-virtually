package l;

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
public final class C23487 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2608 m51938(Uri uri, C6841 c6841) {
        return m51939(uri, (InterfaceC17066) c6841, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2608 m51939(Uri uri, InterfaceC17066 interfaceC17066, boolean z) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery arguments require a worker");
        }
        if (uri == null || (!"file".equals(uri.getScheme()) && !"content".equals(uri.getScheme()))) {
            throw new IOException("Unsupported gallery URI");
        }
        m51940(interfaceC17066);
        final AbstractC15440 c14798 = "content".equals(uri.getScheme()) ? new C14798(uri) : C16999.m39862(new Intent().setData(uri));
        C9555 c9555 = new C9555(c14798);
        m51940(interfaceC17066);
        final C2499 c2499 = C2499.f7958;
        List<InterfaceC17889> list = Collections.EMPTY_LIST;
        if ("file".equals(uri.getScheme())) {
            Future futureSubmit = C1802.f6208.submit(new Callable() { // from class: l.ܳۚۜ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c2499.mo7637(c14798.m36511(), true);
                }
            });
            try {
                list = (List) futureSubmit.get(500L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
                futureSubmit.cancel(false);
            }
        }
        m51940(interfaceC17066);
        ArrayList arrayList = new ArrayList();
        InterfaceC17889 interfaceC17889 = c9555;
        for (InterfaceC17889 interfaceC178810 : list) {
            m51940(interfaceC17066);
            if (interfaceC178810.getPath().equals(c9555.getPath())) {
                arrayList.add(interfaceC178810);
                interfaceC17889 = interfaceC178810;
            } else if (interfaceC178810.mo36969() && (interfaceC178810.mo36971().startsWith("image/") || (z && C6554.m18062(interfaceC178810)))) {
                arrayList.add(interfaceC178810);
            }
        }
        if (interfaceC17889 == c9555) {
            arrayList.add(c9555);
        }
        C7489.m20119(arrayList, 0, false);
        return new C2608(c2499, arrayList, arrayList.indexOf(interfaceC17889));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2608 m51937(Uri uri, ArrayList arrayList, C6841 c6841) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery arguments require a worker");
        }
        m51940(c6841);
        if (uri == null || !"file".equals(uri.getScheme()) || !C16999.m39862(new Intent().setData(uri)).mo36530()) {
            throw new IOException("Gallery source cannot be reopened independently");
        }
        C2608 c2608M51939 = m51939(uri, (InterfaceC17066) c6841, true);
        ArrayList arrayList2 = new ArrayList(c2608M51939.m8233());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC17889) it.next()).getPath());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            m51940(c6841);
            if (str == null || !str.startsWith("/")) {
                throw new IOException("Invalid restored gallery path");
            }
            if (hashSet.add(str)) {
                AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
                if (!abstractC15440M39866.mo36530()) {
                    throw new IOException("Selected gallery source cannot be reopened independently");
                }
                arrayList2.add(new C9555(abstractC15440M39866));
            }
        }
        return new C2608(c2608M51939.m8234(), arrayList2, c2608M51939.m8232());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51940(InterfaceC17066 interfaceC17066) throws InterruptedIOException {
        if (interfaceC17066.mo1526()) {
            throw new InterruptedIOException("Gallery argument request canceled");
        }
    }
}
