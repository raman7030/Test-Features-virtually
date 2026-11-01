package p067l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ܳܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAML */
/* JADX INFO: loaded from: classes4.dex */
public final class C16292 {

    /* JADX INFO: renamed from: ֫ */
    public final C7164 f47890;

    public C16292(Rect rect) {
        this.f47890 = new C7164(rect);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Rect m37087() {
        return this.f47890.m16473();
    }

    public final String toString() {
        return "WindowMetrics { bounds: " + this.f47890.m16473() + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C16292.class.equals(obj.getClass())) {
            return false;
        }
        return C13045.m29864(this.f47890, ((C16292) obj).f47890);
    }

    public final int hashCode() {
        return this.f47890.hashCode();
    }
}
