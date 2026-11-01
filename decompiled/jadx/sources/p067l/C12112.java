package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۤۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C12112 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f33856;

    /* JADX INFO: renamed from: ۧ */
    public final C8088 f33857;

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ boolean m28002(C12112 c12112) {
        return c12112.f33856;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* bridge */ /* synthetic */ C8088 m28003(C12112 c12112) {
        return c12112.f33857;
    }

    public C12112(C8088 c8088, boolean z) {
        this.f33857 = c8088;
        this.f33856 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12112)) {
            return false;
        }
        C12112 c12112 = (C12112) obj;
        return this.f33856 == c12112.f33856 && C12826.equals(this.f33857, c12112.f33857);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f33857) + ((this.f33856 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f33857, Boolean.valueOf(this.f33856)};
        String[] strArrSplit = "recipe;exit".length() == 0 ? new String[0] : "recipe;exit".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C12112.class, sb, "[");
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
