package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7815 implements InterfaceC23218 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f20500;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f20501;

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC12628 mo4820(InterfaceC12628 interfaceC12628) {
        return C22548.m50518(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC12628 mo4822(InterfaceC12628 interfaceC12628) {
        return C22548.m50519(this, interfaceC12628);
    }

    @Override // p067l.InterfaceC12628
    public final C9667 negate() {
        C7933 c7933 = C16057.f47257;
        return C9667.m22548(this);
    }

    public C7815(int[] iArr, int[] iArr2) {
        this.f20501 = iArr;
        this.f20500 = iArr2;
    }

    @Override // p067l.InterfaceC12628
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4821(int i) {
        int[] iArr = this.f20501;
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
        int[] iArr2 = this.f20500;
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
