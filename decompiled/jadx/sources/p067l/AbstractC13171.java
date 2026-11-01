package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7K1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13171 {

    /* JADX INFO: renamed from: ֫ */
    public int f37016 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f37017 = -1;

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo29214();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo29215(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo29216(int i, float f, int i2);

    /* JADX INFO: renamed from: ֫ */
    public final void m30167(float f, int i) {
        float f2 = i + f;
        float fMo29214 = mo29214() - 1;
        if (f2 == fMo29214) {
            f2 = fMo29214 - 1.0E-4f;
        }
        int i2 = (int) f2;
        int i3 = i2 + 1;
        if (i3 > fMo29214 || i2 < 0) {
            return;
        }
        mo29216(i2, f2 % 1, i3);
        int i4 = this.f37016;
        if (i4 != -1) {
            if (i2 > i4) {
                Iterator it = (i2 <= Integer.MIN_VALUE ? C7009.f18261 : new C7009(i4, i2 - 1, 1)).iterator();
                while (((C21762) it).hasNext()) {
                    mo29215(((C21762) it).nextInt());
                }
            }
            int i5 = this.f37017;
            if (i3 < i5) {
                mo29215(i5);
                Iterator it2 = new C7009(i2 + 2, this.f37017, 1).iterator();
                while (((C21762) it2).hasNext()) {
                    mo29215(((C21762) it2).nextInt());
                }
            }
        }
        this.f37016 = i2;
        this.f37017 = i3;
    }
}
