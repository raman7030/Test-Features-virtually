package l;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: l.ۚܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8TA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5476 implements InterfaceC1242 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f17005;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Random f17006;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f17007;

    public C5476() {
        this(new Random());
    }

    public C5476(Random random) {
        this(new int[0], random);
    }

    public C5476(int[] iArr, Random random) {
        this.f17007 = iArr;
        this.f17006 = random;
        this.f17005 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.f17005[iArr[i]] = i;
        }
    }

    @Override // l.InterfaceC1242
    public final int getLength() {
        return this.f17007.length;
    }

    @Override // l.InterfaceC1242
    /* JADX INFO: renamed from: ܽ */
    public final int mo4082(int i) {
        int i2 = this.f17005[i] + 1;
        int[] iArr = this.f17007;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    @Override // l.InterfaceC1242
    /* JADX INFO: renamed from: ۧ */
    public final int mo4079(int i) {
        int i2 = this.f17005[i] - 1;
        if (i2 >= 0) {
            return this.f17007[i2];
        }
        return -1;
    }

    @Override // l.InterfaceC1242
    /* JADX INFO: renamed from: ֫ */
    public final int mo4077() {
        int[] iArr = this.f17007;
        if (iArr.length > 0) {
            return iArr[iArr.length - 1];
        }
        return -1;
    }

    @Override // l.InterfaceC1242
    /* JADX INFO: renamed from: ܽ */
    public final int mo4081() {
        int[] iArr = this.f17007;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    @Override // l.InterfaceC1242
    /* JADX INFO: renamed from: ᩳ */
    public final C5476 mo4083(int i) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        int i2 = 0;
        while (true) {
            iArr = this.f17007;
            random = this.f17006;
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
        return new C5476(iArr4, new Random(random.nextLong()));
    }

    @Override // l.InterfaceC1242
    /* JADX INFO: renamed from: ֫ */
    public final C5476 mo4078(int i) {
        int[] iArr = this.f17007;
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
        return new C5476(iArr2, new Random(this.f17006.nextLong()));
    }

    @Override // l.InterfaceC1242
    /* JADX INFO: renamed from: ۧ */
    public final C5476 mo4080() {
        return new C5476(new Random(this.f17006.nextLong()));
    }
}
