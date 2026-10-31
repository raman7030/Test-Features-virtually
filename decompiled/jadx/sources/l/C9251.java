package l;

/* JADX INFO: renamed from: l.ۢ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes4.dex */
public final class C9251 extends AbstractC8545 {
    public C9251() {
        this.f7214 = EnumC15599.StartTag;
    }

    @Override // l.AbstractC8545, l.AbstractC2195
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC8545 mo7259() {
        super.mo7259();
        this.f26118 = null;
        return this;
    }

    public final String toString() {
        if (!m22252() || this.f26118.size() <= 0) {
            String str = this.f26117;
            return C4860.m14172("<", str != null ? str : "[unset]", ">");
        }
        String str2 = this.f26117;
        return C20087.m46306("<", str2 != null ? str2 : "[unset]", " ", this.f26118.m36737(), ">");
    }
}
