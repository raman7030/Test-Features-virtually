package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74QP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5894 extends AbstractC10588 {

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f14507;

    /* JADX INFO: renamed from: ᩷ */
    public int f14508;

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f14509;

    @Override // p067l.AbstractC10588
    /* JADX INFO: renamed from: ֫ */
    public final void mo5551(AbstractC17054 abstractC17054) {
        ArrayList arrayList = this.f14507;
        ArrayList arrayList2 = this.f14509;
        int i = this.f14508;
        if (i == -1 || i == 0) {
            abstractC17054.mo29014(i, arrayList2.size(), arrayList.size(), m13241(arrayList2), m13241(arrayList));
        } else {
            if (i == 1) {
                abstractC17054.mo29014(i, arrayList2.size(), 0, m13241(arrayList2), (Object[]) null);
                return;
            }
            if (i == 2) {
                abstractC17054.mo29014(i, arrayList2.size(), 0, (Object[]) null, (Object[]) null);
            } else if (i == 3) {
                abstractC17054.mo29014(i, 0, 0, (Object[]) null, (Object[]) null);
            } else {
                if (i == 4) {
                    abstractC17054.mo29014(i, 0, 1, (Object[]) null, m13241(arrayList));
                    return;
                }
                throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object[] m13241(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object objM51953 = arrayList.get(i);
            if (objM51953 instanceof C23329) {
                objM51953 = ((C23329) objM51953).m51953();
            }
            objArr[i] = objM51953;
        }
        return objArr;
    }
}
