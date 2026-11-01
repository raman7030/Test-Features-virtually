package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5210 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C8975 c8975M25355 = C10987.m25355();
        ArrayList arrayList = new ArrayList();
        for (C18362 c18362 : (C18362[]) c8975M25355.m20749().toArray(new C18362[0])) {
            C19033 c19033M41834 = c18362.m41834();
            if (c19033M41834 != null) {
                if (C14486.m33131(c19033M41834.m43234()) == null) {
                    arrayList.add(c18362);
                }
            } else {
                AbstractC17043 abstractC17043M42109 = C18524.m42109(c18362.m41824(), new String[0]);
                if (abstractC17043M42109.mo38688() && !abstractC17043M42109.mo25094()) {
                    arrayList.add(c18362);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C7050.m16212(new RunnableC5447(3, c8975M25355, arrayList));
    }
}
