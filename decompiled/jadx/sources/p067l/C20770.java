package p067l;

/* JADX INFO: renamed from: l.᩵ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8IT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20770 extends C13728 {

    /* JADX INFO: renamed from: ۧ */
    public final long f65294;

    public C20770(InterfaceC10375 interfaceC10375, long j) {
        super(interfaceC10375);
        C23877.m52957(interfaceC10375.getPosition() >= j);
        this.f65294 = j;
    }

    @Override // p067l.C13728, p067l.InterfaceC10375
    public final long getPosition() {
        return super.getPosition() - this.f65294;
    }

    @Override // p067l.C13728, p067l.InterfaceC10375
    /* JADX INFO: renamed from: ܽ */
    public final long mo24039() {
        return super.mo24039() - this.f65294;
    }

    @Override // p067l.C13728, p067l.InterfaceC10375
    public final long getLength() {
        return super.getLength() - this.f65294;
    }
}
