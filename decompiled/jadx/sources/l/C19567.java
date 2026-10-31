package l;

/* JADX INFO: renamed from: l.᩵ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8ON */
/* JADX INFO: loaded from: classes5.dex */
public final class C19567 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f63243;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f63244;

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8353 mo1025() {
        return null;
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo1026(C18252 c18252) {
    }

    @Override // l.InterfaceC14723
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo1027() {
        return null;
    }

    public C19567(float f, int i) {
        this.f63243 = f;
        this.f63244 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19567.class == obj.getClass()) {
            C19567 c19567 = (C19567) obj;
            if (this.f63243 == c19567.f63243 && this.f63244 == c19567.f63244) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f63243) + 527) * 31) + this.f63244;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f63243 + ", svcTemporalLayerCount=" + this.f63244;
    }
}
