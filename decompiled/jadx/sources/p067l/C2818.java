package p067l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.֡ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8MR */
/* JADX INFO: loaded from: classes2.dex */
public final class C2818 {

    /* JADX INFO: renamed from: ۜ */
    public static final C6172 f4823 = new C6172();

    /* JADX INFO: renamed from: ᩷ */
    public static final C20254 f4824 = new C20254();

    /* JADX INFO: renamed from: ۧ */
    public final int f4826;

    /* JADX INFO: renamed from: ܽ */
    public int f4828;

    /* JADX INFO: renamed from: ᩳ */
    public int f4830;

    /* JADX INFO: renamed from: ᩻ */
    public int f4831;

    /* JADX INFO: renamed from: ܿ */
    public final C20925[] f4829 = new C20925[5];

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f4827 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public int f4825 = -1;

    public C2818(int i) {
        this.f4826 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4459() {
        this.f4827.clear();
        this.f4825 = -1;
        this.f4828 = 0;
        this.f4831 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4458(float f, int i) {
        C20925 c20925;
        int i2 = this.f4825;
        ArrayList arrayList = this.f4827;
        if (i2 != 1) {
            Collections.sort(arrayList, f4823);
            this.f4825 = 1;
        }
        int i3 = this.f4830;
        C20925[] c20925Arr = this.f4829;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f4830 = i4;
            c20925 = c20925Arr[i4];
        } else {
            c20925 = new C20925(0);
        }
        int i5 = this.f4828;
        this.f4828 = i5 + 1;
        c20925.f65714 = i5;
        c20925.f65716 = i;
        c20925.f65715 = f;
        arrayList.add(c20925);
        this.f4831 += i;
        while (true) {
            int i6 = this.f4831;
            int i7 = this.f4826;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            C20925 c20926 = (C20925) arrayList.get(0);
            int i9 = c20926.f65716;
            if (i9 <= i8) {
                this.f4831 -= i9;
                arrayList.remove(0);
                int i10 = this.f4830;
                if (i10 < 5) {
                    this.f4830 = i10 + 1;
                    c20925Arr[i10] = c20926;
                }
            } else {
                c20926.f65716 = i9 - i8;
                this.f4831 -= i8;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m4457() {
        int i = this.f4825;
        ArrayList arrayList = this.f4827;
        if (i != 0) {
            Collections.sort(arrayList, f4824);
            this.f4825 = 0;
        }
        float f = this.f4831 * 0.5f;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C20925 c20925 = (C20925) arrayList.get(i3);
            i2 += c20925.f65716;
            if (i2 >= f) {
                return c20925.f65715;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C20925) C20013.m45383(arrayList, 1)).f65715;
    }
}
