package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13928 implements InterfaceC23947 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f39291;

    public C13928(ArrayList arrayList) {
        this.f39291 = arrayList;
    }

    @Override // p067l.InterfaceC23947
    /* JADX INFO: renamed from: ֫ */
    public final void mo24367(C15229 c15229) {
        C21442 c21442Mo31600 = c15229.mo31600();
        C22783 c22783M36175 = c15229.m36175();
        int size = c21442Mo31600.size();
        for (int i = 0; i < size; i++) {
            ((C17950) this.f39291.get(c15229.m34677(i))).m40818(c22783M36175, c21442Mo31600.m56524get(i));
        }
    }
}
