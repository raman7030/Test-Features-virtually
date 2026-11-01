package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۤ */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0929 implements InterfaceC1489 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ String f8846;

    public C0929(String str) {
        this.f8846 = str;
    }

    @Override // p067l.InterfaceC1489
    public final void accept(Object obj) {
        C1384 c1384 = (C1384) obj;
        synchronized (C1664.f54110) {
            C1012 c1012 = C1664.f54111;
            ArrayList arrayList = (ArrayList) c1012.getOrDefault(this.f8846, null);
            if (arrayList == null) {
                return;
            }
            c1012.remove(this.f8846);
            for (int i = 0; i < arrayList.size(); i++) {
                ((InterfaceC1489) arrayList.get(i)).accept(c1384);
            }
        }
    }
}
