package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06VH */
/* JADX INFO: loaded from: classes.dex */
public final class C24775 {

    /* JADX INFO: renamed from: ֫ */
    public final int f79210;

    /* JADX INFO: renamed from: ۧ */
    public final int f79211;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f79212;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f79213;

    public C24775(int i, int i2, boolean z, Object obj) {
        this.f79211 = i;
        this.f79210 = i2;
        this.f79212 = z;
        this.f79213 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24775 m54441(int[] iArr, ArrayList arrayList, int i) {
        int i2 = iArr[i];
        if (i2 == 16) {
            return new C24775(i2, iArr[i + 2], iArr[i + 3] != 0, null);
        }
        if (i2 == 1 || i2 == 42) {
            return new C24775(i2, 0, false, arrayList.get(iArr[i + 2]));
        }
        return null;
    }
}
