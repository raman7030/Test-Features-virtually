package p067l;

/* JADX INFO: renamed from: l.᩸֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8U7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22557 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final float f71143;

    /* JADX INFO: renamed from: ۧ */
    public final float f71144;

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

    public C22557(float f, float f2) {
        C23877.m52956("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.f71143 = f;
        this.f71144 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22557.class == obj.getClass()) {
            C22557 c22557 = (C22557) obj;
            if (this.f71143 == c22557.f71143 && this.f71144 == c22557.f71144) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f71144) + ((Float.floatToIntBits(this.f71143) + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f71143 + ", longitude=" + this.f71144;
    }
}
