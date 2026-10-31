package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ۧܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 872H */
/* JADX INFO: loaded from: classes3.dex */
public final class C11042 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f33197;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f33198;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f33199;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f33200;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f33201;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f33202;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f33203;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33204;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final WeakReference f33205;

    public C11042(int i, int i2, int i3, int i4, int i5, int i6, int i7, InterfaceC7785 interfaceC7785, int i8) {
        this.f33200 = i;
        this.f33202 = i2;
        this.f33203 = i3;
        this.f33198 = i4;
        this.f33199 = i5;
        this.f33197 = i6;
        this.f33201 = i7;
        this.f33205 = new WeakReference(interfaceC7785);
        this.f33204 = i8;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27421(int i, int i2, int i3, int i4, int i5, InterfaceC7785 interfaceC7785, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.f33200;
        if (i12 <= 0 || interfaceC7785 != this.f33205.get() || i6 != this.f33204 || i5 != this.f33201 || i3 != (i7 = this.f33199) || i4 != (i8 = this.f33197) || (i9 = this.f33202) < 0 || i9 > (i10 = this.f33198) || (i11 = this.f33203) < 0 || i11 > i10) {
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
                long jM27420 = m27420(i3, i4, j2, j4);
                long jM27421 = m27420(i3, i4, j3, j5);
                if (jM27421 < 10 && jM27421 < jM27420) {
                    return i12;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m27420(int i, int i2, long j, long j2) {
        long j3 = i;
        long j4 = i2;
        return Math.min(Math.min(Math.abs(j - j3), Math.abs(j - j4)), Math.min(Math.abs(j2 - j3), Math.abs(j2 - j4)));
    }
}
