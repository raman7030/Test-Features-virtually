package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1PJ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6706 implements InterfaceC21090, InterfaceC1209 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ ArrayList f17398;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f17399;

    public /* synthetic */ C6706(ArrayList arrayList, ArrayList arrayList2) {
        this.f17398 = arrayList;
        this.f17399 = arrayList2;
    }

    public /* synthetic */ C6706(C12192 c12192, ArrayList arrayList) {
        this.f17399 = c12192;
        this.f17398 = arrayList;
    }

    @Override // p067l.InterfaceC21090
    /* JADX INFO: renamed from: ֫ */
    public void mo15304(int i, int i2, int i3) {
        C12192.m28155((C12192) this.f17399, this.f17398, i, i2, i3);
    }

    @Override // p067l.InterfaceC1209
    /* JADX INFO: renamed from: ֫ */
    public boolean mo14675(String str) {
        ArrayList arrayList = (ArrayList) this.f17399;
        Iterator it = this.f17398.iterator();
        while (it.hasNext()) {
            if (((C5365) it.next()).m11627(str)) {
                return false;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((C5365) it2.next()).m11627(str)) {
                return true;
            }
        }
        return arrayList.isEmpty();
    }
}
