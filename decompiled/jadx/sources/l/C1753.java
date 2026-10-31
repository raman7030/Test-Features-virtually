package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B21 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1753 implements InterfaceC13041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6070;

    public C1753(String str) {
        this.f6070 = str;
    }

    @Override // l.InterfaceC13041
    public final void accept(Object obj) {
        C10926 c10926 = (C10926) obj;
        synchronized (C16569.f50933) {
            C3432 c3432 = C16569.f50934;
            ArrayList arrayList = (ArrayList) c3432.getOrDefault(this.f6070, null);
            if (arrayList == null) {
                return;
            }
            c3432.remove(this.f6070);
            for (int i = 0; i < arrayList.size(); i++) {
                ((InterfaceC13041) arrayList.get(i)).accept(c10926);
            }
        }
    }
}
