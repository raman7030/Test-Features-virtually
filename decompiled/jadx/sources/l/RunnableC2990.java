package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2990 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C6951 c6951M23409 = C9068.m23409();
        ArrayList arrayList = new ArrayList();
        for (C16828 c16828 : (C16828[]) c6951M23409.m18795().toArray(new C16828[0])) {
            C17534 c17534M39598 = c16828.m39598();
            if (c17534M39598 != null) {
                if (C12749.m31047(c17534M39598.m40974()) == null) {
                    arrayList.add(c16828);
                }
            } else {
                AbstractC15440 abstractC15440M39866 = C16999.m39866(c16828.m39588(), new String[0]);
                if (abstractC15440M39866.mo36530() && !abstractC15440M39866.mo23120()) {
                    arrayList.add(c16828);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C4925.m14315(new RunnableC3239(3, c6951M23409, arrayList));
    }
}
