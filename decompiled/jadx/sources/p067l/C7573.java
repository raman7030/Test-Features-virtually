package p067l;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: l.ۚܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8TA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7573 implements InterfaceC3549 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f19846;

    /* JADX INFO: renamed from: ۧ */
    public final Random f19847;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f19848;

    public C7573() {
        this(new Random());
    }

    public C7573(Random random) {
        this(new int[0], random);
    }

    public C7573(int[] iArr, Random random) {
        this.f19848 = iArr;
        this.f19847 = random;
        this.f19846 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f19846[iArr[i]] = i;
        }
    }

    @Override // p067l.InterfaceC3549
    public final int getLength() {
        return this.f19848.length;
    }

    @Override // p067l.InterfaceC3549
    /* JADX INFO: renamed from: ܽ */
    public final int mo6326(int i) {
        int i2 = this.f19846[i] + 1;
        int[] iArr = this.f19848;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // p067l.InterfaceC3549
    /* JADX INFO: renamed from: ۧ */
    public final int mo6323(int i) {
        int i2 = this.f19846[i] - 1;
        if (i2 >= 0) {
            return this.f19848[i2];
        }
        return -1;
    }

    @Override // p067l.InterfaceC3549
    /* JADX INFO: renamed from: ֫ */
    public final int mo6321() {
        int[] iArr = this.f19848;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override // p067l.InterfaceC3549
    /* JADX INFO: renamed from: ܽ */
    public final int mo6325() {
        int[] iArr = this.f19848;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override // p067l.InterfaceC3549
    /* JADX INFO: renamed from: ᩳ */
    public final C7573 mo6327(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            iArr = this.f19848;
            random = this.f19847;
            if (i2 >= i) {
                break;
            }
            iArr2[i2] = random.nextInt(iArr.length + 1);
            int i3 = i2 + 1;
            int iNextInt = random.nextInt(i3);
            iArr3[i2] = iArr3[iNextInt];
            iArr3[iNextInt] = i2;
            i2 = i3;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length + i; i6++) {
            if (i4 < i && i5 == iArr2[i4]) {
                iArr4[i6] = iArr3[i4];
                i4++;
            } else {
                int i7 = i5 + 1;
                int i8 = iArr[i5];
                iArr4[i6] = i8;
                if (i8 >= 0) {
                    iArr4[i6] = i8 + i;
                }
                i5 = i7;
            }
        }
        return new C7573(iArr4, new Random(random.nextLong()));
    }

    @Override // p067l.InterfaceC3549
    /* JADX INFO: renamed from: ֫ */
    public final C7573 mo6322(int i) {
        int[] iArr = this.f19848;
        int[] iArr2 = new int[iArr.length - i];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 < 0 || i4 >= i) {
                int i5 = i3 - i2;
                if (i4 >= 0) {
                    i4 -= i;
                }
                iArr2[i5] = i4;
            } else {
                i2++;
            }
        }
        return new C7573(iArr2, new Random(this.f19847.nextLong()));
    }

    @Override // p067l.InterfaceC3549
    /* JADX INFO: renamed from: ۧ */
    public final C7573 mo6324() {
        return new C7573(new Random(this.f19847.nextLong()));
    }
}
