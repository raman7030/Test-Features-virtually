package p067l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۧܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 872H */
/* JADX INFO: loaded from: classes3.dex */
public final class C12863 {

    /* JADX INFO: renamed from: ֫ */
    public final int f36192;

    /* JADX INFO: renamed from: ۜ */
    public final int f36193;

    /* JADX INFO: renamed from: ۧ */
    public final int f36194;

    /* JADX INFO: renamed from: ܳ */
    public final int f36195;

    /* JADX INFO: renamed from: ܽ */
    public final int f36196;

    /* JADX INFO: renamed from: ܿ */
    public final int f36197;

    /* JADX INFO: renamed from: ᩳ */
    public final int f36198;

    /* JADX INFO: renamed from: ᩷ */
    public final int f36199;

    /* JADX INFO: renamed from: ᩻ */
    public final WeakReference f36200;

    public C12863(int i, int i2, int i3, int i4, int i5, int i6, int i7, InterfaceC9768 interfaceC9768, int i8) {
        this.f36195 = i;
        this.f36197 = i2;
        this.f36198 = i3;
        this.f36193 = i4;
        this.f36194 = i5;
        this.f36192 = i6;
        this.f36196 = i7;
        this.f36200 = new WeakReference(interfaceC9768);
        this.f36199 = i8;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29483(int i, int i2, int i3, int i4, int i5, InterfaceC9768 interfaceC9768, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.f36195;
        if (i12 <= 0 || interfaceC9768 != this.f36200.get() || i6 != this.f36199 || i5 != this.f36196 || i3 != (i7 = this.f36194) || i4 != (i8 = this.f36192) || (i9 = this.f36197) < 0 || i9 > (i10 = this.f36193) || (i11 = this.f36198) < 0 || i11 > i10) {
            return 0;
        }
        long j = i12;
        if (((long) i9) + j == i7 && ((long) i11) + j == i8) {
            if (i < 0 || i > i10 || i2 < 0 || i2 > i10) {
                return 0;
            }
            long j2 = i;
            long j3 = j2 + j;
            long j4 = i2;
            long j5 = j + j4;
            long j6 = i5;
            if (j3 <= j6 && j5 <= j6) {
                long jM29482 = m29482(i3, i4, j2, j4);
                long jM29483 = m29482(i3, i4, j3, j5);
                if (jM29483 < 10 && jM29483 < jM29482) {
                    return i12;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m29482(int i, int i2, long j, long j2) {
        long j3 = i;
        long j4 = i2;
        return Math.min(Math.min(Math.abs(j - j3), Math.abs(j - j4)), Math.min(Math.abs(j2 - j3), Math.abs(j2 - j4)));
    }
}
