package p067l;

import android.content.pm.PackageInfo;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۨ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85H5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13176 {

    /* JADX INFO: renamed from: ֫ */
    public String f37026;

    /* JADX INFO: renamed from: ۧ */
    public final String f37027;

    /* JADX INFO: renamed from: ܽ */
    public final PackageInfo f37028;

    /* JADX INFO: renamed from: ᩳ */
    public final int f37029;

    public /* synthetic */ C13176(int i, String str, PackageInfo packageInfo, int i2) {
        this(packageInfo, i, str);
    }

    public C13176(PackageInfo packageInfo, int i, String str) {
        this.f37029 = i;
        this.f37027 = str;
        this.f37028 = packageInfo;
    }

    public C13176(int i, String str) {
        this(null, i, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m30175() {
        if (this.f37026 == null) {
            PackageInfo packageInfo = this.f37028;
            if (packageInfo == null) {
                return null;
            }
            this.f37026 = C6860.m15721(packageInfo);
        }
        return this.f37026;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f37027);
        sb.append(" (");
        return C5410.m11876(this.f37029, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
