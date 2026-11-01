package p067l;

/* JADX INFO: renamed from: l.۟ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBCR */
/* JADX INFO: loaded from: classes4.dex */
public final class C9371 extends AbstractC15405 {

    /* JADX INFO: renamed from: ᩸ */
    public final C8050 f25547;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "annotation";
    }

    public C9371(C8050 c8050) {
        c8050.m45999();
        this.f25547 = c8050;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9371)) {
            return false;
        }
        return this.f25547.equals(((C9371) obj).f25547);
    }

    public final int hashCode() {
        return this.f25547.hashCode();
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        return this.f25547.compareTo(((C9371) abstractC15405).f25547);
    }

    public final String toString() {
        return this.f25547.mo4819();
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return this.f25547.mo4819();
    }

    /* JADX INFO: renamed from: ܺ */
    public final C8050 m21784() {
        return this.f25547;
    }
}
