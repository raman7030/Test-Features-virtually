package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 74QP */
/* JADX INFO: loaded from: classes3.dex */
public final class C3710 extends AbstractC8649 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f11706;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f11707;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f11708;

    @Override // l.AbstractC8649
    /* JADX INFO: renamed from: ֫ */
    public final void mo3237(AbstractC15452 abstractC15452) {
        ArrayList arrayList = this.f11706;
        ArrayList arrayList2 = this.f11708;
        int i = this.f11707;
        if (i == -1 || i == 0) {
            abstractC15452.mo26969(i, arrayList2.size(), arrayList.size(), m11294(arrayList2), m11294(arrayList));
        } else {
            if (i == 1) {
                abstractC15452.mo26969(i, arrayList2.size(), 0, m11294(arrayList2), (Object[]) null);
                return;
            }
            if (i == 2) {
                abstractC15452.mo26969(i, arrayList2.size(), 0, (Object[]) null, (Object[]) null);
            } else if (i == 3) {
                abstractC15452.mo26969(i, 0, 0, (Object[]) null, (Object[]) null);
            } else {
                if (i == 4) {
                    abstractC15452.mo26969(i, 0, 1, (Object[]) null, m11294(arrayList));
                    return;
                }
                throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object[] m11294(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            Object objM49617 = arrayList.get(i);
            if (objM49617 instanceof C22055) {
                objM49617 = ((C22055) objM49617).m49617();
            }
            objArr[i] = objM49617;
        }
        return objArr;
    }
}
