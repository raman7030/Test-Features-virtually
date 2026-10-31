package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12163 implements InterfaceC22705 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f36280;

    public C12163(ArrayList arrayList) {
        this.f36280 = arrayList;
    }

    @Override // l.InterfaceC22705
    /* JADX INFO: renamed from: ֫ */
    public final void mo22398(C13532 c13532) {
        C20069 c20069Mo29535 = c13532.mo29535();
        C21480 c21480M34042 = c13532.m34042();
        int size = c20069Mo29535.size();
        for (int i = 0; i < size; i++) {
            ((C16395) this.f36280.get(c13532.m32574(i))).m38601(c21480M34042, c20069Mo29535.m41004get(i));
        }
    }
}
