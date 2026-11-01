package p067l;

/* JADX INFO: renamed from: l.᩹֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A8OY */
/* JADX INFO: loaded from: classes.dex */
public final class C23227 implements InterfaceC16361 {

    /* JADX INFO: renamed from: ֫ */
    public final long f73020;

    /* JADX INFO: renamed from: ۧ */
    public final long f73021;

    /* JADX INFO: renamed from: ܽ */
    public final long f73022;

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

    public C23227(long j, long j2, long j3) {
        this.f73020 = j;
        this.f73021 = j2;
        this.f73022 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23227)) {
            return false;
        }
        C23227 c23227 = (C23227) obj;
        return this.f73020 == c23227.f73020 && this.f73021 == c23227.f73021 && this.f73022 == c23227.f73022;
    }

    public final int hashCode() {
        return C8424.m19607(this.f73022) + ((C8424.m19607(this.f73021) + ((C8424.m19607(this.f73020) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f73020 + ", modification time=" + this.f73021 + ", timescale=" + this.f73022;
    }
}
