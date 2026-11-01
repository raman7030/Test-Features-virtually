package p067l;

import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.newhope.Reduce;

/* JADX INFO: renamed from: l.᩺ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JZ */
/* JADX INFO: loaded from: classes.dex */
public final class C24339 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f77102;

    /* JADX INFO: renamed from: ۧ */
    public int[] f77103;

    public /* synthetic */ C24339(int i) {
        this();
    }

    public C24339() {
        this.f77102 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53703(C13611 c13611) {
        ArrayList<C8246> arrayList = this.f77102;
        if (!arrayList.isEmpty()) {
            int[] iArr = this.f77103;
            int i = 0;
            if (iArr != null) {
                C8246[] c8246Arr = new C8246[iArr.length];
                int[] iArr2 = new int[iArr.length];
                int[] iArr3 = new int[iArr.length];
                for (C8246 c8246 : arrayList) {
                    for (int i2 = 0; i2 < c8246.f21847; i2++) {
                        int i3 = c8246.f21848[i2];
                        if (i3 < this.f77103.length) {
                            C8246 c8247 = c8246Arr[i3];
                            if (c8247 == null) {
                                c8246Arr[i3] = c8246;
                            } else {
                                iArr2[i3] = c8247.f21849.m51373(c8246.f21849) | iArr2[i3];
                                iArr3[i3] = iArr3[i3] | c8246Arr[i3].f21846.m51373(c8246.f21846);
                            }
                        }
                    }
                }
                while (true) {
                    int[] iArr4 = this.f77103;
                    if (i >= iArr4.length) {
                        break;
                    }
                    if (c8246Arr[i] != null) {
                        int i4 = iArr2[i];
                        int i5 = i4 & 1835008;
                        if (i5 != 0 && i5 == (iArr4[i] & 1835008)) {
                            c13611.f38297++;
                        }
                        int i6 = iArr4[i];
                        if (i5 != (1835008 & i6)) {
                            c13611.f38296++;
                        }
                        c13611.f38295 = Integer.bitCount((i6 ^ i4) & Reduce.RMask) + c13611.f38295;
                        c13611.f38294 = Integer.bitCount(262143 & (iArr3[i] ^ this.f77103[i])) + c13611.f38294;
                    }
                    i++;
                }
            }
            return false;
        }
        return true;
    }
}
