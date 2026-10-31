package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9AI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18638 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f58949 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43234(int i, int i2, int i3, int[] iArr) {
        if (i > 1) {
            int i4 = iArr[i];
            int i5 = iArr[i + 1];
            if (i4 == -1 || i5 == -1 || i4 == i2 || i5 == i3) {
                return;
            }
            this.f58949.add(new C2992(i / 2, i4, i5));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43233(int i) {
        ArrayList arrayList = this.f58949;
        int size = arrayList.size();
        if (size > i) {
            arrayList.subList(i, size).clear();
        }
    }
}
