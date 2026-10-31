package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۧܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11080 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f33268;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f33269;

    public C11080(int i, boolean z) {
        this.f33269 = i;
        this.f33268 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11080 m27492(int i, ArrayList arrayList, float f, float f2) {
        if (f >= f2) {
            return new C11080(i, true);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            if (((C13900) arrayList.get(i2)).f41423 == i) {
                return new C11080(i2 == 0 ? -1 : ((C13900) arrayList.get(i2 - 1)).f41423, false);
            }
            i2++;
        }
        throw new IllegalArgumentException(C19370.m44628(i, "Unknown target group "));
    }
}
