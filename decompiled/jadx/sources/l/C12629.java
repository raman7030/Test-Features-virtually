package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12629 extends AbstractC22507 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f38054;

    public C12629(AbstractC8396 abstractC8396, int[] iArr, C13334[] c13334Arr, C13334 c13334) {
        super(EnumC7690.LOOKUP_SWITCH, abstractC8396);
        this.f38054 = iArr;
        this.f72830 = c13334Arr;
        this.f72831 = c13334;
    }

    @Override // l.AbstractC1591
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1591 mo5437(C1403 c1403) {
        int length = this.f72830.length;
        C13334[] c13334Arr = new C13334[length];
        for (int i = 0; i < length; i++) {
            c13334Arr[i] = c1403.mo4896(this.f72830[i]);
        }
        int[] iArr = this.f38054;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        return new C12629(this.f74596.mo6718(c1403), iArr2, c13334Arr, c1403.mo4896(this.f72831));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("switch(");
        sb.append(this.f74596);
        sb.append(") {");
        int i = 0;
        while (true) {
            int[] iArr = this.f38054;
            if (i < iArr.length) {
                sb.append("\n case ");
                sb.append(iArr[i]);
                sb.append(": GOTO ");
                sb.append(this.f72830[i].m32315());
                sb.append(l.b);
                i++;
            } else {
                sb.append("\n default : GOTO ");
                sb.append(this.f72831.m32315());
                sb.append(";\n}");
                return sb.toString();
            }
        }
    }
}
