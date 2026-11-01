package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12899 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f36269;

    /* JADX INFO: renamed from: ۧ */
    public final int f36270;

    public C12899(int i, boolean z) {
        this.f36270 = i;
        this.f36269 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12899 m29554(int i, ArrayList arrayList, float f, float f2) {
        if (f >= f2) {
            return new C12899(i, true);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            if (((C15579) arrayList.get(i2)).f44504 == i) {
                return new C12899(i2 == 0 ? -1 : ((C15579) arrayList.get(i2 - 1)).f44504, false);
            }
            i2++;
        }
        throw new IllegalArgumentException(C20778.m46922(i, "Unknown target group "));
    }
}
