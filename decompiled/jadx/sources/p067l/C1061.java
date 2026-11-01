package p067l;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۙۙ */
/* JADX INFO: compiled from: F942 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1061 {

    /* JADX INFO: renamed from: ֫ */
    public final String f16929;

    /* JADX INFO: renamed from: ۧ */
    public final LocusId f16930;

    public C1061(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f16929 = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f16930 = C1831.m48228(str);
                return;
            } else {
                this.f16930 = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m15000() {
        return this.f16929;
    }

    public final int hashCode() {
        String str = this.f16929;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1061.class != obj.getClass()) {
            return false;
        }
        String str = ((C1061) obj).f16929;
        String str2 = this.f16929;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f16929.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final LocusId m15001() {
        return this.f16930;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1061 m14999(LocusId locusId) {
        C1524.m35169(locusId, "locusId cannot be null");
        String strM48229 = C1831.m48229(locusId);
        if (TextUtils.isEmpty(strM48229)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return new C1061(strM48229);
    }
}
