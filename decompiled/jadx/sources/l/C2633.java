package l;

/* JADX INFO: renamed from: l.ۖܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2633 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f8309;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f8310;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f8311;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f8312;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f8313;

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

    public C2633(long j, long j2, long j3, long j4, long j5) {
        this.f8311 = j;
        this.f8310 = j2;
        this.f8309 = j3;
        this.f8312 = j4;
        this.f8313 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2633.class == obj.getClass()) {
            C2633 c2633 = (C2633) obj;
            if (this.f8311 == c2633.f8311 && this.f8310 == c2633.f8310 && this.f8309 == c2633.f8309 && this.f8312 == c2633.f8312 && this.f8313 == c2633.f8313) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C6371.m17662(this.f8313) + ((C6371.m17662(this.f8312) + ((C6371.m17662(this.f8309) + ((C6371.m17662(this.f8310) + ((C6371.m17662(this.f8311) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f8311 + ", photoSize=" + this.f8310 + ", photoPresentationTimestampUs=" + this.f8309 + ", videoStartPosition=" + this.f8312 + ", videoSize=" + this.f8313;
    }
}
