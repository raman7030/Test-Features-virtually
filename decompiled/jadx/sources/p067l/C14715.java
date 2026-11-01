package p067l;

/* JADX INFO: renamed from: l.۬۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 532I */
/* JADX INFO: loaded from: classes4.dex */
public class C14715 extends AbstractC13375 {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC13375 f41951;

    @Override // p067l.AbstractC13375
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC13375 mo15182() {
        throw null;
    }

    @Override // p067l.InterfaceC20276
    @Deprecated
    public final boolean apply(Object obj) {
        return mo15183(((Character) obj).charValue());
    }

    public C14715(AbstractC13375 abstractC13375) {
        this.f41951 = abstractC13375;
    }

    @Override // p067l.AbstractC13375
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15183(char c) {
        return !this.f41951.mo15183(c);
    }

    @Override // p067l.AbstractC13375
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo27550(CharSequence charSequence) {
        return this.f41951.mo27551(charSequence);
    }

    @Override // p067l.AbstractC13375
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo27551(CharSequence charSequence) {
        return this.f41951.mo27550(charSequence);
    }

    @Override // p067l.AbstractC13375
    /* JADX INFO: renamed from: ֫ */
    public final int mo27548(CharSequence charSequence) {
        return charSequence.length() - this.f41951.mo27548(charSequence);
    }

    public final String toString() {
        return this.f41951 + ".negate()";
    }
}
