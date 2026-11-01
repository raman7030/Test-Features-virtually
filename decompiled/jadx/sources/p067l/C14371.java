package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۫᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14371 extends AbstractC23759 {

    /* JADX INFO: renamed from: ۘ */
    public int[] f41080;

    public C14371(AbstractC10348 abstractC10348, int[] iArr, C15041[] c15041Arr, C15041 c15041) {
        super(EnumC9677.LOOKUP_SWITCH, abstractC10348);
        this.f41080 = iArr;
        this.f75556 = c15041Arr;
        this.f75557 = c15041;
    }

    @Override // p067l.AbstractC3880
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC3880 mo7667(C3702 c3702) {
        int length = this.f75556.length;
        C15041[] c15041Arr = new C15041[length];
        for (int i = 0; i < length; i++) {
            c15041Arr[i] = c3702.mo7135(this.f75556[i]);
        }
        int[] iArr = this.f41080;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        return new C14371(this.f77339.mo8844(c3702), iArr2, c15041Arr, c3702.mo7135(this.f75557));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("switch(");
        sb.append(this.f77339);
        sb.append(") {");
        int i = 0;
        while (true) {
            int[] iArr = this.f41080;
            if (i < iArr.length) {
                sb.append("\n case ");
                sb.append(iArr[i]);
                sb.append(": GOTO ");
                sb.append(this.f75556[i].m34416());
                sb.append(C0249l.f1196b);
                i++;
            } else {
                sb.append("\n default : GOTO ");
                sb.append(this.f75557.m34416());
                sb.append(";\n}");
                return sb.toString();
            }
        }
    }
}
