package p067l;

/* JADX INFO: renamed from: l.ۢ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes4.dex */
public final class C11160 extends AbstractC10489 {
    public C11160() {
        this.f9999 = EnumC17193.StartTag;
    }

    @Override // p067l.AbstractC10489, p067l.AbstractC4454
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC10489 mo9338() {
        super.mo9338();
        this.f29033 = null;
        return this;
    }

    public final String toString() {
        if (!m24220() || this.f29033.size() <= 0) {
            String str = this.f29032;
            return C6988.m16053("<", str != null ? str : "[unset]", ">");
        }
        String str2 = this.f29032;
        return C21459.m48622("<", str2 != null ? str2 : "[unset]", " ", this.f29033.m38898(), ">");
    }
}
