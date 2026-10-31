package l;

/* JADX INFO: renamed from: l.᩹֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A8OY */
/* JADX INFO: loaded from: classes.dex */
public final class C21948 implements InterfaceC14723 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f70309;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f70310;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f70311;

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

    public C21948(long j, long j2, long j3) {
        this.f70309 = j;
        this.f70310 = j2;
        this.f70311 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21948)) {
            return false;
        }
        C21948 c21948 = (C21948) obj;
        return this.f70309 == c21948.f70309 && this.f70310 == c21948.f70310 && this.f70311 == c21948.f70311;
    }

    public final int hashCode() {
        return C6371.m17662(this.f70311) + ((C6371.m17662(this.f70310) + ((C6371.m17662(this.f70309) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f70309 + ", modification time=" + this.f70310 + ", timescale=" + this.f70311;
    }
}
