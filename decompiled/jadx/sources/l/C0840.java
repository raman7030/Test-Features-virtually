package l;

import android.content.res.Resources;

/* JADX INFO: renamed from: l.֨ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0840 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Resources f3036;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Resources.Theme f3037;

    public C0840(Resources resources, Resources.Theme theme) {
        this.f3036 = resources;
        this.f3037 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0840.class == obj.getClass()) {
            C0840 c0840 = (C0840) obj;
            if (this.f3036.equals(c0840.f3036) && C11003.equals(this.f3037, c0840.f3037)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(this.f3036, this.f3037);
    }
}
