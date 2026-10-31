package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.֡ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8MR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0473 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C4002 f2048 = new C4002();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C18819 f2049 = new C18819();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f2051;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f2053;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f2055;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f2056;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19525[] f2054 = new C19525[5];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2052 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f2050 = -1;

    public C0473(int i) {
        this.f2051 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2078() {
        this.f2052.clear();
        this.f2050 = -1;
        this.f2053 = 0;
        this.f2056 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2077(float f, int i) {
        C19525 c19525;
        int i2 = this.f2050;
        ArrayList arrayList = this.f2052;
        if (i2 != 1) {
            Collections.sort(arrayList, f2048);
            this.f2050 = 1;
        }
        int i3 = this.f2055;
        C19525[] c19525Arr = this.f2054;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f2055 = i4;
            c19525 = c19525Arr[i4];
        } else {
            c19525 = new C19525(0);
        }
        int i5 = this.f2053;
        this.f2053 = i5 + 1;
        c19525.f63094 = i5;
        c19525.f63096 = i;
        c19525.f63095 = f;
        arrayList.add(c19525);
        this.f2056 += i;
        while (true) {
            int i6 = this.f2056;
            int i7 = this.f2051;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            C19525 c19526 = (C19525) arrayList.get(0);
            int i9 = c19526.f63096;
            if (i9 <= i8) {
                this.f2056 -= i9;
                arrayList.remove(0);
                int i10 = this.f2055;
                if (i10 < 5) {
                    this.f2055 = i10 + 1;
                    c19525Arr[i10] = c19526;
                }
            } else {
                c19526.f63096 = i9 - i8;
                this.f2056 -= i8;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m2076() {
        int i = this.f2050;
        ArrayList arrayList = this.f2052;
        if (i != 0) {
            Collections.sort(arrayList, f2049);
            this.f2050 = 0;
        }
        float f = this.f2056 * 0.5f;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C19525 c19525 = (C19525) arrayList.get(i3);
            i2 += c19525.f63096;
            if (i2 >= f) {
                return c19525.f63095;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C19525) C18566.m43105(arrayList, 1)).f63095;
    }
}
