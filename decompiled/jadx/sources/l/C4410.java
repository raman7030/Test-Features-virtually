package l;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: l.ۙۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: F942 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4410 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f14113;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LocusId f14114;

    public C4410(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f14113 = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f14114 = C19933.m45915(str);
                return;
            } else {
                this.f14114 = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m13136() {
        return this.f14113;
    }

    public final int hashCode() {
        String str = this.f14113;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4410.class != obj.getClass()) {
            return false;
        }
        String str = ((C4410) obj).f14113;
        String str2 = this.f14113;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f14113.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LocusId m13137() {
        return this.f14114;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4410 m13135(LocusId locusId) {
        C13746.m33055(locusId, "locusId cannot be null");
        String strM45916 = C19933.m45916(locusId);
        if (TextUtils.isEmpty(strM45916)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        return new C4410(strM45916);
    }
}
