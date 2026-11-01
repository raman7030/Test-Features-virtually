package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩴᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes5.dex */
public final class C20355 extends AbstractC15010 {

    /* JADX INFO: renamed from: ܽ */
    public static final C20355 f62864 = new C20355(null, null);

    /* JADX INFO: renamed from: ֫ */
    public final C10967 f62865;

    /* JADX INFO: renamed from: ۧ */
    public final C10967 f62866;

    public /* synthetic */ C20355(C10967 c10967, C10967 c10968, int i) {
        this(c10967, c10968);
    }

    public C20355(C10967 c10967, C10967 c10968) {
        this.f62865 = c10967;
        this.f62866 = c10968;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20355)) {
            return false;
        }
        C20355 c20355 = (C20355) obj;
        return C12826.equals(this.f62865, c20355.f62865) && C12826.equals(this.f62866, c20355.f62866);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f62866) + (C12826.hashCode(this.f62865) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62865, this.f62866};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C20355.class, sb, "[");
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
}
