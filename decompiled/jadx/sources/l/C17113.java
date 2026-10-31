package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܿۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5S8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17113 extends AbstractC22507 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f52445;

    public C17113() {
        super(EnumC7690.TABLE_SWITCH, null);
    }

    public C17113(AbstractC8396 abstractC8396, int i, C13334[] c13334Arr, C13334 c13334) {
        super(EnumC7690.TABLE_SWITCH, abstractC8396);
        this.f52445 = i;
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
        return new C17113(this.f74596.mo6718(c1403), this.f52445, c13334Arr, c1403.mo4896(this.f72831));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("switch(");
        sb.append(this.f74596);
        sb.append(") {");
        for (int i = 0; i < this.f72830.length; i++) {
            sb.append("\n case ");
            sb.append(this.f52445 + i);
            sb.append(": GOTO ");
            sb.append(this.f72830[i].m32315());
            sb.append(l.b);
        }
        sb.append("\n default : GOTO ");
        sb.append(this.f72831.m32315());
        sb.append(";\n}");
        return sb.toString();
    }
}
