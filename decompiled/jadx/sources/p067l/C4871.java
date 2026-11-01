package p067l;

/* JADX INFO: renamed from: l.ۖܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8SY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4871 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final long f11104;

    /* JADX INFO: renamed from: ۧ */
    public final long f11105;

    /* JADX INFO: renamed from: ܽ */
    public final long f11106;

    /* JADX INFO: renamed from: ܿ */
    public final long f11107;

    /* JADX INFO: renamed from: ᩳ */
    public final long f11108;

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

    public C4871(long j, long j2, long j3, long j4, long j5) {
        this.f11106 = j;
        this.f11105 = j2;
        this.f11104 = j3;
        this.f11107 = j4;
        this.f11108 = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4871.class == obj.getClass()) {
            C4871 c4871 = (C4871) obj;
            if (this.f11106 == c4871.f11106 && this.f11105 == c4871.f11105 && this.f11104 == c4871.f11104 && this.f11107 == c4871.f11107 && this.f11108 == c4871.f11108) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C8424.m19607(this.f11108) + ((C8424.m19607(this.f11107) + ((C8424.m19607(this.f11104) + ((C8424.m19607(this.f11105) + ((C8424.m19607(this.f11106) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f11106 + ", photoSize=" + this.f11105 + ", photoPresentationTimestampUs=" + this.f11104 + ", videoStartPosition=" + this.f11107 + ", videoSize=" + this.f11108;
    }
}
