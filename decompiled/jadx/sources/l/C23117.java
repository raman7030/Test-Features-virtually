package l;

import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.newhope.Reduce;

/* JADX INFO: renamed from: l.᩺ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23117 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f74358;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f74359;

    public /* synthetic */ C23117(int i) {
        this();
    }

    public C23117() {
        this.f74358 = new ArrayList();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51309(C11829 c11829) {
        ArrayList<C6184> arrayList = this.f74358;
        if (!arrayList.isEmpty()) {
            int[] iArr = this.f74359;
            int i = 0;
            if (iArr != null) {
                C6184[] c6184Arr = new C6184[iArr.length];
                int[] iArr2 = new int[iArr.length];
                int[] iArr3 = new int[iArr.length];
                for (C6184 c6184 : arrayList) {
                    for (int i2 = 0; i2 < c6184.f18988; i2++) {
                        int i3 = c6184.f18989[i2];
                        if (i3 < this.f74359.length) {
                            C6184 c6185 = c6184Arr[i3];
                            if (c6185 == null) {
                                c6184Arr[i3] = c6184;
                            } else {
                                iArr2[i3] = c6185.f18990.m49024(c6184.f18990) | iArr2[i3];
                                iArr3[i3] = iArr3[i3] | c6184Arr[i3].f18987.m49024(c6184.f18987);
                            }
                        }
                    }
                }
                while (true) {
                    int[] iArr4 = this.f74359;
                    if (i >= iArr4.length) {
                        break;
                    }
                    if (c6184Arr[i] != null) {
                        int i4 = iArr2[i];
                        int i5 = i4 & 1835008;
                        if (i5 != 0 && i5 == (iArr4[i] & 1835008)) {
                            c11829.f35295++;
                        }
                        int i6 = iArr4[i];
                        if (i5 != (1835008 & i6)) {
                            c11829.f35294++;
                        }
                        c11829.f35293 = Integer.bitCount((i6 ^ i4) & Reduce.RMask) + c11829.f35293;
                        c11829.f35292 = Integer.bitCount(262143 & (iArr3[i] ^ this.f74359[i])) + c11829.f35292;
                    }
                    i++;
                }
            }
            return false;
        }
        return true;
    }
}
