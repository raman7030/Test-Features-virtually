package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C20082 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f62172 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m45500(int i, int i2, int i3, int[] iArr) {
        if (i > 1) {
            int i4 = iArr[i];
            int i5 = iArr[i + 1];
            if (i4 == -1 || i5 == -1 || i4 == i2 || i5 == i3) {
                return;
            }
            this.f62172.add(new C5212(i / 2, i4, i5));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45499(int i) {
        ArrayList arrayList = this.f62172;
        int size = arrayList.size();
        if (size > i) {
            arrayList.subList(i, size).clear();
        }
    }
}
