package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩹ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C23511 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20315 f74913;

    /* JADX INFO: renamed from: ۧ */
    public final C10967 f74914;

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ InterfaceC20315 m52280(C23511 c23511) {
        return c23511.f74913;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* bridge */ /* synthetic */ C10967 m52281(C23511 c23511) {
        return c23511.f74914;
    }

    public C23511(C10967 c10967, InterfaceC20315 interfaceC20315) {
        this.f74914 = c10967;
        this.f74913 = interfaceC20315;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23511)) {
            return false;
        }
        C23511 c23511 = (C23511) obj;
        return C12826.equals(this.f74914, c23511.f74914) && C12826.equals(this.f74913, c23511.f74913);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f74913) + (C12826.hashCode(this.f74914) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f74914, this.f74913};
        String[] strArrSplit = "spans;creatorLease".length() == 0 ? new String[0] : "spans;creatorLease".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C23511.class, sb, "[");
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
