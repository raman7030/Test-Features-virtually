package l;

import android.content.pm.PackageInfo;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: TA2U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13698 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f40888;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f40889;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f40890;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f40891;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f40892;

    public C13698(String str, boolean z, boolean z2, boolean z3, long j) {
        this.f40889 = str;
        this.f40891 = z;
        this.f40892 = z2;
        this.f40890 = z3;
        this.f40888 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13698)) {
            return false;
        }
        C13698 c13698 = (C13698) obj;
        return this.f40891 == c13698.f40891 && this.f40892 == c13698.f40892 && this.f40890 == c13698.f40890 && this.f40888 == c13698.f40888 && C11003.equals(this.f40889, c13698.f40889);
    }

    public final int hashCode() {
        int i = (((this.f40891 ? 1231 : 1237) * 31) + (this.f40892 ? 1231 : 1237)) * 31;
        int i2 = this.f40890 ? 1231 : 1237;
        long j = this.f40888;
        return C11003.hashCode(this.f40889) + ((((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f40889, Boolean.valueOf(this.f40891), Boolean.valueOf(this.f40892), Boolean.valueOf(this.f40890), Long.valueOf(this.f40888)};
        String[] strArrSplit = "packageName;supportUninstallUpdate;supportGrantingDataRoot;supportGrantingDataChild;apkInstallTime".length() == 0 ? new String[0] : "packageName;supportUninstallUpdate;supportGrantingDataRoot;supportGrantingDataChild;apkInstallTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C13698.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32947() {
        return this.f40890;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32949() {
        return this.f40891;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13698 m32945(PackageInfo packageInfo) {
        long j = packageInfo.lastUpdateTime;
        C1910 c1910 = new C1910();
        c1910.f6434 = true;
        c1910.f6433 = true;
        c1910.f6435 = true;
        InterfaceC22871 interfaceC22871 = C11083.f33273;
        C11003.requireNonNull(interfaceC22871);
        try {
            interfaceC22871.mo1017(packageInfo.applicationInfo.sourceDir, c1910);
        } catch (Throwable unused) {
        }
        return new C13698(packageInfo.packageName, c1910.f6435 && !packageInfo.applicationInfo.sourceDir.startsWith("/system"), c1910.f6434, c1910.f6433, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32946(C13698 c13698, PackageInfo packageInfo) {
        return c13698.f40889.equals(packageInfo.packageName) && c13698.f40888 == packageInfo.lastUpdateTime;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32948(boolean z) {
        return z ? this.f40892 : this.f40890;
    }
}
