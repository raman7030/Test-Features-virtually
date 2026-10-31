package l;

/* JADX INFO: renamed from: l.ۙۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4393 implements InterfaceC10038 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile C0117 f14078;

    @Override // l.InterfaceC10038
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C0117 mo13123() {
        if (this.f14078 == null) {
            C14975 c14975 = (C14975) this;
            C0117 c0117 = (C0117) c14975.f45645.getDescriptorForType().m41588().get(c14975.f45644);
            synchronized (this) {
                if (this.f14078 == null) {
                    this.f14078 = c0117;
                }
            }
        }
        return this.f14078;
    }
}
