package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۢᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11638 extends AbstractC15010 {

    /* JADX INFO: renamed from: ܽ */
    public static final C11638 f32472 = new C11638(0, null);

    /* JADX INFO: renamed from: ֫ */
    public final int f32473;

    /* JADX INFO: renamed from: ۧ */
    public final C10967 f32474;

    public final int length() {
        C10967 c10967 = this.f32474;
        if (c10967 == null) {
            return 0;
        }
        return c10967.f30368;
    }

    public C11638(int i, C10967 c10967) {
        this.f32473 = i;
        this.f32474 = c10967;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11638)) {
            return false;
        }
        C11638 c11638 = (C11638) obj;
        return this.f32473 == c11638.f32473 && C12826.equals(this.f32474, c11638.f32474);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f32474) + (this.f32473 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f32473), this.f32474};
        String[] strArrSplit = "offset;spans".length() == 0 ? new String[0] : "offset;spans".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C11638.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m26745() {
        return this.f32473;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10967 m26746() {
        return this.f32474;
    }
}
