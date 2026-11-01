package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۤۤ */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes3.dex */
public final class C1349 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f33658;

    /* JADX INFO: renamed from: ۧ */
    public final Object f33659;

    public C1349(Object obj, Object obj2) {
        this.f33658 = obj;
        this.f33659 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1349)) {
            return false;
        }
        C1349 c1349 = (C1349) obj;
        return C12826.equals(c1349.f33658, this.f33658) && C12826.equals(c1349.f33659, this.f33659);
    }

    public final int hashCode() {
        Object obj = this.f33658;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f33659;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f33658 + " " + this.f33659 + C0249l.f1198d;
    }
}
