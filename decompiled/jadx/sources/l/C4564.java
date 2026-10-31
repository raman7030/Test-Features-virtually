package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4564 implements InterfaceC19698, InterfaceC7397 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f14569;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f14570;

    public /* synthetic */ C4564(ArrayList arrayList, ArrayList arrayList2) {
        this.f14569 = arrayList;
        this.f14570 = arrayList2;
    }

    public /* synthetic */ C4564(C10336 c10336, ArrayList arrayList) {
        this.f14570 = c10336;
        this.f14569 = arrayList;
    }

    @Override // l.InterfaceC19698
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo13416(int i, int i2, int i3) {
        C10336.m26130((C10336) this.f14570, this.f14569, i, i2, i3);
    }

    @Override // l.InterfaceC7397
    /* JADX INFO: renamed from: ֫ */
    public boolean mo12795(String str) {
        ArrayList arrayList = (ArrayList) this.f14570;
        Iterator it = this.f14569.iterator();
        while (it.hasNext()) {
            if (((C3153) it.next()).m9583(str)) {
                return false;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((C3153) it2.next()).m9583(str)) {
                return true;
            }
        }
        return arrayList.isEmpty();
    }
}
