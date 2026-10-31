package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5731 implements InterfaceC21938 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f17655;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f17656;

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C21233.m48187(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
        return C21233.m48188(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }

    public C5731(int[] iArr, int[] iArr2) {
        this.f17656 = iArr;
        this.f17655 = iArr2;
    }

    @Override // l.InterfaceC10795
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2465(int i) {
        int[] iArr = this.f17656;
        int length = (iArr.length / 2) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = i3 * 2;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            if (i < i5) {
                length = i3 - 1;
            } else {
                if (i <= i6) {
                    return true;
                }
                i2 = i3 + 1;
            }
        }
        int[] iArr2 = this.f17655;
        if (iArr2.length > 16) {
            return Arrays.binarySearch(iArr2, i) >= 0;
        }
        for (int i7 : iArr2) {
            if (i7 != i) {
                if (i7 > i) {
                    break;
                }
            }
        }
    }
}
