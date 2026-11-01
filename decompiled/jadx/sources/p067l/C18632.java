package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܿۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5S8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18632 extends AbstractC23759 {

    /* JADX INFO: renamed from: ۘ */
    public int f55627;

    public C18632() {
        super(EnumC9677.TABLE_SWITCH, null);
    }

    public C18632(AbstractC10348 abstractC10348, int i, C15041[] c15041Arr, C15041 c15041) {
        super(EnumC9677.TABLE_SWITCH, abstractC10348);
        this.f55627 = i;
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
        return new C18632(this.f77339.mo8844(c3702), this.f55627, c15041Arr, c3702.mo7135(this.f75557));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("switch(");
        sb.append(this.f77339);
        sb.append(") {");
        for (int i = 0; i < this.f75556.length; i++) {
            sb.append("\n case ");
            sb.append(this.f55627 + i);
            sb.append(": GOTO ");
            sb.append(this.f75556[i].m34416());
            sb.append(C0249l.f1196b);
        }
        sb.append("\n default : GOTO ");
        sb.append(this.f75557.m34416());
        sb.append(";\n}");
        return sb.toString();
    }
}
