package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ܳܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAML */
/* JADX INFO: loaded from: classes4.dex */
public final class C14650 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5046 f44783;

    public C14650(Rect rect) {
        this.f44783 = new C5046(rect);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Rect m34940() {
        return this.f44783.m14569();
    }

    public final String toString() {
        return "WindowMetrics { bounds: " + this.f44783.m14569() + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C14650.class.equals(obj.getClass())) {
            return false;
        }
        return C11233.m27802(this.f44783, ((C14650) obj).f44783);
    }

    public final int hashCode() {
        return this.f44783.hashCode();
    }
}
