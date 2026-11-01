package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4LO */
/* JADX INFO: loaded from: classes5.dex */
public final class C22055 extends AbstractC12961 {

    /* JADX INFO: renamed from: ᩶ */
    public final String f69385;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC22349 f69386;

    /* JADX INFO: renamed from: ᩹ */
    public final int[] f69387;

    public C22055(AbstractC22349 abstractC22349, String str, int[] iArr) {
        str.getClass();
        this.f69386 = abstractC22349;
        this.f69385 = str;
        this.f69387 = iArr;
    }

    @Override // p067l.InterfaceC5763
    public final String getValue() {
        return this.f69385;
    }

    @Override // p067l.InterfaceC5763
    public final int[] getStyle() {
        return this.f69387;
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ᩶֫ */
    public final C23198[] mo12360() {
        int[] iArr = this.f69387;
        if (iArr == null) {
            return null;
        }
        int length = iArr.length / 3;
        C23198[] c23198Arr = new C23198[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            c23198Arr[i] = new C23198(this.f69386.m50188(iArr[i2]), iArr[i2 + 1], iArr[i2 + 2] + 1);
        }
        return c23198Arr;
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ܰ֫ */
    public final C23198[] mo12358() {
        int[] iArr = this.f69387;
        if (iArr == null || iArr.length % 3 != 0) {
            return null;
        }
        int length = iArr.length / 3;
        C23198[] c23198Arr = new C23198[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            try {
                c23198Arr[i] = new C23198(this.f69386.mo5708(iArr[i2]).getValue(), iArr[i2 + 1], iArr[i2 + 2] + 1);
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return m29718(c23198Arr);
    }

    @Override // p067l.InterfaceC5763
    /* JADX INFO: renamed from: ᩺֫ */
    public final boolean mo12361() {
        return this.f69387 != null;
    }

    @Override // p067l.AbstractC12961
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22055.class == obj.getClass()) {
            C22055 c22055 = (C22055) obj;
            if (this.f69385.equals(c22055.f69385) && Arrays.equals(this.f69387, c22055.f69387)) {
                return true;
            }
        }
        return false;
    }
}
