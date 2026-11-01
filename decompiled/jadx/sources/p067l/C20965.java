package p067l;

/* JADX INFO: renamed from: l.᩵ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8ON */
/* JADX INFO: loaded from: classes5.dex */
public final class C20965 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final float f65862;

    /* JADX INFO: renamed from: ۧ */
    public final int f65863;

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C10307 mo3421() {
        return null;
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo3422(C19715 c19715) {
    }

    @Override // p067l.InterfaceC16361
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ byte[] mo3423() {
        return null;
    }

    public C20965(float f, int i) {
        this.f65862 = f;
        this.f65863 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20965.class == obj.getClass()) {
            C20965 c20965 = (C20965) obj;
            if (this.f65862 == c20965.f65862 && this.f65863 == c20965.f65863) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f65862) + 527) * 31) + this.f65863;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f65862 + ", svcTemporalLayerCount=" + this.f65863;
    }
}
