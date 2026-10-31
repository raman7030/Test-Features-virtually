package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7K1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11367 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34019 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34020 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo27169();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo27170(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo27171(int i, float f, int i2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28123(float f, int i) {
        float f2 = i + f;
        float fMo27169 = mo27169() - 1;
        if (f2 == fMo27169) {
            f2 = fMo27169 - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (i3 > fMo27169 || i2 < 0) {
            return;
        }
        mo27171(i2, f2 % 1, i3);
        int i4 = this.f34019;
        if (i4 != -1) {
            if (i2 > i4) {
                Iterator it = (i2 <= Integer.MIN_VALUE ? C4882.f15426 : new C4882(i4, i2 - 1, 1)).iterator();
                while (((C20405) it).hasNext()) {
                    mo27170(((C20405) it).nextInt());
                }
            }
            int i5 = this.f34020;
            if (i3 < i5) {
                mo27170(i5);
                Iterator it2 = new C4882(i2 + 2, this.f34020, 1).iterator();
                while (((C20405) it2).hasNext()) {
                    mo27170(((C20405) it2).nextInt());
                }
            }
        }
        this.f34019 = i2;
        this.f34020 = i3;
    }
}
