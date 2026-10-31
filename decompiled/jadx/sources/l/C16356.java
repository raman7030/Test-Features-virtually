package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܽۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16356 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f50336;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f50338;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50339;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f50341 = new int[128];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21834[] f50340 = new C21834[128];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC6479[] f50337 = new AbstractC6479[32];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38503(int i, C21834 c21834, boolean z) {
        int i2;
        AbstractC6479[] abstractC6479Arr;
        if (i <= 0) {
            throw new IllegalArgumentException("Non-positive syntax run length");
        }
        C11003.requireNonNull(c21834, "style");
        long j = ((long) this.f50339) + ((long) i);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        int i4 = this.f50336;
        int[] iArr = this.f50341;
        C21834[] c21834Arr = this.f50340;
        if (i4 == 0 || z || !c21834Arr[i4 - 1].equals(c21834)) {
            int i5 = this.f50336;
            if (i5 == 128) {
                AbstractC6479 c23412 = new C23412(Arrays.copyOf(iArr, i5), (C21834[]) Arrays.copyOf(c21834Arr, this.f50336));
                while (true) {
                    i2 = this.f50338;
                    abstractC6479Arr = this.f50337;
                    if (i2 == 0) {
                        break;
                    }
                    int i6 = i2 - 1;
                    AbstractC6479 abstractC6479 = abstractC6479Arr[i6];
                    if (abstractC6479.f20005 != c23412.f20005) {
                        break;
                    }
                    this.f50338 = i6;
                    C10713 c10713 = new C10713(abstractC6479, c23412);
                    abstractC6479Arr[this.f50338] = null;
                    c23412 = c10713;
                }
                this.f50338 = i2 + 1;
                abstractC6479Arr[i2] = c23412;
                Arrays.fill(c21834Arr, (Object) null);
                this.f50336 = 0;
            }
            int i7 = this.f50336;
            iArr[i7] = i | (z ? Integer.MIN_VALUE : 0);
            this.f50336 = i7 + 1;
            c21834Arr[i7] = c21834;
        } else {
            int i8 = this.f50336 - 1;
            int i9 = iArr[i8];
            iArr[i8] = (Integer.MIN_VALUE & i9) | ((i9 & Integer.MAX_VALUE) + i);
        }
        this.f50339 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9302 m38502() {
        int i = this.f50336;
        AbstractC6479 c23412 = i == 0 ? null : new C23412(Arrays.copyOf(this.f50341, i), (C21834[]) Arrays.copyOf(this.f50340, this.f50336));
        int i2 = this.f50338;
        while (true) {
            i2--;
            if (i2 < 0) {
                return C9302.m23869(c23412);
            }
            c23412 = C9302.m23879(this.f50337[i2], c23412);
        }
    }
}
