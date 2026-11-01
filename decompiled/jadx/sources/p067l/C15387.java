package p067l;

import android.content.pm.PackageInfo;
import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܰ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: TA2U */
/* JADX INFO: loaded from: classes4.dex */
public final class C15387 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f43969;

    /* JADX INFO: renamed from: ۧ */
    public final String f43970;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f43971;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f43972;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f43973;

    public C15387(String str, boolean z, boolean z2, boolean z3, long j) {
        this.f43970 = str;
        this.f43972 = z;
        this.f43973 = z2;
        this.f43971 = z3;
        this.f43969 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15387)) {
            return false;
        }
        C15387 c15387 = (C15387) obj;
        return this.f43972 == c15387.f43972 && this.f43973 == c15387.f43973 && this.f43971 == c15387.f43971 && this.f43969 == c15387.f43969 && C12826.equals(this.f43970, c15387.f43970);
    }

    public final int hashCode() {
        int i = (((this.f43972 ? 1231 : 1237) * 31) + (this.f43973 ? 1231 : 1237)) * 31;
        int i2 = this.f43971 ? 1231 : 1237;
        long j = this.f43969;
        return C12826.hashCode(this.f43970) + ((((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f43970, Boolean.valueOf(this.f43972), Boolean.valueOf(this.f43973), Boolean.valueOf(this.f43971), Long.valueOf(this.f43969)};
        String[] strArrSplit = "packageName;supportUninstallUpdate;supportGrantingDataRoot;supportGrantingDataChild;apkInstallTime".length() == 0 ? new String[0] : "packageName;supportUninstallUpdate;supportGrantingDataRoot;supportGrantingDataChild;apkInstallTime".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C15387.class, sb, "[");
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
    public final boolean m35062() {
        return this.f43971;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m35064() {
        return this.f43972;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15387 m35060(PackageInfo packageInfo) {
        long j = packageInfo.lastUpdateTime;
        C4184 c4184 = new C4184();
        c4184.f9214 = true;
        c4184.f9213 = true;
        c4184.f9215 = true;
        InterfaceC24105 interfaceC24105 = C12902.f36274;
        C12826.requireNonNull(interfaceC24105);
        try {
            interfaceC24105.mo3413(packageInfo.applicationInfo.sourceDir, c4184);
        } catch (Throwable unused) {
        }
        return new C15387(packageInfo.packageName, c4184.f9215 && !packageInfo.applicationInfo.sourceDir.startsWith("/system"), c4184.f9214, c4184.f9213, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35061(C15387 c15387, PackageInfo packageInfo) {
        return c15387.f43970.equals(packageInfo.packageName) && c15387.f43969 == packageInfo.lastUpdateTime;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35063(boolean z) {
        return z ? this.f43973 : this.f43971;
    }
}
