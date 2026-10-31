package l;

/* JADX INFO: renamed from: l.᩸֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8U7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21243 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f68461;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f68462;

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

    public C21243(float f, float f2) {
        C22632.m50630("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.f68461 = f;
        this.f68462 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21243.class == obj.getClass()) {
            C21243 c21243 = (C21243) obj;
            if (this.f68461 == c21243.f68461 && this.f68462 == c21243.f68462) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f68462) + ((Float.floatToIntBits(this.f68461) + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f68461 + ", longitude=" + this.f68462;
    }
}
