package l;

import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۜۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMN */
/* JADX INFO: loaded from: classes3.dex */
public final class C6726 implements InterfaceC14486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5046 f20881;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17309 f20882;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23659 f20883;

    public C6726(C5046 c5046, C23659 c23659, C17309 c17309) {
        this.f20881 = c5046;
        this.f20883 = c23659;
        this.f20882 = c17309;
        if (c5046.m14570() == 0 && c5046.m14566() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (c5046.m14567() != 0 && c5046.m14568() != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    @Override // l.InterfaceC11397
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Rect mo18303() {
        return this.f20881.m14569();
    }

    @Override // l.InterfaceC14486
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18015 mo18305() {
        C5046 c5046 = this.f20881;
        if (c5046.m14570() > c5046.m14566()) {
            return C18015.f56183;
        }
        return C18015.f56184;
    }

    public final String toString() {
        return "HardwareFoldingFeature { " + this.f20881 + ", type=" + this.f20883 + ", state=" + this.f20882 + " }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C6726.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C6726 c6726 = (C6726) obj;
            return C11233.m27802(this.f20881, c6726.f20881) && C11233.m27802(this.f20883, c6726.f20883) && C11233.m27802(this.f20882, c6726.f20882);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    public final int hashCode() {
        return this.f20882.hashCode() + ((this.f20883.hashCode() + (this.f20881.hashCode() * 31)) * 31);
    }

    @Override // l.InterfaceC14486
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo18304() {
        C23659 c23659 = C23659.f76651;
        C23659 c236510 = this.f20883;
        if (C11233.m27802(c236510, c23659)) {
            return true;
        }
        return C11233.m27802(c236510, C23659.f76650) && C11233.m27802(this.f20882, C17309.f53018);
    }
}
