package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10220 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f30697;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f30698;

    public C10220(Object obj, Object obj2) {
        this.f30697 = obj;
        this.f30698 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10220)) {
            return false;
        }
        C10220 c10220 = (C10220) obj;
        return C11003.equals(c10220.f30697, this.f30697) && C11003.equals(c10220.f30698, this.f30698);
    }

    public final int hashCode() {
        Object obj = this.f30697;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f30698;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f30697 + " " + this.f30698 + l.d;
    }
}
