package l;

/* JADX INFO: renamed from: l.᩵ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8IT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19362 extends C11952 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f62681;

    public C19362(InterfaceC8424 interfaceC8424, long j) {
        super(interfaceC8424);
        C22632.m50631(interfaceC8424.getPosition() >= j);
        this.f62681 = j;
    }

    @Override // l.C11952, l.InterfaceC8424
    public final long getPosition() {
        return super.getPosition() - this.f62681;
    }

    @Override // l.C11952, l.InterfaceC8424
    /* JADX INFO: renamed from: ܽ */
    public final long mo22069() {
        return super.mo22069() - this.f62681;
    }

    @Override // l.C11952, l.InterfaceC8424
    public final long getLength() {
        return super.getLength() - this.f62681;
    }
}
