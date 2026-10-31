package l;

import android.content.pm.PackageInfo;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۨ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85H5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11372 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f34029;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f34030;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PackageInfo f34031;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f34032;

    public /* synthetic */ C11372(int i, String str, PackageInfo packageInfo, int i2) {
        this(packageInfo, i, str);
    }

    public C11372(PackageInfo packageInfo, int i, String str) {
        this.f34032 = i;
        this.f34030 = str;
        this.f34031 = packageInfo;
    }

    public C11372(int i, String str) {
        this(null, i, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28131() {
        if (this.f34029 == null) {
            PackageInfo packageInfo = this.f34031;
            if (packageInfo == null) {
                return null;
            }
            this.f34029 = C4726.m13841(packageInfo);
        }
        return this.f34029;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34030);
        sb.append(" (");
        return C3200.m9831(this.f34032, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }
}
