package p067l;

import android.content.res.Resources;

/* JADX INFO: renamed from: l.֨ۗ */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0884 {

    /* JADX INFO: renamed from: ֫ */
    public final Resources f5810;

    /* JADX INFO: renamed from: ۧ */
    public final Resources.Theme f5811;

    public C0884(Resources resources, Resources.Theme theme) {
        this.f5810 = resources;
        this.f5811 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0884.class == obj.getClass()) {
            C0884 c0884 = (C0884) obj;
            if (this.f5810.equals(c0884.f5810) && C12826.equals(this.f5811, c0884.f5811)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(this.f5810, this.f5811);
    }
}
